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
                moveTo(9.1465f, 12.2929f)
                curveTo(8.3654f, 11.5118f, 8.3654f, 10.2455f, 9.1465f, 9.4644f)
                curveTo(9.9275f, 8.6834f, 11.1939f, 8.6834f, 11.9749f, 9.4644f)
                lineTo(12.0f, 9.4895f)
                lineTo(12.0251f, 9.4645f)
                curveTo(12.8061f, 8.6834f, 14.0725f, 8.6834f, 14.8535f, 9.4645f)
                curveTo(15.6346f, 10.2455f, 15.6346f, 11.5119f, 14.8535f, 12.2929f)
                lineTo(12.0251f, 15.1213f)
                lineTo(12.0f, 15.0962f)
                lineTo(11.9749f, 15.1213f)
                lineTo(9.1465f, 12.2929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 4.0f)
                curveTo(3.0f, 2.3431f, 4.3432f, 1.0f, 6.0f, 1.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 1.0f, 21.0f, 2.3431f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 21.6569f, 19.6569f, 23.0f, 18.0f, 23.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 23.0f, 3.0f, 21.6569f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 3.0f, 19.0f, 3.4477f, 19.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 20.5523f, 18.5523f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 21.0f, 5.0f, 20.5523f, 5.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.4477f, 5.4477f, 3.0f, 6.0f, 3.0f)
                close()
            }
        }
        .build()
        return _cardHearts!!
    }

private var _cardHearts: ImageVector? = null
