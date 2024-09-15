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

public val CssGgIcons.CardHearts: ImageVector
    get() {
        if (_cardHearts != null) {
            return _cardHearts!!
        }
        _cardHearts = Builder(name = "CardHearts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.146f, 12.293f)
                curveTo(8.365f, 11.512f, 8.365f, 10.245f, 9.146f, 9.464f)
                curveTo(9.928f, 8.683f, 11.194f, 8.683f, 11.975f, 9.464f)
                lineTo(12.0f, 9.49f)
                lineTo(12.025f, 9.464f)
                curveTo(12.806f, 8.683f, 14.073f, 8.683f, 14.854f, 9.464f)
                curveTo(15.635f, 10.245f, 15.635f, 11.512f, 14.854f, 12.293f)
                lineTo(12.025f, 15.121f)
                lineTo(12.0f, 15.096f)
                lineTo(11.975f, 15.121f)
                lineTo(9.146f, 12.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 4.0f)
                curveTo(3.0f, 2.343f, 4.343f, 1.0f, 6.0f, 1.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 1.0f, 21.0f, 2.343f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 21.657f, 19.657f, 23.0f, 18.0f, 23.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 23.0f, 3.0f, 21.657f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 3.0f, 19.0f, 3.448f, 19.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 20.552f, 18.552f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 21.0f, 5.0f, 20.552f, 5.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.448f, 5.448f, 3.0f, 6.0f, 3.0f)
                close()
            }
        }
        .build()
        return _cardHearts!!
    }

private var _cardHearts: ImageVector? = null
