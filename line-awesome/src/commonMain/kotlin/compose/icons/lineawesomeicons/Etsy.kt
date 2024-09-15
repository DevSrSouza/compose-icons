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

public val LineAwesomeIcons.Etsy: ImageVector
    get() {
        if (_etsy != null) {
            return _etsy!!
        }
        _etsy = Builder(name = "Etsy", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.969f, 5.0f)
                curveTo(18.711f, 5.604f, 9.771f, 5.3f, 6.143f, 5.184f)
                lineTo(6.143f, 6.436f)
                curveTo(8.543f, 6.89f, 9.089f, 6.805f, 9.139f, 8.203f)
                curveTo(9.312f, 12.026f, 9.227f, 20.466f, 9.139f, 24.018f)
                curveTo(9.121f, 25.355f, 8.375f, 25.309f, 6.143f, 25.748f)
                lineTo(6.143f, 27.0f)
                curveTo(13.441f, 26.767f, 18.449f, 26.789f, 24.238f, 27.0f)
                curveTo(24.312f, 26.075f, 24.754f, 22.379f, 24.934f, 21.0f)
                lineTo(23.701f, 21.0f)
                curveTo(22.309f, 24.293f, 22.041f, 25.416f, 19.059f, 25.416f)
                lineTo(14.676f, 25.416f)
                curveTo(13.203f, 25.416f, 12.502f, 24.813f, 12.502f, 23.537f)
                lineTo(12.502f, 16.713f)
                curveTo(15.768f, 16.713f, 16.822f, 16.811f, 16.822f, 16.811f)
                curveTo(18.317f, 16.834f, 18.55f, 18.031f, 19.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                curveTo(19.894f, 15.167f, 19.784f, 16.977f, 20.0f, 12.0f)
                lineTo(19.0f, 12.0f)
                curveTo(18.352f, 14.787f, 18.31f, 15.117f, 16.848f, 15.164f)
                curveTo(16.848f, 15.164f, 15.35f, 15.311f, 12.502f, 15.287f)
                lineTo(12.502f, 7.246f)
                curveTo(12.502f, 6.939f, 12.526f, 6.768f, 13.029f, 6.768f)
                lineTo(19.758f, 6.768f)
                curveTo(21.466f, 6.768f, 21.879f, 8.954f, 22.395f, 11.0f)
                lineTo(23.6f, 11.0f)
                curveTo(23.644f, 10.113f, 23.82f, 6.632f, 23.969f, 5.0f)
                close()
            }
        }
        .build()
        return _etsy!!
    }

private var _etsy: ImageVector? = null
