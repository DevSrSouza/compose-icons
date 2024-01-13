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

public val TablerIcons.NavigationOff: ImageVector
    get() {
        if (_navigationOff != null) {
            return _navigationOff!!
        }
        _navigationOff = Builder(name = "NavigationOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.28f, 12.28f)
                curveToRelative(-0.95f, -2.064f, -2.377f, -5.157f, -4.28f, -9.28f)
                curveToRelative(-0.7f, 1.515f, -1.223f, 2.652f, -1.573f, 3.41f)
                moveToRelative(-1.27f, 2.75f)
                curveToRelative(-0.882f, 1.913f, -2.59f, 5.618f, -5.127f, 11.115f)
                curveToRelative(-0.07f, 0.2f, -0.017f, 0.424f, 0.135f, 0.572f)
                curveToRelative(0.15f, 0.148f, 0.374f, 0.193f, 0.57f, 0.116f)
                lineToRelative(7.265f, -2.463f)
                lineToRelative(7.265f, 2.463f)
                curveToRelative(0.196f, 0.077f, 0.42f, 0.032f, 0.57f, -0.116f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, 0.134f, -0.572f)
                lineToRelative(-0.26f, -0.563f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _navigationOff!!
    }

private var _navigationOff: ImageVector? = null
