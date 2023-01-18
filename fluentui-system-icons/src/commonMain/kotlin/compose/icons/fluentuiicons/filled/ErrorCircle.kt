package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ErrorCircle: ImageVector
    get() {
        if (_errorCircle != null) {
            return _errorCircle!!
        }
        _errorCircle = Builder(name = "ErrorCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.478f, 22.0f, 12.0f)
                curveTo(22.0f, 17.522f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.522f, 2.0f, 12.0f)
                curveTo(2.0f, 6.478f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0018f, 15.0037f)
                curveTo(11.4503f, 15.0037f, 11.0031f, 15.4508f, 11.0031f, 16.0024f)
                curveTo(11.0031f, 16.5539f, 11.4503f, 17.001f, 12.0018f, 17.001f)
                curveTo(12.5533f, 17.001f, 13.0005f, 16.5539f, 13.0005f, 16.0024f)
                curveTo(13.0005f, 15.4508f, 12.5533f, 15.0037f, 12.0018f, 15.0037f)
                close()
                moveTo(11.9996f, 7.0f)
                curveTo(11.4868f, 7.0002f, 11.0643f, 7.3864f, 11.0067f, 7.8837f)
                lineTo(11.0f, 8.0004f)
                lineTo(11.0018f, 13.0012f)
                lineTo(11.0086f, 13.1179f)
                curveTo(11.0665f, 13.6152f, 11.4893f, 14.0011f, 12.0022f, 14.0009f)
                curveTo(12.515f, 14.0007f, 12.9375f, 13.6145f, 12.9951f, 13.1171f)
                lineTo(13.0018f, 13.0005f)
                lineTo(13.0f, 7.9996f)
                lineTo(12.9932f, 7.883f)
                curveTo(12.9353f, 7.3857f, 12.5125f, 6.9998f, 11.9996f, 7.0f)
                close()
            }
        }
        .build()
        return _errorCircle!!
    }

private var _errorCircle: ImageVector? = null
