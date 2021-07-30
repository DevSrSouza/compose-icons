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

public val SolidGroup.SkullCrossbones: ImageVector
    get() {
        if (_skullCrossbones != null) {
            return _skullCrossbones!!
        }
        _skullCrossbones = Builder(name = "SkullCrossbones", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.15f, 453.06f)
                lineTo(297.17f, 384.0f)
                lineToRelative(141.99f, -69.06f)
                curveToRelative(7.9f, -3.95f, 11.11f, -13.56f, 7.15f, -21.46f)
                lineTo(432.0f, 264.85f)
                curveToRelative(-3.95f, -7.9f, -13.56f, -11.11f, -21.47f, -7.16f)
                lineTo(224.0f, 348.41f)
                lineTo(37.47f, 257.69f)
                curveToRelative(-7.9f, -3.95f, -17.51f, -0.75f, -21.47f, 7.16f)
                lineTo(1.69f, 293.48f)
                curveToRelative(-3.95f, 7.9f, -0.75f, 17.51f, 7.15f, 21.46f)
                lineTo(150.83f, 384.0f)
                lineTo(8.85f, 453.06f)
                curveToRelative(-7.9f, 3.95f, -11.11f, 13.56f, -7.15f, 21.47f)
                lineToRelative(14.31f, 28.63f)
                curveToRelative(3.95f, 7.9f, 13.56f, 11.11f, 21.47f, 7.15f)
                lineTo(224.0f, 419.59f)
                lineToRelative(186.53f, 90.72f)
                curveToRelative(7.9f, 3.95f, 17.51f, 0.75f, 21.47f, -7.15f)
                lineToRelative(14.31f, -28.63f)
                curveToRelative(3.95f, -7.91f, 0.74f, -17.52f, -7.16f, -21.47f)
                close()
                moveTo(150.0f, 237.28f)
                lineToRelative(-5.48f, 25.87f)
                curveToRelative(-2.67f, 12.62f, 5.42f, 24.85f, 16.45f, 24.85f)
                horizontalLineToRelative(126.08f)
                curveToRelative(11.03f, 0.0f, 19.12f, -12.23f, 16.45f, -24.85f)
                lineToRelative(-5.5f, -25.87f)
                curveToRelative(41.78f, -22.41f, 70.0f, -62.75f, 70.0f, -109.28f)
                curveTo(368.0f, 57.31f, 303.53f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(80.0f, 57.31f, 80.0f, 128.0f)
                curveToRelative(0.0f, 46.53f, 28.22f, 86.87f, 70.0f, 109.28f)
                close()
                moveTo(280.0f, 112.0f)
                curveToRelative(17.65f, 0.0f, 32.0f, 14.35f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.35f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.35f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.35f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(168.0f, 112.0f)
                curveToRelative(17.65f, 0.0f, 32.0f, 14.35f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.35f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.35f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.35f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _skullCrossbones!!
    }

private var _skullCrossbones: ImageVector? = null
