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

public val LineAwesomeIcons.BasketballBallSolid: ImageVector
    get() {
        if (_basketballBallSolid != null) {
            return _basketballBallSolid!!
        }
        _basketballBallSolid = Builder(name = "BasketballBallSolid", defaultWidth = 32.0.dp,
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
                moveTo(14.875f, 5.063f)
                curveTo(14.918f, 5.059f, 14.957f, 5.066f, 15.0f, 5.063f)
                lineTo(15.0f, 15.0f)
                lineTo(11.938f, 15.0f)
                curveTo(11.723f, 12.188f, 10.629f, 9.621f, 8.906f, 7.594f)
                curveTo(10.551f, 6.203f, 12.605f, 5.293f, 14.875f, 5.063f)
                close()
                moveTo(17.0f, 5.063f)
                curveTo(19.316f, 5.27f, 21.418f, 6.176f, 23.094f, 7.594f)
                curveTo(21.371f, 9.621f, 20.277f, 12.188f, 20.063f, 15.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(7.5f, 9.031f)
                curveTo(8.867f, 10.688f, 9.73f, 12.738f, 9.938f, 15.0f)
                lineTo(5.063f, 15.0f)
                curveTo(5.266f, 12.738f, 6.141f, 10.688f, 7.5f, 9.031f)
                close()
                moveTo(24.5f, 9.031f)
                curveTo(25.859f, 10.688f, 26.734f, 12.738f, 26.938f, 15.0f)
                lineTo(22.063f, 15.0f)
                curveTo(22.27f, 12.738f, 23.133f, 10.688f, 24.5f, 9.031f)
                close()
                moveTo(5.063f, 17.0f)
                lineTo(9.938f, 17.0f)
                curveTo(9.73f, 19.262f, 8.867f, 21.313f, 7.5f, 22.969f)
                curveTo(6.141f, 21.313f, 5.266f, 19.262f, 5.063f, 17.0f)
                close()
                moveTo(11.938f, 17.0f)
                lineTo(15.0f, 17.0f)
                lineTo(15.0f, 26.938f)
                curveTo(12.684f, 26.73f, 10.582f, 25.824f, 8.906f, 24.406f)
                curveTo(10.629f, 22.379f, 11.723f, 19.813f, 11.938f, 17.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(20.063f, 17.0f)
                curveTo(20.277f, 19.813f, 21.371f, 22.379f, 23.094f, 24.406f)
                curveTo(21.418f, 25.824f, 19.316f, 26.73f, 17.0f, 26.938f)
                close()
                moveTo(22.063f, 17.0f)
                lineTo(26.938f, 17.0f)
                curveTo(26.734f, 19.262f, 25.859f, 21.313f, 24.5f, 22.969f)
                curveTo(23.133f, 21.313f, 22.27f, 19.262f, 22.063f, 17.0f)
                close()
            }
        }
        .build()
        return _basketballBallSolid!!
    }

private var _basketballBallSolid: ImageVector? = null
