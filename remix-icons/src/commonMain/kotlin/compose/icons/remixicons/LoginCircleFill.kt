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

public val RemixIcons.LoginCircleFill: ImageVector
    get() {
        if (_loginCircleFill != null) {
            return _loginCircleFill!!
        }
        _loginCircleFill = Builder(name = "LoginCircleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                horizontalLineTo(2.05f)
                curveTo(2.55f, 5.947f, 6.814f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-5.185f, 0.0f, -9.449f, -3.947f, -9.95f, -9.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(5.0f, -4.0f)
                lineToRelative(-5.0f, -4.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _loginCircleFill!!
    }

private var _loginCircleFill: ImageVector? = null
