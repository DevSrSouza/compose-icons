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

public val TablerIcons.SquareRoot2: ImageVector
    get() {
        if (_squareRoot2 != null) {
            return _squareRoot2!!
        }
        _squareRoot2 = Builder(name = "SquareRoot2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.0f, 0.0f, 1.0f, 1.0f, 2.016f, 3.527f)
                curveToRelative(0.984f, 2.473f, 0.984f, 3.473f, 1.984f, 3.473f)
                horizontalLineToRelative(1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveToRelative(1.5f, 0.0f, 3.0f, -2.0f, 4.0f, -3.5f)
                reflectiveCurveToRelative(2.5f, -3.5f, 4.0f, -3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(3.0f, 8.0f)
                lineToRelative(3.0f, -16.0f)
                horizontalLineToRelative(10.0f)
            }
        }
        .build()
        return _squareRoot2!!
    }

private var _squareRoot2: ImageVector? = null
