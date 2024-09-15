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

public val LineAwesomeIcons.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(12.234f, 6.0f, 8.906f, 6.391f, 6.875f, 6.688f)
                curveTo(5.195f, 6.934f, 3.84f, 8.199f, 3.531f, 9.875f)
                curveTo(3.27f, 11.301f, 3.0f, 13.387f, 3.0f, 16.0f)
                curveTo(3.0f, 18.613f, 3.27f, 20.699f, 3.531f, 22.125f)
                curveTo(3.84f, 23.801f, 5.195f, 25.07f, 6.875f, 25.313f)
                curveTo(8.914f, 25.609f, 12.254f, 26.0f, 16.0f, 26.0f)
                curveTo(19.746f, 26.0f, 23.086f, 25.609f, 25.125f, 25.313f)
                curveTo(26.805f, 25.07f, 28.16f, 23.801f, 28.469f, 22.125f)
                curveTo(28.73f, 20.695f, 29.0f, 18.605f, 29.0f, 16.0f)
                curveTo(29.0f, 13.395f, 28.734f, 11.305f, 28.469f, 9.875f)
                curveTo(28.16f, 8.199f, 26.805f, 6.934f, 25.125f, 6.688f)
                curveTo(23.094f, 6.391f, 19.766f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(19.633f, 8.0f, 22.879f, 8.371f, 24.844f, 8.656f)
                curveTo(25.688f, 8.781f, 26.348f, 9.418f, 26.5f, 10.25f)
                curveTo(26.742f, 11.57f, 27.0f, 13.527f, 27.0f, 16.0f)
                curveTo(27.0f, 18.469f, 26.742f, 20.43f, 26.5f, 21.75f)
                curveTo(26.348f, 22.582f, 25.691f, 23.223f, 24.844f, 23.344f)
                curveTo(22.871f, 23.629f, 19.609f, 24.0f, 16.0f, 24.0f)
                curveTo(12.391f, 24.0f, 9.125f, 23.629f, 7.156f, 23.344f)
                curveTo(6.313f, 23.223f, 5.652f, 22.582f, 5.5f, 21.75f)
                curveTo(5.258f, 20.43f, 5.0f, 18.477f, 5.0f, 16.0f)
                curveTo(5.0f, 13.52f, 5.258f, 11.57f, 5.5f, 10.25f)
                curveTo(5.652f, 9.418f, 6.309f, 8.781f, 7.156f, 8.656f)
                curveTo(9.117f, 8.371f, 12.367f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(13.0f, 10.281f)
                lineTo(13.0f, 21.719f)
                lineTo(14.5f, 20.875f)
                lineTo(21.5f, 16.875f)
                lineTo(23.0f, 16.0f)
                lineTo(21.5f, 15.125f)
                lineTo(14.5f, 11.125f)
                close()
                moveTo(15.0f, 13.719f)
                lineTo(18.969f, 16.0f)
                lineTo(15.0f, 18.281f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
