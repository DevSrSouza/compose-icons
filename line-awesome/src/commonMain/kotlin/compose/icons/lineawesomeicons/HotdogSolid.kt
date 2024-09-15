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

public val LineAwesomeIcons.HotdogSolid: ImageVector
    get() {
        if (_hotdogSolid != null) {
            return _hotdogSolid!!
        }
        _hotdogSolid = Builder(name = "HotdogSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.219f, 4.0f)
                curveTo(22.984f, 4.0f, 22.254f, 4.496f, 21.719f, 5.313f)
                curveTo(21.23f, 5.242f, 20.762f, 5.188f, 20.375f, 5.188f)
                curveTo(19.125f, 5.188f, 18.059f, 5.816f, 17.313f, 6.625f)
                curveTo(16.59f, 7.406f, 16.121f, 8.359f, 15.719f, 9.313f)
                curveTo(15.715f, 9.316f, 15.691f, 9.309f, 15.688f, 9.313f)
                curveTo(14.648f, 11.266f, 13.543f, 13.832f, 9.781f, 15.594f)
                curveTo(6.98f, 16.914f, 5.621f, 18.844f, 5.281f, 20.75f)
                curveTo(4.488f, 21.246f, 4.0f, 21.98f, 4.0f, 23.313f)
                curveTo(4.0f, 25.391f, 5.5f, 26.594f, 7.375f, 27.125f)
                curveTo(8.438f, 28.266f, 9.859f, 29.0f, 11.625f, 29.0f)
                curveTo(14.695f, 29.0f, 18.301f, 26.98f, 22.625f, 22.5f)
                lineTo(22.656f, 22.5f)
                curveTo(27.434f, 17.719f, 29.0f, 13.754f, 29.0f, 10.938f)
                curveTo(29.0f, 9.105f, 28.492f, 7.801f, 27.531f, 7.156f)
                curveTo(27.809f, 4.879f, 25.711f, 4.0f, 24.219f, 4.0f)
                close()
                moveTo(20.375f, 7.188f)
                curveTo(20.504f, 7.188f, 20.676f, 7.207f, 20.844f, 7.219f)
                curveTo(20.035f, 9.496f, 19.215f, 12.664f, 16.125f, 15.75f)
                curveTo(13.168f, 18.773f, 10.0f, 19.324f, 7.625f, 19.906f)
                curveTo(8.082f, 19.035f, 8.961f, 18.191f, 10.625f, 17.406f)
                curveTo(14.949f, 15.379f, 16.457f, 12.117f, 17.438f, 10.281f)
                curveTo(17.461f, 10.25f, 17.48f, 10.219f, 17.5f, 10.188f)
                curveTo(17.859f, 9.316f, 18.293f, 8.496f, 18.781f, 7.969f)
                curveTo(19.27f, 7.441f, 19.746f, 7.188f, 20.375f, 7.188f)
                close()
                moveTo(24.969f, 9.0f)
                curveTo(25.473f, 8.977f, 26.043f, 9.066f, 26.719f, 9.313f)
                curveTo(26.859f, 9.652f, 27.0f, 10.164f, 27.0f, 10.938f)
                curveTo(27.0f, 13.008f, 25.801f, 16.543f, 21.25f, 21.094f)
                curveTo(21.238f, 21.105f, 21.23f, 21.113f, 21.219f, 21.125f)
                curveTo(18.258f, 24.195f, 15.738f, 25.852f, 13.75f, 26.563f)
                curveTo(11.418f, 26.414f, 8.832f, 24.617f, 17.875f, 18.0f)
                curveTo(21.535f, 15.324f, 21.43f, 9.176f, 24.969f, 9.0f)
                close()
            }
        }
        .build()
        return _hotdogSolid!!
    }

private var _hotdogSolid: ImageVector? = null
