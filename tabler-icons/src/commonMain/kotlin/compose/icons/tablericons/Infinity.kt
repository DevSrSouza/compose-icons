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

public val TablerIcons.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.828f, 9.172f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 5.656f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 2.172f, -2.828f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 2.172f, -2.828f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 5.656f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.172f, -2.828f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -2.172f, -2.828f)
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
