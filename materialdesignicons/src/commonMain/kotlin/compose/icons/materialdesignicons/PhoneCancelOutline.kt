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

public val MaterialDesignIcons.PhoneCancelOutline: ImageVector
    get() {
        if (_phoneCancelOutline != null) {
            return _phoneCancelOutline!!
        }
        _phoneCancelOutline = Builder(name = "PhoneCancelOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.5f)
                curveTo(18.8f, 15.5f, 17.5f, 15.3f, 16.4f, 14.9f)
                horizontalLineTo(16.1f)
                curveTo(15.8f, 14.9f, 15.6f, 15.0f, 15.4f, 15.2f)
                lineTo(13.2f, 17.4f)
                curveTo(10.4f, 15.9f, 8.0f, 13.6f, 6.6f, 10.8f)
                lineTo(8.8f, 8.6f)
                curveTo(9.1f, 8.3f, 9.2f, 7.9f, 9.0f, 7.6f)
                curveTo(8.7f, 6.5f, 8.5f, 5.2f, 8.5f, 4.0f)
                curveTo(8.5f, 3.5f, 8.0f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.5f, 3.0f, 3.0f, 3.5f, 3.0f, 4.0f)
                curveTo(3.0f, 13.4f, 10.6f, 21.0f, 20.0f, 21.0f)
                curveTo(20.5f, 21.0f, 21.0f, 20.5f, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 16.0f, 20.5f, 15.5f, 20.0f, 15.5f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(6.6f, 5.9f, 6.8f, 6.8f, 7.0f, 7.6f)
                lineTo(5.8f, 8.8f)
                curveTo(5.4f, 7.6f, 5.1f, 6.3f, 5.0f, 5.0f)
                moveTo(19.0f, 19.0f)
                curveTo(17.7f, 18.9f, 16.4f, 18.6f, 15.2f, 18.2f)
                lineTo(16.4f, 17.0f)
                curveTo(17.2f, 17.2f, 18.1f, 17.4f, 19.0f, 17.4f)
                verticalLineTo(19.0f)
                moveTo(16.5f, 2.0f)
                curveTo(14.0f, 2.0f, 12.0f, 4.0f, 12.0f, 6.5f)
                reflectiveCurveTo(14.0f, 11.0f, 16.5f, 11.0f)
                reflectiveCurveTo(21.0f, 9.0f, 21.0f, 6.5f)
                reflectiveCurveTo(19.0f, 2.0f, 16.5f, 2.0f)
                moveTo(16.5f, 9.5f)
                curveTo(14.84f, 9.5f, 13.5f, 8.16f, 13.5f, 6.5f)
                curveTo(13.5f, 5.94f, 13.65f, 5.42f, 13.92f, 5.0f)
                lineTo(18.0f, 9.08f)
                curveTo(17.58f, 9.35f, 17.06f, 9.5f, 16.5f, 9.5f)
                moveTo(19.08f, 8.0f)
                lineTo(15.0f, 3.92f)
                curveTo(15.42f, 3.65f, 15.94f, 3.5f, 16.5f, 3.5f)
                curveTo(18.16f, 3.5f, 19.5f, 4.84f, 19.5f, 6.5f)
                curveTo(19.5f, 7.06f, 19.35f, 7.58f, 19.08f, 8.0f)
                close()
            }
        }
        .build()
        return _phoneCancelOutline!!
    }

private var _phoneCancelOutline: ImageVector? = null
