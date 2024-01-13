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

public val TablerIcons.SquareRoundedChevronsUp: ImageVector
    get() {
        if (_squareRoundedChevronsUp != null) {
            return _squareRoundedChevronsUp!!
        }
        _squareRoundedChevronsUp = Builder(name = "SquareRoundedChevronsUp", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(7.2f, 0.0f, 9.0f, 1.8f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-1.8f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(-9.0f, -1.8f, -9.0f, -9.0f)
                reflectiveCurveToRelative(1.8f, -9.0f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _squareRoundedChevronsUp!!
    }

private var _squareRoundedChevronsUp: ImageVector? = null
