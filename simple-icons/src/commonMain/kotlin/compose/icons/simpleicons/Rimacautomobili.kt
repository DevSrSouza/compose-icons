package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Rimacautomobili: ImageVector
    get() {
        if (_rimacautomobili != null) {
            return _rimacautomobili!!
        }
        _rimacautomobili = Builder(name = "Rimacautomobili", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.422f, 1.317f)
                curveTo(18.428f, 0.488f, 15.194f, -0.017f, 12.007f, 0.0f)
                curveTo(8.819f, -0.017f, 5.586f, 0.487f, 2.594f, 1.317f)
                arcToRelative(0.488f, 0.488f, 0.0f, false, false, -0.342f, 0.455f)
                curveToRelative(0.0f, 7.95f, 2.976f, 17.802f, 9.479f, 22.142f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, false, 0.537f, 0.0f)
                curveToRelative(6.503f, -4.34f, 9.495f, -14.175f, 9.479f, -22.142f)
                curveToRelative(0.016f, -0.21f, -0.13f, -0.39f, -0.326f, -0.455f)
                close()
                moveTo(15.91f, 17.055f)
                curveToRelative(-1.025f, 1.723f, -2.244f, 3.267f, -3.691f, 4.454f)
                arcToRelative(0.32f, 0.319f, 0.0f, false, true, -0.407f, 0.0f)
                curveTo(7.845f, 18.241f, 5.537f, 12.47f, 4.658f, 6.893f)
                lineTo(3.65f, 6.356f)
                horizontalLineToRelative(7.479f)
                curveToRelative(2.407f, 0.0f, 2.715f, 0.78f, 2.715f, 1.35f)
                curveToRelative(0.0f, 0.57f, -0.308f, 1.35f, -2.714f, 1.35f)
                lineTo(8.934f, 9.056f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, false, -0.13f, 0.13f)
                curveToRelative(0.0f, 0.032f, 0.016f, 0.065f, 0.05f, 0.097f)
                lineToRelative(7.332f, 7.332f)
                lineToRelative(0.78f, 0.78f)
                close()
                moveTo(17.243f, 14.405f)
                lineToRelative(-4.374f, -4.374f)
                curveToRelative(-0.065f, -0.065f, -0.016f, -0.162f, 0.065f, -0.18f)
                lineToRelative(0.862f, -0.096f)
                curveToRelative(1.805f, -0.195f, 2.845f, -1.106f, 2.845f, -2.244f)
                curveToRelative(0.0f, -1.317f, -1.398f, -2.049f, -3.723f, -2.049f)
                lineTo(4.446f, 5.462f)
                arcTo(24.735f, 24.733f, 0.0f, false, true, 4.268f, 3.3f)
                arcToRelative(0.462f, 0.462f, 0.0f, false, true, 0.374f, -0.487f)
                arcToRelative(32.298f, 32.296f, 0.0f, false, true, 7.3f, -0.862f)
                horizontalLineToRelative(0.13f)
                curveToRelative(2.39f, 0.0f, 4.878f, 0.293f, 7.301f, 0.862f)
                curveToRelative(0.227f, 0.049f, 0.39f, 0.26f, 0.373f, 0.487f)
                curveToRelative(-0.179f, 3.625f, -0.99f, 7.593f, -2.503f, 11.104f)
                close()
            }
        }
        .build()
        return _rimacautomobili!!
    }

private var _rimacautomobili: ImageVector? = null
