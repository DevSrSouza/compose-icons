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

public val CssGgIcons.ArrowLongDown: ImageVector
    get() {
        if (_arrowLongDown != null) {
            return _arrowLongDown!!
        }
        _arrowLongDown = Builder(name = "ArrowLongDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.012f, 19.162f)
                lineTo(14.825f, 17.34f)
                lineTo(16.243f, 18.75f)
                lineTo(12.012f, 23.005f)
                lineTo(7.757f, 18.774f)
                lineTo(9.168f, 17.356f)
                lineTo(11.013f, 19.191f)
                lineTo(10.998f, 0.997f)
                lineTo(12.998f, 0.995f)
                lineTo(13.012f, 19.162f)
                close()
            }
        }
        .build()
        return _arrowLongDown!!
    }

private var _arrowLongDown: ImageVector? = null
