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

public val MaterialDesignIcons.OneUp: ImageVector
    get() {
        if (_oneUp != null) {
            return _oneUp!!
        }
        _oneUp = Builder(name = "OneUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.0f)
                verticalLineTo(19.0f)
                curveTo(9.4f, 19.0f, 9.0f, 18.6f, 9.0f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 16.5f, 9.4f, 16.0f, 10.0f, 16.0f)
                verticalLineTo(16.0f)
                curveTo(10.5f, 16.0f, 11.0f, 16.4f, 11.0f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 18.6f, 10.6f, 19.0f, 10.0f, 19.0f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(15.0f, 16.5f, 14.6f, 16.0f, 14.0f, 16.0f)
                verticalLineTo(16.0f)
                curveTo(13.5f, 16.0f, 13.0f, 16.4f, 13.0f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(13.0f, 18.5f, 13.4f, 19.0f, 14.0f, 19.0f)
                verticalLineTo(19.0f)
                curveTo(14.6f, 19.0f, 15.0f, 18.6f, 15.0f, 18.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 14.6f, 20.4f, 16.9f, 18.0f, 18.4f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 20.0f)
                verticalLineTo(18.4f)
                curveTo(3.6f, 16.9f, 2.0f, 14.6f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                moveTo(7.0f, 10.0f)
                curveTo(7.0f, 8.9f, 6.4f, 7.9f, 5.5f, 7.4f)
                curveTo(4.5f, 8.7f, 4.0f, 10.3f, 4.0f, 12.0f)
                curveTo(4.0f, 12.3f, 4.0f, 12.7f, 4.1f, 13.0f)
                curveTo(5.7f, 12.9f, 7.0f, 11.6f, 7.0f, 10.0f)
                moveTo(9.0f, 9.0f)
                curveTo(9.0f, 10.7f, 10.3f, 12.0f, 12.0f, 12.0f)
                curveTo(13.7f, 12.0f, 15.0f, 10.7f, 15.0f, 9.0f)
                curveTo(15.0f, 7.3f, 13.7f, 6.0f, 12.0f, 6.0f)
                curveTo(10.3f, 6.0f, 9.0f, 7.3f, 9.0f, 9.0f)
                moveTo(16.0f, 20.0f)
                verticalLineTo(15.5f)
                curveTo(14.8f, 15.2f, 13.4f, 15.0f, 12.0f, 15.0f)
                curveTo(10.6f, 15.0f, 9.2f, 15.2f, 8.0f, 15.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                moveTo(19.9f, 13.0f)
                curveTo(20.0f, 12.7f, 20.0f, 12.3f, 20.0f, 12.0f)
                curveTo(20.0f, 10.3f, 19.5f, 8.7f, 18.5f, 7.4f)
                curveTo(17.6f, 7.9f, 17.0f, 8.9f, 17.0f, 10.0f)
                curveTo(17.0f, 11.6f, 18.3f, 12.9f, 19.9f, 13.0f)
                close()
            }
        }
        .build()
        return _oneUp!!
    }

private var _oneUp: ImageVector? = null
