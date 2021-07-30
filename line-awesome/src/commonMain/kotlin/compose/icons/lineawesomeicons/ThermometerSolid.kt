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

public val LineAwesomeIcons.ThermometerSolid: ImageVector
    get() {
        if (_thermometerSolid != null) {
            return _thermometerSolid!!
        }
        _thermometerSolid = Builder(name = "ThermometerSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 4.0f)
                curveTo(20.1484f, 4.0f, 18.5313f, 4.625f, 17.3125f, 5.8438f)
                lineTo(9.6563f, 13.4688f)
                lineTo(9.5313f, 13.625f)
                curveTo(8.5547f, 14.6016f, 8.0f, 15.9336f, 8.0f, 17.3125f)
                lineTo(8.0f, 19.625f)
                lineTo(4.9063f, 22.6875f)
                lineTo(4.875f, 22.75f)
                curveTo(3.7227f, 23.957f, 3.7188f, 25.9063f, 4.9063f, 27.0938f)
                curveTo(6.1094f, 28.2969f, 8.1094f, 28.2969f, 9.3125f, 27.0938f)
                lineTo(12.375f, 24.0f)
                lineTo(14.6875f, 24.0f)
                curveTo(16.0664f, 24.0f, 17.3984f, 23.4453f, 18.375f, 22.4688f)
                lineTo(26.1563f, 14.6875f)
                curveTo(28.5898f, 12.2539f, 28.5898f, 8.2773f, 26.1563f, 5.8438f)
                curveTo(24.9375f, 4.625f, 23.3516f, 4.0f, 21.75f, 4.0f)
                close()
                moveTo(21.75f, 6.0f)
                curveTo(22.8359f, 6.0f, 23.9141f, 6.4141f, 24.75f, 7.25f)
                curveTo(26.4219f, 8.9219f, 26.4219f, 11.6094f, 24.75f, 13.2813f)
                lineTo(16.9688f, 21.0625f)
                curveTo(16.3672f, 21.6641f, 15.5391f, 22.0f, 14.6875f, 22.0f)
                lineTo(11.5625f, 22.0f)
                lineTo(7.875f, 25.6875f)
                curveTo(7.4375f, 26.125f, 6.75f, 26.125f, 6.3125f, 25.6875f)
                curveTo(5.875f, 25.25f, 5.875f, 24.5625f, 6.3125f, 24.125f)
                lineTo(10.0f, 20.4375f)
                lineTo(10.0f, 17.3125f)
                curveTo(10.0f, 16.4609f, 10.3359f, 15.6328f, 10.9375f, 15.0313f)
                lineTo(11.7813f, 14.1875f)
                lineTo(12.7813f, 15.2188f)
                lineTo(14.2188f, 13.7813f)
                lineTo(13.2188f, 12.7813f)
                lineTo(14.7813f, 11.2188f)
                lineTo(15.7813f, 12.2188f)
                lineTo(17.2188f, 10.7813f)
                lineTo(16.2188f, 9.7813f)
                lineTo(17.7813f, 8.2188f)
                lineTo(18.7813f, 9.2188f)
                lineTo(20.2188f, 7.7813f)
                lineTo(19.25f, 6.8125f)
                curveTo(20.0f, 6.2695f, 20.875f, 6.0f, 21.75f, 6.0f)
                close()
                moveTo(22.2813f, 8.2813f)
                lineTo(10.0625f, 20.5f)
                lineTo(11.5f, 21.9375f)
                lineTo(23.7188f, 9.7188f)
                close()
            }
        }
        .build()
        return _thermometerSolid!!
    }

private var _thermometerSolid: ImageVector? = null
