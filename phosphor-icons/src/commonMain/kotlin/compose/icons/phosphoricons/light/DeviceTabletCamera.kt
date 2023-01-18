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

public val LightGroup.DeviceTabletCamera: ImageVector
    get() {
        if (_deviceTabletCamera != null) {
            return _deviceTabletCamera!!
        }
        _deviceTabletCamera = Builder(name = "DeviceTabletCamera", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 26.0f)
                lineTo(64.0f, 26.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 42.0f, 48.0f)
                lineTo(42.0f, 208.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(192.0f, 230.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(214.0f, 48.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 192.0f, 26.0f)
                close()
                moveTo(202.0f, 208.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(64.0f, 218.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(54.0f, 48.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 64.0f, 38.0f)
                lineTo(192.0f, 38.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(138.0f, 68.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 68.0f)
                close()
            }
        }
        .build()
        return _deviceTabletCamera!!
    }

private var _deviceTabletCamera: ImageVector? = null
