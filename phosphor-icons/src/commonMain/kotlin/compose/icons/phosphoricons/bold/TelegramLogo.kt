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

public val BoldGroup.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) {
            return _telegramLogo!!
        }
        _telegramLogo = Builder(name = "TelegramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.9f, 28.7f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, -20.4f, -3.5f)
                lineTo(28.9f, 97.8f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -12.6f, 20.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, 17.9f)
                lineTo(76.0f, 144.7f)
                lineTo(76.0f, 200.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 12.3f, 18.5f)
                arcTo(20.7f, 20.7f, 0.0f, false, false, 96.0f, 220.0f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, 14.1f, -5.9f)
                lineToRelative(23.3f, -23.3f)
                lineTo(170.0f, 223.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 13.1f, 5.0f)
                arcToRelative(18.7f, 18.7f, 0.0f, false, false, 6.2f, -1.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 13.4f, -14.5f)
                lineTo(240.3f, 48.3f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 233.9f, 28.7f)
                close()
                moveTo(147.9f, 76.8f)
                lineTo(85.2f, 122.1f)
                lineToRelative(-34.8f, -7.0f)
                close()
                moveTo(100.0f, 190.3f)
                lineTo(100.0f, 161.4f)
                lineToRelative(15.4f, 13.5f)
                close()
                moveTo(180.8f, 200.6f)
                lineTo(107.2f, 135.8f)
                lineTo(213.2f, 59.3f)
                close()
            }
        }
        .build()
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
