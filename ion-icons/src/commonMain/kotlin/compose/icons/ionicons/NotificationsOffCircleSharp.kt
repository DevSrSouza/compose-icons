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

public val IonIcons.NotificationsOffCircleSharp: ImageVector
    get() {
        if (_notificationsOffCircleSharp != null) {
            return _notificationsOffCircleSharp!!
        }
        _notificationsOffCircleSharp = Builder(name = "NotificationsOffCircleSharp", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(144.0f, 308.0f)
                lineToRelative(28.0f, -36.0f)
                lineTo(172.0f, 239.7f)
                arcToRelative(131.83f, 131.83f, 0.0f, false, true, 2.34f, -25.42f)
                lineTo(285.92f, 336.0f)
                lineTo(144.0f, 336.0f)
                close()
                moveTo(256.18f, 384.0f)
                curveTo(233.6f, 384.0f, 216.0f, 373.75f, 216.0f, 352.0f)
                horizontalLineToRelative(80.0f)
                curveTo(295.7f, 373.37f, 278.55f, 384.0f, 256.18f, 384.0f)
                close()
                moveTo(349.66f, 380.26f)
                lineTo(138.66f, 153.26f)
                lineTo(162.34f, 131.74f)
                lineTo(373.34f, 358.74f)
                close()
                moveTo(368.0f, 330.85f)
                lineToRelative(-0.32f, -0.38f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(212.18f, 160.84f)
                arcTo(73.4f, 73.4f, 0.0f, false, true, 228.0f, 155.43f)
                lineTo(232.0f, 128.0f)
                horizontalLineToRelative(48.0f)
                lineToRelative(4.0f, 27.43f)
                curveToRelative(40.0f, 8.92f, 56.0f, 44.0f, 56.0f, 84.27f)
                lineTo(340.0f, 272.0f)
                lineToRelative(28.0f, 36.0f)
                close()
            }
        }
        .build()
        return _notificationsOffCircleSharp!!
    }

private var _notificationsOffCircleSharp: ImageVector? = null
