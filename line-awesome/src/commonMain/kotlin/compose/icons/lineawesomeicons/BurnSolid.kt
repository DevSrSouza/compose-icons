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

public val LineAwesomeIcons.BurnSolid: ImageVector
    get() {
        if (_burnSolid != null) {
            return _burnSolid!!
        }
        _burnSolid = Builder(name = "BurnSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.031f, 3.469f)
                lineTo(15.375f, 4.031f)
                curveTo(15.375f, 4.031f, 13.035f, 5.941f, 10.719f, 8.719f)
                curveTo(8.402f, 11.496f, 6.0f, 15.16f, 6.0f, 19.0f)
                curveTo(6.0f, 21.766f, 7.133f, 24.07f, 8.969f, 25.625f)
                curveTo(10.691f, 27.082f, 12.996f, 27.871f, 15.5f, 27.969f)
                curveTo(15.668f, 27.977f, 15.832f, 28.0f, 16.0f, 28.0f)
                curveTo(16.168f, 28.0f, 16.332f, 27.977f, 16.5f, 27.969f)
                curveTo(19.004f, 27.871f, 21.309f, 27.082f, 23.031f, 25.625f)
                curveTo(24.867f, 24.07f, 26.0f, 21.766f, 26.0f, 19.0f)
                curveTo(26.0f, 15.543f, 23.586f, 11.941f, 21.281f, 9.063f)
                curveTo(18.977f, 6.184f, 16.688f, 4.063f, 16.688f, 4.063f)
                close()
                moveTo(15.969f, 6.25f)
                curveTo(16.488f, 6.742f, 17.852f, 7.977f, 19.719f, 10.313f)
                curveTo(21.914f, 13.059f, 24.0f, 16.559f, 24.0f, 19.0f)
                curveTo(24.0f, 21.234f, 23.133f, 22.93f, 21.719f, 24.125f)
                curveTo(21.375f, 24.414f, 21.0f, 24.68f, 20.594f, 24.906f)
                curveTo(20.84f, 24.316f, 21.0f, 23.676f, 21.0f, 23.0f)
                curveTo(21.0f, 16.75f, 17.656f, 12.938f, 17.656f, 12.938f)
                lineTo(15.844f, 10.906f)
                lineTo(15.906f, 13.625f)
                curveTo(15.906f, 13.625f, 15.91f, 14.898f, 15.75f, 16.125f)
                curveTo(15.668f, 16.738f, 15.555f, 17.348f, 15.406f, 17.688f)
                curveTo(15.363f, 17.785f, 15.344f, 17.797f, 15.313f, 17.844f)
                curveTo(15.207f, 17.805f, 14.891f, 17.648f, 14.594f, 17.344f)
                curveTo(14.258f, 17.0f, 14.031f, 16.656f, 14.031f, 16.656f)
                lineTo(13.063f, 15.156f)
                lineTo(12.313f, 16.781f)
                curveTo(12.313f, 16.781f, 11.0f, 19.457f, 11.0f, 23.0f)
                curveTo(11.0f, 23.676f, 11.16f, 24.316f, 11.406f, 24.906f)
                curveTo(11.0f, 24.68f, 10.625f, 24.414f, 10.281f, 24.125f)
                curveTo(8.867f, 22.93f, 8.0f, 21.234f, 8.0f, 19.0f)
                curveTo(8.0f, 16.043f, 10.098f, 12.621f, 12.281f, 10.0f)
                curveTo(14.133f, 7.781f, 15.445f, 6.695f, 15.969f, 6.25f)
                close()
                moveTo(17.656f, 16.781f)
                curveTo(18.34f, 18.266f, 19.0f, 20.34f, 19.0f, 23.0f)
                curveTo(19.0f, 24.656f, 17.656f, 26.0f, 16.0f, 26.0f)
                curveTo(14.344f, 26.0f, 13.0f, 24.656f, 13.0f, 23.0f)
                curveTo(13.0f, 21.406f, 13.309f, 20.059f, 13.594f, 19.094f)
                curveTo(14.043f, 19.496f, 14.594f, 19.906f, 15.406f, 19.906f)
                curveTo(15.883f, 19.906f, 16.336f, 19.688f, 16.625f, 19.406f)
                curveTo(16.914f, 19.125f, 17.078f, 18.793f, 17.219f, 18.469f)
                curveTo(17.445f, 17.941f, 17.563f, 17.355f, 17.656f, 16.781f)
                close()
            }
        }
        .build()
        return _burnSolid!!
    }

private var _burnSolid: ImageVector? = null
