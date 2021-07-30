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

public val CssGgIcons.ArrowDownO: ImageVector
    get() {
        if (_arrowDownO != null) {
            return _arrowDownO!!
        }
        _arrowDownO = Builder(name = "ArrowDownO", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8285f, 12.0259f)
                lineTo(16.2427f, 13.4402f)
                lineTo(12.0f, 17.6828f)
                lineTo(7.7574f, 13.4402f)
                lineTo(9.1716f, 12.0259f)
                lineTo(11.0f, 13.8544f)
                verticalLineTo(6.3172f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.8544f)
                lineTo(14.8285f, 12.0259f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.7782f, 19.7782f)
                curveTo(15.4824f, 24.0739f, 8.5176f, 24.0739f, 4.2218f, 19.7782f)
                curveTo(-0.0739f, 15.4824f, -0.0739f, 8.5176f, 4.2218f, 4.2218f)
                curveTo(8.5176f, -0.0739f, 15.4824f, -0.0739f, 19.7782f, 4.2218f)
                curveTo(24.0739f, 8.5176f, 24.0739f, 15.4824f, 19.7782f, 19.7782f)
                close()
                moveTo(18.364f, 18.364f)
                curveTo(14.8492f, 21.8787f, 9.1508f, 21.8787f, 5.636f, 18.364f)
                curveTo(2.1213f, 14.8492f, 2.1213f, 9.1508f, 5.636f, 5.636f)
                curveTo(9.1508f, 2.1213f, 14.8492f, 2.1213f, 18.364f, 5.636f)
                curveTo(21.8787f, 9.1508f, 21.8787f, 14.8492f, 18.364f, 18.364f)
                close()
            }
        }
        .build()
        return _arrowDownO!!
    }

private var _arrowDownO: ImageVector? = null
