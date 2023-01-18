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

public val ThinGroup.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) {
            return _telegramLogo!!
        }
        _telegramLogo = Builder(name = "TelegramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.6f, 34.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.2f, -2.1f)
                lineTo(31.9f, 105.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.0f, 22.9f)
                lineTo(84.0f, 138.2f)
                lineTo(84.0f, 200.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 7.4f, 11.1f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, false, 4.7f, 0.9f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 8.4f, -3.5f)
                lineToRelative(28.6f, -28.6f)
                lineTo(175.3f, 217.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 7.9f, 3.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.7f, -0.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 8.0f, -8.7f)
                lineTo(232.5f, 46.5f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 228.6f, 34.8f)
                close()
                moveTo(32.3f, 116.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.5f, -4.1f)
                lineTo(204.0f, 46.2f)
                lineTo(87.1f, 130.6f)
                lineTo(35.5f, 120.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 32.3f, 116.7f)
                close()
                moveTo(98.8f, 202.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -4.3f, 0.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 200.0f)
                lineTo(92.0f, 143.7f)
                lineToRelative(35.1f, 30.9f)
                close()
                moveTo(224.7f, 44.8f)
                lineTo(187.1f, 208.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.7f, 2.9f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -3.8f, -0.8f)
                lineTo(94.4f, 135.2f)
                lineTo(224.1f, 41.5f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 224.7f, 44.8f)
                close()
            }
        }
        .build()
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
