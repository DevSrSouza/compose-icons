package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(421.6f, 379.9f)
                curveToRelative(-0.664f, 0.0f, -1.35f, 0.063f, -2.049f, 0.195f)
                curveToRelative(-11.24f, 2.143f, -22.37f, 3.17f, -33.32f, 3.17f)
                curveToRelative(-94.81f, 0.0f, -174.1f, -77.14f, -174.1f, -175.5f)
                curveToRelative(0.0f, -63.19f, 33.79f, -121.3f, 88.73f, -152.6f)
                curveToRelative(8.467f, -4.812f, 6.339f, -17.66f, -3.279f, -19.44f)
                curveToRelative(-11.2f, -2.078f, -29.53f, -3.746f, -40.9f, -3.746f)
                curveTo(132.3f, 31.1f, 32.0f, 132.2f, 32.0f, 256.0f)
                curveToRelative(0.0f, 123.6f, 100.1f, 224.0f, 223.8f, 224.0f)
                curveToRelative(69.04f, 0.0f, 132.1f, -31.45f, 173.8f, -82.93f)
                curveTo(435.3f, 389.1f, 429.1f, 379.9f, 421.6f, 379.9f)
                close()
                moveTo(255.8f, 432.0f)
                curveTo(158.9f, 432.0f, 80.0f, 353.0f, 80.0f, 256.0f)
                curveToRelative(0.0f, -76.32f, 48.77f, -141.4f, 116.7f, -165.8f)
                curveTo(175.2f, 125.0f, 163.2f, 165.6f, 163.2f, 207.8f)
                curveToRelative(0.0f, 99.44f, 65.13f, 183.9f, 154.9f, 212.8f)
                curveTo(298.5f, 428.1f, 277.4f, 432.0f, 255.8f, 432.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
