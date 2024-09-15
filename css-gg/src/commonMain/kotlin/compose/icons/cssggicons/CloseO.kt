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

public val CssGgIcons.CloseO: ImageVector
    get() {
        if (_closeO != null) {
            return _closeO!!
        }
        _closeO = Builder(name = "CloseO", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.339f, 9.322f)
                curveTo(16.743f, 8.946f, 16.766f, 8.313f, 16.389f, 7.909f)
                curveTo(16.013f, 7.505f, 15.38f, 7.483f, 14.976f, 7.859f)
                lineTo(12.05f, 10.587f)
                lineTo(9.322f, 7.66f)
                curveTo(8.946f, 7.256f, 8.313f, 7.234f, 7.909f, 7.611f)
                curveTo(7.505f, 7.987f, 7.483f, 8.62f, 7.859f, 9.024f)
                lineTo(10.587f, 11.95f)
                lineTo(7.66f, 14.677f)
                curveTo(7.256f, 15.054f, 7.234f, 15.687f, 7.611f, 16.091f)
                curveTo(7.987f, 16.495f, 8.62f, 16.517f, 9.024f, 16.14f)
                lineTo(11.95f, 13.413f)
                lineTo(14.677f, 16.339f)
                curveTo(15.054f, 16.743f, 15.687f, 16.766f, 16.091f, 16.389f)
                curveTo(16.495f, 16.013f, 16.517f, 15.38f, 16.14f, 14.976f)
                lineTo(13.413f, 12.05f)
                lineTo(16.339f, 9.322f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f)
                curveTo(18.075f, 1.0f, 23.0f, 5.925f, 23.0f, 12.0f)
                curveTo(23.0f, 18.075f, 18.075f, 23.0f, 12.0f, 23.0f)
                curveTo(5.925f, 23.0f, 1.0f, 18.075f, 1.0f, 12.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _closeO!!
    }

private var _closeO: ImageVector? = null
