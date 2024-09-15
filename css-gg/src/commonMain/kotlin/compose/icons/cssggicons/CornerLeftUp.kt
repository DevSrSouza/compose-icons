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

public val CssGgIcons.CornerLeftUp: ImageVector
    get() {
        if (_cornerLeftUp != null) {
            return _cornerLeftUp!!
        }
        _cornerLeftUp = Builder(name = "CornerLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.71f, 10.625f)
                lineTo(16.123f, 9.21f)
                lineTo(9.753f, 2.852f)
                lineTo(3.395f, 9.222f)
                lineTo(4.811f, 10.635f)
                lineTo(8.592f, 6.846f)
                lineTo(8.601f, 17.152f)
                curveTo(8.603f, 19.361f, 10.396f, 21.15f, 12.605f, 21.148f)
                lineTo(20.605f, 21.141f)
                lineTo(20.603f, 19.141f)
                lineTo(12.603f, 19.148f)
                curveTo(11.499f, 19.149f, 10.602f, 18.255f, 10.601f, 17.15f)
                lineTo(10.592f, 6.514f)
                lineTo(14.71f, 10.625f)
                close()
            }
        }
        .build()
        return _cornerLeftUp!!
    }

private var _cornerLeftUp: ImageVector? = null
