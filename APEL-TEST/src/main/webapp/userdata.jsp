
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        *{
            margin-top: 10px;
            background-color:greenyellow;
            font-size: 28px;
            font-style: italic;
            font-variant: small-caps;
            text-shadow: 2px 2px 5px;
            color: rgb(33, 96, 233);
        }
    </style>
</head>
<body>
    <center>
    <form action="/success"><b>
        <label for="">Name</label>
        <input type="text" name="name"  required><br><br>
        <label for="">Email</label>
        <input type="email" name="email" ><br><br>
        <label for="">Mobile Number</label>
        <input type="tel" name="mobileNumber" pattern="[0-9]{10}"><br><br>
        <label for="">Date Of Birth</label>
        <input  type="date" name="DOB"><br><br>
        <legend>select any one location</legend>
            <select name="location" id="">
                <option value="">--select--</option>
                <option value="">Any Location</option>
                <option value="">Bangalore</option>
                <option value="">Hyderabad</option>
                <option value="">Chennai</option>
                <option value="">New Delhi</option>
            </select><br><br>
        <label for="">identification document</label><br>
        <input type="file" name="Identification_Document" accept="application/pdf,image/png,.pdf,.png" maxlength="2097152"><br><br>
        <button type="submit">submit</button></b>
    </form>
</center>
</body>
</html>