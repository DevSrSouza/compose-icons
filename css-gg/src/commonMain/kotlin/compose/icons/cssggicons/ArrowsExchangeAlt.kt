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

public val CssGgIcons.ArrowsExchangeAlt: ImageVector
    get() {
        if (_arrowsExchangeAlt != null) {
            return _arrowsExchangeAlt!!
        }
        _arrowsExchangeAlt = Builder(name = "ArrowsExchangeAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.993f, 11.016f)
                curveTo(4.44f, 11.016f, 3.993f, 10.568f, 3.993f, 10.016f)
                curveTo(3.993f, 9.658f, 4.18f, 9.345f, 4.462f, 9.168f)
                lineTo(7.15f, 6.48f)
                curveTo(7.54f, 6.09f, 8.173f, 6.09f, 8.564f, 6.48f)
                curveTo(8.954f, 6.871f, 8.954f, 7.504f, 8.564f, 7.895f)
                lineTo(7.443f, 9.016f)
                lineTo(14.993f, 9.016f)
                curveTo(15.545f, 9.016f, 15.993f, 9.464f, 15.993f, 10.016f)
                curveTo(15.993f, 10.568f, 15.545f, 11.016f, 14.993f, 11.016f)
                lineTo(5.042f, 11.016f)
                curveTo(5.033f, 11.016f, 5.024f, 11.016f, 5.015f, 11.016f)
                horizontalLineTo(4.993f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.007f, 12.984f)
                curveTo(19.56f, 12.984f, 20.007f, 13.432f, 20.007f, 13.984f)
                curveTo(20.007f, 14.342f, 19.82f, 14.655f, 19.538f, 14.832f)
                lineTo(16.85f, 17.52f)
                curveTo(16.46f, 17.91f, 15.827f, 17.91f, 15.436f, 17.52f)
                curveTo(15.046f, 17.129f, 15.046f, 16.496f, 15.436f, 16.105f)
                lineTo(16.557f, 14.984f)
                horizontalLineTo(9.007f)
                curveTo(8.455f, 14.984f, 8.007f, 14.536f, 8.007f, 13.984f)
                curveTo(8.007f, 13.432f, 8.455f, 12.984f, 9.007f, 12.984f)
                lineTo(18.958f, 12.984f)
                curveTo(18.967f, 12.984f, 18.976f, 12.984f, 18.985f, 12.984f)
                horizontalLineTo(19.007f)
                close()
            }
        }
        .build()
        return _arrowsExchangeAlt!!
    }

private var _arrowsExchangeAlt: ImageVector? = null
