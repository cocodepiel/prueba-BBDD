function cargarObras(){
    fetch("http://localhost:4050/obras")
    .then(function(respTextoPlano){
        return respTextoPlano.json()
    })
    .then(function(dataJSON){
        console.log(dataJSON)
        const tbody = document.getElementById("obras-body")
        tbody.innerHTML = ""
        for(let obra of dataJSON){
            const row = document.createElement("tr")

            let tableData = document.createElement("td")
            tableData.innerText = obra.id
            row.appendChild(tableData)

            tableData = document.createElement("td")
            tableData.innerText = obra.nombre
            row.appendChild(tableData)
            
            tableData = document.createElement("td")
            tableData.innerText = obra.descripcion
            row.appendChild(tableData)

            tableData = document.createElement("td")
            tableData.innerText = obra.sala ? obra.sala.nombre : "Sin sala"
            row.appendChild(tableData)

            tableData = document.createElement("td")
            const showButton = document.createElement("button")
            showButton.innerText = "Ver"
            showButton.classList.add("btn-detalles")
            showButton.onclick = function(){
                window.location.href = "show.html?id=" + obra.id
            }
            tableData.appendChild(showButton)
            row.appendChild(tableData)

            tbody.appendChild(row)
        }
    })
    .catch(function(err){
        console.log("Error al cargar obras:", err)
    })
}

cargarObras()