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

public val LineAwesomeIcons.LastfmSquare: ImageVector
    get() {
        if (_lastfmSquare != null) {
            return _lastfmSquare!!
        }
        _lastfmSquare = Builder(name = "LastfmSquare", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(12.611f, 12.107f)
                curveTo(10.251f, 12.107f, 9.0f, 13.602f, 9.0f, 16.137f)
                curveTo(9.0f, 18.575f, 10.251f, 19.893f, 12.498f, 19.893f)
                curveTo(14.31f, 19.893f, 15.178f, 19.043f, 15.178f, 19.043f)
                lineTo(14.666f, 17.646f)
                curveTo(14.666f, 17.646f, 13.834f, 18.578f, 12.582f, 18.578f)
                curveTo(11.474f, 18.578f, 10.686f, 17.615f, 10.686f, 16.074f)
                curveTo(10.686f, 14.1f, 11.679f, 13.396f, 12.66f, 13.396f)
                curveTo(14.477f, 13.396f, 14.704f, 14.853f, 15.418f, 17.086f)
                curveTo(15.93f, 18.64f, 16.895f, 19.893f, 19.67f, 19.893f)
                curveTo(21.657f, 19.893f, 23.004f, 19.284f, 23.0f, 17.678f)
                curveTo(23.0f, 15.686f, 21.288f, 15.47f, 19.857f, 15.16f)
                curveTo(19.152f, 14.998f, 18.941f, 14.711f, 18.941f, 14.229f)
                curveTo(18.941f, 13.682f, 19.375f, 13.361f, 20.08f, 13.361f)
                curveTo(20.85f, 13.361f, 21.266f, 13.65f, 21.332f, 14.342f)
                lineTo(22.939f, 14.148f)
                curveTo(22.812f, 12.703f, 21.819f, 12.109f, 20.182f, 12.109f)
                curveTo(18.742f, 12.109f, 17.326f, 12.651f, 17.326f, 14.402f)
                curveTo(17.326f, 15.492f, 17.857f, 16.184f, 19.188f, 16.504f)
                curveTo(20.417f, 16.793f, 21.371f, 16.885f, 21.371f, 17.756f)
                curveTo(21.371f, 18.351f, 20.793f, 18.592f, 19.703f, 18.592f)
                curveTo(18.083f, 18.592f, 17.41f, 17.741f, 17.025f, 16.568f)
                curveTo(16.149f, 13.919f, 15.829f, 12.107f, 12.611f, 12.107f)
                close()
            }
        }
        .build()
        return _lastfmSquare!!
    }

private var _lastfmSquare: ImageVector? = null
