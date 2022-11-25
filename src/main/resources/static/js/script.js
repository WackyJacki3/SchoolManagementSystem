window.addEventListener("load", () => {
  const links = document.querySelectorAll(".nav-link");
  for (let i = 0; i < links.length; i++) {
    if (links[i].href === location.href) {
      links[i].classList.add("active");
    }
  }

  // Add "first-child"
  // const cards = document.querySelectorAll(".card-custom");
  // console.log(cards[0]);
  // console.log(cards[1]);
  // if (cards.length > 0) {
  //   cards[0].classList.add("first-childe");
  // }

  // Add "th-child"
  // const cards = document.querySelectorAll(".card-custom");
  // console.log(cards[0]);
  // console.log(cards[1]);
  // for (let j = 0; j < links.length; j++) {
  //   if (j !== 0) {
  //     cards[j].classList.add("th-childe");
  //   }
  // }
});
