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

public val LineAwesomeIcons.HandPointLeftSolid: ImageVector
    get() {
        if (_handPointLeftSolid != null) {
            return _handPointLeftSolid!!
        }
        _handPointLeftSolid = Builder(name = "HandPointLeftSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9063f, 3.0f)
                curveTo(15.2891f, 3.0f, 14.0f, 4.2305f, 14.0f, 5.6563f)
                curveTo(14.0f, 6.9922f, 14.4688f, 7.9844f, 14.9375f, 8.625f)
                curveTo(15.2305f, 9.0273f, 15.3594f, 9.0938f, 15.5625f, 9.25f)
                lineTo(15.75f, 10.0f)
                lineTo(5.0f, 10.0f)
                curveTo(3.3555f, 10.0f, 2.0f, 11.3555f, 2.0f, 13.0f)
                curveTo(2.0f, 14.6445f, 3.3555f, 16.0f, 5.0f, 16.0f)
                lineTo(8.5625f, 16.0f)
                lineTo(10.2188f, 23.625f)
                curveTo(10.5156f, 25.0039f, 11.7461f, 26.0f, 13.1563f, 26.0f)
                lineTo(30.0f, 26.0f)
                lineTo(30.0f, 10.0f)
                lineTo(24.4063f, 10.0f)
                lineTo(17.625f, 3.2813f)
                lineTo(17.3125f, 3.0f)
                close()
                moveTo(16.5938f, 5.0938f)
                lineTo(23.0f, 11.4063f)
                lineTo(23.0f, 24.0f)
                lineTo(13.1563f, 24.0f)
                curveTo(12.6797f, 24.0f, 12.2578f, 23.6875f, 12.1563f, 23.2188f)
                lineTo(10.375f, 14.7813f)
                lineTo(10.1875f, 14.0f)
                lineTo(5.0f, 14.0f)
                curveTo(4.4336f, 14.0f, 4.0f, 13.5664f, 4.0f, 13.0f)
                curveTo(4.0f, 12.4336f, 4.4336f, 12.0f, 5.0f, 12.0f)
                lineTo(18.3438f, 12.0f)
                lineTo(18.0313f, 10.75f)
                lineTo(17.4375f, 8.5f)
                lineTo(17.3125f, 8.0938f)
                lineTo(16.9688f, 7.9063f)
                curveTo(16.9688f, 7.9063f, 16.7891f, 7.8203f, 16.5313f, 7.4688f)
                curveTo(16.2734f, 7.1172f, 16.0f, 6.5586f, 16.0f, 5.6563f)
                curveTo(16.0f, 5.3477f, 16.1719f, 5.1758f, 16.5938f, 5.0938f)
                close()
                moveTo(25.0f, 12.0f)
                lineTo(28.0f, 12.0f)
                lineTo(28.0f, 24.0f)
                lineTo(25.0f, 24.0f)
                close()
            }
        }
        .build()
        return _handPointLeftSolid!!
    }

private var _handPointLeftSolid: ImageVector? = null
