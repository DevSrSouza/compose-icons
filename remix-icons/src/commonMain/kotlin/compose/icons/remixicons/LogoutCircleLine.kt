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

public val RemixIcons.LogoutCircleLine: ImageVector
    get() {
        if (_logoutCircleLine != null) {
            return _logoutCircleLine!!
        }
        _logoutCircleLine = Builder(name = "LogoutCircleLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-5.0f, -4.0f)
                lineToRelative(5.0f, -4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(4.0f, 18.0f)
                horizontalLineToRelative(2.708f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -12.0f)
                lineTo(4.0f, 6.0f)
                arcTo(9.985f, 9.985f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                arcToRelative(9.985f, 9.985f, 0.0f, false, true, -8.0f, -4.0f)
                close()
            }
        }
        .build()
        return _logoutCircleLine!!
    }

private var _logoutCircleLine: ImageVector? = null
