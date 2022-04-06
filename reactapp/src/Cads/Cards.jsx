import React,{Component} from "react";
import Card from './CardUI';
import img1 from '../assets/pic1.jpg';
import img2 from '../assets/pic2.jpg';
import img3 from '../assets/pic3.jpg';
import img4 from '../assets/pic4.jpg';


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











                </div>
            </div>
        );
    }
}
export default Cards;