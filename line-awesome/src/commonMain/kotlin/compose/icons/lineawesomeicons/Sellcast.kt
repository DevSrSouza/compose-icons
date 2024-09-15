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

public val LineAwesomeIcons.Sellcast: ImageVector
    get() {
        if (_sellcast != null) {
            return _sellcast!!
        }
        _sellcast = Builder(name = "Sellcast", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(20.066f, 9.061f)
                curveTo(19.687f, 8.992f, 19.274f, 9.124f, 19.02f, 9.561f)
                lineTo(18.791f, 9.951f)
                curveTo(16.49f, 8.658f, 13.536f, 9.438f, 12.207f, 11.689f)
                curveTo(10.882f, 13.944f, 11.679f, 16.852f, 13.975f, 18.15f)
                curveTo(14.861f, 18.655f, 13.969f, 18.146f, 14.855f, 18.65f)
                curveTo(16.046f, 19.322f, 17.057f, 17.563f, 15.885f, 16.9f)
                curveTo(15.88f, 16.9f, 14.998f, 16.404f, 14.998f, 16.404f)
                curveTo(13.683f, 15.657f, 13.219f, 13.986f, 13.982f, 12.697f)
                curveTo(14.745f, 11.408f, 16.451f, 10.961f, 17.766f, 11.703f)
                curveTo(18.652f, 12.208f, 17.76f, 11.699f, 18.646f, 12.203f)
                curveTo(19.131f, 12.441f, 19.598f, 12.339f, 19.908f, 12.035f)
                curveTo(20.036f, 11.909f, 20.004f, 11.941f, 20.814f, 10.564f)
                curveTo(21.24f, 9.841f, 20.698f, 9.174f, 20.066f, 9.061f)
                close()
                moveTo(16.688f, 13.201f)
                curveTo(15.712f, 13.097f, 15.068f, 14.518f, 16.094f, 15.098f)
                curveTo(16.951f, 15.574f, 16.131f, 15.118f, 16.979f, 15.594f)
                curveTo(18.294f, 16.341f, 18.751f, 18.012f, 17.994f, 19.301f)
                curveTo(17.231f, 20.59f, 15.526f, 21.037f, 14.211f, 20.295f)
                curveTo(13.325f, 19.79f, 14.216f, 20.299f, 13.33f, 19.795f)
                curveTo(12.84f, 19.515f, 12.207f, 19.683f, 11.926f, 20.164f)
                lineTo(11.178f, 21.434f)
                curveTo(10.578f, 22.452f, 12.1f, 23.909f, 13.191f, 22.051f)
                curveTo(15.492f, 23.344f, 18.446f, 22.563f, 19.775f, 20.313f)
                curveTo(21.104f, 18.062f, 20.31f, 15.154f, 18.004f, 13.848f)
                curveTo(17.118f, 13.343f, 18.007f, 13.852f, 17.121f, 13.348f)
                curveTo(16.972f, 13.264f, 16.827f, 13.216f, 16.688f, 13.201f)
                close()
            }
        }
        .build()
        return _sellcast!!
    }

private var _sellcast: ImageVector? = null
