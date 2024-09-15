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

public val LineAwesomeIcons.RedditSquare: ImageVector
    get() {
        if (_redditSquare != null) {
            return _redditSquare!!
        }
        _redditSquare = Builder(name = "RedditSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(17.059f, 8.994f)
                curveTo(16.881f, 8.964f, 16.704f, 9.082f, 16.662f, 9.262f)
                lineTo(15.799f, 13.008f)
                curveTo(14.129f, 13.05f, 12.634f, 13.602f, 11.58f, 14.465f)
                curveTo(11.307f, 14.18f, 10.926f, 14.0f, 10.5f, 14.0f)
                curveTo(9.672f, 14.0f, 9.0f, 14.672f, 9.0f, 15.5f)
                curveTo(9.0f, 16.172f, 9.446f, 16.735f, 10.055f, 16.926f)
                curveTo(10.023f, 17.115f, 10.0f, 17.305f, 10.0f, 17.5f)
                curveTo(10.0f, 19.985f, 12.686f, 22.0f, 16.0f, 22.0f)
                curveTo(19.314f, 22.0f, 22.0f, 19.985f, 22.0f, 17.5f)
                curveTo(22.0f, 17.305f, 21.977f, 17.115f, 21.945f, 16.926f)
                curveTo(22.554f, 16.735f, 23.0f, 16.172f, 23.0f, 15.5f)
                curveTo(23.0f, 14.672f, 22.328f, 14.0f, 21.5f, 14.0f)
                curveTo(21.074f, 14.0f, 20.693f, 14.18f, 20.42f, 14.465f)
                curveTo(19.432f, 13.656f, 18.057f, 13.118f, 16.514f, 13.02f)
                lineTo(17.27f, 9.738f)
                lineTo(20.039f, 10.195f)
                curveTo(20.132f, 10.65f, 20.517f, 11.0f, 21.0f, 11.0f)
                curveTo(21.552f, 11.0f, 22.0f, 10.552f, 22.0f, 10.0f)
                curveTo(22.0f, 9.448f, 21.552f, 9.0f, 21.0f, 9.0f)
                curveTo(20.632f, 9.0f, 20.324f, 9.209f, 20.15f, 9.506f)
                lineTo(17.059f, 8.994f)
                close()
                moveTo(13.092f, 15.818f)
                curveTo(13.695f, 15.818f, 14.182f, 16.305f, 14.182f, 16.908f)
                curveTo(14.182f, 17.511f, 13.694f, 18.0f, 13.092f, 18.0f)
                curveTo(12.49f, 18.0f, 12.0f, 17.511f, 12.0f, 16.908f)
                curveTo(12.0f, 16.306f, 12.489f, 15.818f, 13.092f, 15.818f)
                close()
                moveTo(18.908f, 15.818f)
                curveTo(19.511f, 15.818f, 20.0f, 16.306f, 20.0f, 16.908f)
                curveTo(20.0f, 17.51f, 19.511f, 18.0f, 18.908f, 18.0f)
                curveTo(18.306f, 18.0f, 17.818f, 17.511f, 17.818f, 16.908f)
                curveTo(17.818f, 16.305f, 18.305f, 15.818f, 18.908f, 15.818f)
                close()
                moveTo(13.473f, 19.021f)
                curveTo(13.562f, 19.015f, 13.654f, 19.042f, 13.727f, 19.105f)
                curveTo(14.881f, 20.093f, 17.117f, 20.093f, 18.271f, 19.105f)
                curveTo(18.417f, 18.98f, 18.64f, 18.996f, 18.766f, 19.143f)
                curveTo(18.892f, 19.29f, 18.876f, 19.511f, 18.729f, 19.637f)
                curveTo(18.028f, 20.239f, 17.033f, 20.584f, 16.0f, 20.584f)
                curveTo(14.967f, 20.584f, 13.973f, 20.239f, 13.271f, 19.637f)
                curveTo(13.124f, 19.511f, 13.108f, 19.29f, 13.234f, 19.143f)
                curveTo(13.297f, 19.069f, 13.383f, 19.028f, 13.473f, 19.021f)
                close()
            }
        }
        .build()
        return _redditSquare!!
    }

private var _redditSquare: ImageVector? = null
