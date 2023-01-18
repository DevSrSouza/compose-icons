package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.LoginCircleLine: ImageVector
    get() {
        if (_loginCircleLine != null) {
            return _loginCircleLine!!
        }
        _loginCircleLine = Builder(name = "LoginCircleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                lineTo(10.0f, 8.0f)
                lineToRelative(5.0f, 4.0f)
                lineToRelative(-5.0f, 4.0f)
                verticalLineToRelative(-3.0f)
                lineTo(1.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(2.458f, 15.0f)
                horizontalLineToRelative(2.124f)
                arcTo(8.003f, 8.003f, 0.0f, false, false, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.582f, 9.0f)
                lineTo(2.458f, 9.0f)
                curveTo(3.732f, 4.943f, 7.522f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-4.478f, 0.0f, -8.268f, -2.943f, -9.542f, -7.0f)
                close()
            }
        }
        .build()
        return _loginCircleLine!!
    }

private var _loginCircleLine: ImageVector? = null
