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

public val CssGgIcons.ArrowAlignH: ImageVector
    get() {
        if (_arrowAlignH != null) {
            return _arrowAlignH!!
        }
        _arrowAlignH = Builder(name = "ArrowAlignH", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.757f)
                lineTo(7.414f, 9.172f)
                lineTo(5.586f, 11.0f)
                lineTo(10.0f, 11.0f)
                verticalLineTo(13.0f)
                lineTo(5.586f, 13.0f)
                lineTo(7.414f, 14.828f)
                lineTo(6.0f, 16.243f)
                lineTo(1.757f, 12.0f)
                lineTo(6.0f, 7.757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.243f)
                lineTo(16.586f, 14.828f)
                lineTo(18.414f, 13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                lineTo(18.414f, 11.0f)
                lineTo(16.586f, 9.172f)
                lineTo(18.0f, 7.757f)
                lineTo(22.243f, 12.0f)
                lineTo(18.0f, 16.243f)
                close()
            }
        }
        .build()
        return _arrowAlignH!!
    }

private var _arrowAlignH: ImageVector? = null
