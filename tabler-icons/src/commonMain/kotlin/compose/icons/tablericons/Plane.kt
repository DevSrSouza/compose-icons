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

public val TablerIcons.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-4.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(2.0f, -7.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(2.0f, -4.0f)
                lineToRelative(-2.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-2.0f, -7.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
