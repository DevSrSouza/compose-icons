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

public val LineAwesomeIcons.XingSquare: ImageVector
    get() {
        if (_xingSquare != null) {
            return _xingSquare!!
        }
        _xingSquare = Builder(name = "XingSquare", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(19.6387f, 9.0f)
                curveTo(19.4187f, 9.0f, 19.2379f, 9.1309f, 19.0879f, 9.3809f)
                curveTo(16.1799f, 14.5169f, 14.6703f, 17.1735f, 14.5703f, 17.3535f)
                lineTo(17.459f, 22.6191f)
                curveTo(17.6f, 22.8691f, 17.7795f, 23.0f, 18.0195f, 23.0f)
                lineTo(20.0586f, 23.0f)
                curveTo(20.3286f, 23.0f, 20.4484f, 22.7805f, 20.3184f, 22.5605f)
                lineTo(17.4609f, 17.3535f)
                lineTo(17.4609f, 17.3438f)
                lineTo(21.957f, 9.4395f)
                curveTo(22.077f, 9.2095f, 21.9373f, 9.0f, 21.6973f, 9.0f)
                lineTo(19.6387f, 9.0f)
                close()
                moveTo(11.0742f, 12.0f)
                curveTo(10.8262f, 12.0f, 10.6874f, 12.1975f, 10.8164f, 12.4355f)
                lineTo(12.1855f, 14.7852f)
                lineTo(10.043f, 18.5547f)
                curveTo(9.924f, 18.7727f, 10.0628f, 19.0f, 10.3008f, 19.0f)
                lineTo(12.3242f, 19.0f)
                curveTo(12.5322f, 19.0f, 12.7191f, 18.8715f, 12.8691f, 18.6035f)
                curveTo(14.2671f, 16.1545f, 14.9918f, 14.8744f, 15.0508f, 14.7754f)
                lineTo(13.6621f, 12.377f)
                curveTo(13.5131f, 12.129f, 13.3257f, 12.0f, 13.0977f, 12.0f)
                lineTo(11.0742f, 12.0f)
                close()
            }
        }
        .build()
        return _xingSquare!!
    }

private var _xingSquare: ImageVector? = null
