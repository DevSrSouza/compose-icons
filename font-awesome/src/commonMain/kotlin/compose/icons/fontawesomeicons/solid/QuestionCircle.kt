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

public val SolidGroup.QuestionCircle: ImageVector
    get() {
        if (_questionCircle != null) {
            return _questionCircle!!
        }
        _questionCircle = Builder(name = "QuestionCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, -111.04f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 393.0f, 8.0f, 256.0f)
                curveTo(8.0f, 119.08f, 119.04f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.08f, 248.0f, 248.0f)
                close()
                moveTo(262.65f, 90.0f)
                curveToRelative(-54.5f, 0.0f, -89.25f, 22.96f, -116.55f, 63.76f)
                curveToRelative(-3.54f, 5.29f, -2.35f, 12.41f, 2.71f, 16.26f)
                lineToRelative(34.7f, 26.31f)
                curveToRelative(5.2f, 3.95f, 12.62f, 3.01f, 16.67f, -2.12f)
                curveToRelative(17.86f, -22.66f, 30.11f, -35.8f, 57.3f, -35.8f)
                curveToRelative(20.43f, 0.0f, 45.7f, 13.15f, 45.7f, 32.96f)
                curveToRelative(0.0f, 14.98f, -12.36f, 22.67f, -32.53f, 33.98f)
                curveTo(247.13f, 238.53f, 216.0f, 254.94f, 216.0f, 296.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -28.46f, 83.19f, -29.65f, 83.19f, -106.67f)
                curveToRelative(0.0f, -58.0f, -60.17f, -102.0f, -116.53f, -102.0f)
                close()
                moveTo(256.0f, 338.0f)
                curveToRelative(-25.36f, 0.0f, -46.0f, 20.64f, -46.0f, 46.0f)
                curveToRelative(0.0f, 25.36f, 20.64f, 46.0f, 46.0f, 46.0f)
                reflectiveCurveToRelative(46.0f, -20.64f, 46.0f, -46.0f)
                curveToRelative(0.0f, -25.36f, -20.64f, -46.0f, -46.0f, -46.0f)
                close()
            }
        }
        .build()
        return _questionCircle!!
    }

private var _questionCircle: ImageVector? = null
