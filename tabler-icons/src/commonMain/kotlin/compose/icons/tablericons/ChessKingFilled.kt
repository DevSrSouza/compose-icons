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

public val TablerIcons.ChessKingFilled: ImageVector
    get() {
        if (_chessKingFilled != null) {
            return _chessKingFilled!!
        }
        _chessKingFilled = Builder(name = "ChessKingFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.758f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, true, 2.033f, -0.734f)
                lineToRelative(0.24f, -0.018f)
                lineToRelative(0.227f, -0.006f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, 4.5f)
                arcToRelative(4.504f, 4.504f, 0.0f, false, true, -4.064f, 4.478f)
                lineToRelative(-0.217f, 0.016f)
                lineToRelative(-0.219f, 0.006f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 2.501f, -8.241f)
                lineToRelative(-0.001f, -1.759f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
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
        return _chessKingFilled!!
    }

private var _chessKingFilled: ImageVector? = null
