var openFile = function (event) {
    var input = event.target;

    var reader = new FileReader();

    reader.onload = function () {
        var text = reader.result;
        var node = document.getElementById('output');
        node.innerText = text;
        console.log(text);
        mandarPeticion(text);

    };
    reader.readAsText(input.files[0]);
};

function mandarPeticion(textoo){
    var objeto = {
        'texto': textoo
    }
    
    fetch('http://localhost:3000/cargarPeliculas', {
        method: 'POST',
        body: JSON.stringify(objeto),
        headers: {
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin': '*',
        }
    }).then(res => res.json())
        .catch(err => {
            console.error('Error:', err)
            alert("Ocurrio un error")
        }).then(response => {
            console.log(response);
            if (response.status == 400) {
                alert("Ocurrió un error")
            } else {
                // actualizar peliculas
                alert("siuuu");
                actualizarTabla(response.data);
            }
        })    
}

function actualizarTabla(registros){
    cadena = ``;
    registros.forEach(element => {
        cadena += `<tr>
            <td> ${element.nombre} </td>
            <td> ${element.genero} </td>
            <td> ${element.clasificacion} </td>
            <td> ${element.anio} </td>
            <td> ${element.duracion} </td>
            <td> <button value=${element.Nombre} onclick="verPerfil(this)" type="button" class="btn btn-outline-dark">Ver Perfil</button> </td>
            </tr>`         
    });

    var tbody = document.getElementById('peliculas');
    tbody.innerHTML = cadena
}