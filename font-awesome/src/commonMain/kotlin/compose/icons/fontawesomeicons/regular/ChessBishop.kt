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

public val RegularGroup.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = Builder(name = "ChessBishop", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 0.0f)
                curveTo(90.7f, 0.0f, 80.0f, 10.7f, 80.0f, 24.0f)
                curveToRelative(0.0f, 11.2f, 7.6f, 20.6f, 18.0f, 23.2f)
                curveToRelative(-7.8f, 8.0f, -16.1f, 17.0f, -24.4f, 27.0f)
                curveTo(38.2f, 116.7f, 0.0f, 178.8f, 0.0f, 250.9f)
                curveToRelative(0.0f, 44.8f, 24.6f, 72.2f, 48.0f, 87.8f)
                lineTo(48.0f, 352.0f)
                lineTo(96.0f, 352.0f)
                lineTo(96.0f, 325.0f)
                curveToRelative(0.0f, -9.0f, -5.0f, -17.2f, -13.0f, -21.3f)
                curveToRelative(-18.0f, -9.3f, -35.0f, -24.7f, -35.0f, -52.7f)
                curveToRelative(0.0f, -55.5f, 29.8f, -106.8f, 62.4f, -145.9f)
                curveToRelative(16.0f, -19.2f, 32.1f, -34.8f, 44.2f, -45.5f)
                curveToRelative(1.9f, -1.7f, 3.7f, -3.2f, 5.3f, -4.6f)
                curveToRelative(1.7f, 1.4f, 3.4f, 3.0f, 5.3f, 4.6f)
                curveToRelative(12.1f, 10.7f, 28.2f, 26.3f, 44.2f, 45.5f)
                curveToRelative(5.3f, 6.3f, 10.5f, 13.0f, 15.5f, 20.0f)
                lineTo(159.0f, 191.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(57.8f, -57.8f)
                curveToRelative(12.8f, 25.9f, 21.2f, 54.3f, 21.2f, 83.8f)
                curveToRelative(0.0f, 28.0f, -17.0f, 43.4f, -35.0f, 52.7f)
                curveToRelative(-8.0f, 4.1f, -13.0f, 12.3f, -13.0f, 21.3f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(48.0f)
                lineTo(271.9f, 338.7f)
                curveToRelative(23.4f, -15.6f, 48.0f, -42.9f, 48.0f, -87.8f)
                curveToRelative(0.0f, -72.1f, -38.2f, -134.2f, -73.6f, -176.7f)
                curveToRelative(-8.3f, -9.9f, -16.6f, -19.0f, -24.4f, -27.0f)
                curveToRelative(10.3f, -2.7f, 18.0f, -12.1f, 18.0f, -23.2f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(160.0f, 0.0f)
                lineTo(104.0f, 0.0f)
                close()
                moveTo(52.7f, 464.0f)
                lineToRelative(16.6f, -32.0f)
                lineTo(250.8f, 432.0f)
                lineToRelative(16.6f, 32.0f)
                lineTo(52.7f, 464.0f)
                close()
                moveTo(260.6f, 384.0f)
                lineTo(59.5f, 384.0f)
                curveToRelative(-12.0f, 0.0f, -22.9f, 6.7f, -28.4f, 17.3f)
                lineTo(4.6f, 452.5f)
                curveToRelative(-3.0f, 5.8f, -4.6f, 12.2f, -4.6f, 18.7f)
                curveTo(0.0f, 493.8f, 18.2f, 512.0f, 40.8f, 512.0f)
                lineTo(279.2f, 512.0f)
                curveToRelative(22.5f, 0.0f, 40.8f, -18.2f, 40.8f, -40.8f)
                curveToRelative(0.0f, -6.5f, -1.6f, -12.9f, -4.6f, -18.7f)
                lineToRelative(-26.5f, -51.2f)
                curveToRelative(-5.5f, -10.6f, -16.5f, -17.3f, -28.4f, -17.3f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
