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

public val TablerIcons.FishChristianity: ImageVector
    get() {
        if (_fishChristianity != null) {
            return _fishChristianity!!
        }
        _fishChristianity = Builder(name = "FishChristianity", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                reflectiveCurveToRelative(-5.646f, 10.0f, -12.308f, 10.0f)
                curveToRelative(-3.226f, 0.025f, -6.194f, -1.905f, -7.692f, -5.0f)
                curveToRelative(1.498f, -3.095f, 4.466f, -5.025f, 7.692f, -5.0f)
                curveToRelative(6.662f, 0.0f, 12.308f, 10.0f, 12.308f, 10.0f)
            }
        }
        .build()
        return _fishChristianity!!
    }

private var _fishChristianity: ImageVector? = null
