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

public val CssGgIcons.Ethernet: ImageVector
    get() {
        if (_ethernet != null) {
            return _ethernet!!
        }
        _ethernet = Builder(name = "Ethernet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 0.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(0.5f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.0f, 2.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.5f)
                close()
                moveTo(6.0f, 18.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.5f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _ethernet!!
    }

private var _ethernet: ImageVector? = null
