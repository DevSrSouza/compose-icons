package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Plex: ImageVector
    get() {
        if (_plex != null) {
            return _plex!!
        }
        _plex = Builder(name = "Plex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.643f, 0.0f)
                horizontalLineTo(4.68f)
                lineToRelative(7.679f, 12.0f)
                lineTo(4.68f, 24.0f)
                horizontalLineToRelative(6.963f)
                lineToRelative(7.677f, -12.0f)
                lineToRelative(-7.677f, -12.0f)
            }
        }
        .build()
        return _plex!!
    }

private var _plex: ImageVector? = null
