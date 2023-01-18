package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) {
            return _waveTriangle!!
        }
        _waveTriangle = Builder(name = "WaveTriangle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.2f, 130.3f)
                lineToRelative(-52.0f, 72.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -6.4f, 0.0f)
                lineTo(76.0f, 62.8f)
                lineTo(27.2f, 130.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, true, true, -6.4f, -4.6f)
                lineToRelative(52.0f, -72.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 6.4f, 0.0f)
                lineTo(180.0f, 193.2f)
                lineToRelative(48.8f, -67.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 6.4f, 4.6f)
                close()
            }
        }
        .build()
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
