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

public val CssGgIcons.Sketch: ImageVector
    get() {
        if (_sketch != null) {
            return _sketch!!
        }
        _sketch = Builder(name = "Sketch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.2088f, 3.0f)
                horizontalLineTo(18.903f)
                lineTo(20.1118f, 10.2527f)
                lineTo(12.0559f, 21.1858f)
                lineTo(4.0f, 10.2527f)
                lineTo(5.2088f, 3.0f)
                close()
                moveTo(6.903f, 5.0f)
                lineTo(6.1118f, 9.7473f)
                lineTo(12.0559f, 17.8142f)
                lineTo(18.0f, 9.7473f)
                lineTo(17.2088f, 5.0f)
                horizontalLineTo(6.903f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0559f, 8.0f)
                horizontalLineTo(16.0559f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0559f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _sketch!!
    }

private var _sketch: ImageVector? = null
