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

public val SimpleIcons.Nsis: ImageVector
    get() {
        if (_nsis != null) {
            return _nsis!!
        }
        _nsis = Builder(name = "Nsis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.736f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineToRelative(-5.132f, -4.919f)
                lineTo(13.736f, 24.0f)
                close()
                moveTo(7.715f, 18.936f)
                lineTo(12.848f, 23.854f)
                lineTo(17.98f, 18.935f)
                lineTo(7.715f, 18.936f)
                close()
                moveTo(1.176f, 13.664f)
                verticalLineToRelative(9.838f)
                lineToRelative(5.132f, -4.919f)
                lineToRelative(-1.503f, -1.441f)
                lineToRelative(-3.629f, -3.478f)
                close()
                moveTo(22.824f, 12.038f)
                lineTo(17.692f, 16.957f)
                lineTo(22.824f, 21.876f)
                verticalLineToRelative(-9.838f)
                close()
                moveTo(17.98f, 18.231f)
                lineTo(12.848f, 13.311f)
                lineTo(7.716f, 18.231f)
                lineTo(17.98f, 18.231f)
                close()
                moveTo(1.696f, 13.165f)
                lineToRelative(5.132f, 4.92f)
                lineToRelative(5.132f, -4.92f)
                lineTo(1.696f, 13.165f)
                close()
                moveTo(22.304f, 11.54f)
                lineTo(12.039f, 11.54f)
                lineToRelative(5.133f, 4.919f)
                lineToRelative(5.132f, -4.919f)
                close()
                moveTo(6.828f, 7.541f)
                lineToRelative(-5.132f, 4.92f)
                lineTo(11.96f, 12.461f)
                lineToRelative(-5.132f, -4.92f)
                close()
                moveTo(1.176f, 11.962f)
                lineTo(6.308f, 7.043f)
                lineTo(1.176f, 2.124f)
                verticalLineToRelative(9.838f)
                close()
                moveTo(22.304f, 10.835f)
                lineTo(17.172f, 5.915f)
                lineTo(12.039f, 10.835f)
                horizontalLineToRelative(10.265f)
                close()
                moveTo(16.284f, 5.77f)
                lineTo(6.02f, 5.77f)
                lineToRelative(5.132f, 4.919f)
                lineToRelative(5.132f, -4.919f)
                close()
                moveTo(22.824f, 0.498f)
                lineTo(17.692f, 5.417f)
                lineTo(22.824f, 10.337f)
                lineTo(22.824f, 0.498f)
                close()
                moveTo(16.285f, 5.065f)
                lineTo(11.152f, 0.146f)
                lineTo(6.02f, 5.065f)
                horizontalLineToRelative(10.265f)
                close()
                moveTo(10.264f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineToRelative(5.132f, 4.919f)
                lineTo(10.264f, 0.0f)
                close()
            }
        }
        .build()
        return _nsis!!
    }

private var _nsis: ImageVector? = null
