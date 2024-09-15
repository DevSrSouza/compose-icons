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

public val LineAwesomeIcons.Ubuntu: ImageVector
    get() {
        if (_ubuntu != null) {
            return _ubuntu!!
        }
        _ubuntu = Builder(name = "Ubuntu", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(19.5f, 9.0f)
                curveTo(18.672f, 9.0f, 18.0f, 9.672f, 18.0f, 10.5f)
                curveTo(18.0f, 11.328f, 18.672f, 12.0f, 19.5f, 12.0f)
                curveTo(20.328f, 12.0f, 21.0f, 11.328f, 21.0f, 10.5f)
                curveTo(21.0f, 9.672f, 20.328f, 9.0f, 19.5f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(13.25f, 11.0f, 11.0f, 13.25f, 11.0f, 16.0f)
                curveTo(11.0f, 18.75f, 13.25f, 21.0f, 16.0f, 21.0f)
                curveTo(18.75f, 21.0f, 21.0f, 18.75f, 21.0f, 16.0f)
                curveTo(21.0f, 13.25f, 18.75f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(17.668f, 13.0f, 19.0f, 14.332f, 19.0f, 16.0f)
                curveTo(19.0f, 17.668f, 17.668f, 19.0f, 16.0f, 19.0f)
                curveTo(14.332f, 19.0f, 13.0f, 17.668f, 13.0f, 16.0f)
                curveTo(13.0f, 14.332f, 14.332f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(9.5f, 15.0f)
                curveTo(8.672f, 15.0f, 8.0f, 15.672f, 8.0f, 16.5f)
                curveTo(8.0f, 17.328f, 8.672f, 18.0f, 9.5f, 18.0f)
                curveTo(10.328f, 18.0f, 11.0f, 17.328f, 11.0f, 16.5f)
                curveTo(11.0f, 15.672f, 10.328f, 15.0f, 9.5f, 15.0f)
                close()
                moveTo(19.5f, 20.0f)
                curveTo(18.672f, 20.0f, 18.0f, 20.672f, 18.0f, 21.5f)
                curveTo(18.0f, 22.328f, 18.672f, 23.0f, 19.5f, 23.0f)
                curveTo(20.328f, 23.0f, 21.0f, 22.328f, 21.0f, 21.5f)
                curveTo(21.0f, 20.672f, 20.328f, 20.0f, 19.5f, 20.0f)
                close()
            }
        }
        .build()
        return _ubuntu!!
    }

private var _ubuntu: ImageVector? = null
