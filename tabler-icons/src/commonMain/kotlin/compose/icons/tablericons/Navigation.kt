package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.5f)
                lineToRelative(7.265f, 2.463f)
                curveToRelative(0.196f, 0.077f, 0.42f, 0.032f, 0.57f, -0.116f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, 0.134f, -0.572f)
                lineToRelative(-7.969f, -17.275f)
                lineToRelative(-7.97f, 17.275f)
                curveToRelative(-0.07f, 0.2f, -0.017f, 0.424f, 0.135f, 0.572f)
                curveToRelative(0.15f, 0.148f, 0.374f, 0.193f, 0.57f, 0.116f)
                lineToRelative(7.265f, -2.463f)
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
