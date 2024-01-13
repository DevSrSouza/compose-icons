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

public val TablerIcons.CircleKeyFilled: ImageVector
    get() {
        if (_circleKeyFilled != null) {
            return _circleKeyFilled!!
        }
        _circleKeyFilled = Builder(name = "CircleKeyFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                curveToRelative(0.0f, -5.523f, 4.477f, -10.0f, 10.0f, -10.0f)
                close()
                moveTo(14.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.98f, 2.65f)
                lineToRelative(-0.015f, 0.174f)
                lineToRelative(-0.005f, 0.176f)
                lineToRelative(0.005f, 0.176f)
                curveToRelative(0.019f, 0.319f, 0.087f, 0.624f, 0.197f, 0.908f)
                lineToRelative(0.09f, 0.209f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(-0.082f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.226f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.226f, 0.0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.226f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.585f, -0.585f)
                lineToRelative(0.793f, 0.792f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.403f, -1.403f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.792f, -0.792f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 1.293f, -5.708f)
                close()
                moveTo(14.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _circleKeyFilled!!
    }

private var _circleKeyFilled: ImageVector? = null
