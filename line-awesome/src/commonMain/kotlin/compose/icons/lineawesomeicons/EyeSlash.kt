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

public val LineAwesomeIcons.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.719f, 2.281f)
                lineTo(2.281f, 3.719f)
                lineTo(8.5f, 9.906f)
                lineTo(19.594f, 21.0f)
                lineTo(21.5f, 22.938f)
                lineTo(28.281f, 29.719f)
                lineTo(29.719f, 28.281f)
                lineTo(23.5f, 22.063f)
                curveTo(27.734f, 19.965f, 30.574f, 16.852f, 30.75f, 16.656f)
                lineTo(31.344f, 16.0f)
                lineTo(30.75f, 15.344f)
                curveTo(30.48f, 15.043f, 24.086f, 8.0f, 16.0f, 8.0f)
                curveTo(14.043f, 8.0f, 12.195f, 8.43f, 10.5f, 9.063f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(18.152f, 10.0f, 20.188f, 10.605f, 22.0f, 11.438f)
                curveTo(22.645f, 12.516f, 23.0f, 13.734f, 23.0f, 15.0f)
                curveTo(23.0f, 16.816f, 22.297f, 18.477f, 21.156f, 19.719f)
                lineTo(18.313f, 16.875f)
                curveTo(18.73f, 16.363f, 19.0f, 15.715f, 19.0f, 15.0f)
                curveTo(19.0f, 13.344f, 17.656f, 12.0f, 16.0f, 12.0f)
                curveTo(15.285f, 12.0f, 14.637f, 12.27f, 14.125f, 12.688f)
                lineTo(12.094f, 10.656f)
                curveTo(13.336f, 10.273f, 14.637f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(6.688f, 10.906f)
                curveTo(3.48f, 12.879f, 1.398f, 15.176f, 1.25f, 15.344f)
                lineTo(0.656f, 16.0f)
                lineTo(1.25f, 16.656f)
                curveTo(1.508f, 16.945f, 7.43f, 23.426f, 15.063f, 23.938f)
                curveTo(15.371f, 23.969f, 15.684f, 24.0f, 16.0f, 24.0f)
                curveTo(16.316f, 24.0f, 16.629f, 23.969f, 16.938f, 23.938f)
                curveTo(17.762f, 23.883f, 18.566f, 23.773f, 19.344f, 23.594f)
                lineTo(17.563f, 21.813f)
                curveTo(17.055f, 21.93f, 16.539f, 22.0f, 16.0f, 22.0f)
                curveTo(12.141f, 22.0f, 9.0f, 18.859f, 9.0f, 15.0f)
                curveTo(9.0f, 14.469f, 9.07f, 13.949f, 9.188f, 13.438f)
                close()
                moveTo(7.25f, 12.938f)
                curveTo(7.09f, 13.613f, 7.0f, 14.301f, 7.0f, 15.0f)
                curveTo(7.0f, 16.738f, 7.488f, 18.34f, 8.344f, 19.719f)
                curveTo(6.055f, 18.406f, 4.305f, 16.867f, 3.406f, 16.0f)
                curveTo(4.152f, 15.277f, 5.496f, 14.078f, 7.25f, 12.938f)
                close()
                moveTo(24.75f, 12.938f)
                curveTo(26.504f, 14.078f, 27.844f, 15.277f, 28.594f, 16.0f)
                curveTo(27.695f, 16.867f, 25.918f, 18.438f, 23.625f, 19.75f)
                curveTo(24.484f, 18.371f, 25.0f, 16.738f, 25.0f, 15.0f)
                curveTo(25.0f, 14.301f, 24.91f, 13.609f, 24.75f, 12.938f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
