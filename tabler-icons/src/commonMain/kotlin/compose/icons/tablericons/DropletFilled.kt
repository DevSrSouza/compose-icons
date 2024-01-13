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

public val TablerIcons.DropletFilled: ImageVector
    get() {
        if (_dropletFilled != null) {
            return _dropletFilled!!
        }
        _dropletFilled = Builder(name = "DropletFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.708f, 2.372f)
                arcToRelative(2.382f, 2.382f, 0.0f, false, false, -0.71f, 0.686f)
                lineToRelative(-4.892f, 7.26f)
                curveToRelative(-1.981f, 3.314f, -1.22f, 7.466f, 1.767f, 9.882f)
                curveToRelative(2.969f, 2.402f, 7.286f, 2.402f, 10.254f, 0.0f)
                curveToRelative(2.987f, -2.416f, 3.748f, -6.569f, 1.795f, -9.836f)
                lineToRelative(-4.919f, -7.306f)
                curveToRelative(-0.722f, -1.075f, -2.192f, -1.376f, -3.295f, -0.686f)
                close()
            }
        }
        .build()
        return _dropletFilled!!
    }

private var _dropletFilled: ImageVector? = null
