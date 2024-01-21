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

public val TablerIcons.Lemon2: ImageVector
    get() {
        if (_lemon2 != null) {
            return _lemon2!!
        }
        _lemon2 = Builder(name = "Lemon2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.185f, 3.611f)
                curveToRelative(1.55f, 2.94f, 0.873f, 6.917f, -1.892f, 9.682f)
                curveToRelative(-2.765f, 2.765f, -6.743f, 3.442f, -9.682f, 1.892f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.796f, -2.796f)
                curveToRelative(-1.55f, -2.94f, -0.873f, -6.917f, 1.892f, -9.682f)
                curveToRelative(2.765f, -2.765f, 6.743f, -3.442f, 9.682f, -1.892f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.611f, -0.815f)
                close()
            }
        }
        .build()
        return _lemon2!!
    }

private var _lemon2: ImageVector? = null
