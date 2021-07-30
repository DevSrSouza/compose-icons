package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.FormatLineHeight: ImageVector
    get() {
        if (_formatLineHeight != null) {
            return _formatLineHeight!!
        }
        _formatLineHeight = Builder(name = "FormatLineHeight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0967f, 6.9971f)
                horizontalLineTo(7.1736f)
                lineTo(4.1736f, 3.9971f)
                lineTo(1.1736f, 6.9971f)
                horizontalLineTo(3.0967f)
                verticalLineTo(17.0031f)
                horizontalLineTo(1.1588f)
                lineTo(4.1588f, 20.0031f)
                lineTo(7.1588f, 17.0031f)
                horizontalLineTo(5.0967f)
                verticalLineTo(6.9971f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8412f, 7.0f)
                horizontalLineTo(8.8412f)
                verticalLineTo(5.0f)
                horizontalLineTo(22.8412f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8412f, 11.0f)
                horizontalLineTo(8.8412f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.8412f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8412f, 15.0f)
                horizontalLineTo(22.8412f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.8412f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8412f, 19.0f)
                horizontalLineTo(8.8412f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.8412f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _formatLineHeight!!
    }

private var _formatLineHeight: ImageVector? = null
