package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Performance: ImageVector
    get() {
        if (_performance != null) {
            return _performance!!
        }
        _performance = Builder(name = "Performance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 9.0f)
                verticalLineTo(13.1707f)
                curveTo(9.8348f, 13.5825f, 9.0f, 14.6938f, 9.0f, 16.0f)
                curveTo(9.0f, 17.6569f, 10.3431f, 19.0f, 12.0f, 19.0f)
                curveTo(13.6569f, 19.0f, 15.0f, 17.6569f, 15.0f, 16.0f)
                curveTo(15.0f, 14.6938f, 14.1652f, 13.5825f, 13.0f, 13.1707f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 15.4477f, 11.4477f, 15.0f, 12.0f, 15.0f)
                curveTo(12.5523f, 15.0f, 13.0f, 15.4477f, 13.0f, 16.0f)
                curveTo(13.0f, 16.5523f, 12.5523f, 17.0f, 12.0f, 17.0f)
                curveTo(11.4477f, 17.0f, 11.0f, 16.5523f, 11.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(15.866f, 5.0f, 19.0f, 8.134f, 19.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 9.2386f, 14.7614f, 7.0f, 12.0f, 7.0f)
                curveTo(9.2386f, 7.0f, 7.0f, 9.2386f, 7.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 8.134f, 8.134f, 5.0f, 12.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 23.0f)
                curveTo(18.0751f, 23.0f, 23.0f, 18.0751f, 23.0f, 12.0f)
                curveTo(23.0f, 5.9249f, 18.0751f, 1.0f, 12.0f, 1.0f)
                curveTo(5.9249f, 1.0f, 1.0f, 5.9249f, 1.0f, 12.0f)
                curveTo(1.0f, 18.0751f, 5.9249f, 23.0f, 12.0f, 23.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveTo(16.9706f, 21.0f, 21.0f, 16.9706f, 21.0f, 12.0f)
                curveTo(21.0f, 7.0294f, 16.9706f, 3.0f, 12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 7.0294f, 3.0f, 12.0f)
                curveTo(3.0f, 16.9706f, 7.0294f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _performance!!
    }

private var _performance: ImageVector? = null
