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

public val IonIcons.NotificationsOff: ImageVector
    get() {
        if (_notificationsOff != null) {
            return _notificationsOff!!
        }
        _notificationsOff = Builder(name = "NotificationsOff", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 464.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, -11.31f, -4.69f)
                lineToRelative(-384.0f, -384.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 75.31f, 52.69f)
                lineToRelative(384.0f, 384.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 448.0f, 464.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.08f, 341.31f)
                curveToRelative(-1.66f, -2.0f, -3.29f, -4.0f, -4.89f, -5.93f)
                curveToRelative(-22.0f, -26.61f, -35.31f, -42.67f, -35.31f, -118.0f)
                curveToRelative(0.0f, -39.0f, -9.33f, -71.0f, -27.72f, -95.0f)
                curveToRelative(-13.56f, -17.73f, -31.89f, -31.18f, -56.05f, -41.12f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.82f, -0.67f)
                curveTo(306.6f, 51.49f, 282.82f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(-50.59f, 19.49f, -59.28f, 48.56f)
                arcToRelative(3.13f, 3.13f, 0.0f, false, true, -0.81f, 0.65f)
                arcToRelative(157.88f, 157.88f, 0.0f, false, false, -21.88f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.49f, 12.49f)
                lineTo(434.32f, 366.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.6f, -6.63f)
                arcTo(35.39f, 35.39f, 0.0f, false, false, 440.08f, 341.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.14f, 217.35f)
                curveToRelative(0.0f, 75.36f, -13.29f, 91.42f, -35.31f, 118.0f)
                curveToRelative(-1.6f, 1.93f, -3.23f, 3.89f, -4.89f, 5.93f)
                arcToRelative(35.16f, 35.16f, 0.0f, false, false, -4.65f, 37.62f)
                curveToRelative(6.17f, 13.0f, 19.32f, 21.07f, 34.33f, 21.07f)
                horizontalLineTo(312.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                lineToRelative(-192.0f, -192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.62f, 5.0f)
                quadTo(112.14f, 208.0f, 112.14f, 217.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 480.0f)
                arcToRelative(80.06f, 80.06f, 0.0f, false, false, 70.44f, -42.13f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 322.9f, 432.0f)
                horizontalLineTo(189.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.55f, 5.87f)
                arcTo(80.06f, 80.06f, 0.0f, false, false, 256.0f, 480.0f)
                close()
            }
        }
        .build()
        return _notificationsOff!!
    }

private var _notificationsOff: ImageVector? = null
