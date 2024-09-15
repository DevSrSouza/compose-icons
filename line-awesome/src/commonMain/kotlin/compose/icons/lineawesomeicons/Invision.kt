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

public val LineAwesomeIcons.Invision: ImageVector
    get() {
        if (_invision != null) {
            return _invision!!
        }
        _invision = Builder(name = "Invision", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(12.902f, 10.0f)
                curveTo(12.334f, 10.004f, 11.768f, 10.383f, 11.766f, 11.133f)
                curveTo(11.766f, 11.773f, 12.287f, 12.283f, 12.922f, 12.283f)
                curveTo(13.101f, 12.278f, 14.072f, 12.112f, 14.055f, 11.115f)
                curveTo(14.042f, 10.367f, 13.471f, 9.996f, 12.902f, 10.0f)
                close()
                moveTo(19.604f, 13.203f)
                curveTo(18.755f, 13.274f, 17.827f, 13.862f, 17.18f, 15.068f)
                lineTo(17.559f, 13.344f)
                lineTo(14.627f, 13.344f)
                lineTo(14.215f, 14.859f)
                lineTo(15.59f, 14.859f)
                lineTo(14.746f, 18.244f)
                curveTo(14.043f, 19.808f, 12.301f, 20.123f, 12.301f, 19.232f)
                curveTo(12.314f, 18.751f, 12.269f, 19.042f, 13.701f, 13.344f)
                lineTo(10.445f, 13.344f)
                lineTo(10.033f, 14.861f)
                lineTo(11.389f, 14.861f)
                curveTo(10.447f, 18.7f, 10.412f, 18.688f, 10.408f, 19.297f)
                curveTo(10.408f, 21.372f, 13.097f, 21.687f, 14.439f, 19.48f)
                lineTo(14.094f, 20.865f)
                lineTo(16.016f, 20.865f)
                lineTo(17.115f, 16.463f)
                curveTo(17.742f, 13.919f, 20.269f, 14.457f, 19.668f, 16.434f)
                curveTo(19.28f, 17.824f, 17.936f, 20.977f, 20.732f, 20.977f)
                curveTo(21.746f, 20.977f, 22.553f, 20.324f, 23.0f, 18.76f)
                lineTo(22.238f, 18.475f)
                curveTo(21.629f, 20.158f, 20.883f, 19.854f, 20.883f, 19.193f)
                curveTo(20.896f, 18.848f, 20.913f, 18.865f, 21.518f, 16.688f)
                curveTo(22.213f, 14.403f, 21.018f, 13.085f, 19.604f, 13.203f)
                close()
            }
        }
        .build()
        return _invision!!
    }

private var _invision: ImageVector? = null
