package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TreeOutline: ImageVector
    get() {
        if (_treeOutline != null) {
            return _treeOutline!!
        }
        _treeOutline = Builder(name = "TreeOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 3.0f)
                curveTo(8.0f, 3.0f, 6.0f, 5.0f, 6.0f, 7.5f)
                curveTo(6.0f, 8.11f, 6.13f, 8.71f, 6.37f, 9.27f)
                curveTo(5.5f, 10.12f, 5.0f, 11.28f, 5.0f, 12.5f)
                curveTo(5.0f, 15.0f, 7.0f, 17.0f, 9.5f, 17.0f)
                curveTo(10.0f, 17.0f, 10.5f, 16.89f, 11.0f, 16.72f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.77f)
                curveTo(13.5f, 15.91f, 14.0f, 16.0f, 14.5f, 16.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 20.0f, 10.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 14.5f, 5.0f)
                curveTo(14.41f, 5.0f, 14.33f, 5.0f, 14.24f, 5.0f)
                curveTo(13.41f, 3.76f, 12.0f, 3.0f, 10.5f, 3.0f)
                moveTo(10.5f, 5.0f)
                curveTo(11.82f, 5.0f, 12.91f, 6.03f, 13.0f, 7.35f)
                curveTo(13.46f, 7.12f, 14.0f, 7.0f, 14.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 14.5f, 14.0f)
                curveTo(13.54f, 14.0f, 12.63f, 13.61f, 11.96f, 12.91f)
                curveTo(11.76f, 14.12f, 10.72f, 15.0f, 9.5f, 15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.0f, 12.5f)
                curveTo(7.0f, 11.12f, 7.8f, 10.54f, 9.0f, 9.79f)
                curveTo(8.2f, 8.76f, 8.0f, 8.16f, 8.0f, 7.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 5.0f)
                close()
            }
        }
        .build()
        return _treeOutline!!
    }

private var _treeOutline: ImageVector? = null
