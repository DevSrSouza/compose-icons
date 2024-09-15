package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ItunesNote: ImageVector
    get() {
        if (_itunesNote != null) {
            return _itunesNote!!
        }
        _itunesNote = Builder(name = "ItunesNote", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.068f, 5.006f)
                curveTo(22.89f, 5.006f, 21.626f, 5.255f, 11.258f, 7.197f)
                curveTo(11.177f, 7.197f, 10.789f, 7.299f, 10.576f, 7.477f)
                curveTo(10.367f, 7.645f, 10.256f, 7.869f, 10.215f, 8.133f)
                curveTo(10.042f, 8.824f, 10.593f, 21.281f, 10.08f, 21.865f)
                curveTo(9.856f, 22.114f, 9.461f, 22.186f, 9.156f, 22.242f)
                curveTo(7.332f, 22.562f, 6.118f, 22.73f, 5.254f, 23.553f)
                curveTo(3.765f, 25.006f, 4.536f, 27.541f, 6.732f, 27.953f)
                curveTo(7.555f, 28.105f, 9.101f, 27.899f, 9.955f, 27.426f)
                curveTo(10.707f, 27.039f, 11.277f, 26.343f, 11.49f, 25.418f)
                curveTo(11.673f, 24.625f, 11.617f, 25.173f, 11.617f, 13.244f)
                curveTo(11.617f, 12.659f, 11.781f, 12.507f, 12.299f, 12.395f)
                curveTo(12.299f, 12.395f, 21.319f, 10.708f, 21.736f, 10.637f)
                curveTo(22.32f, 10.535f, 22.6f, 10.693f, 22.6f, 11.262f)
                curveTo(22.6f, 19.349f, 22.702f, 19.191f, 22.377f, 19.557f)
                curveTo(22.153f, 19.806f, 21.887f, 19.876f, 21.582f, 19.932f)
                curveTo(19.757f, 20.252f, 18.655f, 20.308f, 17.791f, 21.131f)
                curveTo(16.698f, 22.198f, 16.713f, 23.89f, 17.928f, 24.912f)
                curveTo(18.833f, 25.602f, 19.849f, 25.772f, 21.094f, 25.543f)
                curveTo(22.512f, 25.278f, 23.57f, 24.495f, 23.895f, 23.102f)
                curveTo(24.042f, 22.467f, 23.994f, 23.406f, 23.988f, 5.9f)
                curveTo(23.988f, 5.31f, 23.652f, 4.965f, 23.068f, 5.006f)
                close()
            }
        }
        .build()
        return _itunesNote!!
    }

private var _itunesNote: ImageVector? = null
