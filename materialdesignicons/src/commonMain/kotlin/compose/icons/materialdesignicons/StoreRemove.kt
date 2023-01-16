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

public val MaterialDesignIcons.StoreRemove: ImageVector
    get() {
        if (_storeRemove != null) {
            return _storeRemove!!
        }
        _storeRemove = Builder(name = "StoreRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                moveTo(15.46f, 16.88f)
                lineTo(16.88f, 15.46f)
                lineTo(19.0f, 17.59f)
                lineTo(21.12f, 15.47f)
                lineTo(22.54f, 16.88f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.46f, 21.12f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 16.88f)
                moveTo(4.0f, 7.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 12.0f)
                verticalLineTo(13.34f)
                curveTo(20.33f, 13.09f, 19.62f, 12.96f, 18.91f, 12.96f)
                curveTo(17.71f, 12.96f, 16.54f, 13.33f, 15.54f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.53f)
                curveTo(13.3f, 16.53f, 12.92f, 17.73f, 12.92f, 18.95f)
                lineTo(13.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                lineTo(4.0f, 7.0f)
                moveTo(6.0f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _storeRemove!!
    }

private var _storeRemove: ImageVector? = null
