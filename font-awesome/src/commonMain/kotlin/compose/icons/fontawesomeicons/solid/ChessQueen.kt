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

public val SolidGroup.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = Builder(name = "ChessQueen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 56.0f)
                curveToRelative(0.0f, -30.9f, -25.1f, -56.0f, -56.0f, -56.0f)
                reflectiveCurveToRelative(-56.0f, 25.1f, -56.0f, 56.0f)
                reflectiveCurveToRelative(25.1f, 56.0f, 56.0f, 56.0f)
                reflectiveCurveToRelative(56.0f, -25.1f, 56.0f, -56.0f)
                close()
                moveTo(64.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(34.0f, 169.4f)
                lineTo(9.2f, 185.8f)
                curveTo(3.5f, 189.7f, 0.0f, 196.2f, 0.0f, 203.1f)
                curveToRelative(0.0f, 3.2f, 0.7f, 6.4f, 2.2f, 9.3f)
                lineTo(104.0f, 416.0f)
                horizontalLineTo(408.0f)
                lineTo(509.8f, 212.4f)
                curveToRelative(1.4f, -2.9f, 2.2f, -6.1f, 2.2f, -9.3f)
                curveToRelative(0.0f, -6.9f, -3.5f, -13.4f, -9.2f, -17.3f)
                lineTo(478.0f, 169.4f)
                curveToRelative(-8.2f, -5.4f, -19.0f, -4.4f, -26.0f, 2.6f)
                curveToRelative(-12.9f, 12.9f, -30.9f, 21.9f, -48.0f, 15.5f)
                curveToRelative(-17.9f, -6.7f, -28.1f, -20.1f, -32.8f, -35.8f)
                curveTo(367.5f, 139.0f, 357.3f, 128.0f, 344.0f, 128.0f)
                horizontalLineTo(328.0f)
                curveToRelative(-13.3f, 0.0f, -23.9f, 11.2f, -29.6f, 23.2f)
                curveTo(292.6f, 163.4f, 280.6f, 176.0f, 256.0f, 176.0f)
                reflectiveCurveToRelative(-36.6f, -12.6f, -42.4f, -24.8f)
                curveToRelative(-5.7f, -12.0f, -16.3f, -23.2f, -29.6f, -23.2f)
                horizontalLineTo(168.0f)
                curveToRelative(-13.3f, 0.0f, -23.5f, 11.0f, -27.3f, 23.7f)
                curveToRelative(-4.7f, 15.6f, -14.9f, 29.1f, -32.8f, 35.8f)
                curveToRelative(-17.0f, 6.4f, -35.1f, -2.7f, -48.0f, -15.5f)
                curveToRelative(-6.9f, -6.9f, -17.8f, -8.0f, -25.9f, -2.6f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
