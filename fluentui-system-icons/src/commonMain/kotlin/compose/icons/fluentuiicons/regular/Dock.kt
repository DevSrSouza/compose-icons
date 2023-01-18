package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Dock: ImageVector
    get() {
        if (_dock != null) {
            return _dock!!
        }
        _dock = Builder(name = "Dock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.7935f, 9.9968f)
                horizontalLineTo(9.4919f)
                curveTo(9.9061f, 9.9968f, 10.2419f, 10.3326f, 10.2419f, 10.7468f)
                curveTo(10.2419f, 11.1265f, 9.9598f, 11.4403f, 9.5937f, 11.4899f)
                lineTo(9.4919f, 11.4968f)
                horizontalLineTo(4.7935f)
                curveTo(4.1219f, 11.4968f, 3.5908f, 11.9464f, 3.527f, 12.4981f)
                lineTo(3.5206f, 12.6097f)
                lineTo(3.5f, 17.3862f)
                curveTo(3.5f, 17.947f, 3.9891f, 18.4316f, 4.6406f, 18.49f)
                lineTo(4.7729f, 18.4959f)
                horizontalLineTo(19.2271f)
                curveTo(19.8987f, 18.4959f, 20.4298f, 18.0463f, 20.4936f, 17.4946f)
                lineTo(20.5f, 17.383f)
                lineTo(20.5206f, 12.6065f)
                curveTo(20.5206f, 12.0457f, 20.0315f, 11.561f, 19.38f, 11.5027f)
                lineTo(19.2477f, 11.4968f)
                horizontalLineTo(14.5528f)
                curveTo(14.1386f, 11.4968f, 13.8028f, 11.161f, 13.8028f, 10.7468f)
                curveTo(13.8028f, 10.3671f, 14.0849f, 10.0533f, 14.451f, 10.0036f)
                lineTo(14.5528f, 9.9968f)
                horizontalLineTo(19.2477f)
                curveTo(20.7073f, 9.9968f, 21.9237f, 11.0634f, 22.0151f, 12.4427f)
                lineTo(22.0206f, 12.6097f)
                lineTo(22.0f, 17.3862f)
                curveTo(22.0f, 18.7863f, 20.8398f, 19.9067f, 19.401f, 19.9909f)
                lineTo(19.2271f, 19.9959f)
                horizontalLineTo(4.7729f)
                curveTo(3.3133f, 19.9959f, 2.0969f, 18.9293f, 2.0055f, 17.55f)
                lineTo(2.0f, 17.383f)
                lineTo(2.0206f, 12.6065f)
                curveTo(2.0206f, 11.2064f, 3.1808f, 10.086f, 4.6196f, 10.0018f)
                lineTo(4.7935f, 9.9968f)
                horizontalLineTo(9.4919f)
                horizontalLineTo(4.7935f)
                close()
                moveTo(12.4462f, 3.147f)
                lineTo(12.5303f, 3.2197f)
                lineTo(16.4554f, 7.1447f)
                curveTo(16.7483f, 7.4376f, 16.7483f, 7.9125f, 16.4554f, 8.2054f)
                curveTo(16.1891f, 8.4717f, 15.7725f, 8.4959f, 15.4788f, 8.278f)
                lineTo(15.3947f, 8.2054f)
                lineTo(12.7383f, 5.5458f)
                lineTo(12.7397f, 15.2539f)
                curveTo(12.7397f, 15.6681f, 12.4039f, 16.0039f, 11.9897f, 16.0039f)
                curveTo(11.5755f, 16.0039f, 11.2397f, 15.6681f, 11.2397f, 15.2539f)
                lineTo(11.2409f, 5.569f)
                lineTo(8.6053f, 8.2054f)
                curveTo(8.339f, 8.4717f, 7.9223f, 8.4959f, 7.6287f, 8.278f)
                lineTo(7.5446f, 8.2054f)
                curveTo(7.2783f, 7.9391f, 7.2541f, 7.5225f, 7.472f, 7.2288f)
                lineTo(7.5446f, 7.1447f)
                lineTo(11.4697f, 3.2197f)
                curveTo(11.7359f, 2.9534f, 12.1526f, 2.9292f, 12.4462f, 3.147f)
                close()
            }
        }
        .build()
        return _dock!!
    }

private var _dock: ImageVector? = null
