package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ProductHunt: ImageVector
    get() {
        if (_productHunt != null) {
            return _productHunt!!
        }
        _productHunt = Builder(name = "ProductHunt", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(13.0f, 22.0f)
                lineTo(15.0f, 22.0f)
                lineTo(15.0f, 18.0f)
                lineTo(17.5f, 18.0f)
                curveTo(19.431f, 18.0f, 21.0f, 16.431f, 21.0f, 14.5f)
                curveTo(21.0f, 12.569f, 19.431f, 11.0f, 17.5f, 11.0f)
                lineTo(13.0f, 11.0f)
                close()
                moveTo(15.0f, 13.0f)
                lineTo(17.5f, 13.0f)
                curveTo(18.327f, 13.0f, 19.0f, 13.673f, 19.0f, 14.5f)
                curveTo(19.0f, 15.327f, 18.327f, 16.0f, 17.5f, 16.0f)
                lineTo(15.0f, 16.0f)
                lineTo(15.0f, 13.0f)
                close()
            }
        }
        .build()
        return _productHunt!!
    }

private var _productHunt: ImageVector? = null
