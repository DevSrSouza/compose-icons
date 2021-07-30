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

public val LineAwesomeIcons.HandPointDownSolid: ImageVector
    get() {
        if (_handPointDownSolid != null) {
            return _handPointDownSolid!!
        }
        _handPointDownSolid = Builder(name = "HandPointDownSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                lineTo(10.0f, 7.5938f)
                lineTo(3.2813f, 14.375f)
                lineTo(3.0f, 14.6875f)
                lineTo(3.0f, 15.0938f)
                curveTo(3.0f, 16.7109f, 4.2305f, 18.0f, 5.6563f, 18.0f)
                curveTo(6.9922f, 18.0f, 7.9844f, 17.5313f, 8.625f, 17.0625f)
                curveTo(9.0273f, 16.7695f, 9.0938f, 16.6406f, 9.25f, 16.4375f)
                lineTo(10.0f, 16.25f)
                lineTo(10.0f, 27.0f)
                curveTo(10.0f, 28.6445f, 11.3555f, 30.0f, 13.0f, 30.0f)
                curveTo(14.6445f, 30.0f, 16.0f, 28.6445f, 16.0f, 27.0f)
                lineTo(16.0f, 23.4375f)
                lineTo(23.625f, 21.7813f)
                curveTo(25.0039f, 21.4844f, 26.0f, 20.2539f, 26.0f, 18.8438f)
                lineTo(26.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                lineTo(24.0f, 4.0f)
                lineTo(24.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(11.4063f, 9.0f)
                lineTo(24.0f, 9.0f)
                lineTo(24.0f, 18.8438f)
                curveTo(24.0f, 19.3203f, 23.6875f, 19.7422f, 23.2188f, 19.8438f)
                lineTo(14.7813f, 21.625f)
                lineTo(14.0f, 21.8125f)
                lineTo(14.0f, 27.0f)
                curveTo(14.0f, 27.5664f, 13.5664f, 28.0f, 13.0f, 28.0f)
                curveTo(12.4336f, 28.0f, 12.0f, 27.5664f, 12.0f, 27.0f)
                lineTo(12.0f, 13.6563f)
                lineTo(10.75f, 13.9688f)
                lineTo(8.5f, 14.5625f)
                lineTo(8.0938f, 14.6875f)
                lineTo(7.9063f, 15.0313f)
                curveTo(7.9063f, 15.0313f, 7.8203f, 15.2109f, 7.4688f, 15.4688f)
                curveTo(7.1172f, 15.7266f, 6.5586f, 16.0f, 5.6563f, 16.0f)
                curveTo(5.3477f, 16.0f, 5.1758f, 15.8281f, 5.0938f, 15.4063f)
                close()
            }
        }
        .build()
        return _handPointDownSolid!!
    }

private var _handPointDownSolid: ImageVector? = null
