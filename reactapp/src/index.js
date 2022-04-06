import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Navbar from './Navbar';


import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Card from './Cads/Cards';

ReactDOM.render(
  <React.StrictMode>
  
  <Navbar />
  <Card />
  
</React.StrictMode>,
  document.getElementById('root')
);

