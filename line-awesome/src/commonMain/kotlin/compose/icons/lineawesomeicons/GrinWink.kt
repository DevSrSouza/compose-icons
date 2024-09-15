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

public val LineAwesomeIcons.GrinWink: ImageVector
    get() {
        if (_grinWink != null) {
            return _grinWink!!
        }
        _grinWink = Builder(name = "GrinWink", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(11.5f, 12.0f)
                curveTo(10.672f, 12.0f, 10.0f, 12.672f, 10.0f, 13.5f)
                curveTo(10.0f, 14.328f, 10.672f, 15.0f, 11.5f, 15.0f)
                curveTo(12.328f, 15.0f, 13.0f, 14.328f, 13.0f, 13.5f)
                curveTo(13.0f, 12.672f, 12.328f, 12.0f, 11.5f, 12.0f)
                close()
                moveTo(18.0f, 13.0f)
                lineTo(18.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 13.0f)
                close()
                moveTo(20.969f, 17.031f)
                curveTo(20.969f, 18.715f, 20.293f, 19.883f, 19.313f, 20.719f)
                curveTo(18.332f, 21.555f, 17.035f, 22.0f, 16.0f, 22.0f)
                curveTo(13.879f, 22.0f, 12.438f, 21.141f, 11.313f, 20.031f)
                lineTo(9.906f, 21.469f)
                curveTo(11.301f, 22.84f, 13.32f, 24.0f, 16.0f, 24.0f)
                curveTo(17.555f, 24.0f, 19.262f, 23.414f, 20.625f, 22.25f)
                curveTo(21.988f, 21.086f, 22.969f, 19.289f, 22.969f, 17.031f)
                close()
            }
        }
        .build()
        return _grinWink!!
    }

private var _grinWink: ImageVector? = null
