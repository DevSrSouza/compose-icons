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

public val MaterialDesignIcons.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) {
            return _thumbDown!!
        }
        _thumbDown = Builder(name = "ThumbDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                moveTo(15.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.17f, 3.0f, 4.46f, 3.5f, 4.16f, 4.22f)
                lineTo(1.14f, 11.27f)
                curveTo(1.05f, 11.5f, 1.0f, 11.74f, 1.0f, 12.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 16.0f)
                horizontalLineTo(9.31f)
                lineTo(8.36f, 20.57f)
                curveTo(8.34f, 20.67f, 8.33f, 20.77f, 8.33f, 20.88f)
                curveTo(8.33f, 21.3f, 8.5f, 21.67f, 8.77f, 21.94f)
                lineTo(9.83f, 23.0f)
                lineTo(16.41f, 16.41f)
                curveTo(16.78f, 16.05f, 17.0f, 15.55f, 17.0f, 15.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.89f, 16.1f, 3.0f, 15.0f, 3.0f)
                close()
            }
        }
        .build()
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
