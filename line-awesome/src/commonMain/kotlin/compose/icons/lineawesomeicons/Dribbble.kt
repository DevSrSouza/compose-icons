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

public val LineAwesomeIcons.Dribbble: ImageVector
    get() {
        if (_dribbble != null) {
            return _dribbble!!
        }
        _dribbble = Builder(name = "Dribbble", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                curveTo(18.535f, 6.0f, 20.832f, 6.953f, 22.594f, 8.5f)
                curveTo(22.406f, 8.762f, 22.152f, 9.078f, 21.75f, 9.469f)
                curveTo(20.895f, 10.297f, 19.527f, 11.293f, 17.438f, 12.063f)
                curveTo(16.023f, 9.449f, 14.637f, 7.484f, 13.719f, 6.25f)
                curveTo(14.449f, 6.082f, 15.215f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.75f, 6.938f)
                curveTo(12.57f, 8.012f, 14.031f, 10.004f, 15.5f, 12.656f)
                curveTo(11.434f, 13.734f, 7.703f, 13.871f, 6.219f, 13.875f)
                curveTo(6.883f, 10.785f, 8.961f, 8.242f, 11.75f, 6.938f)
                close()
                moveTo(23.969f, 9.969f)
                curveTo(25.188f, 11.582f, 25.945f, 13.578f, 26.0f, 15.75f)
                curveTo(25.109f, 15.551f, 23.797f, 15.355f, 22.094f, 15.344f)
                curveTo(21.207f, 15.34f, 20.203f, 15.402f, 19.125f, 15.531f)
                curveTo(18.875f, 14.961f, 18.605f, 14.41f, 18.344f, 13.875f)
                curveTo(20.586f, 13.016f, 22.113f, 11.883f, 23.125f, 10.906f)
                curveTo(23.469f, 10.57f, 23.738f, 10.262f, 23.969f, 9.969f)
                close()
                moveTo(16.406f, 14.469f)
                curveTo(16.637f, 14.934f, 16.871f, 15.41f, 17.094f, 15.906f)
                curveTo(12.82f, 17.09f, 9.75f, 20.715f, 8.438f, 22.531f)
                curveTo(6.926f, 20.781f, 6.0f, 18.5f, 6.0f, 16.0f)
                curveTo(6.0f, 15.957f, 6.0f, 15.918f, 6.0f, 15.875f)
                curveTo(7.352f, 15.891f, 11.648f, 15.797f, 16.406f, 14.469f)
                close()
                moveTo(22.094f, 17.313f)
                curveTo(23.879f, 17.313f, 25.113f, 17.563f, 25.844f, 17.75f)
                curveTo(25.379f, 20.414f, 23.875f, 22.699f, 21.75f, 24.188f)
                curveTo(21.352f, 21.797f, 20.695f, 19.523f, 19.906f, 17.438f)
                curveTo(20.695f, 17.359f, 21.441f, 17.313f, 22.094f, 17.313f)
                close()
                moveTo(17.875f, 17.781f)
                curveTo(18.773f, 20.063f, 19.527f, 22.566f, 19.906f, 25.219f)
                curveTo(18.711f, 25.723f, 17.383f, 26.0f, 16.0f, 26.0f)
                curveTo(13.707f, 26.0f, 11.59f, 25.23f, 9.906f, 23.938f)
                curveTo(10.934f, 22.531f, 13.953f, 18.789f, 17.875f, 17.781f)
                close()
            }
        }
        .build()
        return _dribbble!!
    }

private var _dribbble: ImageVector? = null
