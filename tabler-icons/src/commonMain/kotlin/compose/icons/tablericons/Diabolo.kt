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

public val TablerIcons.Diabolo: ImageVector
    get() {
        if (_diabolo != null) {
            return _diabolo!!
        }
        _diabolo = Builder(name = "Diabolo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                moveToRelative(-8.0f, 0.0f)
                arcToRelative(8.0f, 3.0f, 0.0f, true, false, 16.0f, 0.0f)
                arcToRelative(8.0f, 3.0f, 0.0f, true, false, -16.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(0.143f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.048f, 0.307f)
                lineToRelative(1.952f, 5.55f)
                lineToRelative(-1.964f, 5.67f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.036f, 0.265f)
                verticalLineToRelative(0.065f)
                curveToRelative(0.0f, 1.657f, 3.582f, 3.0f, 8.0f, 3.0f)
                reflectiveCurveToRelative(8.0f, -1.343f, 8.0f, -3.0f)
                verticalLineToRelative(-0.065f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.036f, -0.265f)
                lineToRelative(-1.964f, -5.67f)
                lineToRelative(1.952f, -5.55f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.048f, -0.307f)
                verticalLineToRelative(-0.143f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, 2.686f, 2.0f, 6.0f, 2.0f)
                reflectiveCurveToRelative(6.0f, -0.895f, 6.0f, -2.0f)
            }
        }
        .build()
        return _diabolo!!
    }

private var _diabolo: ImageVector? = null
