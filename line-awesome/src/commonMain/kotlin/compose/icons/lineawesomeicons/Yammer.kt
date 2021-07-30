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

public val LineAwesomeIcons.Yammer: ImageVector
    get() {
        if (_yammer != null) {
            return _yammer!!
        }
        _yammer = Builder(name = "Yammer", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3613f, 6.041f)
                curveTo(6.2066f, 6.0316f, 6.0504f, 6.0496f, 5.9004f, 6.0996f)
                curveTo(5.2004f, 6.2996f, 4.9f, 6.9996f, 5.0f, 7.5996f)
                lineTo(10.1992f, 20.5996f)
                curveTo(9.4992f, 22.6996f, 8.7992f, 23.6992f, 7.1992f, 23.6992f)
                lineTo(6.5f, 23.6992f)
                curveTo(6.0f, 23.6992f, 5.5004f, 24.0004f, 5.4004f, 24.4004f)
                curveTo(5.3004f, 25.0004f, 5.5992f, 25.6008f, 6.1992f, 25.8008f)
                curveTo(6.5992f, 25.9008f, 7.0004f, 25.9004f, 7.4004f, 25.9004f)
                curveTo(10.4004f, 25.9004f, 11.3008f, 24.3008f, 12.3008f, 21.8008f)
                lineTo(18.0f, 7.5996f)
                curveTo(18.1f, 6.9996f, 17.8008f, 6.3992f, 17.3008f, 6.1992f)
                curveTo(16.7008f, 5.9992f, 15.8992f, 6.3004f, 15.6992f, 6.9004f)
                lineTo(11.6992f, 17.5f)
                lineTo(11.5996f, 17.5f)
                lineTo(7.5f, 6.8008f)
                curveTo(7.275f, 6.3508f, 6.8254f, 6.0691f, 6.3613f, 6.041f)
                close()
                moveTo(24.8145f, 8.0645f)
                curveTo(24.7066f, 8.0629f, 24.6f, 8.0746f, 24.5f, 8.0996f)
                curveTo(24.5f, 8.1996f, 24.4004f, 8.1992f, 24.4004f, 8.1992f)
                curveTo(23.7004f, 8.5992f, 18.4996f, 12.1996f, 19.0996f, 12.5996f)
                curveTo(19.6996f, 12.9996f, 23.1996f, 11.3996f, 25.5996f, 10.0996f)
                curveTo(26.0996f, 9.6996f, 26.1992f, 8.9f, 25.6992f, 8.5f)
                curveTo(25.4742f, 8.2f, 25.1379f, 8.0691f, 24.8145f, 8.0645f)
                close()
                moveTo(27.9004f, 14.9004f)
                curveTo(27.0004f, 14.9004f, 20.7f, 15.5992f, 21.0f, 16.1992f)
                curveTo(21.3f, 16.7992f, 25.2f, 17.0996f, 28.0f, 17.0996f)
                curveTo(28.7f, 16.9996f, 29.1f, 16.4008f, 29.0f, 15.8008f)
                curveTo(28.9f, 15.3008f, 28.4996f, 15.0004f, 28.0996f, 14.9004f)
                lineTo(27.9004f, 14.9004f)
                close()
                moveTo(19.5527f, 19.4395f)
                curveTo(19.3949f, 19.4314f, 19.2742f, 19.45f, 19.1992f, 19.5f)
                curveTo(18.5992f, 19.9f, 23.7f, 23.5004f, 24.5f, 23.9004f)
                curveTo(24.5f, 24.0004f, 24.5996f, 24.0f, 24.5996f, 24.0f)
                curveTo(25.1996f, 24.2f, 25.8f, 23.7992f, 26.0f, 23.1992f)
                curveTo(26.1f, 22.6992f, 25.8992f, 22.2f, 25.6992f, 22.0f)
                curveTo(23.5992f, 20.8625f, 20.6574f, 19.4955f, 19.5527f, 19.4395f)
                close()
            }
        }
        .build()
        return _yammer!!
    }

private var _yammer: ImageVector? = null
