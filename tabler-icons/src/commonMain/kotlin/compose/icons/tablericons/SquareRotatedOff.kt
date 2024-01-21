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

public val TablerIcons.SquareRotatedOff: ImageVector
    get() {
        if (_squareRotatedOff != null) {
            return _squareRotatedOff!!
        }
        _squareRotatedOff = Builder(name = "SquareRotatedOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.964f, 16.952f)
                lineToRelative(-3.462f, 3.461f)
                curveToRelative(-0.782f, 0.783f, -2.222f, 0.783f, -3.0f, 0.0f)
                lineToRelative(-6.911f, -6.91f)
                curveToRelative(-0.783f, -0.783f, -0.783f, -2.223f, 0.0f, -3.0f)
                lineToRelative(3.455f, -3.456f)
                moveToRelative(2.0f, -2.0f)
                lineToRelative(1.453f, -1.452f)
                curveToRelative(0.782f, -0.783f, 2.222f, -0.783f, 3.0f, 0.0f)
                lineToRelative(6.911f, 6.91f)
                curveToRelative(0.783f, 0.783f, 0.783f, 2.223f, 0.0f, 3.0f)
                lineToRelative(-1.448f, 1.45f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _squareRotatedOff!!
    }

private var _squareRotatedOff: ImageVector? = null
