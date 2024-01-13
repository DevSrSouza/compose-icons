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

public val TablerIcons.HexagonalPyramidOff: ImageVector
    get() {
        if (_hexagonalPyramidOff != null) {
            return _hexagonalPyramidOff!!
        }
        _hexagonalPyramidOff = Builder(name = "HexagonalPyramidOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.877f, 7.88f)
                lineToRelative(-4.56f, 7.53f)
                arcToRelative(1.988f, 1.988f, 0.0f, false, false, 0.266f, 2.484f)
                lineToRelative(2.527f, 2.523f)
                curveToRelative(0.374f, 0.373f, 0.88f, 0.583f, 1.408f, 0.583f)
                horizontalLineToRelative(8.964f)
                curveToRelative(0.528f, 0.0f, 1.034f, -0.21f, 1.408f, -0.583f)
                lineToRelative(1.264f, -1.263f)
                moveToRelative(1.792f, -2.205f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, false, -0.262f, -1.538f)
                lineToRelative(-7.846f, -12.954f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -1.676f, 0.0f)
                lineToRelative(-1.772f, 2.926f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(-1.254f, 4.742f)
                moveToRelative(-0.841f, 3.177f)
                lineToRelative(-2.905f, 10.981f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(2.153f, 8.14f)
                moveToRelative(1.444f, 5.457f)
                lineToRelative(1.403f, 5.303f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _hexagonalPyramidOff!!
    }

private var _hexagonalPyramidOff: ImageVector? = null
