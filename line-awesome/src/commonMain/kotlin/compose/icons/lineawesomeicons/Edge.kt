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

public val LineAwesomeIcons.Edge: ImageVector
    get() {
        if (_edge != null) {
            return _edge!!
        }
        _edge = Builder(name = "Edge", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.961f, 10.828f)
                curveTo(7.344f, 12.457f, 5.848f, 14.77f, 5.848f, 14.77f)
                curveTo(5.848f, 14.77f, 6.234f, 9.918f, 9.961f, 7.074f)
                curveTo(11.441f, 5.945f, 13.469f, 5.0f, 16.191f, 5.0f)
                curveTo(17.215f, 5.0f, 19.359f, 5.18f, 21.293f, 6.371f)
                curveTo(23.227f, 7.563f, 24.008f, 8.559f, 24.879f, 10.023f)
                curveTo(25.254f, 10.652f, 25.563f, 11.465f, 25.754f, 12.246f)
                curveTo(26.109f, 13.711f, 26.152f, 15.461f, 26.152f, 15.461f)
                lineTo(26.152f, 17.77f)
                lineTo(12.336f, 17.77f)
                curveTo(12.336f, 17.77f, 12.0f, 22.41f, 18.355f, 22.41f)
                curveTo(20.563f, 22.41f, 21.34f, 22.063f, 22.066f, 21.848f)
                curveTo(23.203f, 21.512f, 24.301f, 20.762f, 24.301f, 20.762f)
                lineTo(24.305f, 25.398f)
                curveTo(24.305f, 25.398f, 21.703f, 27.0f, 17.773f, 27.0f)
                curveTo(16.668f, 27.0f, 15.504f, 26.906f, 14.379f, 26.543f)
                curveTo(13.395f, 26.223f, 11.34f, 25.363f, 9.961f, 23.348f)
                curveTo(9.473f, 22.637f, 8.945f, 21.688f, 8.684f, 20.762f)
                curveTo(8.398f, 19.758f, 8.402f, 18.785f, 8.402f, 18.246f)
                curveTo(8.402f, 16.242f, 9.09f, 14.328f, 10.277f, 12.941f)
                curveTo(11.816f, 11.148f, 13.766f, 10.359f, 13.766f, 10.359f)
                curveTo(13.766f, 10.359f, 13.133f, 11.098f, 12.742f, 12.02f)
                curveTo(12.352f, 12.941f, 12.242f, 13.867f, 12.242f, 13.867f)
                lineTo(20.047f, 13.867f)
                curveTo(20.047f, 13.867f, 20.504f, 9.203f, 15.633f, 9.203f)
                curveTo(13.797f, 9.203f, 11.543f, 9.844f, 9.961f, 10.828f)
                close()
            }
        }
        .build()
        return _edge!!
    }

private var _edge: ImageVector? = null
