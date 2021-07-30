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

public val CssGgIcons.EditFlipH: ImageVector
    get() {
        if (_editFlipH != null) {
            return _editFlipH!!
        }
        _editFlipH = Builder(name = "EditFlipH", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                curveTo(18.5523f, 7.0f, 19.0f, 7.4477f, 19.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 16.5523f, 18.5523f, 17.0f, 18.0f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 19.0f, 21.0f, 17.6569f, 21.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 6.3432f, 19.6569f, 5.0f, 18.0f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveTo(5.0f, 7.4477f, 5.4477f, 7.0f, 6.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 5.0f, 3.0f, 6.3432f, 3.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(3.0f, 17.6569f, 4.3432f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 17.0f, 5.0f, 16.5523f, 5.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _editFlipH!!
    }

private var _editFlipH: ImageVector? = null
