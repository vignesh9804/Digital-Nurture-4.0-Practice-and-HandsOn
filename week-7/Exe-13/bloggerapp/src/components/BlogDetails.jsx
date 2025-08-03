const Blog = ({blogDetails}) => {
    return (
        <ul>
            {blogDetails.map((eachItem)=>
                <div key={eachItem.id}>
                    <h3>{eachItem.bname}</h3>
                    <p>{eachItem.blogBy}</p>
                    <p>{eachItem.blogMatter}</p>
                </div>
            )}
        </ul>
    )
}

export default Blog