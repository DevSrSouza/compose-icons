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

public val TablerIcons.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.562f, -0.259f, 1.442f, -0.776f, 2.64f)
                lineToRelative(-0.724f, 1.36f)
                lineToRelative(1.76f, -1.893f)
                curveToRelative(0.499f, -0.6f, 0.922f, -1.0f, 1.27f, -1.205f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, true, 4.07f, 1.099f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, -1.09f, 4.098f)
                curveToRelative(-0.374f, 0.217f, -0.99f, 0.396f, -1.846f, 0.535f)
                lineToRelative(-2.664f, 0.366f)
                lineToRelative(2.4f, 0.326f)
                curveToRelative(1.0f, 0.145f, 1.698f, 0.337f, 2.11f, 0.576f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, 1.09f, 4.098f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, true, -4.07f, 1.098f)
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
                arcToRelative(2.968f, 2.968f, 0.0f, false, true, 4.07f, -1.099f)
                curveToRelative(0.348f, 0.203f, 0.771f, 0.604f, 1.27f, 1.205f)
                lineToRelative(1.76f, 1.894f)
                curveToRelative(-1.0f, -2.292f, -1.5f, -3.625f, -1.5f, -4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
