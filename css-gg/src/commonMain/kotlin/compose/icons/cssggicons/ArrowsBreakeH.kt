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
                moveTo(9.2427f, 7.0f)
                horizontalLineTo(11.2427f)
                verticalLineTo(11.0001f)
                horizontalLineTo(11.2477f)
                verticalLineTo(13.0001f)
                horizontalLineTo(11.2427f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.2427f)
                verticalLineTo(13.0001f)
                lineTo(4.8285f, 13.0f)
                lineTo(6.6568f, 14.8284f)
                lineTo(5.2426f, 16.2426f)
                lineTo(1.0f, 12.0f)
                lineTo(5.2426f, 7.7573f)
                lineTo(6.6568f, 9.1715f)
                lineTo(4.8284f, 11.0f)
                horizontalLineTo(9.2426f)
                lineTo(9.2427f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2527f, 7.0001f)
                horizontalLineTo(13.2527f)
                verticalLineTo(11.0001f)
                horizontalLineTo(13.2477f)
                verticalLineTo(13.0001f)
                horizontalLineTo(13.2527f)
                verticalLineTo(17.0001f)
                horizontalLineTo(15.2527f)
                verticalLineTo(13.0001f)
                lineTo(19.667f, 13.0f)
                lineTo(17.8385f, 14.8285f)
                lineTo(19.2527f, 16.2427f)
                lineTo(23.4954f, 12.0f)
                lineTo(19.2527f, 7.7574f)
                lineTo(17.8385f, 9.1716f)
                lineTo(19.6669f, 11.0f)
                horizontalLineTo(15.2527f)
                lineTo(15.2527f, 7.0001f)
                close()
            }
        }
        .build()
        return _arrowsBreakeH!!
    }

private var _arrowsBreakeH: ImageVector? = null
