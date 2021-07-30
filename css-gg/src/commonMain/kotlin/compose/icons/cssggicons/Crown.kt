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

public val CssGgIcons.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 6.0914f)
                lineTo(7.22f, 10.8114f)
                lineTo(12.0005f, 6.0309f)
                lineTo(16.7811f, 10.8114f)
                lineTo(21.5f, 6.0925f)
                verticalLineTo(14.9691f)
                curveTo(21.5f, 16.626f, 20.1569f, 17.9691f, 18.5f, 17.9691f)
                horizontalLineTo(5.5f)
                curveTo(3.8431f, 17.9691f, 2.5f, 16.626f, 2.5f, 14.9691f)
                verticalLineTo(6.0914f)
                close()
                moveTo(19.5f, 10.9087f)
                verticalLineTo(14.9691f)
                curveTo(19.5f, 15.5214f, 19.0523f, 15.9691f, 18.5f, 15.9691f)
                horizontalLineTo(5.5f)
                curveTo(4.9477f, 15.9691f, 4.5f, 15.5214f, 4.5f, 14.9691f)
                verticalLineTo(10.9077f)
                lineTo(7.22f, 13.6277f)
                lineTo(12.0005f, 8.8472f)
                lineTo(16.7811f, 13.6277f)
                lineTo(19.5f, 10.9087f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
