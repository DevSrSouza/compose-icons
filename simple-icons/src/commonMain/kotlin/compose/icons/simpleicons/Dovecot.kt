package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Dovecot: ImageVector
    get() {
        if (_dovecot != null) {
            return _dovecot!!
        }
        _dovecot = Builder(name = "Dovecot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.784f, 8.39f)
                curveTo(8.581f, 8.391f, 8.382f, 8.458f, 8.22f, 8.582f)
                lineTo(0.118f, 14.772f)
                curveTo(-0.04f, 14.897f, -0.04f, 15.138f, 0.118f, 15.262f)
                lineTo(0.457f, 15.515f)
                curveTo(0.61f, 15.635f, 0.825f, 15.635f, 0.98f, 15.515f)
                lineTo(4.998f, 12.454f)
                curveTo(5.22f, 12.286f, 5.526f, 12.286f, 5.748f, 12.454f)
                lineTo(8.407f, 14.487f)
                curveTo(8.628f, 14.655f, 8.934f, 14.655f, 9.156f, 14.487f)
                lineTo(12.671f, 11.804f)
                curveTo(12.902f, 11.636f, 12.902f, 11.291f, 12.671f, 11.122f)
                lineTo(9.349f, 8.582f)
                curveTo(9.187f, 8.458f, 8.988f, 8.39f, 8.784f, 8.39f)
                close()
                moveTo(18.082f, 8.39f)
                curveTo(17.878f, 8.39f, 17.68f, 8.458f, 17.519f, 8.582f)
                lineTo(9.417f, 14.778f)
                curveTo(9.255f, 14.901f, 9.255f, 15.144f, 9.417f, 15.267f)
                lineTo(9.752f, 15.522f)
                curveTo(9.908f, 15.638f, 10.124f, 15.638f, 10.279f, 15.522f)
                lineTo(14.914f, 11.989f)
                curveTo(15.136f, 11.823f, 15.442f, 11.823f, 15.662f, 11.989f)
                lineTo(20.189f, 15.441f)
                curveTo(20.41f, 15.61f, 20.718f, 15.61f, 20.939f, 15.441f)
                lineTo(23.828f, 13.228f)
                curveTo(24.057f, 13.056f, 24.057f, 12.712f, 23.828f, 12.54f)
                lineTo(18.647f, 8.582f)
                curveTo(18.485f, 8.458f, 18.286f, 8.39f, 18.082f, 8.39f)
                close()
            }
        }
        .build()
        return _dovecot!!
    }

private var _dovecot: ImageVector? = null
