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

public val TablerIcons.DiaboloPlus: ImageVector
    get() {
        if (_diaboloPlus != null) {
            return _diaboloPlus!!
        }
        _diaboloPlus = Builder(name = "DiaboloPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(0.17f, 0.0f, 0.34f, -0.002f, 0.508f, -0.006f)
                moveToRelative(5.492f, -8.994f)
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
        return _diaboloPlus!!
    }

private var _diaboloPlus: ImageVector? = null
