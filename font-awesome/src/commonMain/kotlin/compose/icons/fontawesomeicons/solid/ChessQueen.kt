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
                moveTo(256.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 256.0f, 0.0f)
                close()
                moveTo(134.1f, 143.8f)
                curveToRelative(3.3f, -13.0f, 15.0f, -23.8f, 30.2f, -23.8f)
                curveToRelative(12.3f, 0.0f, 22.6f, 7.2f, 27.7f, 17.0f)
                curveToRelative(12.0f, 23.2f, 36.2f, 39.0f, 64.0f, 39.0f)
                reflectiveCurveToRelative(52.0f, -15.8f, 64.0f, -39.0f)
                curveToRelative(5.1f, -9.8f, 15.4f, -17.0f, 27.7f, -17.0f)
                curveToRelative(15.3f, 0.0f, 27.0f, 10.8f, 30.2f, 23.8f)
                curveToRelative(7.0f, 27.8f, 32.2f, 48.3f, 62.1f, 48.3f)
                curveToRelative(10.8f, 0.0f, 21.0f, -2.7f, 29.8f, -7.4f)
                curveToRelative(8.4f, -4.4f, 18.9f, -4.5f, 27.6f, 0.9f)
                curveToRelative(13.0f, 8.0f, 17.1f, 25.0f, 9.2f, 38.0f)
                lineTo(399.7f, 400.0f)
                horizontalLineTo(384.0f)
                horizontalLineTo(343.6f)
                horizontalLineTo(168.4f)
                horizontalLineTo(128.0f)
                horizontalLineTo(112.3f)
                lineTo(5.4f, 223.6f)
                curveToRelative(-7.9f, -13.0f, -3.8f, -30.0f, 9.2f, -38.0f)
                curveToRelative(8.7f, -5.3f, 19.2f, -5.3f, 27.6f, -0.9f)
                curveToRelative(8.9f, 4.7f, 19.0f, 7.4f, 29.8f, 7.4f)
                curveToRelative(29.9f, 0.0f, 55.1f, -20.5f, 62.1f, -48.3f)
                close()
                moveTo(256.0f, 224.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(112.0f, 432.0f)
                horizontalLineTo(400.0f)
                lineToRelative(41.4f, 41.4f)
                curveToRelative(4.2f, 4.2f, 6.6f, 10.0f, 6.6f, 16.0f)
                curveToRelative(0.0f, 12.5f, -10.1f, 22.6f, -22.6f, 22.6f)
                horizontalLineTo(86.6f)
                curveTo(74.1f, 512.0f, 64.0f, 501.9f, 64.0f, 489.4f)
                curveToRelative(0.0f, -6.0f, 2.4f, -11.8f, 6.6f, -16.0f)
                lineTo(112.0f, 432.0f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
