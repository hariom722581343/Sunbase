let link = 'https://api/endpoint/customer/management/portal/api/v1/customers';

// Load customers
function loadCustomers() {
    fetch(link, {
        headers: {
            'Authorization': 'Bearer ' + localStorage.getItem('jwtToken')
        }
    })
    .then(response => response.json())
    .then(data => {
        let tableBody = document.querySelector('#customerTable tbody');
        tableBody.innerHTML = '';
        data.forEach(customer => {
            let row = `
                <tr>
                    <td>${link}/${(link)}</td>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.email}</td>
                    <td>${customer.phone}</td>
                    <td>
                        <button onclick="editCustomer(${(link)})">Edit</button>
                        <button onclick="deleteCustomer(${(link)})">Delete</button>
                    </td>
                </tr>
            `;
            tableBody.innerHTML += row;
        });
    });
}

// Edit customer
function editCustomer(id) {
    fetch(`${link}/${id}`, {
        headers: {
            'Authorization': 'Bearer ' + localStorage.getItem('jwtToken')
        }
    })
    .then(response => response.json())
    .then(data => {
        // Handle edit customer logic
        let firstName = prompt('Enter new first name:', data.firstName);
        let lastName = prompt('Enter new last name:', data.lastName);
        let email = prompt('Enter new email:', data.email);
        let phone = prompt('Enter new phone:', data.phone);
        fetch(`${link}/${id}`, {
            method: 'PUT',
            headers: {
                'Authorization': 'Bearer ' + localStorage.getItem('jwtToken'),
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                firstName: firstName,
                lastName: lastName,
                email: email,
                phone: phone
            })
        })
        .then(response => response.json())
        .then(data => {
            loadCustomers();
        });
    });
}

// Delete customer
function deleteCustomer(id) {
    fetch(`${link}/${id}`, {
        method: 'DELETE',
        headers: {
            'Authorization': 'Bearer ' + localStorage.getItem('jwtToken')
        }
    })
    .then(response => response.json())
    .then(data => {
        // Handle delete customer logic
        console.log('Customer deleted successfully!');
        loadCustomers();
        alert('Customer deleted successfully!');
    })
    
}
