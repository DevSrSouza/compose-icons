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

public val MaterialDesignIcons.SortVariantLockOpen: ImageVector
    get() {
        if (_sortVariantLockOpen != null) {
            return _sortVariantLockOpen!!
        }
        _sortVariantLockOpen = Builder(name = "SortVariantLockOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23.0f, 21.4f, 22.4f, 22.0f, 21.7f, 22.0f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22.0f, 15.0f, 21.4f, 15.0f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15.0f, 16.6f, 15.6f, 16.0f, 16.2f, 16.0f)
                verticalLineTo(13.5f)
                curveTo(16.2f, 12.1f, 17.6f, 11.0f, 19.0f, 11.0f)
                reflectiveCurveTo(21.8f, 12.1f, 21.8f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(13.5f)
                curveTo(20.5f, 12.7f, 19.8f, 12.2f, 19.0f, 12.2f)
                reflectiveCurveTo(17.5f, 12.7f, 17.5f, 13.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.8f)
                curveTo(22.4f, 16.0f, 23.0f, 16.6f, 23.0f, 17.3f)
                moveTo(3.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                moveTo(3.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
            }
        }
        .build()
        return _sortVariantLockOpen!!
    }

private var _sortVariantLockOpen: ImageVector? = null
