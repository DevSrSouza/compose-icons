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

public val IonIcons.NotificationsOffCircleOutline: ImageVector
    get() {
        if (_notificationsOffCircleOutline != null) {
            return _notificationsOffCircleOutline!!
        }
        _notificationsOffCircleOutline = Builder(name = "NotificationsOffCircleOutline",
                defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f,
                viewportHeight = 512.0f).apply {
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
                moveTo(220.24f, 352.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.42f)
                curveTo(218.49f, 375.14f, 235.11f, 384.0f, 256.0f, 384.0f)
                reflectiveCurveToRelative(37.5f, -8.86f, 39.73f, -27.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 378.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, -11.84f, -5.24f)
                lineToRelative(-192.0f, -212.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 23.68f, -21.52f)
                lineToRelative(192.0f, 212.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 352.0f, 378.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.68f, 232.21f)
                curveToRelative(0.0f, 53.33f, -11.54f, 61.46f, -27.87f, 80.8f)
                curveToRelative(-6.77f, 8.0f, -0.65f, 23.0f, 11.19f, 23.0f)
                horizontalLineTo(276.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.95f, -6.7f)
                lineToRelative(-98.0f, -106.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.94f, 2.52f)
                curveTo(174.74f, 227.29f, 174.68f, 229.71f, 174.68f, 232.21f)
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
                curveToRelative(-1.28f, 0.51f, -2.57f, 1.05f, -3.88f, 1.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.3f, 6.36f)
                lineTo(361.0f, 323.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.94f, -2.95f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 365.2f, 313.0f)
                close()
            }
        }
        .build()
        return _notificationsOffCircleOutline!!
    }

private var _notificationsOffCircleOutline: ImageVector? = null
