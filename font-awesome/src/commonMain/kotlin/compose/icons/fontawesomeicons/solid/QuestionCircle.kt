package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                curveToRelative(0.0f, 136.997f, -111.043f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.997f, 8.0f, 256.0f)
                curveTo(8.0f, 119.083f, 119.043f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.083f, 248.0f, 248.0f)
                close()
                moveTo(262.655f, 90.0f)
                curveToRelative(-54.497f, 0.0f, -89.255f, 22.957f, -116.549f, 63.758f)
                curveToRelative(-3.536f, 5.286f, -2.353f, 12.415f, 2.715f, 16.258f)
                lineToRelative(34.699f, 26.31f)
                curveToRelative(5.205f, 3.947f, 12.621f, 3.008f, 16.665f, -2.122f)
                curveToRelative(17.864f, -22.658f, 30.113f, -35.797f, 57.303f, -35.797f)
                curveToRelative(20.429f, 0.0f, 45.698f, 13.148f, 45.698f, 32.958f)
                curveToRelative(0.0f, 14.976f, -12.363f, 22.667f, -32.534f, 33.976f)
                curveTo(247.128f, 238.528f, 216.0f, 254.941f, 216.0f, 296.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-1.333f)
                curveToRelative(0.0f, -28.462f, 83.186f, -29.647f, 83.186f, -106.667f)
                curveToRelative(0.0f, -58.002f, -60.165f, -102.0f, -116.531f, -102.0f)
                close()
                moveTo(256.0f, 338.0f)
                curveToRelative(-25.365f, 0.0f, -46.0f, 20.635f, -46.0f, 46.0f)
                curveToRelative(0.0f, 25.364f, 20.635f, 46.0f, 46.0f, 46.0f)
                reflectiveCurveToRelative(46.0f, -20.636f, 46.0f, -46.0f)
                curveToRelative(0.0f, -25.365f, -20.635f, -46.0f, -46.0f, -46.0f)
                close()
            }
        }
        .build()
        return _questionCircle!!
    }

private var _questionCircle: ImageVector? = null
