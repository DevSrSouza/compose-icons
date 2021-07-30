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

public val CssGgIcons.Glass: ImageVector
    get() {
        if (_glass != null) {
            return _glass!!
        }
        _glass = Builder(name = "Glass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 10.0f)
                curveTo(17.0f, 12.419f, 15.2822f, 14.4367f, 13.0f, 14.9f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.9f)
                curveTo(8.7178f, 14.4367f, 7.0f, 12.419f, 7.0f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 11.6569f, 10.3431f, 13.0f, 12.0f, 13.0f)
                curveTo(13.6569f, 13.0f, 15.0f, 11.6569f, 15.0f, 10.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _glass!!
    }

private var _glass: ImageVector? = null
