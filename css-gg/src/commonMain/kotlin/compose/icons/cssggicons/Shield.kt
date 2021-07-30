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

public val CssGgIcons.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 15.7614f, 9.2386f, 18.0f, 12.0f, 18.0f)
                curveTo(14.7614f, 18.0f, 17.0f, 15.7614f, 17.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 16.866f, 15.866f, 20.0f, 12.0f, 20.0f)
                curveTo(8.134f, 20.0f, 5.0f, 16.866f, 5.0f, 13.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
