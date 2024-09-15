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

public val LineAwesomeIcons.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveTo(7.664f, 8.0f, 1.25f, 15.344f, 1.25f, 15.344f)
                lineTo(0.656f, 16.0f)
                lineTo(1.25f, 16.656f)
                curveTo(1.25f, 16.656f, 7.098f, 23.324f, 14.875f, 23.938f)
                curveTo(15.246f, 23.984f, 15.617f, 24.0f, 16.0f, 24.0f)
                curveTo(16.383f, 24.0f, 16.754f, 23.984f, 17.125f, 23.938f)
                curveTo(24.902f, 23.324f, 30.75f, 16.656f, 30.75f, 16.656f)
                lineTo(31.344f, 16.0f)
                lineTo(30.75f, 15.344f)
                curveTo(30.75f, 15.344f, 24.336f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(18.203f, 10.0f, 20.234f, 10.602f, 22.0f, 11.406f)
                curveTo(22.637f, 12.461f, 23.0f, 13.676f, 23.0f, 15.0f)
                curveTo(23.0f, 18.613f, 20.289f, 21.582f, 16.781f, 21.969f)
                curveTo(16.762f, 21.973f, 16.738f, 21.965f, 16.719f, 21.969f)
                curveTo(16.48f, 21.98f, 16.242f, 22.0f, 16.0f, 22.0f)
                curveTo(15.734f, 22.0f, 15.477f, 21.984f, 15.219f, 21.969f)
                curveTo(11.711f, 21.582f, 9.0f, 18.613f, 9.0f, 15.0f)
                curveTo(9.0f, 13.695f, 9.352f, 12.48f, 9.969f, 11.438f)
                lineTo(9.938f, 11.438f)
                curveTo(11.719f, 10.617f, 13.773f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(14.344f, 12.0f, 13.0f, 13.344f, 13.0f, 15.0f)
                curveTo(13.0f, 16.656f, 14.344f, 18.0f, 16.0f, 18.0f)
                curveTo(17.656f, 18.0f, 19.0f, 16.656f, 19.0f, 15.0f)
                curveTo(19.0f, 13.344f, 17.656f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(7.25f, 12.938f)
                curveTo(7.094f, 13.609f, 7.0f, 14.285f, 7.0f, 15.0f)
                curveTo(7.0f, 16.754f, 7.5f, 18.395f, 8.375f, 19.781f)
                curveTo(5.855f, 18.324f, 4.105f, 16.586f, 3.531f, 16.0f)
                curveTo(4.012f, 15.508f, 5.352f, 14.203f, 7.25f, 12.938f)
                close()
                moveTo(24.75f, 12.938f)
                curveTo(26.648f, 14.203f, 27.988f, 15.508f, 28.469f, 16.0f)
                curveTo(27.895f, 16.586f, 26.145f, 18.324f, 23.625f, 19.781f)
                curveTo(24.5f, 18.395f, 25.0f, 16.754f, 25.0f, 15.0f)
                curveTo(25.0f, 14.285f, 24.906f, 13.602f, 24.75f, 12.938f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
