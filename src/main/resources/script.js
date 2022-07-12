let display = document.getElementById('display');

function findAll() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/city",
        success: function (data) {
            loadData(data);
            console.log(data);
        },
        error: function (error) {
            console.log(error);
            alert("Không có quyền");
        }
    })
}

function loadData(data) {
    let str = "";
    for (let i = 0; i < data.length; i++) {
        str +=

            ` <table class="table">
                
            <tr>
                    <th scope="row">${i + 1}</th>
                    <td>${data[i].name}</td>
                    <td>${data[i].area}</td>
                    <td>${data[i].population}</td>
                    <td>${data[i].gdp}</td>
                    <td>${data[i].country.name}</td>
                    <td>${data[i].description}</td>

                </tr>
        </table>
                 `;
    }
    display.innerHTML = str;
}

function showFormAdd() {

}
