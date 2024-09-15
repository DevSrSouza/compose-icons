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
                curveTo(8.718f, 17.437f, 7.0f, 15.419f, 7.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 4.239f, 9.239f, 2.0f, 12.0f, 2.0f)
                curveTo(14.761f, 2.0f, 17.0f, 4.239f, 17.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(17.0f, 15.419f, 15.282f, 17.437f, 13.0f, 17.9f)
                verticalLineTo(21.0f)
                curveTo(13.0f, 21.552f, 12.552f, 22.0f, 12.0f, 22.0f)
                curveTo(11.448f, 22.0f, 11.0f, 21.552f, 11.0f, 21.0f)
                verticalLineTo(17.9f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(13.657f, 4.0f, 15.0f, 5.343f, 15.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 14.306f, 14.165f, 15.417f, 13.0f, 15.829f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 10.448f, 12.552f, 10.0f, 12.0f, 10.0f)
                curveTo(11.448f, 10.0f, 11.0f, 10.448f, 11.0f, 11.0f)
                verticalLineTo(15.829f)
                curveTo(9.835f, 15.417f, 9.0f, 14.306f, 9.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(9.0f, 5.343f, 10.343f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
