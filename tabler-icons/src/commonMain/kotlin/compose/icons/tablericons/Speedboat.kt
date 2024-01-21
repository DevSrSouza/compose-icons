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

public val TablerIcons.Speedboat: ImageVector
    get() {
        if (_speedboat != null) {
            return _speedboat!!
        }
        _speedboat = Builder(name = "Speedboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(13.4f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.5f, -1.34f)
                lineToRelative(3.1f, -4.66f)
                horizontalLineToRelative(0.0f)
                horizontalLineToRelative(-6.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.49f, 0.29f)
                lineToRelative(-3.56f, 1.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, 0.29f)
                horizontalLineToRelative(-3.73f)
                horizontalLineToRelative(0.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-1.5f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 13.0f)
                lineToRelative(1.5f, -5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(2.0f, 3.0f)
            }
        }
        .build()
        return _speedboat!!
    }

private var _speedboat: ImageVector? = null
