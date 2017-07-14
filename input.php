<!DOCTYPE html>
<html>
<head>
</head>
<body>

<?php
/**
 * Created by PhpStorm.
 * User: jasonlu
 * Date: 6/29/17
 * Time: 10:52 AM
 */

// File: input.php
// Author: Jason Lu (jasonlu6@bu.edu)
// Date: 6/29/2017 - 7/1/2017
// UROP Project #4

// This file is a small PHP file (embedded within HTML)
// that will be able to process the input that was handled in
// inputmain.html

// Collaborators:

/**
 * Densmore CIDAR LAB
 *
 * Rohin Banerji (rohinb96@bu.edu)
 * Marliene Pavan (mapavan@bu.edu)
 * Doug Densmore (dougd@bu.edu)
*/

<?php
// define the variables (for now, just the name, email,
// university, research division, gender, grade, and
// the type of file to upload) of user input

$name = $email = $university = $research = $gender = $grade = $file_type = "";

// use the post method to process the user input
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // get the name
    $name = test_input([$_POST["name"]]);
    // get the email
    $email = test_input([$_POST["email"]]);
    // get the university / college
    $university = test_input([$_POST["university"]]);
    // get the research division
    $research = test_input([$_POST["research"]]);
    // get the gender of the person
    $gender = test_input([$_POST["gender"]]);
    // get the grade (undergrad, postgrad, phD, or other)
    // of the person
    $grade = test_input([$_POST]["grade"]);
    // get the type of file from the user input
    $file_type = test([$_POST]["file_type"]);
}

// function to get all of the data
function test_input($data) {
    // accumulate all of the data
    $data = trim($data);
    // strip the slashes / whitespace
    $data = stripslashes($data);
    // deal with the special HTML characters case
    $data = htmlspecialchars($data);
    // return the data in processed form
    return $data;
}
?>


<!-- HTML embedded form -->
<!-- slightly green color -->
<h2 style="background-color:#6cbd7d">Gibson Assembly User Information: </h2>
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
    <!-- get the name -->
    Name: <input type="text" name="name">
    <br><br>
    Email: <input type="text" name="email">
    <br><br>
    University/Collge:<input type="text" name="university">
    <br><br>
    Type of research:
    <input type="radio" name="research" value="cidar">CIDAR LAB
    <br><br>
    <input type="radio" name="research" value="csail">CSAIL MIT
    <br><br>
    <input type="radio" name="research" value="clotho">HCSAIL CLOTHO
    <br><br>
    <input type="radio" name="research" value="wetlab">WETLAB
    <br><br>
    <input type="radio" name="research" value="damplab">DAMPLAB
    <br><br>
    <input type="radio" name="research">
    <br><br>
    Please enter your research group:
    <input type="text" name="research">
    <br><br>
    Please select your gender(s):
    <input type="checkbox" name="gender" value="male">Male
    <input type="checkbox" name="gender" value="female">Female
    <input type="checkbox" name="gender" value="LGBTQ">LGBTQ
    <input type="checkbox" name="gender" value="other">Other
    <br><br>
    Select one (or more) of the following levels of higher education:
    <br><br>
    <input type="button" name="grade" value="ugrad">Undergraduate
    <br><br>
    <input type="button" name="grade" value="grad">Graduate
    <br><br>
    <input type="button" name="grade" value="pgrad">Post-Graduate
    <br><br>
    <input type="button" name="grade" value="phd">Ph. D
    <br><br>
    <input type="button" name="grade" value=" ">Other
    <br><br>
    <!-- submit button -->
    <input type="submit" name="submit" value="Submit">
</form>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
<!-- let the user add some comments -->
    Comment:<textarea name="comment" rows="5" cols="40"></textarea>
</form>
<!-- additional information -->
<!-- ask for the type of file uploaded later -->

<!-- salmon red color -->
<h3 style="background-color: #d26460"</h2>

<!-- echo command: GET method -->
<?php
echo "<h4>Your input:</h4>";
echo $name;
echo "<br>";
echo $email;
echo "<br>";
echo $university;
echo "<br>";
echo $research;
echo "<br>";
echo $gender;
echo "<br>";
echo $grade;
?>

</body>
</html>
