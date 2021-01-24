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
                moveTo(256.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -56.0f, -56.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                close()
                moveTo(432.0f, 448.0f)
                lineTo(80.0f, 448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(504.87f, 184.16f)
                lineToRelative(-28.51f, -15.92f)
                curveToRelative(-7.44f, -5.0f, -16.91f, -2.46f, -22.29f, 4.68f)
                arcToRelative(47.59f, 47.59f, 0.0f, false, true, -47.23f, 18.23f)
                curveTo(383.7f, 186.86f, 368.0f, 164.93f, 368.0f, 141.4f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, -13.4f, -13.4f)
                horizontalLineToRelative(-38.77f)
                curveToRelative(-6.0f, 0.0f, -11.61f, 4.0f, -12.86f, 9.91f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -93.94f, 0.0f)
                curveToRelative(-1.25f, -5.92f, -6.82f, -9.91f, -12.86f, -9.91f)
                lineTo(157.4f, 128.0f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, -13.4f, 13.4f)
                curveToRelative(0.0f, 25.69f, -19.0f, 48.75f, -44.67f, 50.49f)
                arcToRelative(47.5f, 47.5f, 0.0f, false, true, -41.54f, -19.15f)
                curveToRelative(-5.28f, -7.09f, -14.73f, -9.45f, -22.09f, -4.54f)
                lineToRelative(-28.57f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.44f, 20.47f)
                lineTo(104.24f, 416.0f)
                horizontalLineToRelative(303.52f)
                lineToRelative(102.55f, -211.37f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.44f, -20.47f)
                close()
            }
        }
        .build()
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
