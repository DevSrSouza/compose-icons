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

public val LineAwesomeIcons.CheeseSolid: ImageVector
    get() {
        if (_cheeseSolid != null) {
            return _cheeseSolid!!
        }
        _cheeseSolid = Builder(name = "CheeseSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.094f, 5.969f)
                lineTo(10.781f, 6.031f)
                curveTo(4.313f, 7.469f, 3.031f, 13.813f, 3.031f, 13.813f)
                lineTo(3.0f, 13.906f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 20.0f)
                lineTo(28.0f, 20.0f)
                curveTo(27.434f, 20.0f, 27.0f, 19.566f, 27.0f, 19.0f)
                curveTo(27.0f, 18.434f, 27.434f, 18.0f, 28.0f, 18.0f)
                lineTo(29.0f, 18.0f)
                lineTo(29.0f, 13.344f)
                lineTo(28.375f, 13.063f)
                lineTo(11.375f, 6.063f)
                close()
                moveTo(10.969f, 8.094f)
                lineTo(13.75f, 9.25f)
                curveTo(13.309f, 9.434f, 13.0f, 9.691f, 13.0f, 10.0f)
                curveTo(13.0f, 10.551f, 13.895f, 11.0f, 15.0f, 11.0f)
                curveTo(15.758f, 11.0f, 16.41f, 10.781f, 16.75f, 10.469f)
                lineTo(22.906f, 13.0f)
                lineTo(5.375f, 13.0f)
                curveTo(5.977f, 11.52f, 7.469f, 9.0f, 10.969f, 8.094f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(8.094f, 15.0f)
                curveTo(8.039f, 15.156f, 8.0f, 15.328f, 8.0f, 15.5f)
                curveTo(8.0f, 16.328f, 8.672f, 17.0f, 9.5f, 17.0f)
                curveTo(10.328f, 17.0f, 11.0f, 16.328f, 11.0f, 15.5f)
                curveTo(11.0f, 15.328f, 10.961f, 15.156f, 10.906f, 15.0f)
                lineTo(27.0f, 15.0f)
                lineTo(27.0f, 16.406f)
                curveTo(25.891f, 16.848f, 25.0f, 17.742f, 25.0f, 19.0f)
                curveTo(25.0f, 20.258f, 25.891f, 21.152f, 27.0f, 21.594f)
                lineTo(27.0f, 24.0f)
                lineTo(14.719f, 24.0f)
                curveTo(14.891f, 23.707f, 15.0f, 23.363f, 15.0f, 23.0f)
                curveTo(15.0f, 21.895f, 14.105f, 21.0f, 13.0f, 21.0f)
                curveTo(11.895f, 21.0f, 11.0f, 21.895f, 11.0f, 23.0f)
                curveTo(11.0f, 23.363f, 11.109f, 23.707f, 11.281f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
                moveTo(19.5f, 17.0f)
                curveTo(18.672f, 17.0f, 18.0f, 17.672f, 18.0f, 18.5f)
                curveTo(18.0f, 19.328f, 18.672f, 20.0f, 19.5f, 20.0f)
                curveTo(20.328f, 20.0f, 21.0f, 19.328f, 21.0f, 18.5f)
                curveTo(21.0f, 17.672f, 20.328f, 17.0f, 19.5f, 17.0f)
                close()
            }
        }
        .build()
        return _cheeseSolid!!
    }

private var _cheeseSolid: ImageVector? = null
