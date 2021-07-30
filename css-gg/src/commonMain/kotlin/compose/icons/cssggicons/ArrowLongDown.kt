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
                moveTo(13.0125f, 19.162f)
                lineTo(14.8246f, 17.3398f)
                lineTo(16.2427f, 18.7501f)
                lineTo(12.012f, 23.0046f)
                lineTo(7.7573f, 18.7739f)
                lineTo(9.1675f, 17.3557f)
                lineTo(11.0126f, 19.1905f)
                lineTo(10.998f, 0.997f)
                lineTo(12.998f, 0.9954f)
                lineTo(13.0125f, 19.162f)
                close()
            }
        }
        .build()
        return _arrowLongDown!!
    }

private var _arrowLongDown: ImageVector? = null
