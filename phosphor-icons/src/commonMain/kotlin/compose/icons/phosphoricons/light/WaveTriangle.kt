package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) {
            return _waveTriangle!!
        }
        _waveTriangle = Builder(name = "WaveTriangle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.9f, 131.5f)
                lineToRelative(-52.0f, 72.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -9.8f, 0.0f)
                lineTo(76.0f, 66.2f)
                lineTo(28.9f, 131.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.8f, -7.0f)
                lineToRelative(52.0f, -72.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 9.8f, 0.0f)
                lineTo(180.0f, 189.8f)
                lineToRelative(47.1f, -65.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.8f, 7.0f)
                close()
            }
        }
        .build()
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
