package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.7f, 77.7f)
                lineTo(203.3f, 112.0f)
                lineToRelative(26.4f, 26.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-6.3f, -6.4f)
                lineTo(160.3f, 195.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, true, -56.6f, 0.0f)
                lineTo(88.0f, 179.3f)
                lineTo(37.7f, 229.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(76.7f, 168.0f)
                lineTo(61.0f, 152.3f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, true, 0.0f, -56.6f)
                lineTo(112.7f, 44.0f)
                lineToRelative(-6.4f, -6.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(144.0f, 52.7f)
                lineToRelative(34.3f, -34.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(155.3f, 64.0f)
                lineTo(192.0f, 100.7f)
                lineToRelative(34.3f, -34.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
