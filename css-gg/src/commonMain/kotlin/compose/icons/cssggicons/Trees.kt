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

public val CssGgIcons.Trees: ImageVector
    get() {
        if (_trees != null) {
            return _trees!!
        }
        _trees = Builder(name = "Trees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.74f, 16.319f)
                curveTo(12.035f, 17.113f, 11.081f, 17.681f, 10.0f, 17.9f)
                verticalLineTo(21.0f)
                curveTo(10.0f, 21.552f, 9.552f, 22.0f, 9.0f, 22.0f)
                curveTo(8.448f, 22.0f, 8.0f, 21.552f, 8.0f, 21.0f)
                verticalLineTo(17.9f)
                curveTo(5.718f, 17.437f, 4.0f, 15.419f, 4.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 4.239f, 6.239f, 2.0f, 9.0f, 2.0f)
                curveTo(11.609f, 2.0f, 13.751f, 3.998f, 13.98f, 6.547f)
                curveTo(14.573f, 6.199f, 15.263f, 6.0f, 16.0f, 6.0f)
                curveTo(18.209f, 6.0f, 20.0f, 7.791f, 20.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 15.864f, 18.725f, 17.43f, 17.0f, 17.874f)
                verticalLineTo(21.0f)
                curveTo(17.0f, 21.552f, 16.552f, 22.0f, 16.0f, 22.0f)
                curveTo(15.448f, 22.0f, 15.0f, 21.552f, 15.0f, 21.0f)
                verticalLineTo(17.874f)
                curveTo(14.075f, 17.636f, 13.279f, 17.075f, 12.74f, 16.319f)
                close()
                moveTo(12.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(12.0f, 14.306f, 11.165f, 15.417f, 10.0f, 15.829f)
                verticalLineTo(13.0f)
                curveTo(10.0f, 12.448f, 9.552f, 12.0f, 9.0f, 12.0f)
                curveTo(8.448f, 12.0f, 8.0f, 12.448f, 8.0f, 13.0f)
                verticalLineTo(15.829f)
                curveTo(6.835f, 15.417f, 6.0f, 14.306f, 6.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 5.343f, 7.343f, 4.0f, 9.0f, 4.0f)
                curveTo(10.657f, 4.0f, 12.0f, 5.343f, 12.0f, 7.0f)
                close()
                moveTo(17.0f, 15.732f)
                verticalLineTo(13.0f)
                curveTo(17.0f, 12.448f, 16.552f, 12.0f, 16.0f, 12.0f)
                curveTo(15.448f, 12.0f, 15.0f, 12.448f, 15.0f, 13.0f)
                verticalLineTo(15.732f)
                curveTo(14.402f, 15.387f, 14.0f, 14.74f, 14.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(14.0f, 8.895f, 14.895f, 8.0f, 16.0f, 8.0f)
                curveTo(17.105f, 8.0f, 18.0f, 8.895f, 18.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 14.74f, 17.598f, 15.387f, 17.0f, 15.732f)
                close()
            }
        }
        .build()
        return _trees!!
    }

private var _trees: ImageVector? = null
