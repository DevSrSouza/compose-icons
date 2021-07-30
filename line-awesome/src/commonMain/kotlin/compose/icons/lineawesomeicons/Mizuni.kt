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

public val LineAwesomeIcons.Mizuni: ImageVector
    get() {
        if (_mizuni != null) {
            return _mizuni!!
        }
        _mizuni = Builder(name = "Mizuni", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.5f, 10.0f)
                curveTo(10.67f, 10.0f, 10.0f, 10.67f, 10.0f, 11.5f)
                lineTo(10.0f, 22.0f)
                curveTo(10.79f, 21.22f, 11.82f, 20.5892f, 13.0f, 20.1992f)
                lineTo(13.0f, 11.5f)
                curveTo(13.0f, 10.67f, 12.33f, 10.0f, 11.5f, 10.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(15.17f, 10.0f, 14.5f, 10.67f, 14.5f, 11.5f)
                lineTo(14.5f, 19.8301f)
                curveTo(14.99f, 19.7501f, 15.4898f, 19.7109f, 16.0098f, 19.7109f)
                curveTo(16.5198f, 19.7109f, 17.01f, 19.7501f, 17.5f, 19.8301f)
                lineTo(17.5f, 11.5f)
                curveTo(17.5f, 10.67f, 16.83f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(20.5f, 10.0f)
                curveTo(19.67f, 10.0f, 19.0f, 10.67f, 19.0f, 11.5f)
                lineTo(19.0f, 20.1895f)
                curveTo(20.18f, 20.5895f, 21.21f, 21.2102f, 22.0f, 21.9902f)
                lineTo(22.0f, 11.5f)
                curveTo(22.0f, 10.67f, 21.33f, 10.0f, 20.5f, 10.0f)
                close()
            }
        }
        .build()
        return _mizuni!!
    }

private var _mizuni: ImageVector? = null
