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

public val LightGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(161.8f, 104.4f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -54.7f, 30.4f)
                lineTo(95.3f, 162.5f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 1.1f, 13.2f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 11.7f, 6.3f)
                horizontalLineToRelative(39.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 11.7f, -6.3f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 1.1f, -13.2f)
                lineToRelative(-11.8f, -27.7f)
                arcTo(33.9f, 33.9f, 0.0f, false, false, 161.8f, 104.4f)
                close()
                moveTo(138.5f, 127.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -2.6f, 7.7f)
                lineToRelative(13.8f, 32.2f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.2f, 1.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.6f, 0.9f)
                lineTo(108.1f, 170.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.6f, -0.9f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.2f, -1.9f)
                lineTo(120.1f, 135.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -2.6f, -7.7f)
                arcTo(21.8f, 21.8f, 0.0f, false, true, 106.0f, 108.0f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, true, 7.3f, -16.4f)
                arcTo(21.6f, 21.6f, 0.0f, false, true, 128.0f, 86.0f)
                horizontalLineToRelative(2.6f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, true, 19.3f, 19.6f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 138.5f, 127.3f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
