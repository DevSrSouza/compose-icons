package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CardSpades: ImageVector
    get() {
        if (_cardSpades != null) {
            return _cardSpades!!
        }
        _cardSpades = Builder(name = "CardSpades", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.146f, 11.707f)
                curveTo(8.365f, 12.488f, 8.365f, 13.755f, 9.146f, 14.536f)
                curveTo(9.928f, 15.317f, 11.194f, 15.317f, 11.975f, 14.536f)
                lineTo(12.0f, 14.51f)
                lineTo(12.025f, 14.535f)
                curveTo(12.806f, 15.317f, 14.073f, 15.317f, 14.854f, 14.535f)
                curveTo(15.635f, 13.755f, 15.635f, 12.488f, 14.854f, 11.707f)
                lineTo(12.025f, 8.879f)
                lineTo(12.0f, 8.904f)
                lineTo(11.975f, 8.879f)
                lineTo(9.146f, 11.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 20.0f)
                curveTo(3.0f, 21.657f, 4.343f, 23.0f, 6.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 23.0f, 21.0f, 21.657f, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 2.343f, 19.657f, 1.0f, 18.0f, 1.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 1.0f, 3.0f, 2.343f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 21.0f, 19.0f, 20.552f, 19.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(19.0f, 3.448f, 18.552f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 3.0f, 5.0f, 3.448f, 5.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(5.0f, 20.552f, 5.448f, 21.0f, 6.0f, 21.0f)
                close()
            }
        }
        .build()
        return _cardSpades!!
    }

private var _cardSpades: ImageVector? = null
