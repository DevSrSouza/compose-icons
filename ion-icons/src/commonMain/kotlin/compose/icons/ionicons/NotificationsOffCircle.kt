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

public val IonIcons.NotificationsOffCircle: ImageVector
    get() {
        if (_notificationsOffCircle != null) {
            return _notificationsOffCircle!!
        }
        _notificationsOffCircle = Builder(name = "NotificationsOffCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(146.83f, 313.0f)
                curveToRelative(16.33f, -19.34f, 27.86f, -27.47f, 27.86f, -80.8f)
                quadToRelative(0.0f, -3.75f, 0.2f, -7.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, -2.52f)
                lineToRelative(98.0f, 106.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.94f, 6.7f)
                lineTo(158.0f, 335.99f)
                curveTo(146.18f, 336.0f, 140.06f, 321.0f, 146.83f, 313.0f)
                close()
                moveTo(295.76f, 356.41f)
                curveTo(293.53f, 375.14f, 276.92f, 384.0f, 256.0f, 384.0f)
                reflectiveCurveToRelative(-37.51f, -8.86f, -39.75f, -27.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.42f)
                horizontalLineToRelative(71.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 295.76f, 356.42f)
                close()
                moveTo(362.76f, 373.83f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.6f, -1.08f)
                lineToRelative(-192.0f, -212.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 23.68f, -21.52f)
                lineToRelative(192.0f, 212.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 362.76f, 373.84f)
                close()
                moveTo(361.0f, 323.21f)
                lineTo(216.49f, 165.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.3f, -6.36f)
                curveToRelative(1.31f, -0.58f, 2.61f, -1.12f, 3.89f, -1.63f)
                arcToRelative(11.33f, 11.33f, 0.0f, false, false, 6.32f, -6.68f)
                curveTo(231.72f, 138.6f, 242.15f, 128.0f, 256.0f, 128.0f)
                reflectiveCurveToRelative(24.29f, 10.6f, 28.0f, 22.86f)
                arcToRelative(11.34f, 11.34f, 0.0f, false, false, 6.34f, 6.68f)
                curveToRelative(21.21f, 8.44f, 47.0f, 25.81f, 47.0f, 74.67f)
                curveToRelative(0.0f, 53.33f, 11.54f, 61.46f, 27.87f, 80.8f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, true, 2.76f, 7.25f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 361.0f, 323.21f)
                close()
            }
        }
        .build()
        return _notificationsOffCircle!!
    }

private var _notificationsOffCircle: ImageVector? = null
