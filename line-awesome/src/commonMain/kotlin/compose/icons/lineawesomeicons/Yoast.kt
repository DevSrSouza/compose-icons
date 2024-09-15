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

public val LineAwesomeIcons.Yoast: ImageVector
    get() {
        if (_yoast != null) {
            return _yoast!!
        }
        _yoast = Builder(name = "Yoast", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.801f, 4.0f)
                lineTo(15.801f, 17.5f)
                lineTo(13.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                lineTo(14.0f, 19.5f)
                curveTo(14.0f, 19.5f, 14.201f, 20.1f, 14.301f, 20.6f)
                lineTo(14.301f, 21.301f)
                curveTo(14.301f, 21.501f, 14.2f, 21.8f, 14.1f, 22.0f)
                curveTo(13.5f, 23.2f, 12.4f, 23.9f, 11.1f, 23.9f)
                lineTo(11.1f, 26.9f)
                curveTo(13.8f, 26.9f, 16.2f, 25.199f, 17.1f, 22.699f)
                lineTo(24.0f, 4.0f)
                lineTo(20.801f, 4.0f)
                close()
                moveTo(9.0f, 7.0f)
                curveTo(6.8f, 7.0f, 5.0f, 8.8f, 5.0f, 11.0f)
                lineTo(5.0f, 21.0f)
                curveTo(5.0f, 23.2f, 6.8f, 25.0f, 9.0f, 25.0f)
                lineTo(9.9f, 25.0f)
                lineTo(9.9f, 24.0f)
                lineTo(9.0f, 24.0f)
                curveTo(7.3f, 24.0f, 6.0f, 22.6f, 6.0f, 21.0f)
                lineTo(6.0f, 11.0f)
                curveTo(6.0f, 9.3f, 7.3f, 8.0f, 9.0f, 8.0f)
                lineTo(18.1f, 8.0f)
                lineTo(18.5f, 7.0f)
                lineTo(9.0f, 7.0f)
                close()
                moveTo(24.0f, 7.1f)
                lineTo(23.699f, 8.1f)
                curveTo(24.999f, 8.4f, 26.0f, 9.6f, 26.0f, 11.0f)
                lineTo(26.0f, 24.0f)
                lineTo(17.699f, 24.0f)
                curveTo(17.499f, 24.3f, 17.3f, 24.7f, 17.1f, 25.0f)
                lineTo(27.0f, 25.0f)
                lineTo(27.0f, 11.0f)
                curveTo(27.0f, 9.1f, 25.7f, 7.6f, 24.0f, 7.1f)
                close()
            }
        }
        .build()
        return _yoast!!
    }

private var _yoast: ImageVector? = null
