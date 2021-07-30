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

public val CssGgIcons.CardDiamonds: ImageVector
    get() {
        if (_cardDiamonds != null) {
            return _cardDiamonds!!
        }
        _cardDiamonds = Builder(name = "CardDiamonds", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.7574f)
                lineTo(7.7574f, 12.0f)
                lineTo(12.0f, 16.2426f)
                lineTo(16.2426f, 12.0f)
                lineTo(12.0f, 7.7574f)
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
        return _cardDiamonds!!
    }

private var _cardDiamonds: ImageVector? = null
