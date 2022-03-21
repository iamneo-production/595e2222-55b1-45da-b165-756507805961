import React from "react";

function MusicPage() {
    return (
        <div class="container">
            <div class="row p-2">
                <div class="col-2 d-flex justify-content-center align-items-center"><h2>Master</h2></div>
                <div class="col-8"><input type="text" class="form-control"  /></div>
                <div class="col"><button type="button" class="btn btn-primary">Search</button></div>
            </div>
            <div class="row">
                <div class="col-9 d-flex flex-column flex-fill gap-3 pt-5">
                    <div class="row align-items-center">
                        <span class="col-1">1.</span>
                        <span class="col-4">Song Name</span>
                        <span class="col-4">Singer</span>
                        <span class="col-1">Like</span>
                        <span class="col-2"><button type="button" class="btn btn-secondary"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-play" viewBox="0 0 16 16"><path d="M10.804 8 5 4.633v6.734L10.804 8zm.792-.696a.802.802 0 0 1 0 1.392l-6.363 3.692C4.713 12.69 4 12.345 4 11.692V4.308c0-.653.713-.998 1.233-.696l6.363 3.692z"></path></svg></button></span>
                    </div>
                    <div class="row align-items-center">
                        <span class="col-1">2.</span>
                        <span class="col-4">Song Name</span>
                        <span class="col-4">Singer</span>
                        <span class="col-1">Like</span>
                        <span class="col-2"><button type="button" class="btn btn-secondary"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-play" viewBox="0 0 16 16"><path d="M10.804 8 5 4.633v6.734L10.804 8zm.792-.696a.802.802 0 0 1 0 1.392l-6.363 3.692C4.713 12.69 4 12.345 4 11.692V4.308c0-.653.713-.998 1.233-.696l6.363 3.692z"></path></svg></button></span>
                    </div>
                    <div class="row align-items-center">
                        <span class="col-1">3.</span>
                        <span class="col-4">Song Name</span>
                        <span class="col-4">Singer</span>
                        <span class="col-1">Like</span>
                        <span class="col-2"><button type="button" class="btn btn-secondary"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-play" viewBox="0 0 16 16"><path d="M10.804 8 5 4.633v6.734L10.804 8zm.792-.696a.802.802 0 0 1 0 1.392l-6.363 3.692C4.713 12.69 4 12.345 4 11.692V4.308c0-.653.713-.998 1.233-.696l6.363 3.692z"></path></svg></button></span>
                    </div>
                    <div class="row align-items-center">
                        <span class="col-1">4.</span>
                        <span class="col-4">Song Name</span>
                        <span class="col-4">Singer</span>
                        <span class="col-1">Like</span>
                        <span class="col-2"><button type="button" class="btn btn-secondary"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-play" viewBox="0 0 16 16"><path d="M10.804 8 5 4.633v6.734L10.804 8zm.792-.696a.802.802 0 0 1 0 1.392l-6.363 3.692C4.713 12.69 4 12.345 4 11.692V4.308c0-.653.713-.998 1.233-.696l6.363 3.692z"></path></svg></button></span>
                    </div>
                </div>
                <div class="col-3 d-flex flex-column flex-fill gap-3 pt-5">
                    <h4>Master</h4>
                    <span><b>Release Date: </b> 11-02-2200</span>
                    <span><b>Release Date: </b> 11-02-2200</span>
                    <span><b>Release Date: </b> 11-02-2200</span>
                    <span><b>Release Date: </b> 11-02-2200</span>
                </div>
            </div>
        </div>
    )
}

export default MusicPage;