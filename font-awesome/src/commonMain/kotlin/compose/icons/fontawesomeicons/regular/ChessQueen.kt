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

public val RegularGroup.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(160.8f, 88.0f)
                curveToRelative(-18.1f, 0.0f, -31.3f, 12.8f, -35.6f, 26.9f)
                curveToRelative(-8.0f, 26.2f, -32.4f, 45.2f, -61.2f, 45.2f)
                curveToRelative(-10.0f, 0.0f, -19.4f, -2.3f, -27.7f, -6.3f)
                curveToRelative(-7.6f, -3.7f, -16.7f, -3.3f, -24.0f, 1.2f)
                curveTo(0.7f, 162.1f, -3.1f, 177.1f, 3.7f, 188.9f)
                lineTo(97.6f, 352.0f)
                lineTo(153.0f, 352.0f)
                lineToRelative(-83.0f, -144.1f)
                curveToRelative(40.5f, -2.2f, 75.3f, -25.9f, 93.1f, -59.8f)
                curveToRelative(22.0f, 26.8f, 55.4f, 43.9f, 92.8f, 43.9f)
                reflectiveCurveToRelative(70.8f, -17.1f, 92.8f, -43.9f)
                curveToRelative(17.8f, 34.0f, 52.6f, 57.7f, 93.1f, 59.8f)
                lineTo(359.0f, 352.0f)
                horizontalLineToRelative(55.4f)
                lineToRelative(93.9f, -163.1f)
                curveToRelative(6.8f, -11.7f, 3.0f, -26.7f, -8.6f, -33.8f)
                curveToRelative(-7.3f, -4.5f, -16.4f, -4.9f, -24.0f, -1.2f)
                curveToRelative(-8.4f, 4.0f, -17.7f, 6.3f, -27.7f, 6.3f)
                curveToRelative(-28.8f, 0.0f, -53.2f, -19.0f, -61.2f, -45.2f)
                curveTo(382.5f, 100.8f, 369.3f, 88.0f, 351.2f, 88.0f)
                curveToRelative(-14.5f, 0.0f, -26.3f, 8.5f, -32.4f, 19.3f)
                curveToRelative(-12.4f, 22.0f, -35.9f, 36.7f, -62.8f, 36.7f)
                reflectiveCurveToRelative(-50.4f, -14.8f, -62.8f, -36.7f)
                curveTo(187.1f, 96.5f, 175.4f, 88.0f, 160.8f, 88.0f)
                close()
                moveTo(133.2f, 432.0f)
                lineTo(378.8f, 432.0f)
                lineToRelative(16.6f, 32.0f)
                lineTo(116.7f, 464.0f)
                lineToRelative(16.6f, -32.0f)
                close()
                moveTo(416.9f, 401.3f)
                curveToRelative(-5.5f, -10.6f, -16.5f, -17.3f, -28.4f, -17.3f)
                horizontalLineToRelative(-265.0f)
                curveToRelative(-12.0f, 0.0f, -22.9f, 6.7f, -28.4f, 17.3f)
                lineTo(68.6f, 452.5f)
                curveToRelative(-3.0f, 5.8f, -4.6f, 12.2f, -4.6f, 18.7f)
                curveToRelative(0.0f, 22.5f, 18.2f, 40.8f, 40.8f, 40.8f)
                lineTo(407.2f, 512.0f)
                curveToRelative(22.5f, 0.0f, 40.8f, -18.2f, 40.8f, -40.8f)
                curveToRelative(0.0f, -6.5f, -1.6f, -12.9f, -4.6f, -18.7f)
                lineToRelative(-26.5f, -51.2f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
