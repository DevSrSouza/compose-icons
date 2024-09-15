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
                moveTo(2.5f, 6.091f)
                lineTo(7.22f, 10.811f)
                lineTo(12.0f, 6.031f)
                lineTo(16.781f, 10.811f)
                lineTo(21.5f, 6.092f)
                verticalLineTo(14.969f)
                curveTo(21.5f, 16.626f, 20.157f, 17.969f, 18.5f, 17.969f)
                horizontalLineTo(5.5f)
                curveTo(3.843f, 17.969f, 2.5f, 16.626f, 2.5f, 14.969f)
                verticalLineTo(6.091f)
                close()
                moveTo(19.5f, 10.909f)
                verticalLineTo(14.969f)
                curveTo(19.5f, 15.521f, 19.052f, 15.969f, 18.5f, 15.969f)
                horizontalLineTo(5.5f)
                curveTo(4.948f, 15.969f, 4.5f, 15.521f, 4.5f, 14.969f)
                verticalLineTo(10.908f)
                lineTo(7.22f, 13.628f)
                lineTo(12.0f, 8.847f)
                lineTo(16.781f, 13.628f)
                lineTo(19.5f, 10.909f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
