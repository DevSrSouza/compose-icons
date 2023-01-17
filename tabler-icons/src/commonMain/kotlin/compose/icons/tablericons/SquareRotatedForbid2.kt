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

public val TablerIcons.SquareRotatedForbid2: ImageVector
    get() {
        if (_squareRotatedForbid2 != null) {
            return _squareRotatedForbid2!!
        }
        _squareRotatedForbid2 = Builder(name = "SquareRotatedForbid2", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 20.4f)
                lineToRelative(-6.9f, -6.9f)
                curveToRelative(-0.781f, -0.781f, -0.781f, -2.219f, 0.0f, -3.0f)
                lineToRelative(6.9f, -6.9f)
                curveToRelative(0.781f, -0.781f, 2.219f, -0.781f, 3.0f, 0.0f)
                lineToRelative(6.9f, 6.9f)
                curveToRelative(0.781f, 0.781f, 0.781f, 2.219f, 0.0f, 3.0f)
                lineToRelative(-6.9f, 6.9f)
                curveToRelative(-0.781f, 0.781f, -2.219f, 0.781f, -3.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 9.5f)
                lineToRelative(5.0f, 5.0f)
            }
        }
        .build()
        return _squareRotatedForbid2!!
    }

private var _squareRotatedForbid2: ImageVector? = null
