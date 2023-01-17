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

public val TablerIcons.RecycleOff: ImageVector
    get() {
        if (_recycleOff != null) {
            return _recycleOff!!
        }
        _recycleOff = Builder(name = "RecycleOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(2.0f, 2.0f)
                moveToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(9.0f)
                moveToRelative(1.896f, -2.071f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, -0.146f, -0.679f)
                lineToRelative(-0.55f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.536f, 11.0f)
                lineToRelative(-0.732f, -2.732f)
                lineToRelative(-2.732f, 0.732f)
                moveToRelative(2.732f, -0.732f)
                lineToRelative(-4.5f, 7.794f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.506f, 2.89f)
                lineToRelative(1.141f, 0.024f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.464f, 11.0f)
                lineToRelative(2.732f, 0.732f)
                lineToRelative(0.732f, -2.732f)
                moveToRelative(-0.732f, 2.732f)
                lineToRelative(-4.5f, -7.794f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.256f, -0.14f)
                lineToRelative(-0.591f, 0.976f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _recycleOff!!
    }

private var _recycleOff: ImageVector? = null
