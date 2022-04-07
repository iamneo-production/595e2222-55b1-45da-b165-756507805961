import React from "react";
const SignUp = () =>{
    return (

    <>
    <nav className="main-nav">
        <div className="logo">
            <h2>
            <span>R</span>ipple
            <span>T</span>one
            </h2>
        </div>
        <div className="menu-link">
            <ul>
                <li><a href="#">Home</a></li>
            </ul>
            <div className="hamburger-menu">
                <a>
                <img src="https://image.flaticon.com/icons/svg/2016/2016012.svg" alt="burger icon" />
                </a>
            </div>
        </div>
    </nav>
    <div className="main-div" id="box">
        <ul>
            <li>
            <div className="form">
            <h2 className="h2"> <b>Sign up</b> </h2>
        <form action="">
            <div className="form-div">
                <label htmlFor="email"></label>
                <input size="50" className="input" type="text" autoComplete="off" name="email" id="email" placeholder="Enter email" required></input>
            </div>
                <br></br>
            <div className="form-div">
                <label htmlFor="username"></label>
                <input className="input" type="text" autoComplete="off" name="username" id="username" placeholder="Enter Username" required></input>
            </div>
                <br></br>
            <div className="form-div">
                <label htmlFor="phone"></label>
                <input className="input" type="text" autoComplete="off" name="phone" id="mobileNumber" placeholder="Enter Mobile number" required></input>
            </div>
                <br></br>
            <div className="form-div">
                <label htmlFor="password"></label>
                <input className="input" type="text" autoComplete="off" name="password" id="password" placeholder="Password" required></input>
            </div>
                <br></br>
            <div className="form-div">
                <label htmlFor="cpassword"></label>
                <input className="input" type="text" autoComplete="off" name="cpassword" id="confirmPassword" placeholder="Confirm Password" required></input>
            </div>
            <div className="signin" id="signinLink">
                Already a user? Login
            </div>
                <br></br>
            <button className="submit" type="submit" id="submitButton"><b>Submit</b></button>
        </form>
        </div>
        </li>
        </ul>
        </div>
    </>
    )
}
export default SignUp;