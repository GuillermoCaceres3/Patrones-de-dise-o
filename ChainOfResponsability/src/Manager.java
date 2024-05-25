public class Manager implements Handler{
    private Handler nextApprover;

    @Override
    public void setNextApprover(Handler nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void approveRequest(Empleado request) {
        if (request.getPermissionType().equals("Purchase")){
            System.out.println("Manager approved purchase for " + request.getName());
        }else if(nextApprover != null){
            nextApprover.approveRequest(request);
        }
    }
}
