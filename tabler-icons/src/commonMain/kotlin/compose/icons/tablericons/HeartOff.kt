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

public val TablerIcons.HeartOff: ImageVector
    get() {
        if (_heartOff != null) {
            return _heartOff!!
        }
        _heartOff = Builder(name = "HeartOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 12.572f)
                lineToRelative(-1.5f, 1.428f)
                moveToRelative(-2.0f, 2.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-7.5f, -7.428f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -1.288f, -5.068f)
                arcToRelative(4.976f, 4.976f, 0.0f, false, true, 1.788f, -2.504f)
                moveToRelative(3.0f, -1.0f)
                curveToRelative(1.56f, 0.0f, 3.05f, 0.727f, 4.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 7.5f, 6.572f)
            }
        }
        .build()
        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
