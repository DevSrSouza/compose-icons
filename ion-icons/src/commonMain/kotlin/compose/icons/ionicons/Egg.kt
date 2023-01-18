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

public val IonIcons.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 480.0f)
                curveToRelative(-52.57f, 0.0f, -96.72f, -17.54f, -127.7f, -50.73f)
                curveTo(96.7f, 395.4f, 80.0f, 346.05f, 80.0f, 286.55f)
                curveTo(80.0f, 230.5f, 101.48f, 168.0f, 138.93f, 115.0f)
                curveTo(175.65f, 63.0f, 219.41f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(80.35f, 31.0f, 117.07f, 83.0f)
                curveTo(410.52f, 168.0f, 432.0f, 230.5f, 432.0f, 286.55f)
                curveToRelative(0.0f, 59.5f, -16.7f, 108.85f, -48.3f, 142.72f)
                curveTo(352.72f, 462.46f, 308.57f, 480.0f, 256.0f, 480.0f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
