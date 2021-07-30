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

public val LineAwesomeIcons.Simplybuilt: ImageVector
    get() {
        if (_simplybuilt != null) {
            return _simplybuilt!!
        }
        _simplybuilt = Builder(name = "Simplybuilt", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                curveTo(4.9063f, 7.0f, 4.0f, 7.9063f, 4.0f, 9.0f)
                lineTo(4.0f, 23.0f)
                curveTo(4.0f, 24.0938f, 4.9063f, 25.0f, 6.0f, 25.0f)
                lineTo(26.0f, 25.0f)
                curveTo(27.0938f, 25.0f, 28.0f, 24.0938f, 28.0f, 23.0f)
                lineTo(28.0f, 9.0f)
                curveTo(28.0f, 7.9063f, 27.0938f, 7.0f, 26.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                curveTo(20.9063f, 7.0f, 20.0f, 7.9063f, 20.0f, 9.0f)
                lineTo(20.0f, 10.0f)
                lineTo(12.0f, 10.0f)
                lineTo(12.0f, 9.0f)
                curveTo(12.0f, 7.9063f, 11.0938f, 7.0f, 10.0f, 7.0f)
                close()
                moveTo(6.0f, 9.0f)
                lineTo(10.0f, 9.0f)
                lineTo(10.0f, 12.0f)
                lineTo(22.0f, 12.0f)
                lineTo(22.0f, 9.0f)
                lineTo(26.0f, 9.0f)
                lineTo(26.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(10.3438f, 14.5f, 9.0f, 15.8438f, 9.0f, 17.5f)
                curveTo(9.0f, 19.1563f, 10.3438f, 20.5f, 12.0f, 20.5f)
                curveTo(13.6563f, 20.5f, 15.0f, 19.1563f, 15.0f, 17.5f)
                curveTo(15.0f, 15.8438f, 13.6563f, 14.5f, 12.0f, 14.5f)
                close()
                moveTo(20.0f, 14.5f)
                curveTo(18.3438f, 14.5f, 17.0f, 15.8438f, 17.0f, 17.5f)
                curveTo(17.0f, 19.1563f, 18.3438f, 20.5f, 20.0f, 20.5f)
                curveTo(21.6563f, 20.5f, 23.0f, 19.1563f, 23.0f, 17.5f)
                curveTo(23.0f, 15.8438f, 21.6563f, 14.5f, 20.0f, 14.5f)
                close()
            }
        }
        .build()
        return _simplybuilt!!
    }

private var _simplybuilt: ImageVector? = null
