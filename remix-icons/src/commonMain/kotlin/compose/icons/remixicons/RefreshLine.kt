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

public val RemixIcons.RefreshLine: ImageVector
    get() {
        if (_refreshLine != null) {
            return _refreshLine!!
        }
        _refreshLine = Builder(name = "RefreshLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.463f, 4.433f)
                arcTo(9.961f, 9.961f, 0.0f, false, true, 12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.136f, -0.67f, 4.116f, -1.81f, 5.74f)
                lineTo(17.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 6.46f, 6.228f)
                lineToRelative(-0.997f, -1.795f)
                close()
                moveTo(18.537f, 19.567f)
                arcTo(9.961f, 9.961f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -2.136f, 0.67f, -4.116f, 1.81f, -5.74f)
                lineTo(7.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.54f, 5.772f)
                lineToRelative(0.997f, 1.795f)
                close()
            }
        }
        .build()
        return _refreshLine!!
    }

private var _refreshLine: ImageVector? = null
