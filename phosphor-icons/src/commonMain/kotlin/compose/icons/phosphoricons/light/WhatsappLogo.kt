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

public val LightGroup.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) {
            return _whatsappLogo!!
        }
        _whatsappLogo = Builder(name = "WhatsappLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 39.0f, 177.8f)
                lineToRelative(-8.8f, 30.7f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 17.3f, 17.3f)
                lineTo(78.2f, 217.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -45.9f, -12.6f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, -3.1f, -0.8f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -1.6f, 0.2f)
                lineToRelative(-33.2f, 9.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.5f, -2.5f)
                lineToRelative(9.5f, -33.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.6f, -4.7f)
                arcTo(90.0f, 90.0f, 0.0f, true, true, 128.0f, 218.0f)
                close()
                moveTo(179.5f, 144.8f)
                lineTo(159.0f, 133.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.1f, 0.2f)
                lineTo(132.1f, 141.0f)
                arcTo(41.4f, 41.4f, 0.0f, false, true, 115.0f, 123.9f)
                lineToRelative(7.7f, -12.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.2f, -14.1f)
                lineTo(111.2f, 76.5f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 100.0f, 70.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -34.0f, 33.9f)
                arcTo(86.0f, 86.0f, 0.0f, false, false, 152.0f, 190.0f)
                horizontalLineToRelative(0.1f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 186.0f, 156.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 179.5f, 144.8f)
                close()
                moveTo(152.1f, 178.0f)
                lineTo(152.0f, 178.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -74.0f, -74.1f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 100.0f, 82.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.8f, 0.4f)
                lineToRelative(11.7f, 20.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.1f, 2.0f)
                lineToRelative(-9.3f, 15.7f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -0.4f, 5.5f)
                arcToRelative(54.6f, 54.6f, 0.0f, false, false, 27.2f, 27.2f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 5.5f, -0.4f)
                lineToRelative(15.7f, -9.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -0.1f)
                lineToRelative(20.5f, 11.7f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.4f, 0.8f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 152.1f, 178.0f)
                close()
            }
        }
        .build()
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
