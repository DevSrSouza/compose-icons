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

public val TablerIcons.SquareRoundedMinus2: ImageVector
    get() {
        if (_squareRoundedMinus2 != null) {
            return _squareRoundedMinus2!!
        }
        _squareRoundedMinus2 = Builder(name = "SquareRoundedMinus2", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 21.0f)
                curveToRelative(-0.18f, 0.002f, -0.314f, 0.0f, -0.5f, 0.0f)
                curveToRelative(-7.2f, 0.0f, -9.0f, -1.8f, -9.0f, -9.0f)
                reflectiveCurveToRelative(1.8f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 1.8f, 9.0f, 9.0f)
                curveToRelative(0.0f, 1.136f, -0.046f, 2.138f, -0.152f, 3.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
        }
        .build()
        return _squareRoundedMinus2!!
    }

private var _squareRoundedMinus2: ImageVector? = null
