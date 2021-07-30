package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongDownL: ImageVector
    get() {
        if (_arrowLongDownL != null) {
            return _arrowLongDownL!!
        }
        _arrowLongDownL = Builder(name = "ArrowLongDownL", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.998f, 0.9721f)
                verticalLineTo(2.9721f)
                horizontalLineTo(11.9983f)
                lineTo(10.998f, 2.973f)
                lineTo(11.0124f, 19.2135f)
                lineTo(9.1675f, 17.379f)
                lineTo(7.7573f, 18.7972f)
                lineTo(12.0118f, 23.0279f)
                lineTo(16.2427f, 18.7734f)
                lineTo(14.8246f, 17.3632f)
                lineTo(13.0124f, 19.1856f)
                lineTo(12.998f, 2.9721f)
                horizontalLineTo(14.998f)
                verticalLineTo(0.9721f)
                horizontalLineTo(8.998f)
                close()
            }
        }
        .build()
        return _arrowLongDownL!!
    }

private var _arrowLongDownL: ImageVector? = null
