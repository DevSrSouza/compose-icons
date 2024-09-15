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

public val LineAwesomeIcons.WrenchSolid: ImageVector
    get() {
        if (_wrenchSolid != null) {
            return _wrenchSolid!!
        }
        _wrenchSolid = Builder(name = "WrenchSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveTo(17.145f, 4.0f, 14.0f, 7.145f, 14.0f, 11.0f)
                curveTo(14.0f, 11.715f, 14.215f, 12.363f, 14.414f, 13.016f)
                lineTo(4.945f, 22.484f)
                curveTo(3.688f, 23.738f, 3.688f, 25.801f, 4.945f, 27.059f)
                curveTo(6.199f, 28.313f, 8.262f, 28.313f, 9.516f, 27.059f)
                lineTo(18.984f, 17.59f)
                curveTo(19.633f, 17.789f, 20.285f, 18.0f, 21.0f, 18.0f)
                curveTo(24.855f, 18.0f, 28.0f, 14.855f, 28.0f, 11.0f)
                curveTo(28.0f, 9.973f, 27.773f, 9.0f, 27.375f, 8.125f)
                lineTo(26.781f, 6.805f)
                lineTo(25.762f, 7.828f)
                lineTo(22.586f, 11.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 9.414f)
                lineTo(25.195f, 5.219f)
                lineTo(23.875f, 4.625f)
                curveTo(23.0f, 4.227f, 22.027f, 4.0f, 21.0f, 4.0f)
                close()
                moveTo(21.0f, 6.0f)
                curveTo(21.172f, 6.0f, 21.316f, 6.086f, 21.484f, 6.102f)
                lineTo(19.0f, 8.586f)
                lineTo(19.0f, 13.0f)
                lineTo(23.414f, 13.0f)
                lineTo(25.895f, 10.516f)
                curveTo(25.914f, 10.684f, 26.0f, 10.828f, 26.0f, 11.0f)
                curveTo(26.0f, 13.773f, 23.773f, 16.0f, 21.0f, 16.0f)
                curveTo(20.301f, 16.0f, 19.637f, 15.855f, 19.031f, 15.598f)
                lineTo(18.41f, 15.332f)
                lineTo(8.102f, 25.641f)
                curveTo(7.621f, 26.125f, 6.84f, 26.125f, 6.359f, 25.641f)
                curveTo(5.875f, 25.16f, 5.875f, 24.379f, 6.359f, 23.895f)
                lineTo(16.668f, 13.59f)
                lineTo(16.402f, 12.965f)
                curveTo(16.145f, 12.359f, 16.0f, 11.699f, 16.0f, 11.0f)
                curveTo(16.0f, 8.227f, 18.227f, 6.0f, 21.0f, 6.0f)
                close()
            }
        }
        .build()
        return _wrenchSolid!!
    }

private var _wrenchSolid: ImageVector? = null
