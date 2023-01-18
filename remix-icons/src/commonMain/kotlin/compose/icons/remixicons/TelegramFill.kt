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

public val RemixIcons.TelegramFill: ImageVector
    get() {
        if (_telegramFill != null) {
            return _telegramFill!!
        }
        _telegramFill = Builder(name = "TelegramFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(8.89f, 13.17f)
                lineToRelative(0.013f, -0.007f)
                lineToRelative(0.87f, 2.87f)
                curveToRelative(0.112f, 0.311f, 0.266f, 0.367f, 0.453f, 0.341f)
                curveToRelative(0.188f, -0.025f, 0.287f, -0.126f, 0.41f, -0.244f)
                lineToRelative(1.188f, -1.148f)
                lineToRelative(2.55f, 1.888f)
                curveToRelative(0.466f, 0.257f, 0.801f, 0.124f, 0.917f, -0.432f)
                lineToRelative(1.657f, -7.822f)
                curveToRelative(0.183f, -0.728f, -0.137f, -1.02f, -0.702f, -0.788f)
                lineToRelative(-9.733f, 3.76f)
                curveToRelative(-0.664f, 0.266f, -0.66f, 0.638f, -0.12f, 0.803f)
                lineToRelative(2.497f, 0.78f)
                close()
            }
        }
        .build()
        return _telegramFill!!
    }

private var _telegramFill: ImageVector? = null
