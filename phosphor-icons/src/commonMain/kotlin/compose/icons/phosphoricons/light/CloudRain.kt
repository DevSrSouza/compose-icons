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

public val LightGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.3f, 203.3f)
                lineToRelative(-26.3f, 40.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.0f, 2.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.3f, -1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.7f, -8.3f)
                lineToRelative(26.2f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.1f, 6.6f)
                close()
                moveTo(230.0f, 92.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -74.0f, 74.0f)
                lineTo(133.5f, 166.0f)
                lineToRelative(-29.7f, 45.3f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -5.1f, 2.7f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -3.2f, -1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.8f, -8.3f)
                lineTo(119.1f, 166.0f)
                lineTo(76.0f, 166.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 76.0f, 66.0f)
                arcToRelative(50.7f, 50.7f, 0.0f, false, true, 10.3f, 1.1f)
                arcTo(74.0f, 74.0f, 0.0f, false, true, 230.0f, 92.0f)
                close()
                moveTo(218.0f, 92.0f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 94.0f, 92.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(73.1f, 73.1f, 0.0f, false, true, 1.2f, -13.3f)
                arcTo(35.1f, 35.1f, 0.0f, false, false, 76.0f, 78.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, 76.0f)
                horizontalLineToRelative(80.0f)
                arcTo(62.1f, 62.1f, 0.0f, false, false, 218.0f, 92.0f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
