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

public val LineAwesomeIcons.Spotify: ImageVector
    get() {
        if (_spotify != null) {
            return _spotify!!
        }
        _spotify = Builder(name = "Spotify", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.371f, 4.0f, 4.0f, 9.371f, 4.0f, 16.0f)
                curveTo(4.0f, 22.629f, 9.371f, 28.0f, 16.0f, 28.0f)
                curveTo(22.629f, 28.0f, 28.0f, 22.629f, 28.0f, 16.0f)
                curveTo(28.0f, 9.371f, 22.629f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.555f, 6.0f, 26.0f, 10.445f, 26.0f, 16.0f)
                curveTo(26.0f, 21.555f, 21.555f, 26.0f, 16.0f, 26.0f)
                curveTo(10.445f, 26.0f, 6.0f, 21.555f, 6.0f, 16.0f)
                curveTo(6.0f, 10.445f, 10.445f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(14.406f, 10.75f)
                curveTo(12.461f, 10.75f, 10.766f, 10.93f, 9.156f, 11.438f)
                curveTo(8.73f, 11.523f, 8.375f, 11.844f, 8.375f, 12.438f)
                curveTo(8.375f, 13.031f, 8.813f, 13.555f, 9.406f, 13.469f)
                curveTo(9.66f, 13.469f, 9.832f, 13.375f, 10.0f, 13.375f)
                curveTo(11.355f, 13.035f, 12.883f, 12.875f, 14.406f, 12.875f)
                curveTo(17.367f, 12.875f, 20.406f, 13.535f, 22.438f, 14.719f)
                curveTo(22.691f, 14.805f, 22.777f, 14.906f, 23.031f, 14.906f)
                curveTo(23.625f, 14.906f, 24.039f, 14.469f, 24.125f, 13.875f)
                curveTo(24.125f, 13.367f, 23.871f, 13.043f, 23.531f, 12.875f)
                curveTo(20.992f, 11.438f, 17.621f, 10.75f, 14.406f, 10.75f)
                close()
                moveTo(14.125f, 14.469f)
                curveTo(12.348f, 14.469f, 11.082f, 14.723f, 9.813f, 15.063f)
                curveTo(9.391f, 15.23f, 9.156f, 15.492f, 9.156f, 16.0f)
                curveTo(9.156f, 16.422f, 9.492f, 16.844f, 10.0f, 16.844f)
                curveTo(10.172f, 16.844f, 10.246f, 16.836f, 10.5f, 16.75f)
                curveTo(11.43f, 16.496f, 12.707f, 16.344f, 14.063f, 16.344f)
                curveTo(16.855f, 16.344f, 19.285f, 17.023f, 21.063f, 18.125f)
                curveTo(21.23f, 18.211f, 21.402f, 18.281f, 21.656f, 18.281f)
                curveTo(22.164f, 18.281f, 22.5f, 17.852f, 22.5f, 17.344f)
                curveTo(22.5f, 17.004f, 22.34f, 16.668f, 22.0f, 16.5f)
                curveTo(19.801f, 15.145f, 17.004f, 14.469f, 14.125f, 14.469f)
                close()
                moveTo(14.406f, 18.125f)
                curveTo(12.969f, 18.125f, 11.605f, 18.285f, 10.25f, 18.625f)
                curveTo(9.91f, 18.711f, 9.656f, 18.953f, 9.656f, 19.375f)
                curveTo(9.656f, 19.715f, 9.922f, 20.063f, 10.344f, 20.063f)
                curveTo(10.43f, 20.063f, 10.676f, 19.969f, 10.844f, 19.969f)
                curveTo(11.945f, 19.715f, 13.129f, 19.563f, 14.313f, 19.563f)
                curveTo(16.426f, 19.563f, 18.359f, 20.07f, 19.969f, 21.0f)
                curveTo(20.141f, 21.086f, 20.332f, 21.156f, 20.5f, 21.156f)
                curveTo(20.84f, 21.156f, 21.164f, 20.902f, 21.25f, 20.563f)
                curveTo(21.25f, 20.137f, 21.066f, 19.98f, 20.813f, 19.813f)
                curveTo(18.949f, 18.711f, 16.773f, 18.125f, 14.406f, 18.125f)
                close()
            }
        }
        .build()
        return _spotify!!
    }

private var _spotify: ImageVector? = null
