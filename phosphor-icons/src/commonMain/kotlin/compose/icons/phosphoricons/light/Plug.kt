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

public val LightGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 67.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                lineTo(192.0f, 103.5f)
                lineTo(152.5f, 64.0f)
                lineToRelative(35.7f, -35.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                lineTo(144.0f, 55.5f)
                lineTo(116.2f, 27.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineToRelative(7.7f, 7.8f)
                lineTo(62.4f, 97.1f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, false, 0.0f, 53.8f)
                lineTo(79.5f, 168.0f)
                lineTo(27.8f, 219.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineTo(88.0f, 176.5f)
                lineToRelative(17.1f, 17.1f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, false, 53.8f, 0.0f)
                lineTo(212.0f, 140.5f)
                lineToRelative(7.8f, 7.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, -8.4f)
                lineTo(200.5f, 112.0f)
                lineToRelative(35.7f, -35.8f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 236.2f, 67.8f)
                close()
                moveTo(150.4f, 185.1f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -36.8f, 0.0f)
                lineTo(70.9f, 142.4f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, -36.8f)
                lineTo(124.0f, 52.5f)
                lineTo(203.5f, 132.0f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
