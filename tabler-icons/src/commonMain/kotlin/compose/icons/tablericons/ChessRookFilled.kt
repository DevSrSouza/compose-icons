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

public val TablerIcons.ChessRookFilled: ImageVector
    get() {
        if (_chessRookFilled != null) {
            return _chessRookFilled!!
        }
        _chessRookFilled = Builder(name = "ChessRookFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.652f)
                lineToRelative(0.362f, -2.164f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.034f, -0.836f)
                lineToRelative(0.116f, 0.013f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.836f, 1.035f)
                lineToRelative(-0.013f, 0.116f)
                lineToRelative(-0.5f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.865f, 0.829f)
                lineToRelative(-0.122f, 0.007f)
                horizontalLineToRelative(-1.383f)
                lineToRelative(0.877f, 7.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.877f, 1.103f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.993f)
                lineToRelative(0.006f, -0.117f)
                lineToRelative(0.877f, -7.89f)
                horizontalLineToRelative(-1.383f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.96f, -0.718f)
                lineToRelative(-0.026f, -0.118f)
                lineToRelative(-0.5f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.947f, -0.442f)
                lineToRelative(0.025f, 0.114f)
                lineToRelative(0.361f, 2.164f)
                horizontalLineToRelative(1.653f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.993f, -0.117f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
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
        return _chessRookFilled!!
    }

private var _chessRookFilled: ImageVector? = null
