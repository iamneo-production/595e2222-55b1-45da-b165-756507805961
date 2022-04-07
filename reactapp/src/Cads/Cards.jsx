import React,{Component} from "react";
import Card from './CardUI';
import img1 from '../assets/pic1.jpg';
import img2 from '../assets/pic2.jpg';
import img3 from '../assets/pic3.jpg';
import img4 from '../assets/pic4.jpg';
import img5 from '../assets/pic5.jpg';
import img6 from '../assets/pic6.jpg';
import img7 from '../assets/pic7.jpg';
import img8 from '../assets/pic8.jpg';
import img9 from '../assets/pic9.jpg';
import img10 from '../assets/pic10.jpg';
import img11 from '../assets/pic11.jpg';
import img12 from '../assets/pic12.jpg';


class Cards extends Component{
    render(){
        return(
            <div className="container-fluid d-flex justify-content-center">
                <div className="row">
                    <div className="col-md-3">
                        <Card imgsrc={img1} title="justin bieber" songsdigit="0"/>
                    </div>
                    <div className="col-md-3">
                    <Card imgsrc={img2} title="ariana grande" songsdigit="0"/>
                    </div>
                    <div className="col-md-3">
                    <Card imgsrc={img3} title="shawn mendes" songsdigit="0"/>
                    </div>
                    <div className="col-md-3">
                    <Card imgsrc={img4} title="bts" songsdigit="0"/>
                    </div>


                    <div className="col-md-3">
                        <Card imgsrc={img5} title="ar rahaman" songsdigit="0"/>
                    </div>
                    <div className="col-md-3">
                    <Card imgsrc={img6} title="dua lipa" songsdigit="0"/>
                    </div>
                    <div className="col-md-3">
                    <Card imgsrc={img7} title="post malone" songsdigit="0"/>
                    </div>
                    <div className="col-md-3">
                    <Card imgsrc={img8} title="lil nas x" songsdigit="0"/>
                    </div>


                    <div className="col-md-3">
                        <Card imgsrc={img9} title="arijit singh" songsdigit="0"/>
                    </div>
                    <div className="col-md-3">
                    <Card imgsrc={img10} title="shreya goshal" songsdigit="0"/>
                    </div>
                    <div className="col-md-3">
                    <Card imgsrc={img11} title="sunandha sharma" songsdigit="0"/>
                    </div>
                    <div className="col-md-3">
                    <Card imgsrc={img12} title="jass manak" songsdigit="0"/>
                    </div>











                </div>
            </div>
        );
    }
}
export default Cards;
