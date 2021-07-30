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

public val SolidGroup.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) {
            return _arrowCircleDown!!
        }
        _arrowCircleDown = Builder(name = "ArrowCircleDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, -111.0f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 393.0f, 8.0f, 256.0f)
                reflectiveCurveTo(119.0f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.0f, 248.0f, 248.0f)
                close()
                moveTo(360.4f, 227.1f)
                lineTo(288.0f, 302.6f)
                lineTo(288.0f, 120.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(182.6f)
                lineToRelative(-72.4f, -75.5f)
                curveToRelative(-9.3f, -9.7f, -24.8f, -9.9f, -34.3f, -0.4f)
                lineToRelative(-10.9f, 11.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineTo(239.0f, 404.3f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(132.7f, -132.7f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-10.9f, -11.0f)
                curveToRelative(-9.5f, -9.5f, -25.0f, -9.3f, -34.3f, 0.4f)
                close()
            }
        }
        .build()
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
