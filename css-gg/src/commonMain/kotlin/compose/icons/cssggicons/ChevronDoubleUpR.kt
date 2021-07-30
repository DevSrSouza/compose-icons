package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.ChevronDoubleUpR: ImageVector
    get() {
        if (_chevronDoubleUpR != null) {
            return _chevronDoubleUpR!!
        }
        _chevronDoubleUpR = Builder(name = "ChevronDoubleUpR", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8284f, 12.4813f)
                lineTo(16.2426f, 11.067f)
                lineTo(12.0f, 6.8244f)
                lineTo(7.7573f, 11.0671f)
                lineTo(9.1715f, 12.4813f)
                lineTo(12.0f, 9.6529f)
                lineTo(14.8284f, 12.4813f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8284f, 16.7239f)
                lineTo(16.2426f, 15.3097f)
                lineTo(12.0f, 11.0671f)
                lineTo(7.7573f, 15.3097f)
                lineTo(9.1715f, 16.7239f)
                lineTo(12.0f, 13.8955f)
                lineTo(14.8284f, 16.7239f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 4.7741f)
                curveTo(23.0f, 2.565f, 21.2091f, 0.7741f, 19.0f, 0.7741f)
                horizontalLineTo(5.0f)
                curveTo(2.7909f, 0.7741f, 1.0f, 2.565f, 1.0f, 4.7741f)
                verticalLineTo(18.7741f)
                curveTo(1.0f, 20.9832f, 2.7909f, 22.7741f, 5.0f, 22.7741f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 22.7741f, 23.0f, 20.9832f, 23.0f, 18.7741f)
                verticalLineTo(4.7741f)
                close()
                moveTo(19.0f, 2.7741f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 2.7741f, 3.0f, 3.6695f, 3.0f, 4.7741f)
                verticalLineTo(18.7741f)
                curveTo(3.0f, 19.8787f, 3.8954f, 20.7741f, 5.0f, 20.7741f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 20.7741f, 21.0f, 19.8787f, 21.0f, 18.7741f)
                verticalLineTo(4.7741f)
                curveTo(21.0f, 3.6695f, 20.1046f, 2.7741f, 19.0f, 2.7741f)
                close()
            }
        }
        .build()
        return _chevronDoubleUpR!!
    }

private var _chevronDoubleUpR: ImageVector? = null
