package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = Builder(name = "ChessKnight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                lineToRelative(-1.447f, 0.724f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.553f, 0.894f)
                verticalLineToRelative(2.382f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.382f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.553f, -0.894f)
                lineToRelative(-1.447f, -0.724f)
                horizontalLineToRelative(-8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                lineToRelative(1.0f, 3.0f)
                lineToRelative(-3.491f, 2.148f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.524f, 1.852f)
                horizontalLineToRelative(2.967f)
                lineToRelative(-2.073f, 6.0f)
                horizontalLineToRelative(7.961f)
                lineToRelative(0.112f, -5.0f)
                curveToRelative(0.0f, -3.0f, -1.09f, -5.983f, -4.0f, -7.0f)
                curveToRelative(-1.94f, -0.678f, -2.94f, -1.011f, -3.0f, -1.0f)
                close()
            }
        }
        .build()
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
