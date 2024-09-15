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

public val LineAwesomeIcons.HandPointer: ImageVector
    get() {
        if (_handPointer != null) {
            return _handPointer!!
        }
        _handPointer = Builder(name = "HandPointer", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                curveTo(11.355f, 2.0f, 10.0f, 3.355f, 10.0f, 5.0f)
                lineTo(10.0f, 16.813f)
                lineTo(9.344f, 16.125f)
                lineTo(9.094f, 15.906f)
                curveTo(7.941f, 14.754f, 6.059f, 14.754f, 4.906f, 15.906f)
                curveTo(3.754f, 17.059f, 3.754f, 18.941f, 4.906f, 20.094f)
                lineTo(4.906f, 20.125f)
                lineTo(13.094f, 28.219f)
                lineTo(13.156f, 28.25f)
                lineTo(13.188f, 28.313f)
                curveTo(14.535f, 29.324f, 16.254f, 30.0f, 18.188f, 30.0f)
                lineTo(19.906f, 30.0f)
                curveTo(24.441f, 30.0f, 28.094f, 26.348f, 28.094f, 21.813f)
                lineTo(28.094f, 14.0f)
                curveTo(28.094f, 12.355f, 26.738f, 11.0f, 25.094f, 11.0f)
                curveTo(24.668f, 11.0f, 24.273f, 11.117f, 23.906f, 11.281f)
                curveTo(23.578f, 9.98f, 22.395f, 9.0f, 21.0f, 9.0f)
                curveTo(20.234f, 9.0f, 19.531f, 9.301f, 19.0f, 9.781f)
                curveTo(18.469f, 9.301f, 17.766f, 9.0f, 17.0f, 9.0f)
                curveTo(16.648f, 9.0f, 16.316f, 9.074f, 16.0f, 9.188f)
                lineTo(16.0f, 5.0f)
                curveTo(16.0f, 3.355f, 14.645f, 2.0f, 13.0f, 2.0f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(13.555f, 4.0f, 14.0f, 4.445f, 14.0f, 5.0f)
                lineTo(14.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                lineTo(16.0f, 12.0f)
                curveTo(16.0f, 11.445f, 16.445f, 11.0f, 17.0f, 11.0f)
                curveTo(17.555f, 11.0f, 18.0f, 11.445f, 18.0f, 12.0f)
                lineTo(18.0f, 16.0f)
                lineTo(20.0f, 16.0f)
                lineTo(20.0f, 12.0f)
                curveTo(20.0f, 11.445f, 20.445f, 11.0f, 21.0f, 11.0f)
                curveTo(21.555f, 11.0f, 22.0f, 11.445f, 22.0f, 12.0f)
                lineTo(22.0f, 16.0f)
                lineTo(24.094f, 16.0f)
                lineTo(24.094f, 14.0f)
                curveTo(24.094f, 13.445f, 24.539f, 13.0f, 25.094f, 13.0f)
                curveTo(25.648f, 13.0f, 26.094f, 13.445f, 26.094f, 14.0f)
                lineTo(26.094f, 21.813f)
                curveTo(26.094f, 25.277f, 23.371f, 28.0f, 19.906f, 28.0f)
                lineTo(18.188f, 28.0f)
                curveTo(16.723f, 28.0f, 15.457f, 27.477f, 14.406f, 26.688f)
                lineTo(6.313f, 18.688f)
                curveTo(5.867f, 18.242f, 5.867f, 17.758f, 6.313f, 17.313f)
                curveTo(6.758f, 16.867f, 7.242f, 16.867f, 7.688f, 17.313f)
                lineTo(12.0f, 21.625f)
                lineTo(12.0f, 5.0f)
                curveTo(12.0f, 4.445f, 12.445f, 4.0f, 13.0f, 4.0f)
                close()
            }
        }
        .build()
        return _handPointer!!
    }

private var _handPointer: ImageVector? = null
