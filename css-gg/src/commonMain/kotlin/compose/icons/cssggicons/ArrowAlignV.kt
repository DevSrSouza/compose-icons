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

public val CssGgIcons.ArrowAlignV: ImageVector
    get() {
        if (_arrowAlignV != null) {
            return _arrowAlignV!!
        }
        _arrowAlignV = Builder(name = "ArrowAlignV", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                lineTo(7.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.757f, 18.0f)
                lineTo(9.172f, 16.586f)
                lineTo(11.0f, 18.414f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.414f)
                lineTo(14.828f, 16.586f)
                lineTo(16.243f, 18.0f)
                lineTo(12.0f, 22.243f)
                lineTo(7.757f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.243f, 6.0f)
                lineTo(14.828f, 7.414f)
                lineTo(13.0f, 5.586f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 5.586f)
                lineTo(9.172f, 7.414f)
                lineTo(7.757f, 6.0f)
                lineTo(12.0f, 1.757f)
                lineTo(16.243f, 6.0f)
                close()
            }
        }
        .build()
        return _arrowAlignV!!
    }

private var _arrowAlignV: ImageVector? = null
