import Toast_Swift

@objc(Toast)
class Toast: NSObject {

    @objc(multiply:withB:withResolver:withRejecter:)
    func multiply(a: Float, b: Float, resolve:RCTPromiseResolveBlock,reject:RCTPromiseRejectBlock) -> Void {
        resolve(a*b)
    }
    
    @objc(show:)
    func show(message: String) -> Void {
        DispatchQueue.main.async{
            let vc = UIApplication.shared.delegate?.window??.rootViewController;
            vc?.view.makeToast(message)
        }
    }
}
