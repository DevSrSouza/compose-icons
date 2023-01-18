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

public val IonIcons.Notifications: ImageVector
    get() {
        if (_notifications != null) {
            return _notifications!!
        }
        _notifications = Builder(name = "Notifications", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                curveToRelative(-56.38f, 23.21f, -83.78f, 67.74f, -83.78f, 136.14f)
                curveToRelative(0.0f, 75.36f, -13.29f, 91.42f, -35.31f, 118.0f)
                curveToRelative(-1.6f, 1.93f, -3.23f, 3.89f, -4.89f, 5.93f)
                arcToRelative(35.16f, 35.16f, 0.0f, false, false, -4.65f, 37.62f)
                curveToRelative(6.17f, 13.0f, 19.32f, 21.07f, 34.33f, 21.07f)
                horizontalLineTo(410.5f)
                curveToRelative(14.94f, 0.0f, 28.0f, -8.06f, 34.19f, -21.0f)
                arcTo(35.17f, 35.17f, 0.0f, false, false, 440.08f, 341.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 480.0f)
                arcToRelative(80.06f, 80.06f, 0.0f, false, false, 70.44f, -42.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.54f, -5.87f)
                horizontalLineTo(189.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.55f, 5.87f)
                arcTo(80.06f, 80.06f, 0.0f, false, false, 256.0f, 480.0f)
                close()
            }
        }
        .build()
        return _notifications!!
    }

private var _notifications: ImageVector? = null
