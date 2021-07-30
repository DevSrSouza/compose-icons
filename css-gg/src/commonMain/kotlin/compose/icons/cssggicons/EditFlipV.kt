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

public val CssGgIcons.EditFlipV: ImageVector
    get() {
        if (_editFlipV != null) {
            return _editFlipV!!
        }
        _editFlipV = Builder(name = "EditFlipV", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                curveTo(17.0f, 18.5523f, 16.5523f, 19.0f, 16.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                curveTo(7.4477f, 19.0f, 7.0f, 18.5523f, 7.0f, 18.0f)
                lineTo(7.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 18.0f)
                curveTo(5.0f, 19.6569f, 6.3432f, 21.0f, 8.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                curveTo(17.6569f, 21.0f, 19.0f, 19.6569f, 19.0f, 18.0f)
                verticalLineTo(15.0f)
                lineTo(17.0f, 15.0f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(16.5523f, 5.0f, 17.0f, 5.4477f, 17.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                curveTo(19.0f, 4.3432f, 17.6569f, 3.0f, 16.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                curveTo(6.3432f, 3.0f, 5.0f, 4.3432f, 5.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                curveTo(7.0f, 5.4477f, 7.4477f, 5.0f, 8.0f, 5.0f)
                lineTo(16.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                verticalLineTo(11.0f)
                lineTo(3.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _editFlipV!!
    }

private var _editFlipV: ImageVector? = null
