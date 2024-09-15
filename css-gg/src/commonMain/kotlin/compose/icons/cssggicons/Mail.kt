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

public val CssGgIcons.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.01f, 5.838f)
                curveTo(3.01f, 5.286f, 3.457f, 4.838f, 4.01f, 4.838f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 4.838f, 21.0f, 5.286f, 21.0f, 5.838f)
                verticalLineTo(17.162f)
                curveTo(21.0f, 18.267f, 20.105f, 19.162f, 19.0f, 19.162f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 19.162f, 3.0f, 18.267f, 3.0f, 17.162f)
                verticalLineTo(6.162f)
                curveTo(3.0f, 6.114f, 3.003f, 6.068f, 3.01f, 6.022f)
                verticalLineTo(5.838f)
                close()
                moveTo(5.0f, 8.062f)
                verticalLineTo(17.162f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.062f)
                lineTo(14.122f, 12.941f)
                curveTo(12.95f, 14.112f, 11.05f, 14.112f, 9.879f, 12.941f)
                lineTo(5.0f, 8.062f)
                close()
                moveTo(6.572f, 6.806f)
                horizontalLineTo(17.428f)
                lineTo(12.707f, 11.526f)
                curveTo(12.317f, 11.917f, 11.684f, 11.917f, 11.293f, 11.526f)
                lineTo(6.572f, 6.806f)
                close()
            }
        }
        .build()
        return _mail!!
    }

private var _mail: ImageVector? = null
