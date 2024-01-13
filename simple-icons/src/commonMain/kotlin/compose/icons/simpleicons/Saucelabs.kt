package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Saucelabs: ImageVector
    get() {
        if (_saucelabs != null) {
            return _saucelabs!!
        }
        _saucelabs = Builder(name = "Saucelabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.4337f, 7.344f)
                curveToRelative(-0.5641f, -0.7664f, -1.469f, -1.2197f, -2.4343f, -1.2197f)
                lineTo(13.999f, 6.1243f)
                lineTo(11.9993f, 12.0f)
                horizontalLineToRelative(4.8377f)
                lineToRelative(-1.9998f, 5.8755f)
                lineTo(9.9995f, 17.8755f)
                lineToRelative(-1.9997f, 5.8755f)
                horizontalLineToRelative(9.0001f)
                curveToRelative(1.2912f, 0.0f, 2.438f, -0.8086f, 2.8466f, -2.0088f)
                lineTo(23.846f, 9.9922f)
                curveToRelative(0.3049f, -0.8957f, 0.1518f, -1.8807f, -0.4123f, -2.647f)
                close()
                moveTo(9.9997f, 11.999f)
                lineTo(7.1618f, 11.999f)
                lineToRelative(1.9997f, -5.8756f)
                horizontalLineToRelative(4.8378f)
                lineToRelative(2.001f, -5.8743f)
                lineTo(7.0f, 0.2491f)
                curveToRelative(-1.2912f, 0.0f, -2.438f, 0.8086f, -2.8466f, 2.0089f)
                lineTo(0.154f, 14.0079f)
                curveToRelative(-0.3049f, 0.8956f, -0.1518f, 1.8807f, 0.4123f, 2.647f)
                curveToRelative(0.5641f, 0.7663f, 1.469f, 1.2196f, 2.4343f, 1.2196f)
                horizontalLineToRelative(7.0004f)
                lineToRelative(1.9998f, -5.8755f)
                lineTo(10.001f, 11.999f)
                close()
            }
        }
        .build()
        return _saucelabs!!
    }

private var _saucelabs: ImageVector? = null
