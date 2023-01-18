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

public val LightGroup.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) {
            return _telegramLogo!!
        }
        _telegramLogo = Builder(name = "TelegramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 33.3f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -14.3f, -2.5f)
                lineTo(31.1f, 103.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 2.4f, 26.8f)
                lineTo(82.0f, 139.8f)
                lineTo(82.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.6f, 12.9f)
                arcTo(14.9f, 14.9f, 0.0f, false, false, 96.0f, 214.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(27.3f, -27.3f)
                lineTo(174.0f, 218.5f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 9.2f, 3.5f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, false, 4.3f, -0.7f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 9.3f, -10.2f)
                lineTo(234.5f, 47.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 230.0f, 33.3f)
                close()
                moveTo(34.3f, 116.5f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.2f, -2.0f)
                lineTo(190.0f, 53.8f)
                lineTo(86.6f, 128.5f)
                lineTo(35.9f, 118.3f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 34.3f, 116.5f)
                close()
                moveTo(97.4f, 201.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.2f, 0.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 94.0f, 200.0f)
                lineTo(94.0f, 148.1f)
                lineToRelative(30.1f, 26.6f)
                close()
                moveTo(185.2f, 208.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.3f, 1.1f)
                lineTo(97.6f, 135.3f)
                lineToRelative(125.0f, -90.2f)
                close()
            }
        }
        .build()
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
