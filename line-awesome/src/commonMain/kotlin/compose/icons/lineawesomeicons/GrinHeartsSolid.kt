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

public val LineAwesomeIcons.GrinHeartsSolid: ImageVector
    get() {
        if (_grinHeartsSolid != null) {
            return _grinHeartsSolid!!
        }
        _grinHeartsSolid = Builder(name = "GrinHeartsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(10.5f, 11.0f)
                curveTo(9.672f, 11.0f, 9.0f, 11.672f, 9.0f, 12.5f)
                curveTo(9.0f, 12.594f, 9.008f, 12.684f, 9.031f, 12.781f)
                curveTo(9.074f, 13.02f, 9.172f, 13.223f, 9.313f, 13.406f)
                curveTo(10.063f, 14.699f, 12.0f, 16.0f, 12.0f, 16.0f)
                curveTo(12.0f, 16.0f, 15.0f, 14.094f, 15.0f, 12.5f)
                curveTo(15.0f, 11.672f, 14.328f, 11.0f, 13.5f, 11.0f)
                curveTo(12.672f, 11.0f, 12.0f, 11.672f, 12.0f, 12.5f)
                curveTo(12.0f, 11.672f, 11.328f, 11.0f, 10.5f, 11.0f)
                close()
                moveTo(18.5f, 11.0f)
                curveTo(17.672f, 11.0f, 17.0f, 11.672f, 17.0f, 12.5f)
                curveTo(17.0f, 12.594f, 17.008f, 12.684f, 17.031f, 12.781f)
                curveTo(17.074f, 13.02f, 17.172f, 13.223f, 17.313f, 13.406f)
                curveTo(18.063f, 14.699f, 20.0f, 16.0f, 20.0f, 16.0f)
                curveTo(20.0f, 16.0f, 21.988f, 14.711f, 22.719f, 13.375f)
                curveTo(22.879f, 13.078f, 23.0f, 12.789f, 23.0f, 12.5f)
                curveTo(23.0f, 11.672f, 22.328f, 11.0f, 21.5f, 11.0f)
                curveTo(20.672f, 11.0f, 20.0f, 11.672f, 20.0f, 12.5f)
                curveTo(20.0f, 11.672f, 19.328f, 11.0f, 18.5f, 11.0f)
                close()
                moveTo(10.813f, 19.0f)
                lineTo(9.094f, 20.0f)
                curveTo(10.477f, 22.387f, 13.047f, 24.0f, 16.0f, 24.0f)
                curveTo(18.953f, 24.0f, 21.523f, 22.387f, 22.906f, 20.0f)
                lineTo(21.188f, 19.0f)
                curveTo(20.148f, 20.793f, 18.227f, 22.0f, 16.0f, 22.0f)
                curveTo(13.773f, 22.0f, 11.852f, 20.793f, 10.813f, 19.0f)
                close()
            }
        }
        .build()
        return _grinHeartsSolid!!
    }

private var _grinHeartsSolid: ImageVector? = null
