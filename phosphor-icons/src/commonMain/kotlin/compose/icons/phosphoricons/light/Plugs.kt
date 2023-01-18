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

public val LightGroup.Plugs: ImageVector
    get() {
        if (_plugs != null) {
            return _plugs!!
        }
        _plugs = Builder(name = "Plugs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 19.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                lineTo(200.0f, 47.5f)
                lineToRelative(-6.8f, -6.8f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.4f, 0.0f)
                lineTo(124.0f, 67.5f)
                lineToRelative(-3.8f, -3.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineToRelative(72.0f, 72.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, -8.4f)
                lineToRelative(-3.7f, -3.8f)
                lineToRelative(26.8f, -26.8f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -42.4f)
                lineTo(208.5f, 56.0f)
                lineToRelative(27.7f, -27.8f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 236.2f, 19.8f)
                close()
                moveTo(206.8f, 96.7f)
                lineTo(180.0f, 123.5f)
                lineTo(132.5f, 76.0f)
                lineToRelative(26.8f, -26.8f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.4f, 0.0f)
                lineToRelative(22.1f, 22.1f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 206.8f, 96.7f)
                close()
                moveTo(139.8f, 139.8f)
                lineTo(120.0f, 159.5f)
                lineTo(96.5f, 136.0f)
                lineToRelative(19.7f, -19.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                lineTo(88.0f, 127.5f)
                lineTo(72.2f, 111.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineToRelative(3.7f, 3.8f)
                lineTo(40.7f, 150.8f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.4f)
                lineToRelative(6.8f, 6.8f)
                lineTo(19.8f, 227.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineTo(56.0f, 208.5f)
                lineToRelative(6.8f, 6.8f)
                arcToRelative(30.2f, 30.2f, 0.0f, false, false, 42.4f, 0.0f)
                lineTo(132.0f, 188.5f)
                lineToRelative(3.8f, 3.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, -8.4f)
                lineTo(128.5f, 168.0f)
                lineToRelative(19.7f, -19.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                close()
                moveTo(96.7f, 206.8f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.4f, 0.0f)
                lineTo(49.2f, 184.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, -25.4f)
                lineTo(76.0f, 132.5f)
                lineTo(123.5f, 180.0f)
                close()
            }
        }
        .build()
        return _plugs!!
    }

private var _plugs: ImageVector? = null
