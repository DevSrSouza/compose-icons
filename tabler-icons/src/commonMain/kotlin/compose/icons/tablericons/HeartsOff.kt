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

public val TablerIcons.HeartsOff: ImageVector
    get() {
        if (_heartsOff != null) {
            return _heartsOff!!
        }
        _heartsOff = Builder(name = "HeartsOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.017f, 18.0f)
                lineToRelative(-2.017f, 2.0f)
                lineToRelative(-7.5f, -7.428f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.49f, -7.586f)
                moveToRelative(3.01f, -1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.0f, 2.018f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 8.153f, 5.784f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.814f, 11.814f)
                arcToRelative(2.81f, 2.81f, 0.0f, false, false, -0.007f, 3.948f)
                lineToRelative(4.182f, 4.238f)
                lineToRelative(2.01f, -2.021f)
                moveToRelative(1.977f, -1.99f)
                lineToRelative(0.211f, -0.212f)
                arcToRelative(2.81f, 2.81f, 0.0f, false, false, 0.0f, -3.948f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, false, -3.91f, -0.007f)
                lineToRelative(-0.283f, 0.178f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _heartsOff!!
    }

private var _heartsOff: ImageVector? = null
