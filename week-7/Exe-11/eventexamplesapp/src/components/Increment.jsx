import { useState } from "react"

const Increment = ()=>{
    const [numValue,setNumValue] = useState(0)

    const incrementNumValue=()=>{
        setNumValue((preValue)=>preValue+1);
        alert("Hello")
    }

    const decrenmentValue = () => {
        setNumValue((preValue)=>preValue-1);
    }

    return(
        <div>
            <p>{numValue}</p>
            <button onClick={incrementNumValue}>Increment</button>
            <br/>
            <button onClick={decrenmentValue}>Decrenment</button>
        </div>
    )
}

export default Increment