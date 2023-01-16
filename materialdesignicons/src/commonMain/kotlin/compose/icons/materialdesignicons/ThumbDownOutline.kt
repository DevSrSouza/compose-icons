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

public val MaterialDesignIcons.ThumbDownOutline: ImageVector
    get() {
        if (_thumbDownOutline != null) {
            return _thumbDownOutline!!
        }
        _thumbDownOutline = Builder(name = "ThumbDownOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                moveTo(15.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 15.55f, 16.78f, 16.05f, 16.41f, 16.41f)
                lineTo(9.83f, 23.0f)
                lineTo(8.77f, 21.94f)
                curveTo(8.5f, 21.67f, 8.33f, 21.3f, 8.33f, 20.88f)
                lineTo(8.36f, 20.57f)
                lineTo(9.31f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 16.0f, 1.0f, 15.1f, 1.0f, 14.0f)
                verticalLineTo(12.0f)
                curveTo(1.0f, 11.74f, 1.05f, 11.5f, 1.14f, 11.27f)
                lineTo(4.16f, 4.22f)
                curveTo(4.46f, 3.5f, 5.17f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(15.0f)
                moveTo(15.0f, 5.0f)
                horizontalLineTo(5.97f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.78f)
                lineTo(10.65f, 19.32f)
                lineTo(15.0f, 14.97f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _thumbDownOutline!!
    }

private var _thumbDownOutline: ImageVector? = null
