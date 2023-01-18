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

public val ThinGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.6f, 202.2f)
                lineToRelative(-26.3f, 40.0f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 128.0f, 244.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -2.2f, -0.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.1f, -5.5f)
                lineToRelative(26.2f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.7f, 4.4f)
                close()
                moveTo(228.0f, 92.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -72.0f, 72.0f)
                lineTo(132.4f, 164.0f)
                lineToRelative(-30.3f, 46.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.4f, 1.8f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, -2.1f, -0.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.2f, -5.5f)
                lineTo(122.8f, 164.0f)
                lineTo(76.0f, 164.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                arcToRelative(50.4f, 50.4f, 0.0f, false, true, 11.6f, 1.4f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 228.0f, 92.0f)
                close()
                moveTo(220.0f, 92.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 92.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(73.1f, 73.1f, 0.0f, false, true, 1.5f, -14.9f)
                arcTo(43.3f, 43.3f, 0.0f, false, false, 76.0f, 76.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, 80.0f)
                horizontalLineToRelative(80.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 220.0f, 92.0f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
