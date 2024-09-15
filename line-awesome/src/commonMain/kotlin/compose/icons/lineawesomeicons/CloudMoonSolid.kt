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

public val LineAwesomeIcons.CloudMoonSolid: ImageVector
    get() {
        if (_cloudMoonSolid != null) {
            return _cloudMoonSolid!!
        }
        _cloudMoonSolid = Builder(name = "CloudMoonSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.406f, 5.938f)
                lineTo(8.75f, 5.969f)
                curveTo(5.008f, 6.105f, 2.0f, 9.195f, 2.0f, 12.969f)
                curveTo(2.0f, 15.199f, 3.055f, 17.184f, 4.688f, 18.469f)
                curveTo(4.254f, 19.211f, 4.0f, 20.082f, 4.0f, 21.0f)
                curveTo(4.0f, 23.758f, 6.242f, 26.0f, 9.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                curveTo(27.758f, 26.0f, 30.0f, 23.758f, 30.0f, 21.0f)
                curveTo(30.0f, 18.98f, 28.789f, 17.18f, 26.969f, 16.406f)
                curveTo(26.688f, 13.988f, 24.656f, 12.098f, 22.188f, 12.0f)
                curveTo(21.125f, 10.152f, 19.164f, 9.0f, 17.0f, 9.0f)
                curveTo(14.684f, 9.0f, 12.617f, 10.34f, 11.625f, 12.344f)
                curveTo(10.297f, 11.797f, 9.344f, 10.508f, 9.344f, 8.969f)
                curveTo(9.344f, 8.41f, 9.461f, 7.887f, 9.688f, 7.406f)
                close()
                moveTo(7.5f, 8.313f)
                curveTo(7.473f, 8.543f, 7.344f, 8.73f, 7.344f, 8.969f)
                curveTo(7.344f, 10.922f, 8.332f, 12.633f, 9.844f, 13.656f)
                curveTo(8.996f, 14.211f, 8.332f, 15.078f, 8.094f, 16.094f)
                curveTo(7.324f, 16.234f, 6.633f, 16.555f, 6.031f, 17.0f)
                curveTo(4.805f, 16.086f, 4.0f, 14.621f, 4.0f, 12.969f)
                curveTo(4.0f, 10.73f, 5.484f, 8.957f, 7.5f, 8.313f)
                close()
                moveTo(17.0f, 11.0f)
                curveTo(18.605f, 11.0f, 20.055f, 11.961f, 20.688f, 13.438f)
                lineTo(20.969f, 14.125f)
                lineTo(21.875f, 14.031f)
                curveTo(21.918f, 14.023f, 21.953f, 14.0f, 22.0f, 14.0f)
                curveTo(23.652f, 14.0f, 24.996f, 15.352f, 25.0f, 16.938f)
                lineTo(24.969f, 17.906f)
                lineTo(25.75f, 18.094f)
                curveTo(27.082f, 18.434f, 28.0f, 19.637f, 28.0f, 21.0f)
                curveTo(28.0f, 22.652f, 26.652f, 24.0f, 25.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                curveTo(7.348f, 24.0f, 6.0f, 22.652f, 6.0f, 21.0f)
                curveTo(6.0f, 19.348f, 7.348f, 18.0f, 9.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                lineTo(10.0f, 17.0f)
                curveTo(10.0f, 15.898f, 10.895f, 15.004f, 11.906f, 15.0f)
                lineTo(12.906f, 15.063f)
                lineTo(13.094f, 14.219f)
                curveTo(13.469f, 12.359f, 15.102f, 11.0f, 17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _cloudMoonSolid!!
    }

private var _cloudMoonSolid: ImageVector? = null
