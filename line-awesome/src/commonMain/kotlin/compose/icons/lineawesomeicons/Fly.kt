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

public val LineAwesomeIcons.Fly: ImageVector
    get() {
        if (_fly != null) {
            return _fly!!
        }
        _fly = Builder(name = "Fly", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(15.84f, 4.0f, 15.688f, 4.023f, 15.531f, 4.031f)
                curveTo(10.832f, 4.262f, 7.0f, 7.848f, 7.0f, 12.344f)
                curveTo(7.0f, 15.293f, 8.789f, 17.883f, 10.469f, 19.75f)
                curveTo(12.148f, 21.617f, 13.813f, 22.813f, 13.813f, 22.813f)
                lineTo(14.094f, 23.0f)
                lineTo(17.906f, 23.0f)
                lineTo(18.188f, 22.813f)
                curveTo(18.188f, 22.813f, 19.852f, 21.617f, 21.531f, 19.75f)
                curveTo(23.211f, 17.883f, 25.0f, 15.293f, 25.0f, 12.344f)
                curveTo(25.0f, 7.836f, 21.152f, 4.246f, 16.438f, 4.031f)
                curveTo(16.289f, 4.012f, 16.148f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(16.273f, 6.0f, 17.113f, 6.313f, 17.781f, 7.156f)
                curveTo(18.449f, 8.0f, 19.0f, 9.328f, 19.0f, 11.219f)
                curveTo(19.0f, 15.535f, 16.727f, 20.23f, 16.344f, 21.0f)
                lineTo(15.656f, 21.0f)
                curveTo(15.273f, 20.227f, 13.0f, 15.516f, 13.0f, 11.219f)
                curveTo(13.0f, 9.398f, 13.574f, 8.055f, 14.25f, 7.188f)
                curveTo(14.926f, 6.32f, 15.758f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.906f, 7.219f)
                curveTo(11.367f, 8.309f, 11.0f, 9.641f, 11.0f, 11.219f)
                curveTo(11.0f, 14.102f, 11.863f, 17.051f, 12.688f, 19.219f)
                curveTo(12.441f, 18.969f, 12.207f, 18.703f, 11.938f, 18.406f)
                curveTo(10.418f, 16.715f, 9.0f, 14.449f, 9.0f, 12.344f)
                curveTo(9.0f, 10.242f, 10.145f, 8.375f, 11.906f, 7.219f)
                close()
                moveTo(20.156f, 7.25f)
                curveTo(21.887f, 8.41f, 23.0f, 10.262f, 23.0f, 12.344f)
                curveTo(23.0f, 14.449f, 21.582f, 16.715f, 20.063f, 18.406f)
                curveTo(19.801f, 18.699f, 19.555f, 18.945f, 19.313f, 19.188f)
                curveTo(20.129f, 17.027f, 21.0f, 14.09f, 21.0f, 11.219f)
                curveTo(21.0f, 9.648f, 20.668f, 8.328f, 20.156f, 7.25f)
                close()
                moveTo(14.0f, 25.0f)
                lineTo(14.0f, 28.0f)
                lineTo(18.0f, 28.0f)
                lineTo(18.0f, 25.0f)
                close()
            }
        }
        .build()
        return _fly!!
    }

private var _fly: ImageVector? = null
