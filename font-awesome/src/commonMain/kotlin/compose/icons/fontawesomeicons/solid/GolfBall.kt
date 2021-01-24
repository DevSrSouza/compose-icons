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

public val SolidGroup.GolfBall: ImageVector
    get() {
        if (_golfBall != null) {
            return _golfBall!!
        }
        _golfBall = Builder(name = "GolfBall", defaultWidth = 416.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 416.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 416.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(20.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-20.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(416.0f, 208.0f)
                curveToRelative(0.0f, 74.2f, -39.0f, 139.2f, -97.5f, 176.0f)
                horizontalLineToRelative(-221.0f)
                curveTo(39.0f, 347.2f, 0.0f, 282.2f, 0.0f, 208.0f)
                curveTo(0.0f, 93.1f, 93.1f, 0.0f, 208.0f, 0.0f)
                reflectiveCurveToRelative(208.0f, 93.1f, 208.0f, 208.0f)
                close()
                moveTo(235.9f, 251.9f)
                curveToRelative(18.3f, 0.0f, 33.1f, -14.8f, 33.1f, -33.1f)
                curveToRelative(0.0f, -14.4f, -9.3f, -26.3f, -22.1f, -30.9f)
                curveToRelative(9.6f, 26.8f, -15.6f, 51.3f, -41.9f, 41.9f)
                curveToRelative(4.6f, 12.8f, 16.5f, 22.1f, 30.9f, 22.1f)
                close()
                moveTo(285.0f, 298.8f)
                curveToRelative(0.0f, -14.4f, -9.3f, -26.3f, -22.1f, -30.9f)
                curveToRelative(9.6f, 26.8f, -15.6f, 51.3f, -41.9f, 41.9f)
                curveToRelative(4.6f, 12.8f, 16.5f, 22.1f, 30.9f, 22.1f)
                curveToRelative(18.3f, 0.0f, 33.1f, -14.9f, 33.1f, -33.1f)
                close()
                moveTo(349.0f, 234.8f)
                curveToRelative(0.0f, -14.4f, -9.3f, -26.3f, -22.1f, -30.9f)
                curveToRelative(9.6f, 26.8f, -15.6f, 51.3f, -41.9f, 41.9f)
                curveToRelative(4.6f, 12.8f, 16.5f, 22.1f, 30.9f, 22.1f)
                curveToRelative(18.3f, 0.0f, 33.1f, -14.9f, 33.1f, -33.1f)
                close()
            }
        }
        .build()
        return _golfBall!!
    }

private var _golfBall: ImageVector? = null
