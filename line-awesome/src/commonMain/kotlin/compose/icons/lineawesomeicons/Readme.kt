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

public val LineAwesomeIcons.Readme: ImageVector
    get() {
        if (_readme != null) {
            return _readme!!
        }
        _readme = Builder(name = "Readme", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.346f, 6.0f, 2.0f, 7.346f, 2.0f, 9.0f)
                lineTo(2.0f, 21.0f)
                curveTo(2.0f, 22.654f, 3.346f, 24.0f, 5.0f, 24.0f)
                lineTo(11.1836f, 23.9805f)
                curveTo(12.1736f, 23.9805f, 13.133f, 24.2908f, 13.957f, 24.8398f)
                lineTo(16.0f, 26.2012f)
                lineTo(18.043f, 24.8398f)
                curveTo(18.867f, 24.2908f, 19.8264f, 24.0f, 20.8164f, 24.0f)
                lineTo(27.0f, 24.0f)
                curveTo(28.654f, 24.0f, 30.0f, 22.654f, 30.0f, 21.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.346f, 28.654f, 6.0f, 27.0f, 6.0f)
                lineTo(20.8164f, 6.0f)
                curveTo(19.4304f, 6.0f, 18.0866f, 6.4078f, 16.9336f, 7.1758f)
                lineTo(16.0f, 7.7988f)
                lineTo(15.0664f, 7.1758f)
                curveTo(13.9124f, 6.4068f, 12.5706f, 6.0f, 11.1836f, 6.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(11.1836f, 8.0f)
                curveTo(12.1736f, 8.0f, 13.133f, 8.2908f, 13.957f, 8.8398f)
                lineTo(16.0f, 10.2012f)
                lineTo(18.043f, 8.8398f)
                curveTo(18.867f, 8.2908f, 19.8264f, 8.0f, 20.8164f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.552f, 8.0f, 28.0f, 8.449f, 28.0f, 9.0f)
                lineTo(28.0f, 21.0f)
                curveTo(28.0f, 21.551f, 27.552f, 22.0f, 27.0f, 22.0f)
                lineTo(20.8164f, 22.0f)
                curveTo(19.4304f, 22.0f, 18.0866f, 22.4078f, 16.9336f, 23.1758f)
                lineTo(16.0f, 23.7988f)
                lineTo(15.0664f, 23.1758f)
                curveTo(13.9124f, 22.4068f, 12.5706f, 22.0f, 11.1836f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveTo(4.448f, 22.0f, 4.0f, 21.551f, 4.0f, 21.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.449f, 4.448f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(6.0f, 12.0f)
                lineTo(6.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                lineTo(14.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(18.0f, 14.0f)
                lineTo(26.0f, 14.0f)
                lineTo(26.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(6.0f, 18.0f)
                lineTo(14.0f, 18.0f)
                lineTo(14.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                close()
                moveTo(18.0f, 16.0f)
                lineTo(18.0f, 18.0f)
                lineTo(26.0f, 18.0f)
                lineTo(26.0f, 16.0f)
                lineTo(18.0f, 16.0f)
                close()
            }
        }
        .build()
        return _readme!!
    }

private var _readme: ImageVector? = null
