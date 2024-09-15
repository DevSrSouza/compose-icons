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

public val CssGgIcons.ArrowsExchangeAltV: ImageVector
    get() {
        if (_arrowsExchangeAltV != null) {
            return _arrowsExchangeAltV!!
        }
        _arrowsExchangeAltV = Builder(name = "ArrowsExchangeAltV", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.984f, 4.993f)
                curveTo(12.984f, 4.44f, 13.432f, 3.993f, 13.984f, 3.993f)
                curveTo(14.342f, 3.993f, 14.655f, 4.18f, 14.832f, 4.462f)
                lineTo(17.52f, 7.15f)
                curveTo(17.91f, 7.54f, 17.91f, 8.173f, 17.52f, 8.564f)
                curveTo(17.129f, 8.954f, 16.496f, 8.954f, 16.105f, 8.564f)
                lineTo(14.984f, 7.443f)
                verticalLineTo(14.993f)
                curveTo(14.984f, 15.545f, 14.536f, 15.993f, 13.984f, 15.993f)
                curveTo(13.432f, 15.993f, 12.984f, 15.545f, 12.984f, 14.993f)
                verticalLineTo(5.042f)
                curveTo(12.984f, 5.033f, 12.984f, 5.024f, 12.984f, 5.015f)
                verticalLineTo(4.993f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.016f, 19.007f)
                curveTo(11.016f, 19.56f, 10.568f, 20.007f, 10.016f, 20.007f)
                curveTo(9.658f, 20.007f, 9.345f, 19.82f, 9.168f, 19.538f)
                lineTo(6.48f, 16.85f)
                curveTo(6.09f, 16.46f, 6.09f, 15.827f, 6.48f, 15.436f)
                curveTo(6.871f, 15.046f, 7.504f, 15.046f, 7.895f, 15.436f)
                lineTo(9.016f, 16.557f)
                verticalLineTo(9.007f)
                curveTo(9.016f, 8.455f, 9.464f, 8.007f, 10.016f, 8.007f)
                curveTo(10.568f, 8.007f, 11.016f, 8.455f, 11.016f, 9.007f)
                verticalLineTo(18.958f)
                curveTo(11.016f, 18.967f, 11.016f, 18.976f, 11.016f, 18.985f)
                verticalLineTo(19.007f)
                close()
            }
        }
        .build()
        return _arrowsExchangeAltV!!
    }

private var _arrowsExchangeAltV: ImageVector? = null
