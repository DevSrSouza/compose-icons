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

public val MaterialDesignIcons.ThumbUpOutline: ImageVector
    get() {
        if (_thumbUpOutline != null) {
            return _thumbUpOutline!!
        }
        _thumbUpOutline = Builder(name = "ThumbUpOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                moveTo(9.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(7.0f, 8.45f, 7.22f, 7.95f, 7.59f, 7.59f)
                lineTo(14.17f, 1.0f)
                lineTo(15.23f, 2.06f)
                curveTo(15.5f, 2.33f, 15.67f, 2.7f, 15.67f, 3.11f)
                lineTo(15.64f, 3.43f)
                lineTo(14.69f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(22.11f, 8.0f, 23.0f, 8.9f, 23.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(23.0f, 12.26f, 22.95f, 12.5f, 22.86f, 12.73f)
                lineTo(19.84f, 19.78f)
                curveTo(19.54f, 20.5f, 18.83f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 19.0f)
                horizontalLineTo(18.03f)
                lineTo(21.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.21f)
                lineTo(13.34f, 4.68f)
                lineTo(9.0f, 9.03f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _thumbUpOutline!!
    }

private var _thumbUpOutline: ImageVector? = null
