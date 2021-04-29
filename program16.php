<?PHP
//Change the messages to what you want.
$afternoon = "Good afternoon! ";
$evening = "Good evening! ";
$late = "Working late? ";
$morning = "Good morning! ";
$friday= "Get ready for the weekend! ";
//Get the current hour
$current_time = date('G');
//Get the current day
$current_day = date('l');
//12 p.m. - 4 p.m.
if ($current_time >= 12 && $current_time <= 16) {
echo $afternoon;
}
// 5 p.m. to 11 p.m.
elseif ($current_time >= 17 && $current_time <= 24) {
echo $evening;
}
//12 a.m. - 5 a.m.
elseif ($current_time >= 1 && $current_time <= 5) {
echo $late;
}
// 6 a.m. to 11 a.m.
elseif ($current_time >= 6 && $current_time <= 11) {
echo $morning;
}
//If it's Friday, display a message
if ($current_day == "Friday")
{
echo $friday;
}
?>
