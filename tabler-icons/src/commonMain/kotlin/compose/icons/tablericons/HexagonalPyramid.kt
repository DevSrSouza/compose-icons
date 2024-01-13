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

public val TablerIcons.HexagonalPyramid: ImageVector
    get() {
        if (_hexagonalPyramid != null) {
            return _hexagonalPyramid!!
        }
        _hexagonalPyramid = Builder(name = "HexagonalPyramid", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.162f, 2.457f)
                lineToRelative(-7.846f, 12.954f)
                arcToRelative(1.988f, 1.988f, 0.0f, false, false, 0.267f, 2.483f)
                lineToRelative(2.527f, 2.523f)
                curveToRelative(0.374f, 0.373f, 0.88f, 0.583f, 1.408f, 0.583f)
                horizontalLineToRelative(8.964f)
                curveToRelative(0.528f, 0.0f, 1.034f, -0.21f, 1.408f, -0.583f)
                lineToRelative(2.527f, -2.523f)
                arcToRelative(1.988f, 1.988f, 0.0f, false, false, 0.267f, -2.483f)
                lineToRelative(-7.846f, -12.954f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -1.676f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(-5.0f, 18.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(5.0f, 18.9f)
            }
        }
        .build()
        return _hexagonalPyramid!!
    }

private var _hexagonalPyramid: ImageVector? = null
