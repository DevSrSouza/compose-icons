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

public val CssGgIcons.ArrowsBreakeH: ImageVector
    get() {
        if (_arrowsBreakeH != null) {
            return _arrowsBreakeH!!
        }
        _arrowsBreakeH = Builder(name = "ArrowsBreakeH", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.243f, 7.0f)
                horizontalLineTo(11.243f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.248f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.243f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.243f)
                verticalLineTo(13.0f)
                lineTo(4.828f, 13.0f)
                lineTo(6.657f, 14.828f)
                lineTo(5.243f, 16.243f)
                lineTo(1.0f, 12.0f)
                lineTo(5.243f, 7.757f)
                lineTo(6.657f, 9.172f)
                lineTo(4.828f, 11.0f)
                horizontalLineTo(9.243f)
                lineTo(9.243f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.253f, 7.0f)
                horizontalLineTo(13.253f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.248f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.253f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.253f)
                verticalLineTo(13.0f)
                lineTo(19.667f, 13.0f)
                lineTo(17.838f, 14.828f)
                lineTo(19.253f, 16.243f)
                lineTo(23.495f, 12.0f)
                lineTo(19.253f, 7.757f)
                lineTo(17.838f, 9.172f)
                lineTo(19.667f, 11.0f)
                horizontalLineTo(15.253f)
                lineTo(15.253f, 7.0f)
                close()
            }
        }
        .build()
        return _arrowsBreakeH!!
    }

private var _arrowsBreakeH: ImageVector? = null
