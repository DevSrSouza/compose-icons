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

public val LineAwesomeIcons.PenAltSolid: ImageVector
    get() {
        if (_penAltSolid != null) {
            return _penAltSolid!!
        }
        _penAltSolid = Builder(name = "PenAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.156f, 3.0f)
                curveTo(18.391f, 3.004f, 17.645f, 3.301f, 17.094f, 3.906f)
                curveTo(17.086f, 3.914f, 17.102f, 3.93f, 17.094f, 3.938f)
                curveTo(15.863f, 5.176f, 15.387f, 6.406f, 14.969f, 7.5f)
                curveTo(14.789f, 7.973f, 14.609f, 8.418f, 14.375f, 8.875f)
                curveTo(13.914f, 8.344f, 13.25f, 8.0f, 12.5f, 8.0f)
                curveTo(11.133f, 8.0f, 10.0f, 9.133f, 10.0f, 10.5f)
                curveTo(10.0f, 11.867f, 11.133f, 13.0f, 12.5f, 13.0f)
                curveTo(13.242f, 13.0f, 13.883f, 12.648f, 14.344f, 12.125f)
                lineTo(14.406f, 12.188f)
                lineTo(5.281f, 21.281f)
                lineTo(5.0f, 21.594f)
                lineTo(5.0f, 25.563f)
                lineTo(4.0f, 26.594f)
                lineTo(5.406f, 28.0f)
                lineTo(6.438f, 27.0f)
                lineTo(10.406f, 27.0f)
                lineTo(10.719f, 26.719f)
                lineTo(27.281f, 10.125f)
                lineTo(27.313f, 10.094f)
                curveTo(28.465f, 8.941f, 28.465f, 7.059f, 27.313f, 5.906f)
                lineTo(26.094f, 4.688f)
                curveTo(25.516f, 4.109f, 24.766f, 3.813f, 24.0f, 3.813f)
                curveTo(23.285f, 3.813f, 22.59f, 4.09f, 22.031f, 4.594f)
                lineTo(21.313f, 3.906f)
                curveTo(20.723f, 3.316f, 19.934f, 2.996f, 19.156f, 3.0f)
                close()
                moveTo(19.188f, 5.0f)
                curveTo(19.434f, 5.004f, 19.699f, 5.105f, 19.906f, 5.313f)
                lineTo(20.594f, 6.0f)
                lineTo(14.469f, 12.094f)
                curveTo(15.824f, 10.656f, 16.422f, 9.32f, 16.844f, 8.219f)
                curveTo(17.273f, 7.094f, 17.543f, 6.27f, 18.5f, 5.313f)
                lineTo(18.563f, 5.25f)
                curveTo(18.711f, 5.082f, 18.941f, 4.996f, 19.188f, 5.0f)
                close()
                moveTo(24.0f, 5.781f)
                curveTo(24.234f, 5.781f, 24.465f, 5.871f, 24.688f, 6.094f)
                lineTo(25.906f, 7.313f)
                curveTo(26.352f, 7.758f, 26.352f, 8.242f, 25.906f, 8.688f)
                lineTo(25.0f, 9.563f)
                lineTo(22.438f, 7.0f)
                lineTo(23.219f, 6.219f)
                lineTo(23.313f, 6.094f)
                curveTo(23.535f, 5.871f, 23.766f, 5.781f, 24.0f, 5.781f)
                close()
                moveTo(21.0f, 8.438f)
                lineTo(23.563f, 11.0f)
                lineTo(16.0f, 18.563f)
                lineTo(13.438f, 16.0f)
                close()
                moveTo(12.5f, 10.0f)
                curveTo(12.789f, 10.0f, 13.0f, 10.211f, 13.0f, 10.5f)
                curveTo(13.0f, 10.789f, 12.789f, 11.0f, 12.5f, 11.0f)
                curveTo(12.211f, 11.0f, 12.0f, 10.789f, 12.0f, 10.5f)
                curveTo(12.0f, 10.211f, 12.211f, 10.0f, 12.5f, 10.0f)
                close()
                moveTo(12.0f, 17.438f)
                lineTo(14.563f, 20.0f)
                lineTo(9.563f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 22.438f)
                close()
            }
        }
        .build()
        return _penAltSolid!!
    }

private var _penAltSolid: ImageVector? = null
