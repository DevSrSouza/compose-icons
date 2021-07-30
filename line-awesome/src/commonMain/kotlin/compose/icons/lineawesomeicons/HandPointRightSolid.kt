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

public val LineAwesomeIcons.HandPointRightSolid: ImageVector
    get() {
        if (_handPointRightSolid != null) {
            return _handPointRightSolid!!
        }
        _handPointRightSolid = Builder(name = "HandPointRightSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6875f, 3.0f)
                lineTo(14.375f, 3.2813f)
                lineTo(7.5938f, 10.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 26.0f)
                lineTo(18.8438f, 26.0f)
                curveTo(20.2539f, 26.0f, 21.4844f, 25.0039f, 21.7813f, 23.625f)
                lineTo(23.4375f, 16.0f)
                lineTo(27.0f, 16.0f)
                curveTo(28.6445f, 16.0f, 30.0f, 14.6445f, 30.0f, 13.0f)
                curveTo(30.0f, 11.3555f, 28.6445f, 10.0f, 27.0f, 10.0f)
                lineTo(16.25f, 10.0f)
                lineTo(16.4375f, 9.25f)
                curveTo(16.6406f, 9.0938f, 16.7695f, 9.0273f, 17.0625f, 8.625f)
                curveTo(17.5313f, 7.9844f, 18.0f, 6.9922f, 18.0f, 5.6563f)
                curveTo(18.0f, 4.2305f, 16.7109f, 3.0f, 15.0938f, 3.0f)
                close()
                moveTo(15.4063f, 5.0938f)
                curveTo(15.8281f, 5.1758f, 16.0f, 5.3477f, 16.0f, 5.6563f)
                curveTo(16.0f, 6.5586f, 15.7266f, 7.1172f, 15.4688f, 7.4688f)
                curveTo(15.2109f, 7.8203f, 15.0313f, 7.9063f, 15.0313f, 7.9063f)
                lineTo(14.6875f, 8.0938f)
                lineTo(14.5625f, 8.5f)
                lineTo(13.9688f, 10.75f)
                lineTo(13.6563f, 12.0f)
                lineTo(27.0f, 12.0f)
                curveTo(27.5664f, 12.0f, 28.0f, 12.4336f, 28.0f, 13.0f)
                curveTo(28.0f, 13.5664f, 27.5664f, 14.0f, 27.0f, 14.0f)
                lineTo(21.8125f, 14.0f)
                lineTo(21.625f, 14.7813f)
                lineTo(19.8438f, 23.2188f)
                curveTo(19.7422f, 23.6875f, 19.3203f, 24.0f, 18.8438f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 11.4063f)
                close()
                moveTo(4.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                close()
            }
        }
        .build()
        return _handPointRightSolid!!
    }

private var _handPointRightSolid: ImageVector? = null
