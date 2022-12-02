const API_KEY = "1e9a38f01b244efe9d3818d501635119";
const BASE_API = "https://api.rawg.io/api";

const STORAGE_KEY = "STORAGE_KEY"

async function getDatas() {
  const { results } = await fetch(`${BASE_API}/games?key=${API_KEY}`).then(
    (res) => res.json()
  );

  populateHighlights(results)
  populateGames(results)
  populateStores()

  document.getElementById("input").onfocus = function() {
    var modal = document.getElementById("myModal");
    var body = document.getElementById("body");
  
    var span = document.getElementsByClassName("close")[0];

    showDatas(results)

    modal.style.display = "block";
    modal.style.overflowY = "scroll";
    body.style.overflowY = "hidden";
  
    span.onclick = function () {
      modal.style.display = "none";
      modal.style.overflowY = "hidden";
      body.style.overflowY = "scroll";
    };
    window.onclick = function (event) {
      if (event.target == modal) {
        modal.style.display = "none";
        modal.style.overflowY = "hidden";
        body.style.overflowY = "scroll";
      }
    };
  }

  document.getElementById("input").addEventListener("input", function() {
    const value = this.value
    
    const newData = results.filter(res => res.name.toLowerCase().includes(value.toLowerCase()))
    showDatas(newData)
  });
}

function populateHighlights (data) {
  for (i = 0; i < 3; i++){
    const random = Math.floor(Math.random() * data.length);
    document.getElementById(`highlight_${i + 1}_title`).innerText = data[random].name
    document.getElementById(`highlight_${i + 1}_image`).src = data[random].background_image
    document.getElementById(`highlight_${i + 1}_rating`).innerText = `Nota: ${data[random].rating}`
    document.getElementById(`highlight_${i + 1}_release`).innerText = `Lançamento: ${new Date(data[random].released).toLocaleDateString()}`
    document.getElementById(`highlight_${i + 1}_button`).onclick = function() {
      localStorage.setItem(STORAGE_KEY, JSON.stringify(data[random]))
      window.location.href = "./src/modules/Details/index.html"
    }
  }
}

function populateGames (data) {
  const cards = document.getElementById("cards")
  data.map((item) => {
    const link = document.createElement("a")
    link.onclick = function() {
      localStorage.setItem(STORAGE_KEY, JSON.stringify(item))
      window.location.href = "./src/modules/Details/index.html"
    }
    cards.appendChild(link)

    const card = document.createElement("div")
    card.setAttribute("class", "card")
    link.appendChild(card)

    const title = document.createElement("h1")
    title.innerText = item.name;
    card.appendChild(title)

    const image = document.createElement("img")
    image.src = item.background_image;
    card.appendChild(image)

    link.appendChild(card)
  })
}

async function populateStores () {
  const { results } = await fetch(`${BASE_API}/stores?key=${API_KEY}`).then(
    (res) => res.json()
  );

  for (i = 0; i < 3; i++){
    const random = Math.floor(Math.random() * results.length);
    document.getElementById(`stores_${i + 1}_title`).innerText = results[random].name
    document.getElementById(`stores_${i + 1}_image`).src = results[random].image_background
  }
}

function showDatas(data) {
  const cardsDiv = document.getElementById("content");
  while (cardsDiv.hasChildNodes()) {
    cardsDiv.removeChild(cardsDiv.firstChild);
  }

  if (data.length < 1) {
    var title = document.createElement("h3");
    title.innerText = "Não há jogos com esse nome :(";
    cardsDiv.appendChild(title);
  }

  data.map((item) => { 
    var link = document.createElement("a");
    link.onclick = function() {
      localStorage.setItem(STORAGE_KEY, JSON.stringify(item))
      window.location.href = "./src/modules/Details/index.html"
    }
    var newDiv = document.createElement("div");
    link.appendChild(newDiv)
    var content = document.createElement("div");
    content.setAttribute("id", "datas")

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
        newStar.src = "./assets/star.png";
        ratingDiv.appendChild(newStar);
      });
    }
    if (item.rating / Math.floor(item.rating) !== 0) {
      var newStar = document.createElement("img");
      newStar.src = "./assets/half-star.png";
      ratingDiv.appendChild(newStar);
    }
    var rating = document.createElement("p");
    rating.innerText = `(${item.rating})`;
    ratingDiv.appendChild(rating);

    ratingDiv.setAttribute("id", "rating");
    content.appendChild(ratingDiv);

    newDiv.appendChild(content)

    cardsDiv.appendChild(link);
  })
}

getDatas();
