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

public val LineAwesomeIcons.SlackHash: ImageVector
    get() {
        if (_slackHash != null) {
            return _slackHash!!
        }
        _slackHash = Builder(name = "SlackHash", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.656f, 3.0f)
                curveTo(17.375f, 2.977f, 17.063f, 3.031f, 16.781f, 3.125f)
                curveTo(15.652f, 3.504f, 15.059f, 4.715f, 15.438f, 5.844f)
                lineTo(16.344f, 8.5f)
                lineTo(11.219f, 10.219f)
                lineTo(10.375f, 7.656f)
                curveTo(9.996f, 6.527f, 8.785f, 5.934f, 7.656f, 6.313f)
                curveTo(6.523f, 6.691f, 5.902f, 7.902f, 6.281f, 9.031f)
                lineTo(7.125f, 11.563f)
                lineTo(4.469f, 12.469f)
                curveTo(3.34f, 12.848f, 2.746f, 14.09f, 3.125f, 15.219f)
                curveTo(3.504f, 16.348f, 4.715f, 16.941f, 5.844f, 16.563f)
                lineTo(8.5f, 15.688f)
                lineTo(10.219f, 20.781f)
                lineTo(7.656f, 21.625f)
                curveTo(6.527f, 22.004f, 5.934f, 23.215f, 6.313f, 24.344f)
                curveTo(6.691f, 25.477f, 7.902f, 26.098f, 9.031f, 25.719f)
                lineTo(11.563f, 24.875f)
                lineTo(12.469f, 27.531f)
                curveTo(12.848f, 28.66f, 14.09f, 29.254f, 15.219f, 28.875f)
                curveTo(16.348f, 28.496f, 16.941f, 27.285f, 16.563f, 26.156f)
                lineTo(15.688f, 23.5f)
                lineTo(20.781f, 21.781f)
                lineTo(21.625f, 24.344f)
                curveTo(22.004f, 25.473f, 23.215f, 26.066f, 24.344f, 25.688f)
                curveTo(25.477f, 25.309f, 26.098f, 24.098f, 25.719f, 22.969f)
                lineTo(24.875f, 20.438f)
                lineTo(27.531f, 19.531f)
                curveTo(28.66f, 19.152f, 29.254f, 17.91f, 28.875f, 16.781f)
                curveTo(28.496f, 15.652f, 27.285f, 15.059f, 26.156f, 15.438f)
                lineTo(23.5f, 16.313f)
                lineTo(21.781f, 11.219f)
                lineTo(24.344f, 10.375f)
                curveTo(25.473f, 9.996f, 26.066f, 8.785f, 25.688f, 7.656f)
                curveTo(25.309f, 6.527f, 24.098f, 5.902f, 22.969f, 6.281f)
                lineTo(20.438f, 7.125f)
                lineTo(19.531f, 4.469f)
                curveTo(19.246f, 3.621f, 18.496f, 3.066f, 17.656f, 3.0f)
                close()
                moveTo(17.688f, 12.594f)
                lineTo(19.406f, 17.688f)
                lineTo(14.313f, 19.406f)
                lineTo(12.594f, 14.313f)
                close()
            }
        }
        .build()
        return _slackHash!!
    }

private var _slackHash: ImageVector? = null
