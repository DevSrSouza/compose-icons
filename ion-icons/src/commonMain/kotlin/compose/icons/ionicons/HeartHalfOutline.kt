package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.HeartHalfOutline: ImageVector
    get() {
        if (_heartHalfOutline != null) {
            return _heartHalfOutline!!
        }
        _heartHalfOutline = Builder(name = "HeartHalfOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.92f, 64.0f)
                curveToRelative(-48.09f, 0.0f, -80.0f, 29.54f, -96.92f, 51.0f)
                curveToRelative(-16.88f, -21.49f, -48.83f, -51.0f, -96.92f, -51.0f)
                curveTo(98.46f, 64.0f, 48.63f, 114.54f, 48.0f, 176.65f)
                curveToRelative(-0.54f, 54.21f, 18.63f, 104.27f, 58.61f, 153.0f)
                curveToRelative(18.77f, 22.88f, 52.8f, 59.46f, 131.39f, 112.81f)
                arcToRelative(31.84f, 31.84f, 0.0f, false, false, 36.0f, 0.0f)
                curveToRelative(78.59f, -53.35f, 112.62f, -89.93f, 131.39f, -112.81f)
                curveToRelative(40.0f, -48.74f, 59.15f, -98.8f, 58.61f, -153.0f)
                curveTo(463.37f, 114.54f, 413.54f, 64.0f, 352.92f, 64.0f)
                close()
                moveTo(256.0f, 416.0f)
                verticalLineTo(207.58f)
                curveToRelative(0.0f, -19.63f, 5.23f, -38.76f, 14.21f, -56.22f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, true, 0.08f, -0.16f)
                arcToRelative(123.0f, 123.0f, 0.0f, false, true, 21.77f, -28.51f)
                curveTo(310.19f, 105.0f, 330.66f, 96.0f, 352.92f, 96.0f)
                curveToRelative(43.15f, 0.0f, 78.62f, 36.32f, 79.07f, 81.0f)
                curveTo(433.0f, 281.61f, 343.63f, 356.51f, 256.0f, 416.0f)
                close()
            }
        }
        .build()
        return _heartHalfOutline!!
    }

private var _heartHalfOutline: ImageVector? = null
