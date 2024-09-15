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

public val RegularGroup.QuestionCircle: ImageVector
    get() {
        if (_questionCircle != null) {
            return _questionCircle!!
        }
        _questionCircle = Builder(name = "QuestionCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.04f, 8.0f, 8.0f, 119.08f, 8.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, 111.04f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                curveTo(504.0f, 119.08f, 392.96f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 456.0f)
                curveToRelative(-110.53f, 0.0f, -200.0f, -89.43f, -200.0f, -200.0f)
                curveToRelative(0.0f, -110.5f, 89.47f, -200.0f, 200.0f, -200.0f)
                curveToRelative(110.49f, 0.0f, 200.0f, 89.47f, 200.0f, 200.0f)
                curveToRelative(0.0f, 110.53f, -89.43f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(363.24f, 200.8f)
                curveToRelative(0.0f, 67.05f, -72.42f, 68.08f, -72.42f, 92.86f)
                lineTo(290.82f, 300.0f)
                curveToRelative(0.0f, 6.63f, -5.37f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-45.65f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -5.37f, -12.0f, -12.0f)
                verticalLineToRelative(-8.66f)
                curveToRelative(0.0f, -35.74f, 27.1f, -50.03f, 47.58f, -61.52f)
                curveToRelative(17.56f, -9.85f, 28.32f, -16.54f, 28.32f, -29.58f)
                curveToRelative(0.0f, -17.25f, -22.0f, -28.69f, -39.78f, -28.69f)
                curveToRelative(-23.19f, 0.0f, -33.89f, 10.98f, -48.94f, 29.97f)
                curveToRelative(-4.06f, 5.12f, -11.46f, 6.07f, -16.67f, 2.12f)
                lineToRelative(-27.82f, -21.1f)
                curveToRelative(-5.11f, -3.87f, -6.25f, -11.07f, -2.64f, -16.36f)
                curveTo(184.85f, 131.49f, 214.94f, 112.0f, 261.79f, 112.0f)
                curveToRelative(49.07f, 0.0f, 101.45f, 38.3f, 101.45f, 88.8f)
                close()
                moveTo(298.0f, 368.0f)
                curveToRelative(0.0f, 23.16f, -18.84f, 42.0f, -42.0f, 42.0f)
                reflectiveCurveToRelative(-42.0f, -18.84f, -42.0f, -42.0f)
                reflectiveCurveToRelative(18.84f, -42.0f, 42.0f, -42.0f)
                reflectiveCurveToRelative(42.0f, 18.84f, 42.0f, 42.0f)
                close()
            }
        }
        .build()
        return _questionCircle!!
    }

private var _questionCircle: ImageVector? = null
