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

public val RegularGroup.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = Builder(name = "ChessKing", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineTo(200.0f, 56.0f)
                lineTo(168.0f, 56.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(40.0f)
                lineTo(59.6f, 144.0f)
                curveTo(26.7f, 144.0f, 0.0f, 170.7f, 0.0f, 203.6f)
                curveToRelative(0.0f, 8.2f, 1.7f, 16.3f, 4.9f, 23.8f)
                lineTo(59.1f, 352.0f)
                horizontalLineToRelative(52.3f)
                lineTo(49.0f, 208.2f)
                curveToRelative(-0.6f, -1.5f, -1.0f, -3.0f, -1.0f, -4.6f)
                curveToRelative(0.0f, -6.4f, 5.2f, -11.6f, 11.6f, -11.6f)
                lineTo(224.0f, 192.0f)
                lineTo(388.4f, 192.0f)
                curveToRelative(6.4f, 0.0f, 11.6f, 5.2f, 11.6f, 11.6f)
                curveToRelative(0.0f, 1.6f, -0.3f, 3.2f, -1.0f, 4.6f)
                lineTo(336.5f, 352.0f)
                horizontalLineToRelative(52.3f)
                lineToRelative(54.2f, -124.6f)
                curveToRelative(3.3f, -7.5f, 4.9f, -15.6f, 4.9f, -23.8f)
                curveToRelative(0.0f, -32.9f, -26.7f, -59.6f, -59.6f, -59.6f)
                lineTo(248.0f, 144.0f)
                lineTo(248.0f, 104.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(248.0f, 56.0f)
                lineTo(248.0f, 24.0f)
                close()
                moveTo(101.2f, 432.0f)
                lineTo(346.8f, 432.0f)
                lineToRelative(16.6f, 32.0f)
                lineTo(84.7f, 464.0f)
                lineToRelative(16.6f, -32.0f)
                close()
                moveTo(384.9f, 401.3f)
                curveToRelative(-5.5f, -10.6f, -16.5f, -17.3f, -28.4f, -17.3f)
                lineTo(91.5f, 384.0f)
                curveToRelative(-12.0f, 0.0f, -22.9f, 6.7f, -28.4f, 17.3f)
                lineTo(36.6f, 452.5f)
                curveToRelative(-3.0f, 5.8f, -4.6f, 12.2f, -4.6f, 18.7f)
                curveTo(32.0f, 493.8f, 50.2f, 512.0f, 72.8f, 512.0f)
                lineTo(375.2f, 512.0f)
                curveToRelative(22.5f, 0.0f, 40.8f, -18.2f, 40.8f, -40.8f)
                curveToRelative(0.0f, -6.5f, -1.6f, -12.9f, -4.6f, -18.7f)
                lineToRelative(-26.5f, -51.2f)
                close()
            }
        }
        .build()
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
