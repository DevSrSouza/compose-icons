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

public val TablerIcons.Rotate: ImageVector
    get() {
        if (_rotate != null) {
            return _rotate!!
        }
        _rotate = Builder(name = "Rotate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.95f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -0.5f, 4.0f)
                moveToRelative(0.5f, 5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
            }
        }
        .build()
        return _rotate!!
    }

private var _rotate: ImageVector? = null
