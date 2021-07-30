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

public val LineAwesomeIcons.BalanceScaleLeftSolid: ImageVector
    get() {
        if (_balanceScaleLeftSolid != null) {
            return _balanceScaleLeftSolid!!
        }
        _balanceScaleLeftSolid = Builder(name = "BalanceScaleLeftSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5234f, 5.1094f)
                lineTo(18.2813f, 7.0762f)
                curveTo(17.7305f, 6.4241f, 16.9182f, 6.0f, 16.0f, 6.0f)
                curveTo(14.346f, 6.0f, 13.0f, 7.346f, 13.0f, 9.0f)
                curveTo(13.0f, 9.0214f, 13.0054f, 9.0412f, 13.0059f, 9.0625f)
                lineTo(8.0f, 11.0f)
                lineTo(3.0f, 19.75f)
                lineTo(3.0f, 20.0156f)
                curveTo(3.0f, 22.7716f, 5.243f, 25.0f, 8.0f, 25.0f)
                curveTo(10.757f, 25.0f, 13.0f, 22.7716f, 13.0f, 20.0156f)
                lineTo(13.0f, 19.75f)
                lineTo(9.0098f, 12.7656f)
                lineTo(13.7246f, 10.9316f)
                curveTo(14.0632f, 11.3299f, 14.4983f, 11.6374f, 15.0f, 11.8164f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(21.0f, 26.0f)
                lineTo(21.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 11.8164f)
                curveTo(18.1613f, 11.4021f, 19.0f, 10.3016f, 19.0f, 9.0f)
                curveTo(19.0f, 8.9813f, 18.9945f, 8.964f, 18.9941f, 8.9453f)
                lineTo(23.2109f, 7.3633f)
                lineTo(19.0f, 14.7344f)
                lineTo(19.0f, 15.0f)
                curveTo(19.0f, 17.757f, 21.243f, 20.0f, 24.0f, 20.0f)
                curveTo(26.757f, 20.0f, 29.0f, 17.757f, 29.0f, 15.0f)
                lineTo(29.0f, 14.7344f)
                lineTo(24.5098f, 6.877f)
                lineTo(23.5234f, 5.1094f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(16.552f, 8.0f, 17.0f, 8.449f, 17.0f, 9.0f)
                curveTo(17.0f, 9.551f, 16.552f, 10.0f, 16.0f, 10.0f)
                curveTo(15.448f, 10.0f, 15.0f, 9.551f, 15.0f, 9.0f)
                curveTo(15.0f, 8.449f, 15.448f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(24.0f, 10.0156f)
                lineTo(26.2773f, 14.0f)
                lineTo(21.7227f, 14.0f)
                lineTo(24.0f, 10.0156f)
                close()
                moveTo(8.0f, 15.0313f)
                lineTo(10.2676f, 19.0f)
                lineTo(5.7324f, 19.0f)
                lineTo(8.0f, 15.0313f)
                close()
                moveTo(21.1855f, 16.0f)
                lineTo(26.8145f, 16.0f)
                curveTo(26.4002f, 17.1616f, 25.3022f, 18.0f, 24.0f, 18.0f)
                curveTo(22.6978f, 18.0f, 21.5998f, 17.1616f, 21.1855f, 16.0f)
                close()
                moveTo(5.1797f, 21.0f)
                lineTo(10.8203f, 21.0f)
                curveTo(10.41f, 22.169f, 9.3074f, 23.0156f, 8.0f, 23.0156f)
                curveTo(6.6926f, 23.0156f, 5.59f, 22.169f, 5.1797f, 21.0f)
                close()
            }
        }
        .build()
        return _balanceScaleLeftSolid!!
    }

private var _balanceScaleLeftSolid: ImageVector? = null
