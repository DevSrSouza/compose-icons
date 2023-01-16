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

public val MaterialDesignIcons.PackageVariantRemove: ImageVector
    get() {
        if (_packageVariantRemove != null) {
            return _packageVariantRemove!!
        }
        _packageVariantRemove = Builder(name = "PackageVariantRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.6f)
                curveTo(13.3f, 15.8f, 13.7f, 15.8f, 14.0f, 15.6f)
                lineTo(19.0f, 12.7f)
                verticalLineTo(13.0f)
                curveTo(19.7f, 13.0f, 20.4f, 13.1f, 21.0f, 13.4f)
                verticalLineTo(11.6f)
                lineTo(22.0f, 11.0f)
                curveTo(22.5f, 10.7f, 22.6f, 10.1f, 22.4f, 9.6f)
                lineTo(20.9f, 7.1f)
                curveTo(20.8f, 6.9f, 20.7f, 6.7f, 20.5f, 6.6f)
                lineTo(12.6f, 2.2f)
                curveTo(12.4f, 2.1f, 12.2f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(11.6f, 2.1f, 11.4f, 2.2f)
                lineTo(3.6f, 6.6f)
                curveTo(3.4f, 6.7f, 3.2f, 6.8f, 3.1f, 7.0f)
                lineTo(1.6f, 9.6f)
                curveTo(1.3f, 10.1f, 1.5f, 10.7f, 2.0f, 11.0f)
                curveTo(2.3f, 11.2f, 2.7f, 11.2f, 3.0f, 11.0f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 16.9f, 3.2f, 17.2f, 3.5f, 17.4f)
                lineTo(11.4f, 21.8f)
                curveTo(11.6f, 21.9f, 11.8f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(12.4f, 21.9f, 12.6f, 21.8f)
                lineTo(13.5f, 21.3f)
                curveTo(13.2f, 20.7f, 13.1f, 20.0f, 13.0f, 19.3f)
                moveTo(11.0f, 19.3f)
                lineTo(5.0f, 15.9f)
                verticalLineTo(9.2f)
                lineTo(11.0f, 12.6f)
                verticalLineTo(19.3f)
                moveTo(20.1f, 9.7f)
                lineTo(13.8f, 13.3f)
                lineTo(13.2f, 12.3f)
                lineTo(19.5f, 8.7f)
                lineTo(20.1f, 9.7f)
                moveTo(12.0f, 10.8f)
                verticalLineTo(4.2f)
                lineTo(18.0f, 7.5f)
                lineTo(12.0f, 10.8f)
                moveTo(22.5f, 16.9f)
                lineTo(20.4f, 19.0f)
                lineTo(22.5f, 21.1f)
                lineTo(21.1f, 22.5f)
                lineTo(19.0f, 20.4f)
                lineTo(16.9f, 22.5f)
                lineTo(15.5f, 21.1f)
                lineTo(17.6f, 19.0f)
                lineTo(15.5f, 16.9f)
                lineTo(16.9f, 15.5f)
                lineTo(19.0f, 17.6f)
                lineTo(21.1f, 15.5f)
                lineTo(22.5f, 16.9f)
                close()
            }
        }
        .build()
        return _packageVariantRemove!!
    }

private var _packageVariantRemove: ImageVector? = null
