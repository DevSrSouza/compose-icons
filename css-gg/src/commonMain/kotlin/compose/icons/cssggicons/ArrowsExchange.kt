package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.ArrowsExchange: ImageVector
    get() {
        if (_arrowsExchange != null) {
            return _arrowsExchange!!
        }
        _arrowsExchange = Builder(name = "ArrowsExchange", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.993f, 12.984f)
                curveTo(4.44f, 12.984f, 3.993f, 13.432f, 3.993f, 13.984f)
                curveTo(3.993f, 14.342f, 4.18f, 14.655f, 4.462f, 14.832f)
                lineTo(7.15f, 17.52f)
                curveTo(7.54f, 17.91f, 8.173f, 17.91f, 8.564f, 17.52f)
                curveTo(8.954f, 17.129f, 8.954f, 16.496f, 8.564f, 16.105f)
                lineTo(7.443f, 14.984f)
                horizontalLineTo(14.993f)
                curveTo(15.545f, 14.984f, 15.993f, 14.536f, 15.993f, 13.984f)
                curveTo(15.993f, 13.432f, 15.545f, 12.984f, 14.993f, 12.984f)
                lineTo(5.042f, 12.984f)
                curveTo(5.033f, 12.984f, 5.024f, 12.984f, 5.015f, 12.984f)
                horizontalLineTo(4.993f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.007f, 11.016f)
                curveTo(19.56f, 11.016f, 20.007f, 10.568f, 20.007f, 10.016f)
                curveTo(20.007f, 9.658f, 19.82f, 9.345f, 19.538f, 9.168f)
                lineTo(16.85f, 6.48f)
                curveTo(16.46f, 6.09f, 15.827f, 6.09f, 15.436f, 6.48f)
                curveTo(15.046f, 6.871f, 15.046f, 7.504f, 15.436f, 7.895f)
                lineTo(16.557f, 9.016f)
                lineTo(9.007f, 9.016f)
                curveTo(8.455f, 9.016f, 8.007f, 9.464f, 8.007f, 10.016f)
                curveTo(8.007f, 10.568f, 8.455f, 11.016f, 9.007f, 11.016f)
                lineTo(18.958f, 11.016f)
                curveTo(18.967f, 11.016f, 18.976f, 11.016f, 18.985f, 11.016f)
                horizontalLineTo(19.007f)
                close()
            }
        }
        .build()
        return _arrowsExchange!!
    }

private var _arrowsExchange: ImageVector? = null
