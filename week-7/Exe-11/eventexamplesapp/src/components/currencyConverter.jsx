import { useState } from "react"

const CurrencyConverter = () => {
    const [amount,setAmount] = useState(0)
    const [currency,setCurrency] = useState("")

    const onChangeAmount = (event) => {
        setAmount(event.target.value);
    }

    const onChangeCurrency = (event) => {
        setCurrency(event.target.value);
    }

    const onSubmitButtonClicked = () => {
        const oneEuro = 101
        alert(`Converting to ${currency} Amount is ${amount*oneEuro}`)
    }

    return(
        <div>
            <h1 className="currency_heading">Currency Converter!!</h1>
            <label>Amount: </label>
            <input type="text" onChange={onChangeAmount} value={amount}/>
            <br/>
            <label>Currency: </label>
            <textarea rows="2" cols="25" onChange={onChangeCurrency} value={currency}></textarea>
            <br/>
            <button onClick={onSubmitButtonClicked}>Submit</button>
        </div>
    )
}

export default CurrencyConverter