package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ArrowEnterUp: ImageVector
    get() {
        if (_arrowEnterUp != null) {
            return _arrowEnterUp!!
        }
        _arrowEnterUp = Builder(name = "ArrowEnterUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 21.0f)
                curveTo(20.0f, 21.5128f, 19.614f, 21.9355f, 19.1166f, 21.9933f)
                lineTo(19.0f, 22.0f)
                lineTo(12.5f, 22.0f)
                curveTo(10.6314f, 22.0f, 9.1049f, 20.5357f, 9.0052f, 18.692f)
                lineTo(9.0f, 18.5f)
                lineTo(9.0f, 5.415f)
                lineTo(5.7071f, 8.7071f)
                curveTo(5.3466f, 9.0676f, 4.7794f, 9.0953f, 4.3871f, 8.7903f)
                lineTo(4.2929f, 8.7071f)
                curveTo(3.9324f, 8.3466f, 3.9047f, 7.7794f, 4.2097f, 7.3871f)
                lineTo(4.2929f, 7.2929f)
                lineTo(9.2929f, 2.2929f)
                curveTo(9.3283f, 2.2575f, 9.3657f, 2.2253f, 9.4047f, 2.1963f)
                lineTo(9.5159f, 2.1247f)
                lineTo(9.6287f, 2.0712f)
                lineTo(9.734f, 2.0358f)
                lineTo(9.8515f, 2.011f)
                lineTo(9.9102f, 2.004f)
                lineTo(10.0f, 2.0f)
                lineTo(10.0752f, 2.0028f)
                lineTo(10.2007f, 2.0202f)
                lineTo(10.3121f, 2.0497f)
                lineTo(10.4232f, 2.0937f)
                lineTo(10.5207f, 2.146f)
                lineTo(10.6129f, 2.2097f)
                lineTo(10.7071f, 2.2929f)
                lineTo(15.7071f, 7.2929f)
                curveTo(16.0976f, 7.6834f, 16.0976f, 8.3166f, 15.7071f, 8.7071f)
                curveTo(15.3466f, 9.0676f, 14.7794f, 9.0953f, 14.3871f, 8.7903f)
                lineTo(14.2929f, 8.7071f)
                lineTo(11.0f, 5.415f)
                lineTo(11.0f, 18.5f)
                curveTo(11.0f, 19.2797f, 11.5949f, 19.9204f, 12.3555f, 19.9931f)
                lineTo(12.5f, 20.0f)
                lineTo(19.0f, 20.0f)
                curveTo(19.5523f, 20.0f, 20.0f, 20.4477f, 20.0f, 21.0f)
                close()
            }
        }
        .build()
        return _arrowEnterUp!!
    }

private var _arrowEnterUp: ImageVector? = null
