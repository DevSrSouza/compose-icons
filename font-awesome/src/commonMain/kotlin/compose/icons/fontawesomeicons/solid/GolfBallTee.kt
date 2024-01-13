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

public val SolidGroup.GolfBallTee: ImageVector
    get() {
        if (_golfBallTee != null) {
            return _golfBallTee!!
        }
        _golfBallTee = Builder(name = "GolfBallTee", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 192.0f)
                curveToRelative(0.0f, 66.8f, -34.1f, 125.6f, -85.8f, 160.0f)
                lineTo(85.8f, 352.0f)
                curveTo(34.1f, 317.6f, 0.0f, 258.8f, 0.0f, 192.0f)
                curveTo(0.0f, 86.0f, 86.0f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveTo(384.0f, 86.0f, 384.0f, 192.0f)
                close()
                moveTo(242.1f, 256.6f)
                curveToRelative(0.0f, 18.5f, -15.0f, 33.5f, -33.5f, 33.5f)
                curveToRelative(-4.9f, 0.0f, -9.1f, 5.1f, -5.4f, 8.4f)
                curveToRelative(5.9f, 5.2f, 13.7f, 8.4f, 22.1f, 8.4f)
                curveToRelative(18.5f, 0.0f, 33.5f, -15.0f, 33.5f, -33.5f)
                curveToRelative(0.0f, -8.5f, -3.2f, -16.2f, -8.4f, -22.1f)
                curveToRelative(-3.3f, -3.7f, -8.4f, 0.5f, -8.4f, 5.4f)
                close()
                moveTo(189.8f, 207.3f)
                curveToRelative(-4.9f, 0.0f, -9.1f, 5.1f, -5.4f, 8.4f)
                curveToRelative(5.9f, 5.2f, 13.7f, 8.4f, 22.1f, 8.4f)
                curveToRelative(18.5f, 0.0f, 33.5f, -15.0f, 33.5f, -33.5f)
                curveToRelative(0.0f, -8.5f, -3.2f, -16.2f, -8.4f, -22.1f)
                curveToRelative(-3.3f, -3.7f, -8.4f, 0.5f, -8.4f, 5.4f)
                curveToRelative(0.0f, 18.5f, -15.0f, 33.5f, -33.5f, 33.5f)
                close()
                moveTo(303.3f, 189.8f)
                curveToRelative(0.0f, 18.5f, -15.0f, 33.5f, -33.5f, 33.5f)
                curveToRelative(-4.9f, 0.0f, -9.1f, 5.1f, -5.4f, 8.4f)
                curveToRelative(5.9f, 5.2f, 13.7f, 8.4f, 22.1f, 8.4f)
                curveToRelative(18.5f, 0.0f, 33.5f, -15.0f, 33.5f, -33.5f)
                curveToRelative(0.0f, -8.5f, -3.2f, -16.2f, -8.4f, -22.1f)
                curveToRelative(-3.3f, -3.7f, -8.4f, 0.5f, -8.4f, 5.4f)
                close()
                moveTo(96.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(64.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(240.0f, 448.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(160.0f, 464.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(128.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _golfBallTee!!
    }

private var _golfBallTee: ImageVector? = null
