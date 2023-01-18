package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TimerOutline: ImageVector
    get() {
        if (_timerOutline != null) {
            return _timerOutline!!
        }
        _timerOutline = Builder(name = "TimerOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.91f, 128.0f)
                arcTo(191.85f, 191.85f, 0.0f, false, false, 64.0f, 254.0f)
                curveToRelative(-1.18f, 106.35f, 85.65f, 193.8f, 192.0f, 194.0f)
                curveToRelative(106.2f, 0.2f, 192.0f, -85.83f, 192.0f, -192.0f)
                curveToRelative(0.0f, -104.54f, -83.55f, -189.61f, -187.5f, -192.0f)
                arcTo(4.36f, 4.36f, 0.0f, false, false, 256.0f, 68.37f)
                verticalLineTo(152.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.38f, 278.63f)
                lineToRelative(-79.0f, -113.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(113.0f, 79.0f)
                arcToRelative(32.5f, 32.5f, 0.0f, false, true, -37.25f, 53.26f)
                arcTo(33.21f, 33.21f, 0.0f, false, true, 233.38f, 278.63f)
                close()
            }
        }
        .build()
        return _timerOutline!!
    }

private var _timerOutline: ImageVector? = null
