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
                curveTo(11.3555f, 2.0f, 10.0f, 3.3555f, 10.0f, 5.0f)
                lineTo(10.0f, 16.8125f)
                lineTo(9.3438f, 16.125f)
                lineTo(9.0938f, 15.9063f)
                curveTo(7.9414f, 14.7539f, 6.0586f, 14.7539f, 4.9063f, 15.9063f)
                curveTo(3.7539f, 17.0586f, 3.7539f, 18.9414f, 4.9063f, 20.0938f)
                lineTo(4.9063f, 20.125f)
                lineTo(13.0938f, 28.2188f)
                lineTo(13.1563f, 28.25f)
                lineTo(13.1875f, 28.3125f)
                curveTo(14.5352f, 29.3242f, 16.2539f, 30.0f, 18.1875f, 30.0f)
                lineTo(19.9063f, 30.0f)
                curveTo(24.4414f, 30.0f, 28.0938f, 26.3477f, 28.0938f, 21.8125f)
                lineTo(28.0938f, 14.0f)
                curveTo(28.0938f, 12.3555f, 26.7383f, 11.0f, 25.0938f, 11.0f)
                curveTo(24.668f, 11.0f, 24.2734f, 11.1172f, 23.9063f, 11.2813f)
                curveTo(23.5781f, 9.9805f, 22.3945f, 9.0f, 21.0f, 9.0f)
                curveTo(20.2344f, 9.0f, 19.5313f, 9.3008f, 19.0f, 9.7813f)
                curveTo(18.4688f, 9.3008f, 17.7656f, 9.0f, 17.0f, 9.0f)
                curveTo(16.6484f, 9.0f, 16.3164f, 9.0742f, 16.0f, 9.1875f)
                lineTo(16.0f, 5.0f)
                curveTo(16.0f, 3.3555f, 14.6445f, 2.0f, 13.0f, 2.0f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(13.5547f, 4.0f, 14.0f, 4.4453f, 14.0f, 5.0f)
                lineTo(14.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                lineTo(16.0f, 12.0f)
                curveTo(16.0f, 11.4453f, 16.4453f, 11.0f, 17.0f, 11.0f)
                curveTo(17.5547f, 11.0f, 18.0f, 11.4453f, 18.0f, 12.0f)
                lineTo(18.0f, 16.0f)
                lineTo(20.0f, 16.0f)
                lineTo(20.0f, 12.0f)
                curveTo(20.0f, 11.4453f, 20.4453f, 11.0f, 21.0f, 11.0f)
                curveTo(21.5547f, 11.0f, 22.0f, 11.4453f, 22.0f, 12.0f)
                lineTo(22.0f, 16.0f)
                lineTo(24.0938f, 16.0f)
                lineTo(24.0938f, 14.0f)
                curveTo(24.0938f, 13.4453f, 24.5391f, 13.0f, 25.0938f, 13.0f)
                curveTo(25.6484f, 13.0f, 26.0938f, 13.4453f, 26.0938f, 14.0f)
                lineTo(26.0938f, 21.8125f)
                curveTo(26.0938f, 25.2773f, 23.3711f, 28.0f, 19.9063f, 28.0f)
                lineTo(18.1875f, 28.0f)
                curveTo(16.7227f, 28.0f, 15.457f, 27.4766f, 14.4063f, 26.6875f)
                lineTo(6.3125f, 18.6875f)
                curveTo(5.8672f, 18.2422f, 5.8672f, 17.7578f, 6.3125f, 17.3125f)
                curveTo(6.7578f, 16.8672f, 7.2422f, 16.8672f, 7.6875f, 17.3125f)
                lineTo(12.0f, 21.625f)
                lineTo(12.0f, 5.0f)
                curveTo(12.0f, 4.4453f, 12.4453f, 4.0f, 13.0f, 4.0f)
                close()
            }
        }
        .build()
        return _handPointer!!
    }

private var _handPointer: ImageVector? = null
