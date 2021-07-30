package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Flame16: ImageVector
    get() {
        if (_flame16 != null) {
            return _flame16!!
        }
        _flame16 = Builder(name = "Flame16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.998f, 14.5f)
                curveToRelative(2.832f, 0.0f, 5.0f, -1.98f, 5.0f, -4.5f)
                curveToRelative(0.0f, -1.463f, -0.68f, -2.19f, -1.879f, -3.383f)
                lineToRelative(-0.036f, -0.037f)
                curveToRelative(-1.013f, -1.008f, -2.3f, -2.29f, -2.834f, -4.434f)
                curveToRelative(-0.322f, 0.256f, -0.63f, 0.579f, -0.864f, 0.953f)
                curveToRelative(-0.432f, 0.696f, -0.621f, 1.58f, -0.046f, 2.73f)
                curveToRelative(0.473f, 0.947f, 0.67f, 2.284f, -0.278f, 3.232f)
                curveToRelative(-0.61f, 0.61f, -1.545f, 0.84f, -2.403f, 0.633f)
                arcToRelative(2.788f, 2.788f, 0.0f, false, true, -1.436f, -0.874f)
                arcTo(3.21f, 3.21f, 0.0f, false, false, 3.0f, 10.0f)
                curveToRelative(0.0f, 2.53f, 2.164f, 4.5f, 4.998f, 4.5f)
                close()
                moveTo(9.533f, 0.753f)
                curveTo(9.496f, 0.34f, 9.16f, 0.009f, 8.77f, 0.146f)
                curveTo(7.035f, 0.75f, 4.34f, 3.187f, 5.997f, 6.5f)
                curveToRelative(0.344f, 0.689f, 0.285f, 1.218f, 0.003f, 1.5f)
                curveToRelative(-0.419f, 0.419f, -1.54f, 0.487f, -2.04f, -0.832f)
                curveToRelative(-0.173f, -0.454f, -0.659f, -0.762f, -1.035f, -0.454f)
                curveTo(2.036f, 7.44f, 1.5f, 8.702f, 1.5f, 10.0f)
                curveToRelative(0.0f, 3.512f, 2.998f, 6.0f, 6.498f, 6.0f)
                reflectiveCurveToRelative(6.5f, -2.5f, 6.5f, -6.0f)
                curveToRelative(0.0f, -2.137f, -1.128f, -3.26f, -2.312f, -4.438f)
                curveToRelative(-1.19f, -1.184f, -2.436f, -2.425f, -2.653f, -4.81f)
                close()
            }
        }
        .build()
        return _flame16!!
    }

private var _flame16: ImageVector? = null
