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

public val LineAwesomeIcons.Palfed: ImageVector
    get() {
        if (_palfed != null) {
            return _palfed!!
        }
        _palfed = Builder(name = "Palfed", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(13.45f, 4.0f, 13.0f, 4.45f, 13.0f, 5.0f)
                lineTo(13.0f, 6.0f)
                curveTo(8.582f, 6.0f, 5.0f, 7.791f, 5.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                curveTo(2.9f, 10.0f, 2.0f, 10.9f, 2.0f, 12.0f)
                curveTo(2.0f, 13.1f, 2.9f, 14.0f, 4.0f, 14.0f)
                lineTo(5.375f, 14.0f)
                lineTo(6.781f, 25.248f)
                curveTo(6.906f, 26.249f, 7.757f, 27.0f, 8.766f, 27.0f)
                lineTo(23.234f, 27.0f)
                curveTo(24.243f, 27.0f, 25.095f, 26.249f, 25.221f, 25.248f)
                lineTo(26.625f, 14.0f)
                lineTo(28.0f, 14.0f)
                curveTo(29.1f, 14.0f, 30.0f, 13.1f, 30.0f, 12.0f)
                curveTo(30.0f, 10.9f, 29.1f, 10.0f, 28.0f, 10.0f)
                lineTo(27.0f, 10.0f)
                curveTo(27.0f, 7.791f, 23.418f, 6.0f, 19.0f, 6.0f)
                lineTo(19.0f, 5.0f)
                curveTo(19.0f, 4.45f, 18.55f, 4.0f, 18.0f, 4.0f)
                lineTo(14.0f, 4.0f)
                close()
                moveTo(15.328f, 8.188f)
                curveTo(15.709f, 8.223f, 16.049f, 8.506f, 16.141f, 8.969f)
                curveTo(19.804f, 7.843f, 23.0f, 9.018f, 23.0f, 12.621f)
                curveTo(23.0f, 16.574f, 19.085f, 20.366f, 16.0f, 19.635f)
                lineTo(16.0f, 24.709f)
                lineTo(16.0f, 24.719f)
                curveTo(16.01f, 24.892f, 16.059f, 25.353f, 15.76f, 25.688f)
                curveTo(15.273f, 26.226f, 14.064f, 26.196f, 13.912f, 24.557f)
                curveTo(13.704f, 22.304f, 13.921f, 14.099f, 13.982f, 12.252f)
                curveTo(12.891f, 13.013f, 11.016f, 14.803f, 11.016f, 16.102f)
                curveTo(11.026f, 16.229f, 11.035f, 16.306f, 11.045f, 16.336f)
                curveTo(11.055f, 16.336f, 11.375f, 16.197f, 11.613f, 16.197f)
                curveTo(12.963f, 16.197f, 12.664f, 18.436f, 10.883f, 18.436f)
                curveTo(9.793f, 18.437f, 9.0f, 17.52f, 9.0f, 16.256f)
                curveTo(9.0f, 14.125f, 11.176f, 11.404f, 14.109f, 9.836f)
                curveTo(14.16f, 9.207f, 14.262f, 8.719f, 14.643f, 8.404f)
                curveTo(14.856f, 8.233f, 15.1f, 8.166f, 15.328f, 8.188f)
                close()
                moveTo(18.539f, 10.684f)
                curveTo(17.76f, 10.692f, 16.903f, 10.886f, 16.15f, 11.16f)
                curveTo(16.085f, 13.159f, 16.025f, 15.256f, 16.0f, 17.24f)
                curveTo(16.035f, 17.382f, 16.13f, 17.555f, 16.754f, 17.555f)
                curveTo(18.592f, 17.555f, 20.919f, 15.383f, 20.914f, 12.674f)
                curveTo(20.914f, 11.17f, 19.837f, 10.669f, 18.539f, 10.684f)
                close()
            }
        }
        .build()
        return _palfed!!
    }

private var _palfed: ImageVector? = null
