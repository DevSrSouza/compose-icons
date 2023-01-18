package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.TelegramLine: ImageVector
    get() {
        if (_telegramLine != null) {
            return _telegramLine!!
        }
        _telegramLine = Builder(name = "TelegramLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(8.89f, 13.17f)
                lineToRelative(-2.498f, -0.779f)
                curveToRelative(-0.54f, -0.165f, -0.543f, -0.537f, 0.121f, -0.804f)
                lineToRelative(9.733f, -3.76f)
                curveToRelative(0.565f, -0.23f, 0.885f, 0.061f, 0.702f, 0.79f)
                lineToRelative(-1.657f, 7.82f)
                curveToRelative(-0.116f, 0.557f, -0.451f, 0.69f, -0.916f, 0.433f)
                lineToRelative(-2.551f, -1.888f)
                lineToRelative(-1.189f, 1.148f)
                curveToRelative(-0.122f, 0.118f, -0.221f, 0.219f, -0.409f, 0.244f)
                curveToRelative(-0.187f, 0.026f, -0.341f, -0.03f, -0.454f, -0.34f)
                lineToRelative(-0.87f, -2.871f)
                lineToRelative(-0.012f, 0.008f)
                close()
            }
        }
        .build()
        return _telegramLine!!
    }

private var _telegramLine: ImageVector? = null
