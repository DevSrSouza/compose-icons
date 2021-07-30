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

public val CssGgIcons.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 17.9f)
                curveTo(8.7178f, 17.4367f, 7.0f, 15.419f, 7.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 4.2386f, 9.2386f, 2.0f, 12.0f, 2.0f)
                curveTo(14.7614f, 2.0f, 17.0f, 4.2386f, 17.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(17.0f, 15.419f, 15.2822f, 17.4367f, 13.0f, 17.9f)
                verticalLineTo(21.0f)
                curveTo(13.0f, 21.5523f, 12.5523f, 22.0f, 12.0f, 22.0f)
                curveTo(11.4477f, 22.0f, 11.0f, 21.5523f, 11.0f, 21.0f)
                verticalLineTo(17.9f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(13.6569f, 4.0f, 15.0f, 5.3432f, 15.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 14.3062f, 14.1652f, 15.4175f, 13.0f, 15.8293f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 10.4477f, 12.5523f, 10.0f, 12.0f, 10.0f)
                curveTo(11.4477f, 10.0f, 11.0f, 10.4477f, 11.0f, 11.0f)
                verticalLineTo(15.8293f)
                curveTo(9.8348f, 15.4175f, 9.0f, 14.3062f, 9.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(9.0f, 5.3432f, 10.3431f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
