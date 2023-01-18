package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.9f, 204.4f)
                lineToRelative(-26.2f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.4f, -8.8f)
                lineToRelative(26.3f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.3f, 8.8f)
                close()
                moveTo(232.0f, 92.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -76.0f, 76.0f)
                lineTo(134.6f, 168.0f)
                lineToRelative(-29.2f, 44.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.7f, 3.6f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -4.3f, -1.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -2.3f, -11.1f)
                lineTo(115.4f, 168.0f)
                lineTo(76.0f, 168.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 76.0f, 64.0f)
                arcToRelative(53.8f, 53.8f, 0.0f, false, true, 9.0f, 0.8f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 232.0f, 92.0f)
                close()
                moveTo(216.0f, 92.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 96.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(74.9f, 74.9f, 0.0f, false, true, 0.9f, -11.7f)
                arcTo(40.3f, 40.3f, 0.0f, false, false, 76.0f, 80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f)
                horizontalLineToRelative(80.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 216.0f, 92.0f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
