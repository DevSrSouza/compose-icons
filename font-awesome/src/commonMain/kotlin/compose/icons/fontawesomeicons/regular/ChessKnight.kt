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

public val RegularGroup.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.6f, 48.0f)
                lineTo(117.3f, 48.0f)
                lineToRelative(17.1f, 12.8f)
                curveToRelative(6.0f, 4.5f, 9.6f, 11.6f, 9.6f, 19.2f)
                reflectiveCurveToRelative(-3.6f, 14.7f, -9.6f, 19.2f)
                lineToRelative(-6.5f, 4.9f)
                curveToRelative(-10.0f, 7.5f, -16.0f, 19.3f, -16.0f, 31.9f)
                lineToRelative(-0.3f, 91.0f)
                curveToRelative(0.0f, 10.2f, 4.9f, 19.9f, 13.2f, 25.8f)
                lineToRelative(1.9f, 1.3f)
                curveToRelative(9.9f, 7.1f, 23.3f, 7.0f, 33.2f, -0.1f)
                lineToRelative(49.9f, -36.3f)
                curveToRelative(10.7f, -7.8f, 25.7f, -5.4f, 33.5f, 5.3f)
                reflectiveCurveToRelative(5.4f, 25.7f, -5.3f, 33.5f)
                lineToRelative(-49.9f, 36.3f)
                lineToRelative(-53.8f, 39.1f)
                curveToRelative(-7.3f, 5.3f, -13.0f, 12.2f, -16.9f, 20.1f)
                lineTo(66.8f, 352.0f)
                curveToRelative(5.3f, -22.1f, 17.8f, -41.9f, 35.9f, -56.3f)
                curveToRelative(-1.3f, -0.8f, -2.6f, -1.7f, -3.8f, -2.6f)
                lineTo(97.0f, 291.8f)
                curveToRelative(-21.0f, -15.0f, -33.4f, -39.2f, -33.3f, -65.0f)
                lineToRelative(0.3f, -91.0f)
                curveToRelative(0.1f, -19.8f, 6.7f, -38.7f, 18.6f, -53.9f)
                lineToRelative(-0.4f, -0.3f)
                curveTo(70.7f, 73.0f, 64.0f, 59.6f, 64.0f, 45.3f)
                curveTo(64.0f, 20.3f, 84.3f, 0.0f, 109.3f, 0.0f)
                lineTo(226.6f, 0.0f)
                curveTo(331.2f, 0.0f, 416.0f, 84.8f, 416.0f, 189.4f)
                curveToRelative(0.0f, 11.1f, -1.0f, 22.2f, -2.9f, 33.2f)
                lineTo(390.1f, 352.0f)
                lineTo(341.3f, 352.0f)
                lineToRelative(24.5f, -137.8f)
                curveToRelative(1.5f, -8.2f, 2.2f, -16.5f, 2.2f, -24.8f)
                curveTo(368.0f, 111.3f, 304.7f, 48.0f, 226.6f, 48.0f)
                close()
                moveTo(85.2f, 432.0f)
                lineTo(68.7f, 464.0f)
                lineTo(379.3f, 464.0f)
                lineToRelative(-16.6f, -32.0f)
                lineTo(85.2f, 432.0f)
                close()
                moveTo(400.9f, 401.3f)
                lineToRelative(26.5f, 51.2f)
                curveToRelative(3.0f, 5.8f, 4.6f, 12.2f, 4.6f, 18.7f)
                curveToRelative(0.0f, 22.5f, -18.2f, 40.8f, -40.8f, 40.8f)
                lineTo(56.8f, 512.0f)
                curveTo(34.2f, 512.0f, 16.0f, 493.8f, 16.0f, 471.2f)
                curveToRelative(0.0f, -6.5f, 1.6f, -12.9f, 4.6f, -18.7f)
                lineToRelative(26.5f, -51.2f)
                curveTo(52.5f, 390.7f, 63.5f, 384.0f, 75.5f, 384.0f)
                horizontalLineToRelative(297.0f)
                curveToRelative(12.0f, 0.0f, 22.9f, 6.7f, 28.4f, 17.3f)
                close()
                moveTo(172.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -40.0f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
