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

public val TablerIcons.InfinityOff: ImageVector
    get() {
        if (_infinityOff != null) {
            return _infinityOff!!
        }
        _infinityOff = Builder(name = "InfinityOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.165f, 8.174f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.166f, 3.826f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.829f, 2.828f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 2.172f, -2.828f)
                moveToRelative(1.677f, -2.347f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.495f, -0.481f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.129f, 6.1f)
                moveToRelative(-3.521f, 0.537f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.608f, -0.981f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.172f, -2.828f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _infinityOff!!
    }

private var _infinityOff: ImageVector? = null
