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

public val TablerIcons.Mickey: ImageVector
    get() {
        if (_mickey != null) {
            return _mickey!!
        }
        _mickey = Builder(name = "Mickey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.25f, 4.8f)
                arcToRelative(7.017f, 7.017f, 0.0f, false, false, -2.424f, 2.1f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -0.826f, -6.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -0.826f, 6.902f)
                arcToRelative(7.013f, 7.013f, 0.0f, false, false, -2.424f, -2.103f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.25f, -4.799f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                moveToRelative(-7.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -14.0f, 0.0f)
            }
        }
        .build()
        return _mickey!!
    }

private var _mickey: ImageVector? = null
