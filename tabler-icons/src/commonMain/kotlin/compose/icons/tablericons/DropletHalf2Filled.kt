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

public val TablerIcons.DropletHalf2Filled: ImageVector
    get() {
        if (_dropletHalf2Filled != null) {
            return _dropletHalf2Filled!!
        }
        _dropletHalf2Filled = Builder(name = "DropletHalf2Filled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.905f, 2.923f)
                lineToRelative(0.098f, 0.135f)
                lineToRelative(4.92f, 7.306f)
                arcToRelative(7.566f, 7.566f, 0.0f, false, true, 1.043f, 3.167f)
                lineToRelative(0.024f, 0.326f)
                curveToRelative(0.007f, 0.047f, 0.01f, 0.094f, 0.01f, 0.143f)
                lineToRelative(-0.002f, 0.06f)
                curveToRelative(0.056f, 2.3f, -0.944f, 4.582f, -2.87f, 6.14f)
                curveToRelative(-2.969f, 2.402f, -7.286f, 2.402f, -10.255f, 0.0f)
                curveToRelative(-1.904f, -1.54f, -2.904f, -3.787f, -2.865f, -6.071f)
                arcToRelative(1.052f, 1.052f, 0.0f, false, true, 0.013f, -0.333f)
                arcToRelative(7.66f, 7.66f, 0.0f, false, true, 0.913f, -3.176f)
                lineToRelative(0.172f, -0.302f)
                lineToRelative(4.893f, -7.26f)
                curveToRelative(0.185f, -0.275f, 0.426f, -0.509f, 0.709f, -0.686f)
                curveToRelative(1.055f, -0.66f, 2.446f, -0.413f, 3.197f, 0.55f)
                close()
                moveTo(11.845f, 4.03f)
                lineToRelative(-0.077f, 0.038f)
                lineToRelative(-0.041f, 0.03f)
                lineToRelative(-0.037f, 0.036f)
                lineToRelative(-0.033f, 0.042f)
                lineToRelative(-4.863f, 7.214f)
                arcToRelative(5.607f, 5.607f, 0.0f, false, false, -0.651f, 1.61f)
                horizontalLineToRelative(11.723f)
                arcToRelative(5.444f, 5.444f, 0.0f, false, false, -0.49f, -1.313f)
                lineToRelative(-0.141f, -0.251f)
                lineToRelative(-4.891f, -7.261f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, false, -0.5f, -0.145f)
                close()
            }
        }
        .build()
        return _dropletHalf2Filled!!
    }

private var _dropletHalf2Filled: ImageVector? = null
