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

public val CssGgIcons.ArrowsExchangeV: ImageVector
    get() {
        if (_arrowsExchangeV != null) {
            return _arrowsExchangeV!!
        }
        _arrowsExchangeV = Builder(name = "ArrowsExchangeV", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.984f, 15.0f)
                curveTo(12.984f, 15.552f, 13.432f, 16.0f, 13.984f, 16.0f)
                curveTo(14.342f, 16.0f, 14.655f, 15.813f, 14.832f, 15.531f)
                lineTo(17.52f, 12.843f)
                curveTo(17.91f, 12.452f, 17.91f, 11.819f, 17.52f, 11.429f)
                curveTo(17.129f, 11.038f, 16.496f, 11.038f, 16.105f, 11.429f)
                lineTo(14.984f, 12.55f)
                lineTo(14.984f, 5.0f)
                curveTo(14.984f, 4.448f, 14.536f, 4.0f, 13.984f, 4.0f)
                curveTo(13.432f, 4.0f, 12.984f, 4.448f, 12.984f, 5.0f)
                lineTo(12.984f, 14.951f)
                curveTo(12.984f, 14.96f, 12.984f, 14.969f, 12.984f, 14.978f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.016f, 9.0f)
                curveTo(11.016f, 8.448f, 10.568f, 8.0f, 10.016f, 8.0f)
                curveTo(9.659f, 8.0f, 9.345f, 8.187f, 9.168f, 8.469f)
                lineTo(6.481f, 11.157f)
                curveTo(6.09f, 11.548f, 6.09f, 12.181f, 6.481f, 12.571f)
                curveTo(6.871f, 12.962f, 7.504f, 12.962f, 7.895f, 12.571f)
                lineTo(9.016f, 11.45f)
                lineTo(9.016f, 19.0f)
                curveTo(9.016f, 19.552f, 9.464f, 20.0f, 10.016f, 20.0f)
                curveTo(10.568f, 20.0f, 11.016f, 19.552f, 11.016f, 19.0f)
                lineTo(11.016f, 9.049f)
                curveTo(11.016f, 9.04f, 11.016f, 9.031f, 11.016f, 9.022f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _arrowsExchangeV!!
    }

private var _arrowsExchangeV: ImageVector? = null
