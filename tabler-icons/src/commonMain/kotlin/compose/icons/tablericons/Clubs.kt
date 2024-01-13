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

public val TablerIcons.Clubs: ImageVector
    get() {
        if (_clubs != null) {
            return _clubs!!
        }
        _clubs = Builder(name = "Clubs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.164f, 6.447f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -1.164f, 6.198f)
                verticalLineToRelative(1.355f)
                lineToRelative(1.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(1.0f, -4.0f)
                lineToRelative(0.0f, -1.355f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -1.164f, -6.199f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.163f, -6.446f)
                close()
            }
        }
        .build()
        return _clubs!!
    }

private var _clubs: ImageVector? = null
