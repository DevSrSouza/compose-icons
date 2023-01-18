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

public val RegularGroup.PersonChat: ImageVector
    get() {
        if (_personChat != null) {
            return _personChat!!
        }
        _personChat = Builder(name = "PersonChat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3108f, 15.4983f)
                curveTo(11.4832f, 14.9647f, 11.7227f, 14.4613f, 12.0193f, 13.9979f)
                horizontalLineTo(6.2493f)
                curveTo(5.0071f, 13.9979f, 4.0f, 15.005f, 4.0f, 16.2473f)
                verticalLineTo(16.8251f)
                curveTo(4.0f, 17.7181f, 4.3186f, 18.5818f, 4.8985f, 19.2609f)
                curveTo(6.3107f, 20.9147f, 8.3893f, 21.8134f, 11.0903f, 21.9745f)
                lineTo(11.5412f, 20.4934f)
                curveTo(9.0393f, 20.4139f, 7.2221f, 19.6716f, 6.0394f, 18.2866f)
                curveTo(5.6915f, 17.8791f, 5.5003f, 17.3609f, 5.5003f, 16.8251f)
                verticalLineTo(16.2473f)
                curveTo(5.5003f, 15.8336f, 5.8357f, 15.4983f, 6.2493f, 15.4983f)
                horizontalLineTo(11.3108f)
                close()
                moveTo(11.9981f, 2.0f)
                curveTo(14.7601f, 2.0f, 16.9991f, 4.2391f, 16.9991f, 7.0011f)
                curveTo(16.9991f, 9.7631f, 14.7601f, 12.0022f, 11.9981f, 12.0022f)
                curveTo(9.2361f, 12.0022f, 6.9971f, 9.7631f, 6.9971f, 7.0011f)
                curveTo(6.9971f, 4.2391f, 9.2361f, 2.0f, 11.9981f, 2.0f)
                close()
                moveTo(11.9981f, 3.5003f)
                curveTo(10.0647f, 3.5003f, 8.4974f, 5.0677f, 8.4974f, 7.0011f)
                curveTo(8.4974f, 8.9345f, 10.0647f, 10.5019f, 11.9981f, 10.5019f)
                curveTo(13.9315f, 10.5019f, 15.4988f, 8.9345f, 15.4988f, 7.0011f)
                curveTo(15.4988f, 5.0677f, 13.9315f, 3.5003f, 11.9981f, 3.5003f)
                close()
                moveTo(23.0f, 17.4988f)
                curveTo(23.0f, 20.537f, 20.5371f, 23.0f, 17.4989f, 23.0f)
                curveTo(16.5312f, 23.0f, 15.6219f, 22.7502f, 14.832f, 22.3115f)
                lineTo(12.6449f, 22.977f)
                curveTo(12.2621f, 23.0935f, 11.9043f, 22.7357f, 12.0209f, 22.3529f)
                lineTo(12.6866f, 20.1664f)
                curveTo(12.2477f, 19.3763f, 11.9977f, 18.4667f, 11.9977f, 17.4988f)
                curveTo(11.9977f, 14.4605f, 14.4607f, 11.9976f, 17.4989f, 11.9976f)
                curveTo(20.5371f, 11.9976f, 23.0f, 14.4605f, 23.0f, 17.4988f)
                close()
                moveTo(15.4985f, 15.9985f)
                curveTo(15.2223f, 15.9985f, 14.9984f, 16.2224f, 14.9984f, 16.4986f)
                curveTo(14.9984f, 16.7748f, 15.2223f, 16.9987f, 15.4985f, 16.9987f)
                horizontalLineTo(19.4993f)
                curveTo(19.7755f, 16.9987f, 19.9994f, 16.7748f, 19.9994f, 16.4986f)
                curveTo(19.9994f, 16.2224f, 19.7755f, 15.9985f, 19.4993f, 15.9985f)
                horizontalLineTo(15.4985f)
                close()
                moveTo(14.9984f, 18.499f)
                curveTo(14.9984f, 18.7752f, 15.2223f, 18.9991f, 15.4985f, 18.9991f)
                horizontalLineTo(17.4989f)
                curveTo(17.7751f, 18.9991f, 17.999f, 18.7752f, 17.999f, 18.499f)
                curveTo(17.999f, 18.2228f, 17.7751f, 17.9989f, 17.4989f, 17.9989f)
                horizontalLineTo(15.4985f)
                curveTo(15.2223f, 17.9989f, 14.9984f, 18.2228f, 14.9984f, 18.499f)
                close()
            }
        }
        .build()
        return _personChat!!
    }

private var _personChat: ImageVector? = null
