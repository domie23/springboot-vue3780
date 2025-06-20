const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootljm7u/",
            name: "springbootljm7u",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "班级综合测评管理系统"
        } 
    }
}
export default base
