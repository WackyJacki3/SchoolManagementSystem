window.addEventListener("load", () => {
  const links = document.querySelectorAll(".nav-link");
  for (let i = 0; i < links.length; i++) {
    console.log(links[i].href === location.href);
    if (links[i].href === location.href) {
      links[i].classList.add("active");
    }
  }
});
