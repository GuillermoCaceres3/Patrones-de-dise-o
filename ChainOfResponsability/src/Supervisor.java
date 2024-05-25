public class Supervisor implements Handler{
    private Handler nextApprover;

    @Override
    public void setNextApprover(Handler nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void approveRequest(Empleado request) {
        if (request.getPermissionType().equals("Vacation")){
            System.out.println("Supervisor approved vacation for " + request.getName());
        }else if(nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}
