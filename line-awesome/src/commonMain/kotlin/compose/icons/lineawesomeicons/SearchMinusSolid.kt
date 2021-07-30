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

public val LineAwesomeIcons.SearchMinusSolid: ImageVector
    get() {
        if (_searchMinusSolid != null) {
            return _searchMinusSolid!!
        }
        _searchMinusSolid = Builder(name = "SearchMinusSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                curveTo(13.4883f, 3.0f, 9.0f, 7.4883f, 9.0f, 13.0f)
                curveTo(9.0f, 15.3945f, 9.8398f, 17.5898f, 11.25f, 19.3125f)
                lineTo(3.2813f, 27.2813f)
                lineTo(4.7188f, 28.7188f)
                lineTo(12.6875f, 20.75f)
                curveTo(14.4102f, 22.1602f, 16.6055f, 23.0f, 19.0f, 23.0f)
                curveTo(24.5117f, 23.0f, 29.0f, 18.5117f, 29.0f, 13.0f)
                curveTo(29.0f, 7.4883f, 24.5117f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(19.0f, 5.0f)
                curveTo(23.4297f, 5.0f, 27.0f, 8.5703f, 27.0f, 13.0f)
                curveTo(27.0f, 17.4297f, 23.4297f, 21.0f, 19.0f, 21.0f)
                curveTo(14.5703f, 21.0f, 11.0f, 17.4297f, 11.0f, 13.0f)
                curveTo(11.0f, 8.5703f, 14.5703f, 5.0f, 19.0f, 5.0f)
                close()
                moveTo(15.0f, 12.0f)
                lineTo(15.0f, 14.0f)
                lineTo(23.0f, 14.0f)
                lineTo(23.0f, 12.0f)
                close()
            }
        }
        .build()
        return _searchMinusSolid!!
    }

private var _searchMinusSolid: ImageVector? = null
