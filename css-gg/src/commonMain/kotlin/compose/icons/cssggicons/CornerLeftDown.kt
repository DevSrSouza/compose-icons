package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerLeftDown: ImageVector
    get() {
        if (_cornerLeftDown != null) {
            return _cornerLeftDown!!
        }
        _cornerLeftDown = Builder(name = "CornerLeftDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.601f, 6.85f)
                curveTo(10.602f, 5.745f, 11.499f, 4.851f, 12.603f, 4.852f)
                lineTo(20.603f, 4.859f)
                lineTo(20.605f, 2.859f)
                lineTo(12.605f, 2.852f)
                curveTo(10.396f, 2.85f, 8.603f, 4.639f, 8.601f, 6.848f)
                lineTo(8.592f, 17.154f)
                lineTo(4.811f, 13.366f)
                lineTo(3.395f, 14.778f)
                lineTo(9.753f, 21.148f)
                lineTo(16.123f, 14.79f)
                lineTo(14.71f, 13.375f)
                lineTo(10.592f, 17.486f)
                lineTo(10.601f, 6.85f)
                close()
            }
        }
        .build()
        return _cornerLeftDown!!
    }

private var _cornerLeftDown: ImageVector? = null
