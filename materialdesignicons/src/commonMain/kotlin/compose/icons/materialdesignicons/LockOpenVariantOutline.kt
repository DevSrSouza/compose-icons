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

public val MaterialDesignIcons.LockOpenVariantOutline: ImageVector
    get() {
        if (_lockOpenVariantOutline != null) {
            return _lockOpenVariantOutline!!
        }
        _lockOpenVariantOutline = Builder(name = "LockOpenVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                curveTo(11.1f, 13.0f, 12.0f, 13.89f, 12.0f, 15.0f)
                curveTo(12.0f, 16.11f, 11.11f, 17.0f, 10.0f, 17.0f)
                reflectiveCurveTo(8.0f, 16.11f, 8.0f, 15.0f)
                reflectiveCurveTo(8.9f, 13.0f, 10.0f, 13.0f)
                moveTo(18.0f, 1.0f)
                curveTo(15.24f, 1.0f, 13.0f, 3.24f, 13.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 8.0f, 2.0f, 8.9f, 2.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1f, 22.0f, 18.0f, 21.1f, 18.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 8.9f, 17.1f, 8.0f, 16.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 4.34f, 16.34f, 3.0f, 18.0f, 3.0f)
                reflectiveCurveTo(21.0f, 4.34f, 21.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                curveTo(23.0f, 3.24f, 20.76f, 1.0f, 18.0f, 1.0f)
                moveTo(16.0f, 10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _lockOpenVariantOutline!!
    }

private var _lockOpenVariantOutline: ImageVector? = null
