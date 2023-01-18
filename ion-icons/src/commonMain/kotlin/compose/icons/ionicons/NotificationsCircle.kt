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

public val IonIcons.NotificationsCircle: ImageVector
    get() {
        if (_notificationsCircle != null) {
            return _notificationsCircle!!
        }
        _notificationsCircle = Builder(name = "NotificationsCircle", defaultWidth = 512.0.dp,
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
                moveTo(256.0f, 384.0f)
                curveToRelative(-20.9f, 0.0f, -37.52f, -8.86f, -39.75f, -27.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.42f)
                horizontalLineToRelative(71.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.48f)
                curveTo(293.15f, 374.85f, 276.68f, 384.0f, 256.0f, 384.0f)
                close()
                moveTo(354.0f, 336.0f)
                lineTo(158.0f, 336.0f)
                curveToRelative(-11.84f, 0.0f, -18.0f, -15.0f, -11.19f, -23.0f)
                curveToRelative(16.33f, -19.34f, 27.87f, -27.47f, 27.87f, -80.8f)
                curveToRelative(0.0f, -48.87f, 25.74f, -66.21f, 47.0f, -74.67f)
                arcToRelative(11.35f, 11.35f, 0.0f, false, false, 6.33f, -6.68f)
                curveTo(231.7f, 138.6f, 242.14f, 128.0f, 256.0f, 128.0f)
                reflectiveCurveToRelative(24.28f, 10.6f, 28.0f, 22.86f)
                arcToRelative(11.39f, 11.39f, 0.0f, false, false, 6.34f, 6.68f)
                curveToRelative(21.21f, 8.44f, 47.0f, 25.81f, 47.0f, 74.67f)
                curveToRelative(0.0f, 53.33f, 11.53f, 61.46f, 27.86f, 80.8f)
                curveTo(371.94f, 321.0f, 365.77f, 336.0f, 354.0f, 336.0f)
                close()
            }
        }
        .build()
        return _notificationsCircle!!
    }

private var _notificationsCircle: ImageVector? = null
