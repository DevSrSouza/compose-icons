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

public val TablerIcons.ChessBishopFilled: ImageVector
    get() {
        if (_chessBishopFilled != null) {
            return _chessBishopFilled!!
        }
        _chessBishopFilled = Builder(name = "ChessBishopFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.386f, 3.442f)
                curveToRelative(0.646f, 0.28f, 1.226f, 0.62f, 1.74f, 1.017f)
                lineToRelative(-3.833f, 3.834f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.403f, 1.403f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(3.814f, -3.813f)
                curveToRelative(0.977f, 1.35f, 1.479f, 3.07f, 1.479f, 5.106f)
                curveToRelative(0.0f, 1.913f, -1.178f, 3.722f, -3.089f, 3.973f)
                lineToRelative(-0.2f, 0.02f)
                lineToRelative(-0.211f, 0.007f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.126f, 0.0f, -3.5f, -1.924f, -3.5f, -4.0f)
                curveToRelative(0.0f, -3.68f, 1.57f, -6.255f, 4.613f, -7.56f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.387f, -3.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                verticalLineToRelative(1.0f)
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
        return _chessBishopFilled!!
    }

private var _chessBishopFilled: ImageVector? = null
