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
                moveTo(8.998f, 0.972f)
                verticalLineTo(2.972f)
                horizontalLineTo(11.998f)
                lineTo(10.998f, 2.973f)
                lineTo(11.012f, 19.213f)
                lineTo(9.168f, 17.379f)
                lineTo(7.757f, 18.797f)
                lineTo(12.012f, 23.028f)
                lineTo(16.243f, 18.773f)
                lineTo(14.825f, 17.363f)
                lineTo(13.012f, 19.186f)
                lineTo(12.998f, 2.972f)
                horizontalLineTo(14.998f)
                verticalLineTo(0.972f)
                horizontalLineTo(8.998f)
                close()
            }
        }
        .build()
        return _arrowLongDownL!!
    }

private var _arrowLongDownL: ImageVector? = null
