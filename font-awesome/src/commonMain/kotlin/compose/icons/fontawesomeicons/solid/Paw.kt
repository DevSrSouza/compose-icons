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

public val SolidGroup.Paw: ImageVector
    get() {
        if (_paw != null) {
            return _paw!!
        }
        _paw = Builder(name = "Paw", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.5f, 92.9f)
                curveToRelative(14.3f, 42.9f, -0.3f, 86.2f, -32.6f, 96.8f)
                reflectiveCurveToRelative(-70.1f, -15.6f, -84.4f, -58.5f)
                reflectiveCurveToRelative(0.3f, -86.2f, 32.6f, -96.8f)
                reflectiveCurveToRelative(70.1f, 15.6f, 84.4f, 58.5f)
                close()
                moveTo(100.4f, 198.6f)
                curveToRelative(18.9f, 32.4f, 14.3f, 70.1f, -10.2f, 84.1f)
                reflectiveCurveToRelative(-59.7f, -0.9f, -78.5f, -33.3f)
                reflectiveCurveTo(-2.7f, 179.3f, 21.8f, 165.3f)
                reflectiveCurveToRelative(59.7f, 0.9f, 78.5f, 33.3f)
                close()
                moveTo(69.2f, 401.2f)
                curveTo(121.6f, 259.9f, 214.7f, 224.0f, 256.0f, 224.0f)
                reflectiveCurveToRelative(134.4f, 35.9f, 186.8f, 177.2f)
                curveToRelative(3.6f, 9.7f, 5.2f, 20.1f, 5.2f, 30.5f)
                verticalLineToRelative(1.6f)
                curveToRelative(0.0f, 25.8f, -20.9f, 46.7f, -46.7f, 46.7f)
                curveToRelative(-11.5f, 0.0f, -22.9f, -1.4f, -34.0f, -4.2f)
                lineToRelative(-88.0f, -22.0f)
                curveToRelative(-15.3f, -3.8f, -31.3f, -3.8f, -46.6f, 0.0f)
                lineToRelative(-88.0f, 22.0f)
                curveToRelative(-11.1f, 2.8f, -22.5f, 4.2f, -34.0f, 4.2f)
                curveTo(84.9f, 480.0f, 64.0f, 459.1f, 64.0f, 433.3f)
                verticalLineToRelative(-1.6f)
                curveToRelative(0.0f, -10.4f, 1.6f, -20.8f, 5.2f, -30.5f)
                close()
                moveTo(421.8f, 282.7f)
                curveToRelative(-24.5f, -14.0f, -29.1f, -51.7f, -10.2f, -84.1f)
                reflectiveCurveToRelative(54.0f, -47.3f, 78.5f, -33.3f)
                reflectiveCurveToRelative(29.1f, 51.7f, 10.2f, 84.1f)
                reflectiveCurveToRelative(-54.0f, 47.3f, -78.5f, 33.3f)
                close()
                moveTo(310.1f, 189.7f)
                curveToRelative(-32.3f, -10.6f, -46.9f, -53.9f, -32.6f, -96.8f)
                reflectiveCurveToRelative(52.1f, -69.1f, 84.4f, -58.5f)
                reflectiveCurveToRelative(46.9f, 53.9f, 32.6f, 96.8f)
                reflectiveCurveToRelative(-52.1f, 69.1f, -84.4f, 58.5f)
                close()
            }
        }
        .build()
        return _paw!!
    }

private var _paw: ImageVector? = null
