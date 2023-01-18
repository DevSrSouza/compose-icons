package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.NotificationsCircleOutline: ImageVector
    get() {
        if (_notificationsCircleOutline != null) {
            return _notificationsCircleOutline!!
        }
        _notificationsCircleOutline = Builder(name = "NotificationsCircleOutline", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveTo(448.0f, 362.0f, 448.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(365.2f, 313.0f)
                curveToRelative(-16.33f, -19.34f, -27.86f, -27.47f, -27.86f, -80.8f)
                curveToRelative(0.0f, -48.86f, -25.78f, -66.23f, -47.0f, -74.67f)
                arcToRelative(11.39f, 11.39f, 0.0f, false, true, -6.34f, -6.68f)
                curveTo(280.29f, 138.6f, 269.88f, 128.0f, 256.0f, 128.0f)
                reflectiveCurveToRelative(-24.31f, 10.6f, -28.0f, 22.86f)
                arcToRelative(11.35f, 11.35f, 0.0f, false, true, -6.33f, 6.68f)
                curveToRelative(-21.24f, 8.46f, -47.0f, 25.8f, -47.0f, 74.67f)
                curveToRelative(0.0f, 53.33f, -11.54f, 61.46f, -27.87f, 80.8f)
                curveToRelative(-6.77f, 8.0f, -0.65f, 23.0f, 11.19f, 23.0f)
                horizontalLineTo(354.0f)
                curveTo(365.77f, 336.0f, 371.94f, 321.0f, 365.2f, 313.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.24f, 352.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.42f)
                curveTo(218.49f, 375.14f, 235.11f, 384.0f, 256.0f, 384.0f)
                curveToRelative(20.67f, 0.0f, 37.14f, -9.15f, 39.66f, -27.52f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.48f)
                close()
            }
        }
        .build()
        return _notificationsCircleOutline!!
    }

private var _notificationsCircleOutline: ImageVector? = null
