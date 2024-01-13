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

public val SimpleIcons.E3: ImageVector
    get() {
        if (_e3 != null) {
            return _e3!!
        }
        _e3 = Builder(name = "E3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0676f, 16.5185f)
                lineTo(4.7723f, 16.5185f)
                verticalLineToRelative(-2.6738f)
                horizontalLineToRelative(6.2615f)
                verticalLineToRelative(-3.757f)
                lineTo(4.7723f, 10.0877f)
                verticalLineToRelative(-2.64f)
                horizontalLineToRelative(6.2615f)
                lineTo(11.0338f, 3.691f)
                lineTo(0.0f, 3.691f)
                verticalLineToRelative(16.6184f)
                horizontalLineToRelative(14.1476f)
                curveToRelative(0.0f, -0.0339f, -2.7754f, -0.7108f, -3.08f, -3.7908f)
                close()
                moveTo(21.1876f, 10.1216f)
                curveToRelative(1.8954f, 1.2862f, 2.8769f, 2.5385f, 2.8092f, 5.1108f)
                curveToRelative(-0.0677f, 2.6738f, -2.7754f, 5.043f, -5.72f, 5.043f)
                curveToRelative(-2.0984f, 0.0f, -4.7723f, -0.9477f, -5.7876f, -3.7569f)
                lineToRelative(3.4861f, -1.5569f)
                curveToRelative(0.4738f, 0.88f, 1.1508f, 1.557f, 2.2f, 1.557f)
                curveToRelative(1.1507f, 0.0f, 1.9969f, -0.88f, 2.0984f, -1.997f)
                curveToRelative(0.0339f, -0.2708f, -0.1353f, -2.2338f, -2.0984f, -2.3015f)
                lineToRelative(-2.2f, -0.237f)
                lineToRelative(2.8092f, -4.5353f)
                horizontalLineToRelative(-6.3292f)
                verticalLineToRelative(-3.757f)
                horizontalLineToRelative(11.5415f)
                close()
            }
        }
        .build()
        return _e3!!
    }

private var _e3: ImageVector? = null
