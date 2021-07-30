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

public val LineAwesomeIcons.HandPointUp: ImageVector
    get() {
        if (_handPointUp != null) {
            return _handPointUp!!
        }
        _handPointUp = Builder(name = "HandPointUp", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                curveTo(11.3555f, 2.0f, 10.0f, 3.3555f, 10.0f, 5.0f)
                lineTo(10.0f, 15.75f)
                lineTo(9.25f, 15.5625f)
                curveTo(9.0938f, 15.3594f, 9.0273f, 15.2305f, 8.625f, 14.9375f)
                curveTo(7.9844f, 14.4688f, 6.9922f, 14.0f, 5.6563f, 14.0f)
                curveTo(4.2305f, 14.0f, 3.0f, 15.2891f, 3.0f, 16.9063f)
                lineTo(3.0f, 17.3125f)
                lineTo(3.2813f, 17.625f)
                lineTo(10.0f, 24.4063f)
                lineTo(10.0f, 30.0f)
                lineTo(26.0f, 30.0f)
                lineTo(26.0f, 13.1563f)
                curveTo(26.0f, 11.7461f, 25.0039f, 10.5156f, 23.625f, 10.2188f)
                lineTo(16.0f, 8.5625f)
                lineTo(16.0f, 5.0f)
                curveTo(16.0f, 3.3555f, 14.6445f, 2.0f, 13.0f, 2.0f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(13.5664f, 4.0f, 14.0f, 4.4336f, 14.0f, 5.0f)
                lineTo(14.0f, 10.1875f)
                lineTo(14.7813f, 10.375f)
                lineTo(23.2188f, 12.1563f)
                curveTo(23.6875f, 12.2578f, 24.0f, 12.6797f, 24.0f, 13.1563f)
                lineTo(24.0f, 23.0f)
                lineTo(11.4063f, 23.0f)
                lineTo(5.0938f, 16.5938f)
                curveTo(5.1758f, 16.1719f, 5.3477f, 16.0f, 5.6563f, 16.0f)
                curveTo(6.5586f, 16.0f, 7.1172f, 16.2734f, 7.4688f, 16.5313f)
                curveTo(7.8203f, 16.7891f, 7.9063f, 16.9688f, 7.9063f, 16.9688f)
                lineTo(8.0938f, 17.3125f)
                lineTo(8.5f, 17.4375f)
                lineTo(10.75f, 18.0313f)
                lineTo(12.0f, 18.3438f)
                lineTo(12.0f, 5.0f)
                curveTo(12.0f, 4.4336f, 12.4336f, 4.0f, 13.0f, 4.0f)
                close()
                moveTo(12.0f, 25.0f)
                lineTo(24.0f, 25.0f)
                lineTo(24.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                close()
            }
        }
        .build()
        return _handPointUp!!
    }

private var _handPointUp: ImageVector? = null
