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

public val SolidGroup.BasketballBall: ImageVector
    get() {
        if (_basketballBall != null) {
            return _basketballBall!!
        }
        _basketballBall = Builder(name = "BasketballBall", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.3f, 10.3f)
                curveToRelative(-43.8f, 6.3f, -86.2f, 24.1f, -122.2f, 53.8f)
                lineToRelative(77.4f, 77.4f)
                curveToRelative(27.8f, -35.8f, 43.3f, -81.2f, 44.8f, -131.2f)
                close()
                moveTo(248.0f, 222.0f)
                lineTo(405.9f, 64.1f)
                curveToRelative(-42.4f, -35.0f, -93.6f, -53.5f, -145.5f, -56.1f)
                curveToRelative(-1.2f, 63.9f, -21.5f, 122.3f, -58.7f, 167.7f)
                lineTo(248.0f, 222.0f)
                close()
                moveTo(56.1f, 98.1f)
                curveToRelative(-29.7f, 36.0f, -47.5f, 78.4f, -53.8f, 122.2f)
                curveToRelative(50.0f, -1.5f, 95.5f, -17.0f, 131.2f, -44.8f)
                lineTo(56.1f, 98.1f)
                close()
                moveTo(328.3f, 302.3f)
                curveToRelative(45.3f, -37.1f, 103.7f, -57.4f, 167.7f, -58.7f)
                curveToRelative(-2.6f, -51.9f, -21.1f, -103.1f, -56.1f, -145.5f)
                lineTo(282.0f, 256.0f)
                lineToRelative(46.3f, 46.3f)
                close()
                moveTo(248.0f, 290.0f)
                lineTo(90.1f, 447.9f)
                curveToRelative(42.4f, 34.9f, 93.6f, 53.5f, 145.5f, 56.1f)
                curveToRelative(1.3f, -64.0f, 21.6f, -122.4f, 58.7f, -167.7f)
                lineTo(248.0f, 290.0f)
                close()
                moveTo(439.9f, 413.9f)
                curveToRelative(29.7f, -36.0f, 47.5f, -78.4f, 53.8f, -122.2f)
                curveToRelative(-50.1f, 1.6f, -95.5f, 17.1f, -131.2f, 44.8f)
                lineToRelative(77.4f, 77.4f)
                close()
                moveTo(167.7f, 209.7f)
                curveTo(122.3f, 246.9f, 63.9f, 267.3f, 0.0f, 268.4f)
                curveToRelative(2.6f, 51.9f, 21.1f, 103.1f, 56.1f, 145.5f)
                lineTo(214.0f, 256.0f)
                lineToRelative(-46.3f, -46.3f)
                close()
                moveTo(283.7f, 501.7f)
                curveToRelative(43.8f, -6.3f, 86.2f, -24.1f, 122.2f, -53.8f)
                lineToRelative(-77.4f, -77.4f)
                curveToRelative(-27.7f, 35.7f, -43.2f, 81.2f, -44.8f, 131.2f)
                close()
            }
        }
        .build()
        return _basketballBall!!
    }

private var _basketballBall: ImageVector? = null
