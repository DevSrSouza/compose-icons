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

public val LineAwesomeIcons.GlideG: ImageVector
    get() {
        if (_glideG != null) {
            return _glideG!!
        }
        _glideG = Builder(name = "GlideG", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.035f, 3.0f)
                curveTo(10.19f, 3.0f, 7.0f, 8.773f, 7.0f, 13.074f)
                curveTo(7.0f, 17.538f, 9.837f, 20.012f, 14.27f, 20.012f)
                curveTo(14.879f, 20.012f, 14.828f, 19.961f, 14.828f, 20.205f)
                curveTo(13.97f, 26.751f, 10.217f, 26.965f, 10.217f, 25.01f)
                curveTo(10.217f, 23.019f, 12.966f, 22.524f, 12.992f, 22.402f)
                curveTo(12.976f, 21.782f, 10.604f, 21.0f, 10.0f, 21.0f)
                curveTo(8.279f, 21.005f, 7.0f, 23.108f, 7.0f, 24.535f)
                curveTo(7.0f, 27.171f, 8.541f, 29.0f, 11.217f, 29.0f)
                curveTo(15.147f, 29.0f, 18.021f, 25.048f, 18.904f, 21.615f)
                curveTo(19.671f, 18.543f, 19.473f, 18.403f, 19.904f, 18.184f)
                curveTo(21.539f, 17.361f, 22.825f, 17.572f, 24.668f, 17.572f)
                curveTo(25.572f, 17.572f, 26.216f, 17.761f, 27.658f, 18.0f)
                curveTo(27.805f, 18.0f, 27.998f, 17.853f, 27.998f, 17.705f)
                curveTo(27.999f, 17.299f, 26.381f, 14.34f, 26.0f, 14.193f)
                curveTo(25.822f, 14.122f, 25.412f, 14.0f, 25.219f, 14.0f)
                curveTo(23.335f, 14.0f, 21.982f, 14.384f, 20.393f, 15.283f)
                lineTo(20.348f, 15.238f)
                curveTo(20.704f, 12.836f, 22.0f, 10.285f, 22.0f, 7.822f)
                curveTo(22.0f, 4.191f, 19.6f, 3.0f, 16.035f, 3.0f)
                close()
                moveTo(16.289f, 5.828f)
                curveTo(17.234f, 5.828f, 17.766f, 6.218f, 17.766f, 7.0f)
                curveTo(17.761f, 7.726f, 17.628f, 8.446f, 17.48f, 9.152f)
                curveTo(17.008f, 11.422f, 16.076f, 13.99f, 15.609f, 16.26f)
                curveTo(15.492f, 16.778f, 14.934f, 16.654f, 14.492f, 16.654f)
                curveTo(12.547f, 16.654f, 12.0f, 14.532f, 12.0f, 12.943f)
                curveTo(12.0f, 10.556f, 12.919f, 7.394f, 15.143f, 6.17f)
                curveTo(15.498f, 5.962f, 15.893f, 5.828f, 16.289f, 5.828f)
                close()
            }
        }
        .build()
        return _glideG!!
    }

private var _glideG: ImageVector? = null
