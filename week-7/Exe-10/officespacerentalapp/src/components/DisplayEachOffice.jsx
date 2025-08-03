const DisplayEachOffice = ({officeDetails}) => {
    const {name,cost,address} = officeDetails

    const costColor = cost<50000?"green":"red";

    return(
        <div>
            <h1>Name: {name}</h1>
            <h3 style={{color:costColor}}>Rent Rs.{officeDetails.cost}</h3>
            <h3>Address: {address}</h3>
        </div>
    )
}

export default DisplayEachOffice