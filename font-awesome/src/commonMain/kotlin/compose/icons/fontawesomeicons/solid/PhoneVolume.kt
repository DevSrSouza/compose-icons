package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PhoneVolume: ImageVector
    get() {
        if (_phoneVolume != null) {
            return _phoneVolume!!
        }
        _phoneVolume = Builder(name = "PhoneVolume", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.33f, 506.97f)
                curveToRelative(-129.87f, -129.87f, -129.68f, -340.25f, 0.0f, -469.93f)
                curveToRelative(5.7f, -5.7f, 14.53f, -6.63f, 21.26f, -2.42f)
                lineToRelative(64.82f, 40.51f)
                arcToRelative(17.19f, 17.19f, 0.0f, false, true, 6.85f, 20.96f)
                lineToRelative(-32.41f, 81.02f)
                arcToRelative(17.19f, 17.19f, 0.0f, false, true, -17.67f, 10.72f)
                lineToRelative(-55.81f, -5.58f)
                curveToRelative(-21.05f, 58.26f, -20.61f, 122.47f, 0.0f, 179.51f)
                lineToRelative(55.81f, -5.58f)
                arcToRelative(17.19f, 17.19f, 0.0f, false, true, 17.67f, 10.72f)
                lineToRelative(32.41f, 81.02f)
                arcToRelative(17.19f, 17.19f, 0.0f, false, true, -6.85f, 20.96f)
                lineToRelative(-64.82f, 40.51f)
                arcToRelative(17.19f, 17.19f, 0.0f, false, true, -21.26f, -2.42f)
                close()
                moveTo(247.13f, 95.47f)
                curveToRelative(11.83f, 20.05f, 11.83f, 45.01f, 0.0f, 65.06f)
                curveToRelative(-3.95f, 6.69f, -13.11f, 7.96f, -18.72f, 2.58f)
                lineToRelative(-5.97f, -5.73f)
                curveToRelative(-3.91f, -3.75f, -4.79f, -9.62f, -2.26f, -14.41f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, 0.0f, -29.94f)
                curveToRelative(-2.53f, -4.79f, -1.65f, -10.66f, 2.26f, -14.41f)
                lineToRelative(5.97f, -5.73f)
                curveToRelative(5.61f, -5.38f, 14.77f, -4.11f, 18.72f, 2.58f)
                close()
                moveTo(338.91f, 4.29f)
                curveToRelative(60.14f, 71.6f, 60.09f, 175.88f, 0.0f, 247.43f)
                curveToRelative(-4.47f, 5.33f, -12.53f, 5.75f, -17.55f, 0.93f)
                lineToRelative(-5.8f, -5.56f)
                curveToRelative(-4.56f, -4.37f, -4.98f, -11.53f, -0.93f, -16.38f)
                curveToRelative(49.69f, -59.54f, 49.65f, -145.93f, 0.0f, -205.42f)
                curveToRelative(-4.05f, -4.85f, -3.63f, -12.01f, 0.93f, -16.38f)
                lineToRelative(5.8f, -5.56f)
                curveToRelative(5.02f, -4.81f, 13.08f, -4.39f, 17.55f, 0.93f)
                close()
                moveTo(292.94f, 49.23f)
                curveToRelative(36.05f, 46.32f, 36.11f, 111.15f, 0.0f, 157.55f)
                curveToRelative(-4.39f, 5.64f, -12.7f, 6.25f, -17.86f, 1.3f)
                lineToRelative(-5.82f, -5.58f)
                curveToRelative(-4.4f, -4.22f, -5.0f, -11.1f, -1.28f, -15.93f)
                curveToRelative(26.54f, -34.56f, 26.53f, -82.57f, 0.0f, -117.13f)
                curveToRelative(-3.71f, -4.84f, -3.12f, -11.71f, 1.28f, -15.93f)
                lineToRelative(5.82f, -5.58f)
                curveToRelative(5.16f, -4.95f, 13.47f, -4.34f, 17.86f, 1.3f)
                close()
            }
        }
        .build()
        return _phoneVolume!!
    }

private var _phoneVolume: ImageVector? = null
