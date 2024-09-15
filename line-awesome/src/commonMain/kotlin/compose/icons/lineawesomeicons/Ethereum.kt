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

public val LineAwesomeIcons.Ethereum: ImageVector
    get() {
        if (_ethereum != null) {
            return _ethereum!!
        }
        _ethereum = Builder(name = "Ethereum", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.953f, 3.0f)
                lineTo(6.93f, 15.553f)
                lineTo(16.004f, 20.014f)
                lineTo(24.934f, 15.549f)
                lineTo(17.053f, 3.0f)
                lineTo(16.5f, 3.0f)
                lineTo(14.953f, 3.0f)
                close()
                moveTo(15.0f, 6.637f)
                lineTo(15.0f, 10.988f)
                lineTo(11.086f, 12.764f)
                lineTo(15.0f, 6.637f)
                close()
                moveTo(17.0f, 6.678f)
                lineTo(20.818f, 12.758f)
                lineTo(17.0f, 11.004f)
                lineTo(17.0f, 6.678f)
                close()
                moveTo(15.0f, 13.184f)
                lineTo(15.0f, 17.291f)
                lineTo(10.656f, 15.154f)
                lineTo(15.0f, 13.184f)
                close()
                moveTo(17.0f, 13.207f)
                lineTo(21.246f, 15.156f)
                lineTo(17.0f, 17.279f)
                lineTo(17.0f, 13.207f)
                close()
                moveTo(7.0f, 17.512f)
                lineTo(7.0f, 20.031f)
                lineTo(14.928f, 28.875f)
                lineTo(16.0f, 28.875f)
                lineTo(17.072f, 28.875f)
                lineTo(25.0f, 20.031f)
                lineTo(25.0f, 17.512f)
                lineTo(16.0f, 22.125f)
                lineTo(7.0f, 17.512f)
                close()
                moveTo(11.521f, 22.078f)
                lineTo(15.0f, 23.861f)
                lineTo(15.0f, 25.957f)
                lineTo(11.521f, 22.078f)
                close()
                moveTo(20.479f, 22.078f)
                lineTo(17.0f, 25.957f)
                lineTo(17.0f, 23.861f)
                lineTo(20.479f, 22.078f)
                close()
            }
        }
        .build()
        return _ethereum!!
    }

private var _ethereum: ImageVector? = null
