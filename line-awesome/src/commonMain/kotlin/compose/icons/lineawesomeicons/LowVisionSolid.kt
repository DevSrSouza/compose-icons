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

public val LineAwesomeIcons.LowVisionSolid: ImageVector
    get() {
        if (_lowVisionSolid != null) {
            return _lowVisionSolid!!
        }
        _lowVisionSolid = Builder(name = "LowVisionSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7188f, 2.2813f)
                lineTo(2.2813f, 3.7188f)
                lineTo(28.2813f, 29.7188f)
                lineTo(29.7188f, 28.2813f)
                lineTo(23.125f, 21.6875f)
                curveTo(26.4375f, 19.6211f, 28.6367f, 16.9023f, 28.7813f, 16.7188f)
                lineTo(29.0f, 16.4375f)
                lineTo(29.0f, 15.5313f)
                lineTo(28.75f, 15.25f)
                curveTo(28.4961f, 14.9531f, 22.5234f, 8.0f, 16.0f, 8.0f)
                curveTo(14.0977f, 8.0f, 12.3203f, 8.5313f, 10.7188f, 9.2813f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(20.6484f, 10.0f, 25.2813f, 14.4805f, 26.75f, 16.0313f)
                curveTo(25.9375f, 16.9492f, 24.0977f, 18.832f, 21.6875f, 20.25f)
                lineTo(19.4375f, 18.0f)
                curveTo(20.3359f, 16.4688f, 20.1289f, 14.4727f, 18.8125f, 13.1563f)
                curveTo(17.4961f, 11.8398f, 15.5313f, 11.6641f, 14.0f, 12.5625f)
                lineTo(12.25f, 10.8125f)
                curveTo(13.4336f, 10.3359f, 14.6836f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(7.75f, 11.0313f)
                curveTo(5.0703f, 12.957f, 3.3477f, 15.1211f, 3.2188f, 15.2813f)
                lineTo(3.0f, 15.5313f)
                lineTo(3.0f, 16.4688f)
                lineTo(3.25f, 16.75f)
                curveTo(3.5117f, 17.0469f, 9.7188f, 24.0f, 16.0f, 24.0f)
                curveTo(17.3984f, 24.0f, 18.75f, 23.7266f, 20.0f, 23.2813f)
                close()
                moveTo(8.375f, 13.0938f)
                lineTo(17.1875f, 21.9063f)
                curveTo(16.8008f, 21.9609f, 16.3984f, 22.0f, 16.0f, 22.0f)
                curveTo(15.5156f, 22.0f, 15.0195f, 21.9414f, 14.5313f, 21.8438f)
                lineTo(6.9688f, 14.25f)
                curveTo(7.3828f, 13.8711f, 7.8633f, 13.4883f, 8.375f, 13.0938f)
                close()
                moveTo(6.2188f, 14.9375f)
                lineTo(12.5313f, 21.2188f)
                curveTo(9.2891f, 19.8672f, 6.3789f, 17.1211f, 5.25f, 15.9688f)
                curveTo(5.4844f, 15.7031f, 5.8203f, 15.332f, 6.2188f, 14.9375f)
                close()
            }
        }
        .build()
        return _lowVisionSolid!!
    }

private var _lowVisionSolid: ImageVector? = null
