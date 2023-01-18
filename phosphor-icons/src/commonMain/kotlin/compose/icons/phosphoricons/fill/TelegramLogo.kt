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

public val FillGroup.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) {
            return _telegramLogo!!
        }
        _telegramLogo = Builder(name = "TelegramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.3f, 31.7f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 215.0f, 29.0f)
                lineTo(30.4f, 101.5f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, -10.1f, 16.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.8f, 14.3f)
                lineTo(80.0f, 141.4f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.9f, 14.8f)
                arcTo(16.6f, 16.6f, 0.0f, false, false, 96.0f, 216.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 11.3f, -4.7f)
                lineToRelative(26.0f, -25.9f)
                lineTo(172.6f, 220.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 10.5f, 4.0f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, 5.0f, -0.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 10.7f, -11.6f)
                lineTo(236.4f, 47.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 231.3f, 31.7f)
                close()
                moveTo(183.2f, 208.0f)
                lineToRelative(-82.4f, -72.5f)
                lineTo(219.5f, 49.8f)
                close()
            }
        }
        .build()
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
