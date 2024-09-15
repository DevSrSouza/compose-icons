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

public val CssGgIcons.ArrowsBreakeV: ImageVector
    get() {
        if (_arrowsBreakeV != null) {
            return _arrowsBreakeV!!
        }
        _arrowsBreakeV = Builder(name = "ArrowsBreakeV", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.243f, 5.243f)
                lineTo(14.828f, 6.657f)
                lineTo(13.0f, 4.828f)
                lineTo(13.0f, 9.243f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.243f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.243f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 4.828f)
                lineTo(9.172f, 6.657f)
                lineTo(7.757f, 5.243f)
                lineTo(12.0f, 1.0f)
                lineTo(16.243f, 5.243f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 15.253f)
                verticalLineTo(13.253f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.253f)
                horizontalLineTo(13.0f)
                lineTo(13.0f, 19.667f)
                lineTo(14.828f, 17.838f)
                lineTo(16.243f, 19.253f)
                lineTo(12.0f, 23.495f)
                lineTo(7.757f, 19.253f)
                lineTo(9.172f, 17.838f)
                lineTo(11.0f, 19.667f)
                verticalLineTo(15.253f)
                lineTo(7.0f, 15.253f)
                close()
            }
        }
        .build()
        return _arrowsBreakeV!!
    }

private var _arrowsBreakeV: ImageVector? = null
