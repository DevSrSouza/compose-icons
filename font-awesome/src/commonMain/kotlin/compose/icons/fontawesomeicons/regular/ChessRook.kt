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

public val RegularGroup.ChessRook: ImageVector
    get() {
        if (_chessRook != null) {
            return _chessRook!!
        }
        _chessRook = Builder(name = "ChessRook", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 80.0f)
                lineTo(80.0f, 192.0f)
                curveToRelative(0.0f, 2.5f, 1.2f, 4.9f, 3.2f, 6.4f)
                lineToRelative(51.2f, 38.4f)
                curveToRelative(6.8f, 5.1f, 10.4f, 13.4f, 9.5f, 21.9f)
                lineTo(133.5f, 352.0f)
                lineTo(85.2f, 352.0f)
                lineToRelative(9.4f, -85.0f)
                lineTo(54.4f, 236.8f)
                curveTo(40.3f, 226.2f, 32.0f, 209.6f, 32.0f, 192.0f)
                lineTo(32.0f, 72.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                lineTo(376.0f, 32.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                lineTo(416.0f, 192.0f)
                curveToRelative(0.0f, 17.6f, -8.3f, 34.2f, -22.4f, 44.8f)
                lineTo(353.4f, 267.0f)
                lineToRelative(9.4f, 85.0f)
                lineTo(314.5f, 352.0f)
                lineToRelative(-10.4f, -93.3f)
                curveToRelative(-0.9f, -8.4f, 2.7f, -16.8f, 9.5f, -21.9f)
                lineToRelative(51.2f, -38.4f)
                curveToRelative(2.0f, -1.5f, 3.2f, -3.9f, 3.2f, -6.4f)
                lineTo(368.0f, 80.0f)
                lineTo(304.0f, 80.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(256.0f, 80.0f)
                lineTo(192.0f, 80.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(144.0f, 80.0f)
                lineTo(80.0f, 80.0f)
                close()
                moveTo(84.7f, 464.0f)
                lineTo(363.3f, 464.0f)
                lineToRelative(-16.6f, -32.0f)
                lineTo(101.2f, 432.0f)
                lineTo(84.7f, 464.0f)
                close()
                moveTo(356.6f, 384.0f)
                curveToRelative(12.0f, 0.0f, 22.9f, 6.7f, 28.4f, 17.3f)
                lineToRelative(26.5f, 51.2f)
                curveToRelative(3.0f, 5.8f, 4.6f, 12.2f, 4.6f, 18.7f)
                curveToRelative(0.0f, 22.5f, -18.2f, 40.8f, -40.8f, 40.8f)
                lineTo(72.8f, 512.0f)
                curveTo(50.2f, 512.0f, 32.0f, 493.8f, 32.0f, 471.2f)
                curveToRelative(0.0f, -6.5f, 1.6f, -12.9f, 4.6f, -18.7f)
                lineToRelative(26.5f, -51.2f)
                curveTo(68.5f, 390.7f, 79.5f, 384.0f, 91.5f, 384.0f)
                horizontalLineToRelative(265.0f)
                close()
                moveTo(208.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(192.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(208.0f, 288.0f)
                close()
            }
        }
        .build()
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
