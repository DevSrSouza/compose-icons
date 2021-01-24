package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.TelegramPlane: ImageVector
    get() {
        if (_telegramPlane != null) {
            return _telegramPlane!!
        }
        _telegramPlane = Builder(name = "TelegramPlane", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(446.7f, 98.6f)
                lineToRelative(-67.6f, 318.8f)
                curveToRelative(-5.1f, 22.5f, -18.4f, 28.1f, -37.3f, 17.5f)
                lineToRelative(-103.0f, -75.9f)
                lineToRelative(-49.7f, 47.8f)
                curveToRelative(-5.5f, 5.5f, -10.1f, 10.1f, -20.7f, 10.1f)
                lineToRelative(7.4f, -104.9f)
                lineToRelative(190.9f, -172.5f)
                curveToRelative(8.3f, -7.4f, -1.8f, -11.5f, -12.9f, -4.1f)
                lineTo(117.8f, 284.0f)
                lineTo(16.2f, 252.2f)
                curveToRelative(-22.1f, -6.9f, -22.5f, -22.1f, 4.6f, -32.7f)
                lineTo(418.2f, 66.4f)
                curveToRelative(18.4f, -6.9f, 34.5f, 4.1f, 28.5f, 32.2f)
                close()
            }
        }
        .build()
        return _telegramPlane!!
    }

private var _telegramPlane: ImageVector? = null
