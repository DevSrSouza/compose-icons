package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) {
            return _whatsappLogo!!
        }
        _whatsappLogo = Builder(name = "WhatsappLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 36.8f, 178.0f)
                lineToRelative(-8.5f, 30.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 48.0f, 227.7f)
                lineToRelative(30.0f, -8.5f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 24.0f)
                close()
                moveTo(152.1f, 192.0f)
                lineTo(152.0f, 192.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, -88.0f, -88.1f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 100.0f, 68.0f)
                arcToRelative(14.9f, 14.9f, 0.0f, false, true, 12.9f, 7.5f)
                lineTo(124.6f, 96.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -0.2f, 16.1f)
                lineTo(117.3f, 124.0f)
                arcTo(41.4f, 41.4f, 0.0f, false, false, 132.0f, 138.7f)
                lineToRelative(11.9f, -7.1f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, 16.1f, -0.2f)
                lineToRelative(20.5f, 11.7f)
                arcTo(14.9f, 14.9f, 0.0f, false, true, 188.0f, 156.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 152.1f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.5f, 154.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.4f, 0.4f)
                arcToRelative(55.4f, 55.4f, 0.0f, false, true, -28.2f, -28.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.4f, -7.4f)
                lineToRelative(9.4f, -15.6f)
                lineTo(99.4f, 84.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 80.0f, 103.9f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 152.0f, 176.0f)
                horizontalLineToRelative(0.1f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 172.0f, 156.6f)
                lineToRelative(-19.9f, -11.3f)
                close()
            }
        }
        .build()
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
