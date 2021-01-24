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

public val SolidGroup.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 272.47f)
                lineToRelative(40.63f, 18.06f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 24.88f, 0.47f)
                lineToRelative(12.78f, -5.12f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 18.76f, -20.5f)
                lineToRelative(9.22f, -30.65f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 12.55f, -15.65f)
                lineTo(159.94f, 208.0f)
                verticalLineToRelative(50.33f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -26.53f, 42.94f)
                lineToRelative(-57.22f, 28.65f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 32.0f, 401.48f)
                lineTo(32.0f, 416.0f)
                horizontalLineToRelative(319.86f)
                lineTo(351.86f, 224.0f)
                curveToRelative(0.0f, -106.0f, -85.92f, -192.0f, -191.92f, -192.0f)
                lineTo(12.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 44.0f)
                arcToRelative(16.9f, 16.9f, 0.0f, false, false, 1.79f, 7.58f)
                lineTo(16.0f, 80.0f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -7.0f, 17.0f)
                verticalLineToRelative(137.21f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 19.0f, 29.26f)
                close()
                moveTo(52.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                close()
                moveTo(368.0f, 448.0f)
                lineTo(16.0f, 448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
