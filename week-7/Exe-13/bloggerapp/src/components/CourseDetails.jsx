const Course = ({courseDetails}) => {
    return (
        <ul>
            {courseDetails.map((eachItem)=>
                <div>
                    <h3>{eachItem.cname}</h3>
                    <p>{eachItem.cdate}</p>
                </div>
            )}
        </ul>
    )
}

export default Course