import './App.css';
import DisplayEachOffice from './components/DisplayEachOffice';

function App() {
  const element = "Office Space"
  const Imgurl = "https://t4.ftcdn.net/jpg/03/84/55/29/360_F_384552930_zPoe9zgmCF7qgt8fqSedcyJ6C6Ye3dFs.jpg"
  const jsxatt = <img src={Imgurl} alt='office' width="25%" height="25%"/>
  const officeDetails = [{name:"Vignesh Office",cost:40000,address:"Chennai"}]


  return (
    <div className="App">
      <h1>{element} ,at Affordable space</h1>
      {jsxatt}
      {
        officeDetails.map((eachItem)=><DisplayEachOffice officeDetails={eachItem}/>)
      }
    </div>
  );
}

export default App;
