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

public val LineAwesomeIcons.HammerSolid: ImageVector
    get() {
        if (_hammerSolid != null) {
            return _hammerSolid!!
        }
        _hammerSolid = Builder(name = "HammerSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0625f, 2.0f)
                lineTo(9.5625f, 3.8125f)
                curveTo(14.2773f, 7.2109f, 15.707f, 10.543f, 16.0f, 11.2813f)
                lineTo(15.0938f, 12.1875f)
                lineTo(15.0938f, 12.2188f)
                lineTo(14.4063f, 12.9063f)
                lineTo(2.6875f, 25.0625f)
                lineTo(2.0f, 25.7813f)
                lineTo(6.25f, 30.0313f)
                lineTo(6.9688f, 29.2813f)
                lineTo(19.375f, 16.4375f)
                lineTo(19.6875f, 16.0625f)
                lineTo(19.7813f, 16.0f)
                lineTo(20.75f, 15.6563f)
                lineTo(20.9375f, 15.8438f)
                lineTo(20.5625f, 16.75f)
                lineTo(20.2813f, 17.375f)
                lineTo(23.5938f, 20.6875f)
                lineTo(29.9688f, 14.3125f)
                lineTo(27.125f, 11.4688f)
                lineTo(26.6563f, 11.0313f)
                lineTo(26.0625f, 11.25f)
                lineTo(25.1563f, 11.5938f)
                lineTo(24.9375f, 11.375f)
                lineTo(25.25f, 10.375f)
                lineTo(25.375f, 9.9688f)
                lineTo(25.1875f, 9.5938f)
                curveTo(25.1875f, 9.5938f, 24.1328f, 7.6367f, 21.75f, 5.75f)
                curveTo(19.3672f, 3.8633f, 15.5938f, 2.0f, 10.1563f, 2.0f)
                close()
                moveTo(13.0938f, 4.25f)
                curveTo(16.4609f, 4.75f, 18.8906f, 6.0156f, 20.5313f, 7.3125f)
                curveTo(22.2969f, 8.7109f, 23.0f, 9.8438f, 23.2188f, 10.2188f)
                lineTo(22.8438f, 11.375f)
                lineTo(22.6875f, 11.9375f)
                lineTo(23.0938f, 12.375f)
                lineTo(24.6875f, 13.9688f)
                lineTo(25.3125f, 13.7188f)
                lineTo(26.1875f, 13.375f)
                lineTo(27.125f, 14.3125f)
                lineTo(23.5938f, 17.8438f)
                lineTo(22.6563f, 16.9063f)
                lineTo(23.0313f, 16.0f)
                lineTo(23.3125f, 15.375f)
                lineTo(22.8125f, 14.9063f)
                lineTo(21.6875f, 13.7813f)
                lineTo(21.25f, 13.3125f)
                lineTo(20.625f, 13.5313f)
                lineTo(18.8438f, 14.25f)
                lineTo(18.6563f, 14.3125f)
                lineTo(17.9375f, 13.625f)
                lineTo(17.2188f, 12.9063f)
                lineTo(18.375f, 11.75f)
                lineTo(18.1563f, 11.1563f)
                curveTo(18.1563f, 11.1563f, 16.8125f, 7.7617f, 13.0938f, 4.25f)
                close()
                moveTo(15.8125f, 14.3125f)
                lineTo(17.25f, 15.75f)
                lineTo(6.2188f, 27.1563f)
                lineTo(4.8125f, 25.75f)
                close()
            }
        }
        .build()
        return _hammerSolid!!
    }

private var _hammerSolid: ImageVector? = null
