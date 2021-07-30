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

public val SolidGroup.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft = Builder(name = "ArrowCircleLeft", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 504.0f)
                curveTo(119.0f, 504.0f, 8.0f, 393.0f, 8.0f, 256.0f)
                reflectiveCurveTo(119.0f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(-111.0f, 248.0f, -248.0f, 248.0f)
                close()
                moveTo(284.9f, 360.4f)
                lineTo(209.4f, 288.0f)
                lineTo(392.0f, 288.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(209.4f, 224.0f)
                lineToRelative(75.5f, -72.4f)
                curveToRelative(9.7f, -9.3f, 9.9f, -24.8f, 0.4f, -34.3f)
                lineToRelative(-11.0f, -10.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(107.7f, 239.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(132.7f, 132.7f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(11.0f, -10.9f)
                curveToRelative(9.5f, -9.5f, 9.3f, -25.0f, -0.4f, -34.3f)
                close()
            }
        }
        .build()
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
