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

public val SimpleIcons.Inspire: ImageVector
    get() {
        if (_inspire != null) {
            return _inspire!!
        }
        _inspire = Builder(name = "Inspire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(3.873f, 3.6875f)
                curveToRelative(1.0359f, -8.0E-4f, 1.8758f, 0.8391f, 1.875f, 1.875f)
                curveToRelative(-3.0E-4f, 1.035f, -0.8399f, 1.8738f, -1.875f, 1.873f)
                curveTo(2.8387f, 7.4352f, 2.0003f, 6.5968f, 2.0f, 5.5625f)
                curveToRelative(-8.0E-4f, -1.035f, 0.838f, -1.8747f, 1.873f, -1.875f)
                close()
                moveTo(8.3633f, 4.1953f)
                horizontalLineToRelative(3.5312f)
                lineToRelative(6.7344f, 10.8125f)
                horizontalLineToRelative(0.045f)
                lineTo(18.6739f, 4.1953f)
                lineTo(22.0f, 4.1953f)
                verticalLineToRelative(16.1172f)
                horizontalLineToRelative(-3.5469f)
                lineToRelative(-6.7168f, -10.791f)
                horizontalLineToRelative(-0.0468f)
                verticalLineToRelative(10.791f)
                lineTo(8.3633f, 20.3125f)
                lineTo(8.3633f, 4.1953f)
                close()
                moveTo(2.2403f, 8.9824f)
                reflectiveCurveToRelative(0.013f, 0.0041f, 3.3886f, 0.0f)
                verticalLineToRelative(11.2754f)
                lineTo(2.2402f, 20.2578f)
                lineTo(2.2402f, 8.9824f)
                close()
            }
        }
        .build()
        return _inspire!!
    }

private var _inspire: ImageVector? = null
