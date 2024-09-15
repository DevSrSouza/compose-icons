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
                curveTo(19.091f, 5.0f, 21.883f, 6.286f, 23.883f, 8.346f)
                curveTo(22.846f, 9.095f, 21.979f, 10.053f, 21.32f, 11.18f)
                lineTo(23.039f, 12.189f)
                curveTo(23.568f, 11.281f, 24.287f, 10.504f, 25.145f, 9.895f)
                curveTo(26.315f, 11.643f, 27.0f, 13.743f, 27.0f, 16.0f)
                curveTo(27.0f, 18.257f, 26.315f, 20.357f, 25.145f, 22.105f)
                curveTo(24.277f, 21.486f, 23.549f, 20.697f, 23.01f, 19.77f)
                lineTo(21.279f, 20.77f)
                curveTo(21.938f, 21.907f, 22.826f, 22.885f, 23.883f, 23.654f)
                curveTo(21.883f, 25.714f, 19.091f, 27.0f, 16.0f, 27.0f)
                curveTo(12.909f, 27.0f, 10.117f, 25.714f, 8.117f, 23.654f)
                curveTo(9.174f, 22.885f, 10.062f, 21.907f, 10.721f, 20.77f)
                lineTo(8.99f, 19.77f)
                curveTo(8.451f, 20.697f, 7.723f, 21.486f, 6.855f, 22.105f)
                curveTo(5.685f, 20.357f, 5.0f, 18.257f, 5.0f, 16.0f)
                curveTo(5.0f, 13.743f, 5.685f, 11.643f, 6.855f, 9.895f)
                curveTo(7.713f, 10.504f, 8.432f, 11.281f, 8.961f, 12.189f)
                lineTo(10.68f, 11.18f)
                curveTo(10.021f, 10.053f, 9.154f, 9.095f, 8.117f, 8.346f)
                curveTo(10.117f, 6.286f, 12.909f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.58f, 13.211f)
                lineTo(9.67f, 13.801f)
                curveTo(9.89f, 14.521f, 10.0f, 15.26f, 10.0f, 16.0f)
                curveTo(10.0f, 16.73f, 9.899f, 17.45f, 9.689f, 18.15f)
                lineTo(11.6f, 18.721f)
                curveTo(11.87f, 17.841f, 12.0f, 16.92f, 12.0f, 16.0f)
                curveTo(12.0f, 15.06f, 11.86f, 14.121f, 11.58f, 13.211f)
                close()
                moveTo(20.42f, 13.211f)
                curveTo(20.14f, 14.121f, 20.0f, 15.06f, 20.0f, 16.0f)
                curveTo(20.0f, 16.92f, 20.13f, 17.841f, 20.4f, 18.721f)
                lineTo(22.311f, 18.15f)
                curveTo(22.101f, 17.45f, 22.0f, 16.73f, 22.0f, 16.0f)
                curveTo(22.0f, 15.26f, 22.11f, 14.521f, 22.33f, 13.801f)
                lineTo(20.42f, 13.211f)
                close()
            }
        }
        .build()
        return _baseballBallSolid!!
    }

private var _baseballBallSolid: ImageVector? = null
