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

public val BoldGroup.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) {
            return _whatsappLogo!!
        }
        _whatsappLogo = Builder(name = "WhatsappLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 32.5f, 178.5f)
                lineToRelative(-8.1f, 28.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.7f, 24.7f)
                lineToRelative(28.4f, -8.1f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(85.1f, 85.1f, 0.0f, false, true, -42.9f, -11.7f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -6.1f, -1.7f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -3.3f, 0.4f)
                lineToRelative(-26.2f, 7.5f)
                lineTo(57.0f, 180.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -1.3f, -9.4f)
                arcTo(85.1f, 85.1f, 0.0f, false, true, 44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, 84.0f)
                close()
                moveTo(178.3f, 131.4f)
                lineTo(165.9f, 124.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -19.2f, -0.8f)
                lineToRelative(-5.0f, 2.5f)
                arcToRelative(24.3f, 24.3f, 0.0f, false, true, -11.4f, -11.4f)
                lineToRelative(2.5f, -5.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -0.8f, -19.2f)
                lineToRelative(-7.4f, -12.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 107.5f, 68.0f)
                lineTo(104.0f, 68.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, -36.0f, 35.5f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 152.0f, 188.0f)
                horizontalLineToRelative(0.5f)
                arcTo(35.9f, 35.9f, 0.0f, false, false, 188.0f, 152.0f)
                verticalLineToRelative(-3.5f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 178.3f, 131.4f)
                close()
                moveTo(164.0f, 152.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -11.6f, 12.0f)
                lineTo(152.0f, 164.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, -60.0f, -60.4f)
                arcTo(11.8f, 11.8f, 0.0f, false, true, 104.0f, 92.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(5.1f, 8.5f)
                lineToRelative(-3.8f, 7.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -0.8f, 8.5f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, false, 33.7f, 33.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.5f, -0.8f)
                lineToRelative(7.6f, -3.8f)
                lineToRelative(8.5f, 5.1f)
                close()
            }
        }
        .build()
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
