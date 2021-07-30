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

public val CssGgIcons.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1459f, 11.0499f)
                lineTo(12.9716f, 9.0575f)
                lineTo(15.3462f, 8.8498f)
                curveTo(14.4471f, 7.9832f, 13.2242f, 7.4503f, 11.8769f, 7.4503f)
                curveTo(9.1155f, 7.4503f, 6.8769f, 9.6889f, 6.8769f, 12.4503f)
                curveTo(6.8769f, 15.2117f, 9.1155f, 17.4503f, 11.8769f, 17.4503f)
                curveTo(13.6977f, 17.4503f, 15.2911f, 16.4771f, 16.1654f, 15.0224f)
                lineTo(18.1682f, 15.5231f)
                curveTo(17.0301f, 17.8487f, 14.6405f, 19.4503f, 11.8769f, 19.4503f)
                curveTo(8.0109f, 19.4503f, 4.8769f, 16.3163f, 4.8769f, 12.4503f)
                curveTo(4.8769f, 8.5843f, 8.0109f, 5.4503f, 11.8769f, 5.4503f)
                curveTo(13.8233f, 5.4503f, 15.5842f, 6.2447f, 16.853f, 7.5271f)
                lineTo(16.6078f, 4.7241f)
                lineTo(18.6002f, 4.5498f)
                lineTo(19.1231f, 10.527f)
                lineTo(13.1459f, 11.0499f)
                close()
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
