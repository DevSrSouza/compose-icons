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

public val CssGgIcons.ArrowsH: ImageVector
    get() {
        if (_arrowsH != null) {
            return _arrowsH!!
        }
        _arrowsH = Builder(name = "ArrowsH", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.657f, 9.172f)
                lineTo(4.243f, 7.757f)
                lineTo(0.0f, 12.0f)
                lineTo(4.243f, 16.243f)
                lineTo(5.657f, 14.828f)
                lineTo(3.829f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.829f)
                lineTo(5.657f, 9.172f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.172f)
                lineTo(18.343f, 14.828f)
                lineTo(19.757f, 16.243f)
                lineTo(24.0f, 12.0f)
                lineTo(19.757f, 7.757f)
                lineTo(18.343f, 9.172f)
                lineTo(20.172f, 11.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _arrowsH!!
    }

private var _arrowsH: ImageVector? = null
