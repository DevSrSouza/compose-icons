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

public val RegularGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.9f, 108.3f)
                horizontalLineToRelative(-0.1f)
                lineTo(89.8f, 74.0f)
                horizontalLineToRelative(-0.1f)
                lineTo(53.9f, 34.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(70.0f, 76.1f)
                arcToRelative(143.9f, 143.9f, 0.0f, false, false, -43.8f, 30.1f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, false, -4.7f, 73.9f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 12.6f, 6.1f)
                arcToRelative(17.1f, 17.1f, 0.0f, false, false, 5.9f, -1.1f)
                lineToRelative(47.4f, -19.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.7f, -11.7f)
                lineToRelative(5.9f, -29.5f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 9.1f, -2.5f)
                lineToRelative(90.0f, 99.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
                moveTo(97.6f, 109.8f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -10.3f, 12.0f)
                lineToRelative(-5.9f, 29.5f)
                lineTo(34.1f, 170.2f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 3.4f, -52.7f)
                arcToRelative(126.8f, 126.8f, 0.0f, false, true, 44.0f, -28.8f)
                lineTo(100.0f, 109.1f)
                close()
                moveTo(234.5f, 180.1f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -12.6f, 6.1f)
                arcToRelative(17.1f, 17.1f, 0.0f, false, true, -5.9f, -1.1f)
                lineToRelative(-4.1f, -1.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.0f, -14.8f)
                lineToRelative(4.0f, 1.6f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -3.4f, -52.7f)
                arcTo(128.0f, 128.0f, 0.0f, false, false, 121.0f, 80.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -0.9f, -16.0f)
                arcToRelative(144.4f, 144.4f, 0.0f, false, true, 109.7f, 42.0f)
                arcTo(56.1f, 56.1f, 0.0f, false, true, 234.5f, 180.1f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
