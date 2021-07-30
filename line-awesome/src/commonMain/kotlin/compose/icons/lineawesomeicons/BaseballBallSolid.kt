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

public val LineAwesomeIcons.BaseballBallSolid: ImageVector
    get() {
        if (_baseballBallSolid != null) {
            return _baseballBallSolid!!
        }
        _baseballBallSolid = Builder(name = "BaseballBallSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(19.0905f, 5.0f, 21.8826f, 6.2863f, 23.8828f, 8.3457f)
                curveTo(22.8463f, 9.0949f, 21.9786f, 10.0526f, 21.3203f, 11.1797f)
                lineTo(23.0391f, 12.1895f)
                curveTo(23.5679f, 11.2815f, 24.2871f, 10.5039f, 25.1445f, 9.8945f)
                curveTo(26.3154f, 11.6425f, 27.0f, 13.7428f, 27.0f, 16.0f)
                curveTo(27.0f, 18.2572f, 26.3154f, 20.3575f, 25.1445f, 22.1055f)
                curveTo(24.2771f, 21.4861f, 23.5486f, 20.6975f, 23.0098f, 19.7695f)
                lineTo(21.2793f, 20.7695f)
                curveTo(21.9377f, 21.9067f, 22.8263f, 22.8852f, 23.8828f, 23.6543f)
                curveTo(21.8826f, 25.7137f, 19.0905f, 27.0f, 16.0f, 27.0f)
                curveTo(12.9095f, 27.0f, 10.1174f, 25.7137f, 8.1172f, 23.6543f)
                curveTo(9.1737f, 22.8852f, 10.0623f, 21.9067f, 10.7207f, 20.7695f)
                lineTo(8.9902f, 19.7695f)
                curveTo(8.4514f, 20.6975f, 7.7229f, 21.4861f, 6.8555f, 22.1055f)
                curveTo(5.6846f, 20.3575f, 5.0f, 18.2572f, 5.0f, 16.0f)
                curveTo(5.0f, 13.7428f, 5.6846f, 11.6425f, 6.8555f, 9.8945f)
                curveTo(7.7129f, 10.5039f, 8.4321f, 11.2815f, 8.9609f, 12.1895f)
                lineTo(10.6797f, 11.1797f)
                curveTo(10.0214f, 10.0526f, 9.1537f, 9.0949f, 8.1172f, 8.3457f)
                curveTo(10.1174f, 6.2863f, 12.9095f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.5801f, 13.2109f)
                lineTo(9.6699f, 13.8008f)
                curveTo(9.8899f, 14.5208f, 10.0f, 15.26f, 10.0f, 16.0f)
                curveTo(10.0f, 16.73f, 9.8995f, 17.4504f, 9.6895f, 18.1504f)
                lineTo(11.5996f, 18.7207f)
                curveTo(11.8696f, 17.8407f, 12.0f, 16.92f, 12.0f, 16.0f)
                curveTo(12.0f, 15.06f, 11.8601f, 14.1209f, 11.5801f, 13.2109f)
                close()
                moveTo(20.4199f, 13.2109f)
                curveTo(20.1399f, 14.1209f, 20.0f, 15.06f, 20.0f, 16.0f)
                curveTo(20.0f, 16.92f, 20.1304f, 17.8407f, 20.4004f, 18.7207f)
                lineTo(22.3105f, 18.1504f)
                curveTo(22.1005f, 17.4504f, 22.0f, 16.73f, 22.0f, 16.0f)
                curveTo(22.0f, 15.26f, 22.1101f, 14.5208f, 22.3301f, 13.8008f)
                lineTo(20.4199f, 13.2109f)
                close()
            }
        }
        .build()
        return _baseballBallSolid!!
    }

private var _baseballBallSolid: ImageVector? = null
