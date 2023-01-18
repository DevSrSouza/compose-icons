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

public val LightGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.3f, 75.4f)
                horizontalLineToRelative(-0.1f)
                lineTo(52.4f, 36.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.8f, 8.0f)
                lineTo(73.4f, 76.9f)
                arcToRelative(140.8f, 140.8f, 0.0f, false, false, -45.8f, 30.7f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -4.5f, 71.2f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 16.2f, 4.4f)
                lineToRelative(47.3f, -18.9f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 95.1f, 154.0f)
                lineToRelative(5.9f, -29.5f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 1.2f, -1.5f)
                arcToRelative(78.8f, 78.8f, 0.0f, false, true, 10.6f, -2.8f)
                lineTo(203.6f, 220.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, -1.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.4f, -8.4f)
                close()
                moveTo(98.3f, 111.7f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -9.0f, 10.5f)
                lineToRelative(-5.9f, 29.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.3f, 1.4f)
                lineToRelative(-47.3f, 19.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.3f, -0.6f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 3.6f, -55.4f)
                arcTo(128.3f, 128.3f, 0.0f, false, true, 82.0f, 86.4f)
                lineToRelative(21.6f, 23.7f)
                close()
                moveTo(232.9f, 178.8f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, -16.2f, 4.4f)
                lineToRelative(-4.0f, -1.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.4f, -11.2f)
                lineToRelative(4.1f, 1.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 2.3f, -0.6f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -3.6f, -55.4f)
                arcToRelative(130.2f, 130.2f, 0.0f, false, false, -99.0f, -37.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -0.7f, -12.0f)
                arcToRelative(142.2f, 142.2f, 0.0f, false, true, 108.2f, 41.4f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 232.9f, 178.8f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
