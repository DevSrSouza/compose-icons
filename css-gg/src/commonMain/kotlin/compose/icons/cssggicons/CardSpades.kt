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
                moveTo(9.1465f, 11.7071f)
                curveTo(8.3654f, 12.4882f, 8.3654f, 13.7545f, 9.1465f, 14.5356f)
                curveTo(9.9275f, 15.3166f, 11.1939f, 15.3166f, 11.9749f, 14.5356f)
                lineTo(12.0f, 14.5104f)
                lineTo(12.0251f, 14.5355f)
                curveTo(12.8061f, 15.3166f, 14.0725f, 15.3166f, 14.8535f, 14.5355f)
                curveTo(15.6346f, 13.7545f, 15.6346f, 12.4881f, 14.8535f, 11.7071f)
                lineTo(12.0251f, 8.8786f)
                lineTo(12.0f, 8.9038f)
                lineTo(11.9749f, 8.8787f)
                lineTo(9.1465f, 11.7071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 20.0f)
                curveTo(3.0f, 21.6569f, 4.3432f, 23.0f, 6.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 23.0f, 21.0f, 21.6569f, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 2.3431f, 19.6569f, 1.0f, 18.0f, 1.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 1.0f, 3.0f, 2.3431f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 21.0f, 19.0f, 20.5523f, 19.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(19.0f, 3.4477f, 18.5523f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 3.0f, 5.0f, 3.4477f, 5.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(5.0f, 20.5523f, 5.4477f, 21.0f, 6.0f, 21.0f)
                close()
            }
        }
        .build()
        return _cardSpades!!
    }

private var _cardSpades: ImageVector? = null
