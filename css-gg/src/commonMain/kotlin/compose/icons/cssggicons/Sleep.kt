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

public val CssGgIcons.Sleep: ImageVector
    get() {
        if (_sleep != null) {
            return _sleep!!
        }
        _sleep = Builder(name = "Sleep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                close()
                moveTo(16.899f, 17.0f)
                curveTo(15.6364f, 18.2372f, 13.9073f, 19.0f, 12.0f, 19.0f)
                curveTo(10.0927f, 19.0f, 8.3636f, 18.2372f, 7.101f, 17.0f)
                horizontalLineTo(16.899f)
                close()
                moveTo(18.3264f, 15.0f)
                curveTo(18.7583f, 14.0907f, 19.0f, 13.0736f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                curveTo(5.0f, 13.0736f, 5.2417f, 14.0907f, 5.6736f, 15.0f)
                horizontalLineTo(18.3264f)
                close()
            }
        }
        .build()
        return _sleep!!
    }

private var _sleep: ImageVector? = null
