let poblarTabla = () => {
    fetch('/alumno')
    .then(xs => xs.json())
    .then(data => { 
        let template = document.getElementById('templateTablaUsuarios').innerHTML
        let salidaHTML = Mustache.render(template, { xs : data})
        document.getElementById('tablaUsuarios').innerHTML = salidaHTML
    })
}

let borrarRegistro = idRegistro => {
    fetch('/alumno/' + idRegistro, {
       method: 'DELETE',
       headers: {
           'Content-Type': 'application/json',
           'Access-Control-Allow-Origin':'*'
       }})
       .then(function(response) {
            if (response.status === 200) {
                poblarTabla()
            }
       })
       .catch(function(err) {
           console.error(err);
       });
}

let manejarBorrado = () => {
    document.addEventListener('click', e => {
        if (e.target.classList.contains('js-botonBorradoUsuario')) {
            borrarRegistro(e.target.dataset.idborrar)
        }
    })
}

poblarTabla();
manejarBorrado();

