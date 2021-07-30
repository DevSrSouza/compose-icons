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

public val SolidGroup.ArrowAltCircleLeft: ImageVector
    get() {
        if (_arrowAltCircleLeft != null) {
            return _arrowAltCircleLeft!!
        }
        _arrowAltCircleLeft = Builder(name = "ArrowAltCircleLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 504.0f)
                curveTo(119.0f, 504.0f, 8.0f, 393.0f, 8.0f, 256.0f)
                reflectiveCurveTo(119.0f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(-111.0f, 248.0f, -248.0f, 248.0f)
                close()
                moveTo(372.0f, 212.0f)
                lineTo(256.0f, 212.0f)
                verticalLineToRelative(-70.9f)
                curveToRelative(0.0f, -10.7f, -13.0f, -16.1f, -20.5f, -8.5f)
                lineTo(121.2f, 247.5f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.2f, 0.0f, 16.9f)
                lineToRelative(114.3f, 114.9f)
                curveToRelative(7.6f, 7.6f, 20.5f, 2.2f, 20.5f, -8.5f)
                lineTo(256.0f, 300.0f)
                horizontalLineToRelative(116.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _arrowAltCircleLeft!!
    }

private var _arrowAltCircleLeft: ImageVector? = null
