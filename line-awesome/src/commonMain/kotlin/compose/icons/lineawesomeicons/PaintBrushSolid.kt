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

public val LineAwesomeIcons.PaintBrushSolid: ImageVector
    get() {
        if (_paintBrushSolid != null) {
            return _paintBrushSolid!!
        }
        _paintBrushSolid = Builder(name = "PaintBrushSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.8125f, 4.0313f)
                curveTo(23.9766f, 4.0313f, 23.1328f, 4.3672f, 22.5f, 5.0f)
                lineTo(9.8125f, 17.5f)
                lineTo(9.1875f, 18.0938f)
                curveTo(8.4375f, 18.2344f, 7.7227f, 18.6016f, 7.1563f, 19.2188f)
                curveTo(6.3242f, 20.1289f, 6.1602f, 21.2422f, 5.8438f, 22.4375f)
                curveTo(5.5273f, 23.6328f, 5.125f, 24.9648f, 4.1563f, 26.4375f)
                lineTo(3.1563f, 28.0f)
                lineTo(5.0f, 28.0f)
                curveTo(8.9141f, 28.0f, 11.4961f, 26.1289f, 12.8125f, 24.8125f)
                lineTo(12.8438f, 24.7813f)
                curveTo(13.4453f, 24.1641f, 13.7813f, 23.3867f, 13.9063f, 22.5938f)
                lineTo(14.4063f, 22.125f)
                lineTo(27.0938f, 9.625f)
                lineTo(27.0938f, 9.5938f)
                curveTo(28.3594f, 8.3281f, 28.3594f, 6.2656f, 27.0938f, 5.0f)
                curveTo(26.4609f, 4.3672f, 25.6484f, 4.0313f, 24.8125f, 4.0313f)
                close()
                moveTo(24.8125f, 6.0f)
                curveTo(25.125f, 6.0f, 25.4219f, 6.1406f, 25.6875f, 6.4063f)
                curveTo(26.2227f, 6.9414f, 26.2227f, 7.6523f, 25.6875f, 8.1875f)
                lineTo(16.6563f, 17.125f)
                lineTo(14.8438f, 15.3125f)
                lineTo(23.9063f, 6.4063f)
                curveTo(24.1719f, 6.1406f, 24.5f, 6.0f, 24.8125f, 6.0f)
                close()
                moveTo(13.4063f, 16.7188f)
                lineTo(15.2188f, 18.5313f)
                lineTo(13.7188f, 20.0f)
                lineTo(11.9063f, 18.1875f)
                close()
                moveTo(9.9688f, 20.0313f)
                curveTo(10.4727f, 20.0469f, 11.0195f, 20.2422f, 11.4375f, 20.625f)
                curveTo(12.2148f, 21.3359f, 12.2344f, 22.5781f, 11.4063f, 23.4063f)
                curveTo(10.5391f, 24.2734f, 9.0f, 25.3906f, 6.75f, 25.8125f)
                curveTo(7.2305f, 24.7617f, 7.5664f, 23.7813f, 7.7813f, 22.9688f)
                curveTo(8.1133f, 21.7148f, 8.3594f, 20.8555f, 8.625f, 20.5625f)
                curveTo(8.9727f, 20.1836f, 9.4648f, 20.0156f, 9.9688f, 20.0313f)
                close()
            }
        }
        .build()
        return _paintBrushSolid!!
    }

private var _paintBrushSolid: ImageVector? = null
