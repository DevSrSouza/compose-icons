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

public val LineAwesomeIcons.Odnoklassniki: ImageVector
    get() {
        if (_odnoklassniki != null) {
            return _odnoklassniki!!
        }
        _odnoklassniki = Builder(name = "Odnoklassniki", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.3281f)
                curveTo(16.2969f, 8.3281f, 17.3516f, 9.3828f, 17.3516f, 10.6797f)
                curveTo(17.3516f, 11.9727f, 16.2969f, 13.0273f, 15.0f, 13.0273f)
                curveTo(13.7031f, 13.0273f, 12.6484f, 11.9727f, 12.6484f, 10.6797f)
                curveTo(12.6484f, 9.3828f, 13.7031f, 8.3281f, 15.0f, 8.3281f)
                close()
                moveTo(15.0f, 16.3555f)
                curveTo(18.1328f, 16.3555f, 20.6797f, 13.8086f, 20.6797f, 10.6797f)
                curveTo(20.6797f, 7.5469f, 18.1328f, 5.0f, 15.0f, 5.0f)
                curveTo(11.8672f, 5.0f, 9.3242f, 7.5469f, 9.3242f, 10.6797f)
                curveTo(9.3242f, 13.8086f, 11.8672f, 16.3555f, 15.0f, 16.3555f)
                close()
                moveTo(17.2969f, 20.9883f)
                curveTo(18.4531f, 20.7227f, 19.5664f, 20.2656f, 20.5938f, 19.6211f)
                curveTo(21.3711f, 19.1328f, 21.6055f, 18.1055f, 21.1172f, 17.3281f)
                curveTo(20.625f, 16.5469f, 19.6016f, 16.3125f, 18.8203f, 16.8047f)
                curveTo(16.4961f, 18.2656f, 13.5039f, 18.2656f, 11.1758f, 16.8047f)
                curveTo(10.3984f, 16.3125f, 9.3711f, 16.5469f, 8.8828f, 17.3281f)
                curveTo(8.3945f, 18.1055f, 8.6289f, 19.1328f, 9.4063f, 19.6211f)
                curveTo(10.4336f, 20.2656f, 11.5469f, 20.7227f, 12.7031f, 20.9883f)
                lineTo(9.5273f, 24.1602f)
                curveTo(8.8789f, 24.8086f, 8.8789f, 25.8633f, 9.5273f, 26.5117f)
                curveTo(9.8555f, 26.8359f, 10.2773f, 27.0f, 10.7031f, 27.0f)
                curveTo(11.1289f, 27.0f, 11.5547f, 26.8359f, 11.8828f, 26.5117f)
                lineTo(15.0f, 23.3945f)
                lineTo(18.1211f, 26.5117f)
                curveTo(18.7695f, 27.1641f, 19.8203f, 27.1641f, 20.4727f, 26.5117f)
                curveTo(21.1211f, 25.8633f, 21.1211f, 24.8086f, 20.4727f, 24.1602f)
                curveTo(20.4727f, 24.1602f, 17.2969f, 20.9883f, 17.2969f, 20.9883f)
                close()
            }
        }
        .build()
        return _odnoklassniki!!
    }

private var _odnoklassniki: ImageVector? = null
