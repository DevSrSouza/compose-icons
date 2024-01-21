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

public val TablerIcons.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = Builder(name = "EggFried", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(14.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.872f, 6.13f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.178f, 5.681f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.684f, 3.626f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -8.662f, -5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 4.645f, -8.856f)
                arcToRelative(4.982f, 4.982f, 0.0f, false, true, 3.651f, -1.585f)
                close()
            }
        }
        .build()
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
