package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 8.772f)
                lineTo(14.021f, 1.793f)
                curveTo(12.849f, 0.621f, 10.95f, 0.621f, 9.778f, 1.793f)
                lineTo(3.0f, 8.571f)
                verticalLineTo(23.086f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.086f)
                curveTo(10.0f, 15.981f, 10.895f, 15.086f, 12.0f, 15.086f)
                curveTo(13.105f, 15.086f, 14.0f, 15.981f, 14.0f, 17.086f)
                verticalLineTo(23.086f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.772f)
                close()
                moveTo(11.192f, 3.207f)
                lineTo(5.0f, 9.4f)
                verticalLineTo(21.086f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.086f)
                curveTo(8.0f, 14.877f, 9.791f, 13.086f, 12.0f, 13.086f)
                curveTo(14.209f, 13.086f, 16.0f, 14.877f, 16.0f, 17.086f)
                verticalLineTo(21.086f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.601f)
                lineTo(12.607f, 3.207f)
                curveTo(12.216f, 2.817f, 11.583f, 2.817f, 11.192f, 3.207f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
