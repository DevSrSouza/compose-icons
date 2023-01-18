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

public val IonIcons.FootstepsOutline: ImageVector
    get() {
        if (_footstepsOutline != null) {
            return _footstepsOutline!!
        }
        _footstepsOutline = Builder(name = "FootstepsOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 246.84f)
                curveToRelative(8.81f, 58.62f, -7.33f, 90.67f, -52.91f, 97.41f)
                curveToRelative(-50.65f, 7.49f, -71.52f, -26.44f, -80.33f, -85.06f)
                curveToRelative(-11.85f, -78.88f, 16.0f, -127.94f, 55.71f, -131.1f)
                curveTo(158.61f, 125.22f, 191.18f, 188.23f, 200.0f, 246.84f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(223.65f, 409.53f)
                curveToRelative(3.13f, 33.28f, -14.86f, 64.34f, -42.0f, 69.66f)
                curveToRelative(-27.4f, 5.36f, -58.71f, -16.37f, -65.09f, -49.19f)
                reflectiveCurveToRelative(17.75f, -34.56f, 47.32f, -40.21f)
                reflectiveCurveTo(219.87f, 369.39f, 223.65f, 409.53f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(312.0f, 150.83f)
                curveToRelative(-8.81f, 58.62f, 7.33f, 90.67f, 52.9f, 97.41f)
                curveToRelative(50.66f, 7.49f, 71.52f, -26.44f, 80.33f, -85.06f)
                curveToRelative(11.86f, -78.89f, -16.0f, -128.22f, -55.7f, -131.1f)
                curveTo(353.13f, 29.44f, 320.82f, 92.21f, 312.0f, 150.83f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(288.35f, 313.53f)
                curveToRelative(-3.13f, 33.27f, 14.86f, 64.34f, 42.0f, 69.66f)
                curveToRelative(27.4f, 5.36f, 58.71f, -16.37f, 65.09f, -49.19f)
                reflectiveCurveToRelative(-17.75f, -34.56f, -47.32f, -40.22f)
                reflectiveCurveTo(292.13f, 273.38f, 288.35f, 313.53f)
                close()
            }
        }
        .build()
        return _footstepsOutline!!
    }

private var _footstepsOutline: ImageVector? = null
