var signUpButton = document.getElementById('signUp')
var signInButton = document.getElementById('signIn')
var container = document.getElementById('dowebok')

signUpButton.addEventListener('click', function () {
    container.classList.add('right-panel-active')
})

signInButton.addEventListener('click', function () {
    container.classList.remove('right-panel-active')
});

// $(function () {
//     var $bg = $("#bg");
//     let width = window.innerWidth;
//     let height = window.innerHeight;
//     console.log(width)
//     console.log(height)
//     let str = "";
//     for (let i = 0; i < 12; i++) {
//         str += ("<tr>" +
//             "<td>I love you more than I can say</td>" +
//             "<td>蓥蓥，爱你爱你爱你</td>" +
//             "<td>you are my dearest</td>" +
//             "</tr>>");
//     }
//     $bg.html(str);
// })
