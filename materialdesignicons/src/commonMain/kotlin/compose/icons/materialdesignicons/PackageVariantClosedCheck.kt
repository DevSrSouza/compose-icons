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

public val MaterialDesignIcons.PackageVariantClosedCheck: ImageVector
    get() {
        if (_packageVariantClosedCheck != null) {
            return _packageVariantClosedCheck!!
        }
        _packageVariantClosedCheck = Builder(name = "PackageVariantClosedCheck", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(11.8f, 2.0f, 11.6f, 2.1f, 11.4f, 2.2f)
                lineTo(3.5f, 6.6f)
                curveTo(3.2f, 6.8f, 3.0f, 7.1f, 3.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 16.9f, 3.2f, 17.2f, 3.5f, 17.4f)
                lineTo(11.4f, 21.8f)
                curveTo(11.6f, 21.9f, 11.8f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(12.4f, 21.9f, 12.6f, 21.8f)
                lineTo(13.5f, 21.3f)
                curveTo(13.2f, 20.7f, 13.1f, 20.0f, 13.0f, 19.3f)
                verticalLineTo(12.6f)
                lineTo(19.0f, 9.2f)
                verticalLineTo(13.0f)
                curveTo(19.7f, 13.0f, 20.4f, 13.1f, 21.0f, 13.3f)
                verticalLineTo(7.5f)
                curveTo(21.0f, 7.1f, 20.8f, 6.8f, 20.5f, 6.6f)
                lineTo(12.6f, 2.2f)
                curveTo(12.4f, 2.1f, 12.2f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.2f)
                lineTo(18.0f, 7.5f)
                lineTo(16.0f, 8.6f)
                lineTo(10.1f, 5.2f)
                lineTo(12.0f, 4.2f)
                moveTo(8.1f, 6.3f)
                lineTo(14.0f, 9.8f)
                lineTo(12.0f, 10.9f)
                lineTo(6.0f, 7.5f)
                lineTo(8.1f, 6.3f)
                moveTo(5.0f, 9.2f)
                lineTo(11.0f, 12.6f)
                verticalLineTo(19.3f)
                lineTo(5.0f, 15.9f)
                verticalLineTo(9.2f)
                moveTo(21.3f, 15.8f)
                lineTo(17.7f, 19.4f)
                lineTo(16.1f, 17.8f)
                lineTo(15.0f, 19.0f)
                lineTo(17.8f, 22.0f)
                lineTo(22.6f, 17.2f)
                lineTo(21.3f, 15.8f)
                close()
            }
        }
        .build()
        return _packageVariantClosedCheck!!
    }

private var _packageVariantClosedCheck: ImageVector? = null
