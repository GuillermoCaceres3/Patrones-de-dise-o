public interface Handler {
    public void setNextApprover(Handler nextApprover);
    public void approveRequest(Empleado request);
}
