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

public val TablerIcons.Horseshoe: ImageVector
    get() {
        if (_horseshoe != null) {
            return _horseshoe!!
        }
        _horseshoe = Builder(name = "Horseshoe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                curveToRelative(0.5f, -1.242f, 2.0f, -2.0f, 2.0f, -5.0f)
                reflectiveCurveToRelative(-1.0f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveToRelative(-9.0f, 6.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(1.495f, 3.749f, 2.0f, 5.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(2.0f, 3.0f)
                lineToRelative(2.406f, -1.147f)
                curveToRelative(1.25f, -0.714f, 1.778f, -2.08f, 1.203f, -3.363f)
                curveToRelative(-1.078f, -2.407f, -1.609f, -8.49f, 3.391f, -8.49f)
                reflectiveCurveToRelative(4.469f, 6.083f, 3.39f, 8.49f)
                curveToRelative(-0.574f, 1.284f, -0.045f, 2.649f, 1.204f, 3.363f)
                lineToRelative(2.406f, 1.147f)
                lineToRelative(2.0f, -3.0f)
                lineToRelative(-2.0f, -1.0f)
                close()
            }
        }
        .build()
        return _horseshoe!!
    }

private var _horseshoe: ImageVector? = null
