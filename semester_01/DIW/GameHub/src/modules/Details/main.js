const API_KEY = "1e9a38f01b244efe9d3818d501635119";
const BASE_API = "https://api.rawg.io/api";
const STORAGE_KEY = "STORAGE_KEY"

const data = JSON.parse(localStorage.getItem(STORAGE_KEY))

async function getDetails(id) {
  const result = await fetch(`${BASE_API}/games/${id}?key=${API_KEY}`).then(
    (res) => res.json()
  );

  document.getElementById("title").innerText = result.name
  document.getElementById("image").src = result.background_image
  document.getElementById("description").innerText = result.description_raw
  const button = document.getElementById("button");
  button.onclick = () => (window.location = result.website);
  
  console.log(result)
}

getDetails(data.id)