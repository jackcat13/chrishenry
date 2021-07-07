function moveLogoToCenter() {
    document.getElementById('logoWrapper').className = 'moveLogo';
    setTimeout(function (){
        document.getElementById('menuWrapper').style.visibility = 'visible'
        document.getElementById('menuWrapper').className = 'menu';
    }, 5100);
}

setTimeout(function (){
    moveLogoToCenter()
}, 1000);