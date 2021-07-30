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

public val CssGgIcons.Style: ImageVector
    get() {
        if (_style != null) {
            return _style!!
        }
        _style = Builder(name = "Style", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 11.0f)
                lineTo(3.0f, 3.0f)
                lineTo(11.0f, 3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineTo(9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 8.0f)
                verticalLineTo(6.0f)
                lineTo(18.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 12.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _style!!
    }

private var _style: ImageVector? = null
