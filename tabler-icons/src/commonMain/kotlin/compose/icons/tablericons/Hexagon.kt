package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 6.873f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 1.747f)
                verticalLineToRelative(6.536f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.029f, 1.748f)
                lineToRelative(-6.0f, 3.833f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.942f, 0.0f)
                lineToRelative(-6.0f, -3.833f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.029f, -1.747f)
                verticalLineToRelative(-6.537f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.029f, -1.748f)
                lineToRelative(6.0f, -3.572f)
                arcToRelative(2.056f, 2.056f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(6.0f, 3.573f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
