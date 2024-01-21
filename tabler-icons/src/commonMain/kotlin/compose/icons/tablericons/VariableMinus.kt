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

public val TablerIcons.VariableMinus: ImageVector
    get() {
        if (_variableMinus != null) {
            return _variableMinus!!
        }
        _variableMinus = Builder(name = "VariableMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(5.0f, 4.0f)
                curveToRelative(-2.5f, 5.0f, -2.5f, 10.0f, 0.0f, 16.0f)
                moveToRelative(14.0f, -16.0f)
                curveToRelative(1.775f, 3.55f, 2.29f, 7.102f, 1.544f, 11.01f)
                moveToRelative(-11.544f, -6.01f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.0f, 0.0f, 1.0f, 1.0f, 2.016f, 3.527f)
                curveToRelative(0.782f, 1.966f, 0.943f, 3.0f, 1.478f, 3.343f)
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
        }
        .build()
        return _variableMinus!!
    }

private var _variableMinus: ImageVector? = null
