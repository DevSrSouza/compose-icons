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

public val FillGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.9f, 210.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.5f, 11.3f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.9f, -2.6f)
                lineToRelative(-90.0f, -99.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, -9.1f, 2.5f)
                lineToRelative(-5.9f, 29.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.7f, 11.7f)
                lineTo(40.0f, 185.1f)
                arcToRelative(17.1f, 17.1f, 0.0f, false, true, -5.9f, 1.1f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -12.6f, -6.1f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, true, 4.7f, -73.9f)
                arcTo(143.9f, 143.9f, 0.0f, false, true, 70.0f, 76.1f)
                lineTo(42.1f, 45.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.9f, 34.6f)
                lineTo(89.7f, 74.0f)
                horizontalLineToRelative(0.1f)
                lineToRelative(31.0f, 34.2f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(229.8f, 106.2f)
                arcToRelative(144.4f, 144.4f, 0.0f, false, false, -109.7f, -42.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.5f, 13.4f)
                lineTo(209.0f, 181.4f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, 2.9f, 2.0f)
                lineToRelative(4.1f, 1.7f)
                arcToRelative(17.1f, 17.1f, 0.0f, false, false, 5.9f, 1.1f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 12.6f, -6.1f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 229.8f, 106.2f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
