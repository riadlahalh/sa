var arabic=document.getElementById("a");
var english=document.getElementById("e");
var title=document.getElementById("title");
var t1=document.getElementById("t1");
var t2=document.getElementById("t2");
var t3=document.getElementById("t3");
arabic. onclick  =()=>{
  setlanugage("arabic");
  localStorage.setItem("lang","arabic");
};
english.onclick=()=>{
  setlanugage("english");
  localStorage.setItem("lang","english");
};
onload=()=>{
 setlanugage(localStorage.getItem("lang"));
};
function setlanugage(getlanuage){
  if(getlanuage==="arabic"){
      title.innerHTML="رياض لحلاح";
      t1.innerHTML="مرحبا";
      t2.innerHTML="رياض لحلاح";
      t3.innerHTML="اتصل بنا ";
}else if(getlanuage==="english"){
  title.innerHTML="riad lahlah";
   t1.innerHTML="hello";
      t2.innerHTML="riad lahlah";
      t3.innerHTML="contqct u";
 
}
}