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

public val TablerIcons.HazeMoon: ImageVector
    get() {
        if (_hazeMoon != null) {
            return _hazeMoon!!
        }
        _hazeMoon = Builder(name = "HazeMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 20.0f)
                horizontalLineToRelative(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.296f, 16.0f)
                curveToRelative(-2.268f, -1.4f, -3.598f, -4.087f, -3.237f, -6.916f)
                curveToRelative(0.443f, -3.48f, 3.308f, -6.083f, 6.698f, -6.084f)
                verticalLineToRelative(0.006f)
                horizontalLineToRelative(0.296f)
                curveToRelative(-1.991f, 1.916f, -2.377f, 5.03f, -0.918f, 7.405f)
                curveToRelative(1.459f, 2.374f, 4.346f, 3.33f, 6.865f, 2.275f)
                arcToRelative(6.888f, 6.888f, 0.0f, false, true, -2.777f, 3.314f)
            }
        }
        .build()
        return _hazeMoon!!
    }

private var _hazeMoon: ImageVector? = null
