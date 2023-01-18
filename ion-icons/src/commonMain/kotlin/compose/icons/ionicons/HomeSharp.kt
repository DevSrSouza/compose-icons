package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.HomeSharp: ImageVector
    get() {
        if (_homeSharp != null) {
            return _homeSharp!!
        }
        _homeSharp = Builder(name = "HomeSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 174.74f)
                lineToRelative(0.0f, -126.74f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, 58.45f)
                lineToRelative(-80.0f, -74.45f)
                lineToRelative(-256.0f, 240.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(-96.0f, -97.26f)
                close()
            }
        }
        .build()
        return _homeSharp!!
    }

private var _homeSharp: ImageVector? = null
