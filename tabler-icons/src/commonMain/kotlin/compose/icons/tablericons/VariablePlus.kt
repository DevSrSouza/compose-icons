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

public val TablerIcons.VariablePlus: ImageVector
    get() {
        if (_variablePlus != null) {
            return _variablePlus!!
        }
        _variablePlus = Builder(name = "VariablePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                curveToRelative(-2.5f, 5.0f, -2.5f, 10.0f, 0.0f, 16.0f)
                moveToRelative(14.0f, -16.0f)
                curveToRelative(1.38f, 2.76f, 2.0f, 5.52f, 1.855f, 8.448f)
                moveToRelative(-11.855f, -3.448f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.0f, 0.0f, 1.0f, 1.0f, 2.016f, 3.527f)
                curveToRelative(0.785f, 1.972f, 0.944f, 3.008f, 1.483f, 3.346f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                curveToRelative(1.5f, 0.0f, 3.0f, -2.0f, 4.0f, -3.5f)
                reflectiveCurveToRelative(2.5f, -3.5f, 4.0f, -3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(6.0f)
            }
        }
        .build()
        return _variablePlus!!
    }

private var _variablePlus: ImageVector? = null
