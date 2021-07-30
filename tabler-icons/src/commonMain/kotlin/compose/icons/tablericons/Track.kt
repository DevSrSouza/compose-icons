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

public val TablerIcons.Track: ImageVector
    get() {
        if (_track != null) {
            return _track!!
        }
        _track = Builder(name = "Track", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                lineToRelative(11.0f, -11.0f)
                moveToRelative(5.0f, 5.0f)
                lineToRelative(-11.0f, 11.0f)
                moveToRelative(-4.0f, -8.0f)
                lineToRelative(7.0f, 7.0f)
                moveToRelative(-3.5f, -10.5f)
                lineToRelative(7.0f, 7.0f)
                moveToRelative(-3.5f, -10.5f)
                lineToRelative(7.0f, 7.0f)
            }
        }
        .build()
        return _track!!
    }

private var _track: ImageVector? = null
