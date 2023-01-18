package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.9f, 111.0f)
                horizontalLineToRelative(0.0f)
                lineTo(86.8f, 76.7f)
                horizontalLineToRelative(0.0f)
                lineTo(51.0f, 37.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.4f)
                lineToRelative(31.8f, 35.0f)
                arcTo(138.6f, 138.6f, 0.0f, false, false, 29.0f, 109.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, -4.4f, 68.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.0f, 3.7f)
                lineToRelative(47.3f, -18.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 7.3f, -8.8f)
                lineToRelative(5.9f, -29.5f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 2.5f, -2.9f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, 11.9f, -3.2f)
                lineTo(205.0f, 218.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, -5.7f)
                close()
                moveTo(98.9f, 113.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -7.7f, 8.9f)
                lineToRelative(-5.9f, 29.6f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.4f, 2.9f)
                lineTo(35.6f, 173.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -4.6f, -1.2f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, true, 3.7f, -58.0f)
                arcTo(129.5f, 129.5f, 0.0f, false, true, 82.6f, 84.0f)
                lineToRelative(24.7f, 27.2f)
                arcTo(66.2f, 66.2f, 0.0f, false, false, 98.9f, 113.6f)
                close()
                moveTo(231.4f, 177.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.0f, 3.7f)
                lineToRelative(-4.0f, -1.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.2f, -5.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.2f, -2.2f)
                lineToRelative(4.0f, 1.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 4.6f, -1.2f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, -3.7f, -58.0f)
                arcTo(132.0f, 132.0f, 0.0f, false, false, 120.7f, 76.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.2f, -3.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.8f, -4.2f)
                arcTo(140.2f, 140.2f, 0.0f, false, true, 227.0f, 109.0f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 231.4f, 177.6f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
