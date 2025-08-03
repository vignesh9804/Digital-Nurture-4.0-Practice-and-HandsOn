const Book = ({bookDetails}) => {
    return (
        <ul>
            {bookDetails.map((eachItem)=>
                <div key={eachItem.id}>
                    <h3>{eachItem.bname}</h3>
                    <p>{eachItem.price}</p>
                    <p>{eachItem.blogMatter}</p>
                </div>
            )}
        </ul>
    )
}

export default Book