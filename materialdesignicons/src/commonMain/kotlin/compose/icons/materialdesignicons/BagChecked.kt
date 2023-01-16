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

public val MaterialDesignIcons.BagChecked: ImageVector
    get() {
        if (_bagChecked != null) {
            return _bagChecked!!
        }
        _bagChecked = Builder(name = "BagChecked", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                moveTo(4.0f, 15.0f)
                curveTo(4.0f, 15.5f, 4.2f, 16.0f, 4.6f, 16.4f)
                curveTo(5.0f, 16.8f, 5.5f, 17.0f, 6.0f, 17.0f)
                verticalLineTo(6.0f)
                curveTo(5.5f, 6.0f, 5.0f, 6.2f, 4.6f, 6.6f)
                curveTo(4.2f, 7.0f, 4.0f, 7.5f, 4.0f, 8.0f)
                verticalLineTo(15.0f)
                moveTo(13.5f, 6.0f)
                horizontalLineTo(10.5f)
                curveTo(10.5f, 5.6f, 10.6f, 5.2f, 10.9f, 4.9f)
                curveTo(11.2f, 4.6f, 11.5f, 4.5f, 12.0f, 4.5f)
                curveTo(12.4f, 4.5f, 12.8f, 4.6f, 13.1f, 4.9f)
                curveTo(13.3f, 5.2f, 13.5f, 5.6f, 13.5f, 6.0f)
                moveTo(7.0f, 6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 5.2f, 14.7f, 4.5f, 14.1f, 3.9f)
                reflectiveCurveTo(12.8f, 3.0f, 12.0f, 3.0f)
                curveTo(11.2f, 3.0f, 10.5f, 3.3f, 9.9f, 3.9f)
                curveTo(9.3f, 4.5f, 9.0f, 5.2f, 9.0f, 6.0f)
                horizontalLineTo(7.0f)
                moveTo(18.0f, 17.0f)
                curveTo(18.5f, 17.0f, 19.0f, 16.8f, 19.4f, 16.4f)
                curveTo(19.8f, 16.0f, 20.0f, 15.5f, 20.0f, 15.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 7.5f, 19.8f, 7.0f, 19.4f, 6.6f)
                curveTo(19.0f, 6.2f, 18.5f, 6.0f, 18.0f, 6.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _bagChecked!!
    }

private var _bagChecked: ImageVector? = null
