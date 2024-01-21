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

public val TablerIcons.ChessKnightFilled: ImageVector
    get() {
        if (_chessKnightFilled != null) {
            return _chessKnightFilled!!
        }
        _chessKnightFilled = Builder(name = "ChessKnightFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.959f, 1.99f)
                lineToRelative(-0.147f, 0.028f)
                lineToRelative(-0.115f, 0.029f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.646f, 1.27f)
                lineToRelative(0.749f, 2.245f)
                lineToRelative(-2.815f, 1.735f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.655f, 2.751f)
                lineToRelative(0.089f, 0.133f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.614f, 0.819f)
                lineToRelative(1.563f, -0.001f)
                lineToRelative(-1.614f, 4.674f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.945f, 1.327f)
                horizontalLineToRelative(7.961f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.978f)
                lineToRelative(0.112f, -5.0f)
                curveToRelative(0.0f, -3.827f, -1.555f, -6.878f, -4.67f, -7.966f)
                lineToRelative(-2.399f, -0.83f)
                lineToRelative(-0.375f, -0.121f)
                lineToRelative(-0.258f, -0.074f)
                lineToRelative(-0.135f, -0.031f)
                lineToRelative(-0.101f, -0.013f)
                lineToRelative(-0.055f, -0.001f)
                lineToRelative(-0.048f, 0.003f)
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
        return _chessKnightFilled!!
    }

private var _chessKnightFilled: ImageVector? = null
