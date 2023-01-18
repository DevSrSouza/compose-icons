package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.3f, 206.6f)
                lineToRelative(-26.3f, 40.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.0f, 5.4f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -6.6f, -2.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -3.4f, -16.6f)
                lineToRelative(26.2f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.1f, 13.2f)
                close()
                moveTo(236.0f, 92.0f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, true, -80.0f, 80.0f)
                lineTo(136.7f, 172.0f)
                lineToRelative(-27.9f, 42.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 98.7f, 220.0f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, -6.5f, -2.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.5f, -16.6f)
                lineTo(108.0f, 172.0f)
                lineTo(76.0f, 172.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 76.0f, 60.0f)
                arcToRelative(46.3f, 46.3f, 0.0f, false, true, 6.5f, 0.4f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 236.0f, 92.0f)
                close()
                moveTo(212.0f, 92.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -112.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(70.3f, 70.3f, 0.0f, false, true, 0.4f, -8.0f)
                lineTo(76.0f, 84.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f)
                horizontalLineToRelative(80.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 212.0f, 92.0f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
