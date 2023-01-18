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

public val FilledGroup.HeartCircle: ImageVector
    get() {
        if (_heartCircle != null) {
            return _heartCircle!!
        }
        _heartCircle = Builder(name = "HeartCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(11.696f, 16.8556f)
                lineTo(7.5901f, 12.0637f)
                curveTo(6.8146f, 11.1586f, 6.7992f, 9.8279f, 7.5535f, 8.9051f)
                curveTo(8.466f, 7.7888f, 10.1383f, 7.6926f, 11.1728f, 8.6969f)
                lineTo(11.9998f, 9.4997f)
                lineTo(12.8268f, 8.6969f)
                curveTo(13.8614f, 7.6926f, 15.5338f, 7.7889f, 16.4463f, 8.9052f)
                curveTo(17.2007f, 9.8281f, 17.1853f, 11.1591f, 16.4096f, 12.0642f)
                lineTo(12.3035f, 16.8556f)
                curveTo(12.1439f, 17.0419f, 11.8557f, 17.0419f, 11.696f, 16.8556f)
                close()
            }
        }
        .build()
        return _heartCircle!!
    }

private var _heartCircle: ImageVector? = null
