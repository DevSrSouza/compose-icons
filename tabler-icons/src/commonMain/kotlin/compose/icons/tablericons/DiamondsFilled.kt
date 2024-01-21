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

public val TablerIcons.DiamondsFilled: ImageVector
    get() {
        if (_diamondsFilled != null) {
            return _diamondsFilled!!
        }
        _diamondsFilled = Builder(name = "DiamondsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.005f)
                curveToRelative(-0.777f, 0.0f, -1.508f, 0.367f, -1.971f, 0.99f)
                lineToRelative(-5.362f, 6.895f)
                curveToRelative(-0.89f, 1.136f, -0.89f, 3.083f, 0.0f, 4.227f)
                lineToRelative(5.375f, 6.911f)
                arcToRelative(2.457f, 2.457f, 0.0f, false, false, 3.93f, -0.017f)
                lineToRelative(5.361f, -6.894f)
                curveToRelative(0.89f, -1.136f, 0.89f, -3.083f, 0.0f, -4.227f)
                lineToRelative(-5.375f, -6.911f)
                arcToRelative(2.446f, 2.446f, 0.0f, false, false, -1.958f, -0.974f)
                close()
            }
        }
        .build()
        return _diamondsFilled!!
    }

private var _diamondsFilled: ImageVector? = null
