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

public val LineAwesomeIcons.TabletsSolid: ImageVector
    get() {
        if (_tabletsSolid != null) {
            return _tabletsSolid!!
        }
        _tabletsSolid = Builder(name = "TabletsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                curveTo(18.14f, 3.0f, 15.0f, 6.141f, 15.0f, 10.0f)
                curveTo(15.0f, 13.859f, 18.14f, 17.0f, 22.0f, 17.0f)
                curveTo(25.86f, 17.0f, 29.0f, 13.859f, 29.0f, 10.0f)
                curveTo(29.0f, 6.141f, 25.86f, 3.0f, 22.0f, 3.0f)
                close()
                moveTo(22.0f, 5.0f)
                curveTo(24.757f, 5.0f, 27.0f, 7.243f, 27.0f, 10.0f)
                curveTo(27.0f, 11.017f, 26.69f, 11.961f, 26.166f, 12.752f)
                lineTo(19.248f, 5.834f)
                curveTo(20.039f, 5.31f, 20.983f, 5.0f, 22.0f, 5.0f)
                close()
                moveTo(17.834f, 7.248f)
                lineTo(24.752f, 14.168f)
                curveTo(23.962f, 14.692f, 23.017f, 15.0f, 22.0f, 15.0f)
                curveTo(19.243f, 15.0f, 17.0f, 12.757f, 17.0f, 10.0f)
                curveTo(17.0f, 8.983f, 17.31f, 8.039f, 17.834f, 7.248f)
                close()
                moveTo(10.0f, 14.0f)
                curveTo(6.14f, 14.0f, 3.0f, 17.141f, 3.0f, 21.0f)
                curveTo(3.0f, 24.859f, 6.14f, 28.0f, 10.0f, 28.0f)
                curveTo(13.86f, 28.0f, 17.0f, 24.859f, 17.0f, 21.0f)
                curveTo(17.0f, 17.141f, 13.86f, 14.0f, 10.0f, 14.0f)
                close()
                moveTo(10.0f, 16.0f)
                curveTo(12.414f, 16.0f, 14.434f, 17.721f, 14.898f, 20.0f)
                lineTo(5.102f, 20.0f)
                curveTo(5.566f, 17.721f, 7.586f, 16.0f, 10.0f, 16.0f)
                close()
                moveTo(5.102f, 22.0f)
                lineTo(14.898f, 22.0f)
                curveTo(14.434f, 24.279f, 12.414f, 26.0f, 10.0f, 26.0f)
                curveTo(7.586f, 26.0f, 5.566f, 24.279f, 5.102f, 22.0f)
                close()
            }
        }
        .build()
        return _tabletsSolid!!
    }

private var _tabletsSolid: ImageVector? = null
