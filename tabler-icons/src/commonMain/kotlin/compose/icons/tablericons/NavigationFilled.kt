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

public val TablerIcons.NavigationFilled: ImageVector
    get() {
        if (_navigationFilled != null) {
            return _navigationFilled!!
        }
        _navigationFilled = Builder(name = "NavigationFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.092f, 2.581f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.754f, -0.116f)
                lineToRelative(0.062f, 0.116f)
                lineToRelative(8.005f, 17.365f)
                curveToRelative(0.198f, 0.566f, 0.05f, 1.196f, -0.378f, 1.615f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, -1.459f, 0.393f)
                lineToRelative(-7.077f, -2.398f)
                lineToRelative(-6.899f, 2.338f)
                arcToRelative(1.535f, 1.535f, 0.0f, false, true, -1.52f, -0.231f)
                lineToRelative(-0.112f, -0.1f)
                curveToRelative(-0.398f, -0.386f, -0.556f, -0.954f, -0.393f, -1.556f)
                lineToRelative(0.047f, -0.15f)
                lineToRelative(7.97f, -17.276f)
                close()
            }
        }
        .build()
        return _navigationFilled!!
    }

private var _navigationFilled: ImageVector? = null
