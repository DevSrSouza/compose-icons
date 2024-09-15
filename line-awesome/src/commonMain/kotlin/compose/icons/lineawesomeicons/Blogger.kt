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

public val LineAwesomeIcons.Blogger: ImageVector
    get() {
        if (_blogger != null) {
            return _blogger!!
        }
        _blogger = Builder(name = "Blogger", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(15.0f, 10.0f)
                curveTo(13.0f, 10.0f, 13.03f, 10.02f, 12.4f, 10.27f)
                curveTo(11.23f, 10.74f, 10.39f, 11.72f, 10.09f, 12.98f)
                curveTo(10.04f, 13.21f, 10.02f, 13.59f, 10.01f, 15.76f)
                curveTo(9.99f, 18.47f, 10.01f, 18.87f, 10.18f, 19.41f)
                curveTo(10.6f, 20.74f, 11.791f, 21.719f, 12.971f, 21.939f)
                curveTo(13.371f, 22.009f, 18.26f, 22.031f, 18.75f, 21.961f)
                curveTo(19.63f, 21.841f, 20.299f, 21.49f, 20.939f, 20.83f)
                curveTo(21.409f, 20.36f, 21.701f, 19.85f, 21.891f, 19.17f)
                curveTo(22.031f, 18.7f, 22.021f, 15.349f, 21.961f, 15.109f)
                curveTo(21.911f, 14.899f, 21.791f, 14.689f, 21.631f, 14.609f)
                curveTo(21.581f, 14.589f, 21.281f, 14.559f, 20.961f, 14.539f)
                curveTo(20.421f, 14.519f, 20.359f, 14.51f, 20.189f, 14.4f)
                curveTo(19.929f, 14.25f, 19.85f, 14.069f, 19.85f, 13.619f)
                curveTo(19.85f, 12.739f, 19.48f, 11.91f, 18.75f, 11.17f)
                curveTo(18.23f, 10.64f, 17.66f, 10.28f, 16.99f, 10.08f)
                curveTo(16.84f, 10.04f, 16.19f, 10.0f, 15.0f, 10.0f)
                close()
                moveTo(13.77f, 13.0f)
                lineTo(16.063f, 13.0f)
                curveTo(16.487f, 13.0f, 16.832f, 13.345f, 16.832f, 13.77f)
                curveTo(16.832f, 14.195f, 16.487f, 14.539f, 16.063f, 14.539f)
                lineTo(13.77f, 14.539f)
                curveTo(13.345f, 14.539f, 13.0f, 14.195f, 13.0f, 13.77f)
                curveTo(13.0f, 13.345f, 13.345f, 13.0f, 13.77f, 13.0f)
                close()
                moveTo(13.77f, 17.461f)
                lineTo(18.043f, 17.461f)
                curveTo(18.468f, 17.461f, 18.813f, 17.805f, 18.813f, 18.23f)
                curveTo(18.813f, 18.655f, 18.468f, 19.0f, 18.043f, 19.0f)
                lineTo(13.77f, 19.0f)
                curveTo(13.345f, 19.0f, 13.0f, 18.655f, 13.0f, 18.23f)
                curveTo(13.0f, 17.805f, 13.345f, 17.461f, 13.77f, 17.461f)
                close()
            }
        }
        .build()
        return _blogger!!
    }

private var _blogger: ImageVector? = null
