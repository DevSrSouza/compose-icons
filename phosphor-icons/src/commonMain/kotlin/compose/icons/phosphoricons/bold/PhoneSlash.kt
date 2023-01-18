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

public val BoldGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.8f, 105.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-31.0f, -34.1f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, -0.1f)
                lineTo(56.9f, 31.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 39.1f, 48.1f)
                lineTo(63.4f, 74.8f)
                arcToRelative(147.4f, 147.4f, 0.0f, false, false, -40.1f, 28.5f)
                arcToRelative(60.2f, 60.2f, 0.0f, false, false, -5.0f, 79.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 15.8f, 7.7f)
                arcToRelative(21.1f, 21.1f, 0.0f, false, false, 7.4f, -1.4f)
                lineToRelative(47.3f, -19.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 101.0f, 155.2f)
                lineToRelative(5.5f, -27.2f)
                arcToRelative(33.1f, 33.1f, 0.0f, false, true, 4.2f, -1.2f)
                lineToRelative(88.4f, 97.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.8f, -17.0f)
                close()
                moveTo(83.4f, 121.0f)
                lineToRelative(-5.5f, 27.4f)
                lineTo(35.5f, 165.3f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, true, 4.8f, -45.0f)
                arcTo(123.8f, 123.8f, 0.0f, false, true, 80.4f, 93.5f)
                lineToRelative(12.7f, 14.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 83.4f, 121.0f)
                close()
                moveTo(237.7f, 182.5f)
                arcToRelative(22.4f, 22.4f, 0.0f, false, true, -4.5f, 4.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.1f, -19.4f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -3.4f, -47.0f)
                arcTo(124.1f, 124.1f, 0.0f, false, false, 130.9f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.3f, -24.0f)
                horizontalLineToRelative(0.3f)
                arcToRelative(147.7f, 147.7f, 0.0f, false, true, 101.2f, 43.3f)
                arcTo(60.2f, 60.2f, 0.0f, false, true, 237.7f, 182.5f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
