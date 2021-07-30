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
                moveTo(16.2427f, 5.2426f)
                lineTo(14.8285f, 6.6568f)
                lineTo(13.0f, 4.8284f)
                lineTo(13.0001f, 9.2427f)
                horizontalLineTo(17.0001f)
                verticalLineTo(11.2427f)
                horizontalLineTo(7.0001f)
                verticalLineTo(9.2427f)
                horizontalLineTo(11.0001f)
                lineTo(11.0f, 4.8285f)
                lineTo(9.1716f, 6.6568f)
                lineTo(7.7574f, 5.2426f)
                lineTo(12.0f, 1.0f)
                lineTo(16.2427f, 5.2426f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 15.2527f)
                verticalLineTo(13.2527f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.2527f)
                horizontalLineTo(13.0001f)
                lineTo(13.0f, 19.6669f)
                lineTo(14.8284f, 17.8385f)
                lineTo(16.2426f, 19.2527f)
                lineTo(12.0f, 23.4954f)
                lineTo(7.7573f, 19.2527f)
                lineTo(9.1715f, 17.8385f)
                lineTo(11.0f, 19.667f)
                verticalLineTo(15.2527f)
                lineTo(7.0f, 15.2527f)
                close()
            }
        }
        .build()
        return _arrowsBreakeV!!
    }

private var _arrowsBreakeV: ImageVector? = null
