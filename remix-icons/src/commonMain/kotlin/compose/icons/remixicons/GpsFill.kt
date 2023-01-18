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

public val RemixIcons.GpsFill: ImageVector
    get() {
        if (_gpsFill != null) {
            return _gpsFill!!
        }
        _gpsFill = Builder(name = "GpsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                lineToRelative(3.0f, 6.0f)
                lineTo(9.0f, 22.0f)
                lineToRelative(3.0f, -6.0f)
                close()
                moveTo(9.373f, 16.255f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.255f, 0.0f)
                lineToRelative(-1.356f, -2.711f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.544f, 0.0f)
                lineToRelative(-1.355f, 2.71f)
                close()
                moveTo(7.132f, 20.737f)
                arcTo(9.997f, 9.997f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                arcToRelative(9.997f, 9.997f, 0.0f, false, true, -5.132f, 8.737f)
                lineToRelative(-1.343f, -2.688f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -7.05f, 0.0f)
                lineToRelative(-1.343f, 2.688f)
                close()
            }
        }
        .build()
        return _gpsFill!!
    }

private var _gpsFill: ImageVector? = null
