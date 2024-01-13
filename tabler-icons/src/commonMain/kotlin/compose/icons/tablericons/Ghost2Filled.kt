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

public val TablerIcons.Ghost2Filled: ImageVector
    get() {
        if (_ghost2Filled != null) {
            return _ghost2Filled!!
        }
        _ghost2Filled = Builder(name = "Ghost2Filled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 1.999f)
                lineToRelative(0.041f, 0.002f)
                lineToRelative(0.208f, 0.003f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.747f, 7.747f)
                lineToRelative(0.003f, 0.248f)
                lineToRelative(0.177f, 0.006f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.819f, 2.819f)
                lineToRelative(0.005f, 0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineToRelative(-0.001f, 1.696f)
                lineToRelative(1.833f, 2.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.72f, 1.548f)
                lineToRelative(-0.112f, 0.006f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-3.445f, 0.002f, -6.327f, -2.49f, -6.901f, -5.824f)
                lineToRelative(-0.028f, -0.178f)
                lineToRelative(-0.071f, 0.001f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.175f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                lineToRelative(0.004f, -0.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.996f, -7.75f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(10.01f, 8.0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, -1.993f)
                close()
                moveTo(14.01f, 8.0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, -1.993f)
                close()
            }
        }
        .build()
        return _ghost2Filled!!
    }

private var _ghost2Filled: ImageVector? = null
