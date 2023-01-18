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

public val RegularGroup.ArrowForwardDownPerson: ImageVector
    get() {
        if (_arrowForwardDownPerson != null) {
            return _arrowForwardDownPerson!!
        }
        _arrowForwardDownPerson = Builder(name = "ArrowForwardDownPerson", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.69f, 9.5004f)
                lineTo(16.727f, 6.5374f)
                curveTo(16.4341f, 6.2446f, 16.4341f, 5.7697f, 16.727f, 5.4768f)
                curveTo(16.9933f, 5.2105f, 17.41f, 5.1863f, 17.7036f, 5.4042f)
                lineTo(17.7877f, 5.4768f)
                lineTo(22.0303f, 9.7194f)
                curveTo(22.2966f, 9.9857f, 22.3208f, 10.4024f, 22.1029f, 10.696f)
                lineTo(22.0303f, 10.7801f)
                lineTo(17.7877f, 15.0227f)
                curveTo(17.4948f, 15.3156f, 17.0199f, 15.3156f, 16.727f, 15.0227f)
                curveTo(16.4608f, 14.7565f, 16.4366f, 14.3398f, 16.6544f, 14.0462f)
                lineTo(16.727f, 13.9621f)
                lineTo(19.69f, 11.0004f)
                lineTo(14.0f, 10.9998f)
                curveTo(9.8021f, 10.9998f, 6.3837f, 7.6621f, 6.2538f, 3.4958f)
                lineTo(6.25f, 3.2498f)
                curveTo(6.25f, 2.8355f, 6.5858f, 2.4998f, 7.0f, 2.4998f)
                curveTo(7.4142f, 2.4998f, 7.75f, 2.8355f, 7.75f, 3.2498f)
                curveTo(7.75f, 6.6248f, 10.4252f, 9.3751f, 13.7709f, 9.4956f)
                lineTo(14.0f, 9.4998f)
                lineTo(19.69f, 9.5004f)
                close()
                moveTo(9.0f, 13.5f)
                curveTo(9.0f, 14.8807f, 7.8807f, 16.0f, 6.5f, 16.0f)
                curveTo(5.1193f, 16.0f, 4.0f, 14.8807f, 4.0f, 13.5f)
                curveTo(4.0f, 12.1193f, 5.1193f, 11.0f, 6.5f, 11.0f)
                curveTo(7.8807f, 11.0f, 9.0f, 12.1193f, 9.0f, 13.5f)
                close()
                moveTo(11.0f, 18.875f)
                curveTo(11.0f, 20.4315f, 9.7143f, 22.0f, 6.5f, 22.0f)
                curveTo(3.2857f, 22.0f, 2.0f, 20.4374f, 2.0f, 18.875f)
                verticalLineTo(18.772f)
                curveTo(2.0f, 17.7929f, 2.7937f, 17.0f, 3.7727f, 17.0f)
                horizontalLineTo(9.2273f)
                curveTo(10.2063f, 17.0f, 11.0f, 17.793f, 11.0f, 18.772f)
                verticalLineTo(18.875f)
                close()
            }
        }
        .build()
        return _arrowForwardDownPerson!!
    }

private var _arrowForwardDownPerson: ImageVector? = null
