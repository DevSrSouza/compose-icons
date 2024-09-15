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

public val LineAwesomeIcons.Lastfm: ImageVector
    get() {
        if (_lastfm != null) {
            return _lastfm!!
        }
        _lastfm = Builder(name = "Lastfm", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.348f, 22.078f)
                lineTo(13.32f, 19.289f)
                curveTo(13.32f, 19.289f, 11.652f, 21.148f, 9.152f, 21.148f)
                curveTo(6.941f, 21.148f, 5.367f, 19.223f, 5.367f, 16.145f)
                curveTo(5.367f, 12.199f, 7.355f, 10.789f, 9.313f, 10.789f)
                curveTo(12.137f, 10.789f, 13.031f, 12.617f, 13.805f, 14.957f)
                lineTo(14.828f, 18.164f)
                curveTo(15.855f, 21.277f, 17.781f, 23.777f, 23.328f, 23.777f)
                curveTo(27.305f, 23.777f, 30.0f, 22.559f, 30.0f, 19.352f)
                curveTo(30.0f, 16.754f, 28.523f, 15.406f, 25.766f, 14.766f)
                lineTo(23.711f, 14.316f)
                curveTo(22.301f, 13.996f, 21.883f, 13.418f, 21.883f, 12.457f)
                curveTo(21.883f, 11.367f, 22.75f, 10.723f, 24.16f, 10.723f)
                curveTo(25.699f, 10.723f, 26.535f, 11.301f, 26.664f, 12.68f)
                lineTo(29.871f, 12.297f)
                curveTo(29.613f, 9.41f, 27.625f, 8.223f, 24.352f, 8.223f)
                curveTo(21.469f, 8.223f, 18.645f, 9.313f, 18.645f, 12.809f)
                curveTo(18.645f, 14.988f, 19.703f, 16.367f, 22.363f, 17.012f)
                lineTo(24.547f, 17.523f)
                curveTo(26.18f, 17.91f, 26.727f, 18.582f, 26.727f, 19.512f)
                curveTo(26.727f, 20.699f, 25.57f, 21.18f, 23.391f, 21.18f)
                curveTo(20.152f, 21.18f, 18.805f, 19.48f, 18.035f, 17.141f)
                lineTo(16.977f, 13.934f)
                curveTo(15.629f, 9.762f, 13.48f, 8.223f, 9.215f, 8.223f)
                curveTo(4.504f, 8.223f, 2.0f, 11.203f, 2.0f, 16.273f)
                curveTo(2.0f, 21.148f, 4.504f, 23.777f, 8.992f, 23.777f)
                curveTo(12.617f, 23.777f, 14.348f, 22.078f, 14.348f, 22.078f)
                close()
            }
        }
        .build()
        return _lastfm!!
    }

private var _lastfm: ImageVector? = null
