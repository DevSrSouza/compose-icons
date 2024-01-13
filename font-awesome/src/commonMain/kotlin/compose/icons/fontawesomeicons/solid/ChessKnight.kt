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

public val SolidGroup.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 48.0f)
                lineTo(82.7f, 61.3f)
                curveTo(70.7f, 73.3f, 64.0f, 89.5f, 64.0f, 106.5f)
                lineTo(64.0f, 238.9f)
                curveToRelative(0.0f, 10.7f, 5.3f, 20.7f, 14.2f, 26.6f)
                lineToRelative(10.6f, 7.0f)
                curveToRelative(14.3f, 9.6f, 32.7f, 10.7f, 48.1f, 3.0f)
                lineToRelative(3.2f, -1.6f)
                curveToRelative(2.6f, -1.3f, 5.0f, -2.8f, 7.3f, -4.5f)
                lineToRelative(49.4f, -37.0f)
                curveToRelative(6.6f, -5.0f, 15.7f, -5.0f, 22.3f, 0.0f)
                curveToRelative(10.2f, 7.7f, 9.9f, 23.1f, -0.7f, 30.3f)
                lineTo(90.4f, 350.0f)
                curveTo(73.9f, 361.3f, 64.0f, 380.0f, 64.0f, 400.0f)
                lineTo(384.0f, 400.0f)
                lineToRelative(28.9f, -159.0f)
                curveToRelative(2.1f, -11.3f, 3.1f, -22.8f, 3.1f, -34.3f)
                lineTo(416.0f, 192.0f)
                curveTo(416.0f, 86.0f, 330.0f, 0.0f, 224.0f, 0.0f)
                lineTo(83.8f, 0.0f)
                curveTo(72.9f, 0.0f, 64.0f, 8.9f, 64.0f, 19.8f)
                curveToRelative(0.0f, 7.5f, 4.2f, 14.3f, 10.9f, 17.7f)
                lineTo(96.0f, 48.0f)
                close()
                moveTo(120.0f, 116.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 40.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -40.0f, 0.0f)
                close()
                moveTo(22.6f, 473.4f)
                curveToRelative(-4.2f, 4.2f, -6.6f, 10.0f, -6.6f, 16.0f)
                curveTo(16.0f, 501.9f, 26.1f, 512.0f, 38.6f, 512.0f)
                lineTo(409.4f, 512.0f)
                curveToRelative(12.5f, 0.0f, 22.6f, -10.1f, 22.6f, -22.6f)
                curveToRelative(0.0f, -6.0f, -2.4f, -11.8f, -6.6f, -16.0f)
                lineTo(384.0f, 432.0f)
                lineTo(64.0f, 432.0f)
                lineTo(22.6f, 473.4f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
