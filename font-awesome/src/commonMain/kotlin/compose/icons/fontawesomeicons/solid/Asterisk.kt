package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(478.21f, 334.093f)
                lineTo(336.0f, 256.0f)
                lineToRelative(142.21f, -78.093f)
                curveToRelative(11.795f, -6.477f, 15.961f, -21.384f, 9.232f, -33.037f)
                lineToRelative(-19.48f, -33.741f)
                curveToRelative(-6.728f, -11.653f, -21.72f, -15.499f, -33.227f, -8.523f)
                lineTo(296.0f, 186.718f)
                lineToRelative(3.475f, -162.204f)
                curveTo(299.763f, 11.061f, 288.937f, 0.0f, 275.48f, 0.0f)
                horizontalLineToRelative(-38.96f)
                curveToRelative(-13.456f, 0.0f, -24.283f, 11.061f, -23.994f, 24.514f)
                lineTo(216.0f, 186.718f)
                lineTo(77.265f, 102.607f)
                curveToRelative(-11.506f, -6.976f, -26.499f, -3.13f, -33.227f, 8.523f)
                lineToRelative(-19.48f, 33.741f)
                curveToRelative(-6.728f, 11.653f, -2.562f, 26.56f, 9.233f, 33.037f)
                lineTo(176.0f, 256.0f)
                lineTo(33.79f, 334.093f)
                curveToRelative(-11.795f, 6.477f, -15.961f, 21.384f, -9.232f, 33.037f)
                lineToRelative(19.48f, 33.741f)
                curveToRelative(6.728f, 11.653f, 21.721f, 15.499f, 33.227f, 8.523f)
                lineTo(216.0f, 325.282f)
                lineToRelative(-3.475f, 162.204f)
                curveTo(212.237f, 500.939f, 223.064f, 512.0f, 236.52f, 512.0f)
                horizontalLineToRelative(38.961f)
                curveToRelative(13.456f, 0.0f, 24.283f, -11.061f, 23.995f, -24.514f)
                lineTo(296.0f, 325.282f)
                lineToRelative(138.735f, 84.111f)
                curveToRelative(11.506f, 6.976f, 26.499f, 3.13f, 33.227f, -8.523f)
                lineToRelative(19.48f, -33.741f)
                curveToRelative(6.728f, -11.653f, 2.563f, -26.559f, -9.232f, -33.036f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
