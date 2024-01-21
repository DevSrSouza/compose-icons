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

public val TablerIcons.ChessQueenFilled: ImageVector
    get() {
        if (_chessQueenFilled != null) {
            return _chessQueenFilled!!
        }
        _chessQueenFilled = Builder(name = "ChessQueenFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.572f, 3.236f)
                lineToRelative(0.793f, 1.983f)
                lineToRelative(1.702f, -1.702f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, true, 1.933f, -2.517f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.674f, 3.884f)
                lineToRelative(-1.69f, 9.295f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.865f, 0.814f)
                lineToRelative(-0.119f, 0.007f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.956f, -0.705f)
                lineToRelative(-0.028f, -0.116f)
                lineToRelative(-1.69f, -9.295f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.607f, -1.367f)
                lineToRelative(1.701f, 1.702f)
                lineToRelative(0.794f, -1.983f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.572f, -3.236f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.987f, -1.768f)
                lineToRelative(0.011f, -0.174f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.998f, -1.058f)
                close()
            }
        }
        .build()
        return _chessQueenFilled!!
    }

private var _chessQueenFilled: ImageVector? = null
