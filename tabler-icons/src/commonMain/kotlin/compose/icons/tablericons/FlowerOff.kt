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

public val TablerIcons.FlowerOff: ImageVector
    get() {
        if (_flowerOff != null) {
            return _flowerOff!!
        }
        _flowerOff = Builder(name = "FlowerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.875f, 9.882f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.247f, 4.238f)
                moveToRelative(0.581f, -3.423f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, false, -1.418f, -1.409f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                curveToRelative(0.0f, 0.562f, -0.259f, 1.442f, -0.776f, 2.64f)
                lineToRelative(-0.724f, 1.36f)
                lineToRelative(1.76f, -1.893f)
                curveToRelative(0.499f, -0.6f, 0.922f, -1.0f, 1.27f, -1.205f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, true, 4.07f, 1.099f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, -1.09f, 4.098f)
                curveToRelative(-0.374f, 0.217f, -0.99f, 0.396f, -1.846f, 0.535f)
                lineToRelative(-1.779f, 0.244f)
                moveToRelative(0.292f, 0.282f)
                lineToRelative(1.223f, 0.166f)
                curveToRelative(1.0f, 0.145f, 1.698f, 0.337f, 2.11f, 0.576f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, 1.226f, 3.832f)
                moveToRelative(-2.277f, 1.733f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, true, -1.929f, -0.369f)
                curveToRelative(-0.348f, -0.202f, -0.771f, -0.604f, -1.27f, -1.205f)
                lineToRelative(-1.76f, -1.893f)
                lineToRelative(0.724f, 1.36f)
                curveToRelative(0.516f, 1.199f, 0.776f, 2.079f, 0.776f, 2.64f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                curveToRelative(0.0f, -0.562f, 0.259f, -1.442f, 0.776f, -2.64f)
                lineToRelative(0.724f, -1.36f)
                lineToRelative(-1.76f, 1.893f)
                curveToRelative(-0.499f, 0.601f, -0.922f, 1.0f, -1.27f, 1.205f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, true, -4.07f, -1.098f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, 1.09f, -4.098f)
                curveToRelative(0.374f, -0.218f, 0.99f, -0.396f, 1.846f, -0.536f)
                lineToRelative(2.664f, -0.366f)
                lineToRelative(-2.4f, -0.325f)
                curveToRelative(-1.0f, -0.145f, -1.698f, -0.337f, -2.11f, -0.576f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, -1.09f, -4.099f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, true, 2.134f, -1.467f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _flowerOff!!
    }

private var _flowerOff: ImageVector? = null
