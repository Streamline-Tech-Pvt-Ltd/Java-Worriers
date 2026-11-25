function userProfile(){
const user={
    name:"sahil",
    city:"pune",
    age:"25"
}
return (
    <div>
<p>{user.name}</p>
<p>{user.city}</p>
<p>{user.age}</p>
    </div>
);

}
export default userProfile;