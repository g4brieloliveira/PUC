const API_KEY = "1e9a38f01b244efe9d3818d501635119";
const BASE_API = "https://api.rawg.io/api";

async function getDetails(id) {
  const data = await fetch(`${BASE_API}/games/${id}?key=${API_KEY}`).then(
    (res) => res.json()
  );
  var modal = document.getElementById("myModal");

  var span = document.getElementsByClassName("close")[0];

  document.getElementById("modalTitle").innerText = data.name;
  document.getElementById("modalImg").src = data.background_image;
  document.getElementById("modalDescription").innerText = data.description_raw;
  const button = document.getElementById("button");
  button.onclick = () => (window.location = data.website);

  modal.style.display = "block";

  span.onclick = function () {
    modal.style.display = "none";
  };
  window.onclick = function (event) {
    if (event.target == modal) {
      modal.style.display = "none";
    }
  };
}

async function getDatas() {
  const { results } = await fetch(`${BASE_API}/games?key=${API_KEY}`).then(
    (res) => res.json()
  );

  results.map((item) => {
    const cardsDiv = document.getElementById("cards");

    var newDiv = document.createElement("div");
    var content = document.createElement("div");
    content.setAttribute("id", "content")

    var image = document.createElement("img");
    image.src = item.background_image;
    newDiv.appendChild(image);

    var title = document.createElement("h3");
    title.innerText = item.name;
    content.appendChild(title);

    var ratingDiv = document.createElement("div");
    const ratingArray = Array.from(new Array(Math.floor(item.rating)));
    {
      ratingArray.map(() => {
        var newStar = document.createElement("img");
        newStar.src = "../../assets/star.png";
        ratingDiv.appendChild(newStar);
      });
    }
    if (item.rating / Math.floor(item.rating) !== 0) {
      var newStar = document.createElement("img");
      newStar.src = "../../assets/half-star.png";
      ratingDiv.appendChild(newStar);
    }
    var rating = document.createElement("p");
    rating.innerText = `(${item.rating})`;
    ratingDiv.appendChild(rating);

    ratingDiv.setAttribute("id", "rating");
    content.appendChild(ratingDiv);

    var releaseDate = document.createElement("p");
    var data = new Date(item.released);
    releaseDate.innerText = data.toLocaleDateString();
    content.appendChild(releaseDate);

    var button = document.createElement("button");
    button.innerText = "Ver detalhes";
    button.onclick = () => getDetails(item.id);
    content.appendChild(button);

    newDiv.appendChild(content)

    cardsDiv.appendChild(newDiv);
  });
}

getDatas();
