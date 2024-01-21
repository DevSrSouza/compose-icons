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

public val TablerIcons.BrandCake: ImageVector
    get() {
        if (_brandCake != null) {
            return _brandCake!!
        }
        _brandCake = Builder(name = "BrandCake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.84f, 12.0f)
                curveToRelative(0.0f, 2.05f, 0.985f, 3.225f, -0.04f, 5.0f)
                curveToRelative(-1.026f, 1.775f, -2.537f, 1.51f, -4.314f, 2.534f)
                curveToRelative(-1.776f, 1.026f, -2.302f, 2.466f, -4.353f, 2.466f)
                curveToRelative(-2.051f, 0.0f, -2.576f, -1.441f, -4.353f, -2.466f)
                curveToRelative(-1.776f, -1.024f, -3.288f, -0.759f, -4.314f, -2.534f)
                curveToRelative(-1.025f, -1.775f, -0.04f, -2.95f, -0.04f, -5.0f)
                reflectiveCurveToRelative(-0.985f, -3.225f, 0.04f, -5.0f)
                curveToRelative(1.026f, -1.775f, 2.537f, -1.51f, 4.314f, -2.534f)
                curveToRelative(1.776f, -1.026f, 2.302f, -2.466f, 4.353f, -2.466f)
                reflectiveCurveToRelative(2.577f, 1.441f, 4.353f, 2.466f)
                curveToRelative(1.776f, 1.024f, 3.288f, 0.759f, 4.313f, 2.534f)
                curveToRelative(1.026f, 1.775f, 0.04f, 2.95f, 0.04f, 5.0f)
                close()
            }
        }
        .build()
        return _brandCake!!
    }

private var _brandCake: ImageVector? = null
