
var triplist;
var boatlist;
var boatIdtoDelete;
var geustIdtoDelet;
var tripTdtoStop;
var tripIdTodelete;
$(document).ready(function () {
    $('#stop').click(stoptrip);
    $('#delete').click(removeBoat);
     $('#delete1').click(removeGeust);
    $("#add").click(addName);
    $("#addgeust").click(addGeust);
    $("#start").click(addtripName);
    boatlist = $("#boatform").DataTable();
    getNames();

    triplist = $("#tripform").DataTable();
        getTrips();

    geustlist = $("#geustform").DataTable();
         getGeust();
});

function getNames() {
    $.get("/api/boat", function (boats) {
        boatlist.clear();
        for (i = 0; i < boats.length; i++) {
            const bot = boats[i];
            boatlist.row.add(
                $(
                    '<tr id="row' + bot.id + '"><td>' + bot.id + '</td>' +
                    '<td>' + bot.typeBoat + '</td>' +
                    '<td>' + bot.minimumPrice + '</td>' +
                    '<td>' + bot.actualPrice + '</td>' +
                    '<td>' + bot.boatNumber + '</td>' +
                    '<td>' + bot.seatsNumber + '</td>' +
                    '<td><button class="btn btn-success" onclick="confirmdeleteBoats(' + bot.id + ');">Delete</button></td></tr>'
));
        }
        boatlist.draw();
    });
}

function getTrips() {
    $.get("/api/trips", function (trips) {
        boatlist.clear();
        for (i = 0; i < trips.length; i++) {
            const bt = trips[i];
            triplist.row.add(
                $(
                    '<tr id="row' + bt.id + '"><td>' + bt.id + '</td>' +
                    '<td>' + bt.numberOfPersoon + '</td>' +
                    '<td>' + bt.numberOfBoat + '</td>' +
                    '<td>' + bt.duration + '</td>' +
                    '<td><button class="btn btn-success" onclick="confirmstoptrip(' + bt.id + ');">Stop Trip</button></td></tr>'
                ));
        }
        triplist.draw();
    });
}

function getGeust() {
    $.get("/api/geust", function (geusts) {
        geustlist.clear();
        for (i = 0; i < geusts.length; i++) {
            const gest = geusts[i];
            geustlist.row.add(
                $(
                    '<tr id="row' + gest.id + '"><td>' + gest.id + '</td>' +
                    '<td>' + gest.name + '</td>' +
                    '<td>' + gest.idNumber + '</td>' +
                    '<td>' + gest.phone + '</td>' +
                    '<td><button class="btn btn-success" onclick="confirmdeleteGeusts(' + gest.id + ');">delete</button></td></tr>'
               ));
        }
        geustlist.draw();
    });
}

function confirmstoptrip(id) {
    $('#confirm1').modal('show');

    tripTdtoStop = id;
}

function confirmdeleteBoats(id) {

    $('#confirm').modal('show');
    boatIdtoDelete = id;
}

function confirmdeleteGeusts(id) {

    $('#confirm2').modal('show');
    geustIdtoDelet = id;
}


//to removeBoat from datatable
function removeBoat() {
    $.ajax({
        url: '/api/boat/' + boatIdtoDelete,
        type: 'DELETE',
        success: function () {
            getNames();
            $('#confirm').modal('hide');

        },
        error: function () {
            alert('Something went wrong!!');
        }
    });
}
//to removeGeust from datatable
function removeGeust() {
    $.ajax({
        url: '/api/geust/' + geustIdtoDelet,
        type: 'DELETE',
        success: function () {
            getGeust();
            $('#confirm2').modal('hide');

        },
        error: function () {
            alert('Something went wrong!!');
        }
    });
}

//function to stop duration
function stoptrip() {
    $.ajax({
        url: '/api/trips/' + tripTdtoStop,
        type: 'PUT',
        success: function (trip) {
            trip.duration
            $('#confirm1').modal('hide');

        },
        error: function () {
            alert('Something went wrong!!');
        }
    });
}
//addboat to datatable
function addName() {

    var newboat = {
        typeBoat: $("#typeBoat").val(),
        minimumPrice: $("#minimumPrice").val(),
        actualPrice: $("#actualPrice").val(),
        boatNumber: $("#boatNumber").val(),
        seatsNumber: $("#seatsNumber").val(),


    }

    var jsonoject = JSON.stringify(newboat);
    $.ajax({
        url: "/api/boat/addBoat",
        contentType: "application/json",
        type: "POST",
        data: jsonoject,

        success: function () {
            alert("doen successflly");
            getNames();
        },
        error: function () {
            alert("doen not successflly");
        }
    });
}
//to add trip to datatable
function addtripName() {

    var newtrip = {
        numberOfPersoon: $("#numberOfPersoon").val(),
        numberOfBoat: $("#numberOfBoat").val(),
        duration: $("#duration").val(),
}

    var jsonoject = JSON.stringify(newtrip);
    $.ajax({
        url: "/api/trips/addtrip",
        contentType: "application/json",
        type: "POST",
        data: jsonoject,

        success: function () {
            alert("doen successflly");
            getTrips();
        },
        error: function () {
            alert("doen not successflly");
        }
    });
}
//to addgeust to datatable
function addGeust() {

    var newgeust = {
        name: $("#name").val(),
        idNumber: $("#idNumber").val(),
        phone: $("#phone").val(),
}

    var jsonoject = JSON.stringify(newgeust);

    $.ajax({
        url: "/api/geust/addGeust",
        contentType: "application/json",
        type: "POST",
        data: jsonoject,

        success: function () {
            alert("doen successflly");
            getGeust();
        },
        error: function () {
            alert("doen not successflly");
        }
    });
}






