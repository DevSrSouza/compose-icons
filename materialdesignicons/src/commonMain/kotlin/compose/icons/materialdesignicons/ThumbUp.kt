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

public val MaterialDesignIcons.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) {
            return _thumbUp!!
        }
        _thumbUp = Builder(name = "ThumbUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.0f)
                curveTo(23.0f, 8.89f, 22.1f, 8.0f, 21.0f, 8.0f)
                horizontalLineTo(14.68f)
                lineTo(15.64f, 3.43f)
                curveTo(15.66f, 3.33f, 15.67f, 3.22f, 15.67f, 3.11f)
                curveTo(15.67f, 2.7f, 15.5f, 2.32f, 15.23f, 2.05f)
                lineTo(14.17f, 1.0f)
                lineTo(7.59f, 7.58f)
                curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(18.83f, 21.0f, 19.54f, 20.5f, 19.84f, 19.78f)
                lineTo(22.86f, 12.73f)
                curveTo(22.95f, 12.5f, 23.0f, 12.26f, 23.0f, 12.0f)
                verticalLineTo(10.0f)
                moveTo(1.0f, 21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null
