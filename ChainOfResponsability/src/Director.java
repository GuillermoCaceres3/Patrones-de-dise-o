public class Director implements Handler{

    private Handler nextApprover;

    @Override
    public void setNextApprover(Handler nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void approveRequest(Empleado request) {
        if (request.getPermissionType().equals("Access")){
            System.out.println("Director approved access for " + request.getName());
        }else if(nextApprover != null){
            nextApprover.approveRequest(request);
        }else{
            System.out.println("Request for " + request.getPermissionType() + " by " + request.getName() + " was denied ");
        }
    }
}
