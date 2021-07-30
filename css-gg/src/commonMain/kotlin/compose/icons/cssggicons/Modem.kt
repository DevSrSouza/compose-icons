package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Modem: ImageVector
    get() {
        if (_modem != null) {
            return _modem!!
        }
        _modem = Builder(name = "Modem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.6341f)
                curveTo(18.0f, 17.1864f, 17.5523f, 17.6341f, 17.0f, 17.6341f)
                curveTo(16.4477f, 17.6341f, 16.0f, 17.1864f, 16.0f, 16.6341f)
                curveTo(16.0f, 16.0819f, 16.4477f, 15.6341f, 17.0f, 15.6341f)
                curveTo(17.5523f, 15.6341f, 18.0f, 16.0819f, 18.0f, 16.6341f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.866f, 3.1341f)
                curveTo(5.3877f, 2.858f, 4.7761f, 3.0219f, 4.5f, 3.5002f)
                curveTo(4.2239f, 3.9785f, 4.3877f, 4.5901f, 4.866f, 4.8662f)
                lineTo(18.3205f, 12.6341f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.6341f)
                curveTo(2.0f, 18.8433f, 3.7909f, 20.6341f, 6.0f, 20.6341f)
                horizontalLineTo(18.0f)
                curveTo(20.2091f, 20.6341f, 22.0f, 18.8433f, 22.0f, 16.6341f)
                verticalLineTo(12.6341f)
                lineTo(5.866f, 3.1341f)
                close()
                moveTo(20.0f, 14.6341f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.6341f)
                curveTo(4.0f, 17.7387f, 4.8954f, 18.6341f, 6.0f, 18.6341f)
                horizontalLineTo(18.0f)
                curveTo(19.1046f, 18.6341f, 20.0f, 17.7387f, 20.0f, 16.6341f)
                verticalLineTo(14.6341f)
                close()
            }
        }
        .build()
        return _modem!!
    }

private var _modem: ImageVector? = null
