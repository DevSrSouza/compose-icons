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

public val ThinGroup.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) {
            return _whatsappLogo!!
        }
        _whatsappLogo = Builder(name = "WhatsappLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 41.1f, 177.5f)
                lineToRelative(-9.0f, 31.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.8f, 14.8f)
                lineToRelative(31.6f, -9.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(91.3f, 91.3f, 0.0f, false, true, -47.0f, -12.9f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -2.0f, -0.5f)
                lineTo(77.9f, 206.6f)
                lineToRelative(-33.2f, 9.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.9f, -4.9f)
                lineToRelative(9.5f, -33.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.4f, -3.1f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 128.0f, 220.0f)
                close()
                moveTo(178.5f, 146.5f)
                lineTo(158.1f, 134.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -12.2f, 0.1f)
                lineToRelative(-13.8f, 8.3f)
                arcToRelative(45.4f, 45.4f, 0.0f, false, true, -19.4f, -19.4f)
                lineToRelative(8.3f, -13.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.1f, -12.2f)
                lineTo(109.5f, 77.5f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 100.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 31.9f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 152.0f, 188.0f)
                horizontalLineToRelative(0.1f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 184.0f, 156.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 178.5f, 146.5f)
                close()
                moveTo(152.1f, 180.0f)
                lineTo(152.0f, 180.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -76.0f, -76.1f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 100.0f, 80.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 2.5f, 1.5f)
                lineToRelative(11.7f, 20.4f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 0.0f, 4.1f)
                lineToRelative(-9.4f, 15.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.2f, 3.7f)
                arcToRelative(51.9f, 51.9f, 0.0f, false, false, 26.1f, 26.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.7f, -0.2f)
                lineToRelative(15.6f, -9.4f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 4.1f, 0.0f)
                lineToRelative(20.4f, 11.7f)
                arcTo(2.9f, 2.9f, 0.0f, false, true, 176.0f, 156.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.1f, 180.0f)
                close()
            }
        }
        .build()
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
