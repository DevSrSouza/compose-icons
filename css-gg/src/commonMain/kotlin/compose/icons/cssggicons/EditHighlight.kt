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

public val CssGgIcons.EditHighlight: ImageVector
    get() {
        if (_editHighlight != null) {
            return _editHighlight!!
        }
        _editHighlight = Builder(name = "EditHighlight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(10.7785f, 6.0f, 9.6422f, 6.365f, 8.6944f, 6.9919f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.9919f)
                horizontalLineTo(7.535f)
                curveTo(7.0091f, 8.5774f, 6.5967f, 9.2669f, 6.3324f, 10.0258f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0258f)
                horizontalLineTo(6.0787f)
                curveTo(6.0269f, 11.3428f, 6.0f, 11.6683f, 6.0f, 12.0f)
                curveTo(6.0f, 12.3379f, 6.0279f, 12.6693f, 6.0816f, 12.9919f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.9919f)
                horizontalLineTo(6.3386f)
                curveTo(6.6019f, 14.7404f, 7.0094f, 15.4208f, 7.5278f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.6822f)
                curveTo(9.6325f, 17.6318f, 10.7733f, 18.0f, 12.0f, 18.0f)
                curveTo(15.3137f, 18.0f, 18.0f, 15.3137f, 18.0f, 12.0f)
                curveTo(18.0f, 8.6863f, 15.3137f, 6.0f, 12.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _editHighlight!!
    }

private var _editHighlight: ImageVector? = null
