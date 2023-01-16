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

public val MaterialDesignIcons.AccountTagOutline: ImageVector
    get() {
        if (_accountTagOutline != null) {
            return _accountTagOutline!!
        }
        _accountTagOutline = Builder(name = "AccountTagOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4f, 16.0f)
                curveTo(15.1f, 16.0f, 14.8f, 15.7f, 14.8f, 15.4f)
                curveTo(14.8f, 15.1f, 15.1f, 14.8f, 15.4f, 14.8f)
                curveTo(15.7f, 14.8f, 16.0f, 15.1f, 16.0f, 15.4f)
                curveTo(16.0f, 15.7f, 15.7f, 16.0f, 15.4f, 16.0f)
                moveTo(21.8f, 17.8f)
                lineTo(18.2f, 14.2f)
                curveTo(18.0f, 14.1f, 17.8f, 14.0f, 17.6f, 14.0f)
                horizontalLineTo(14.8f)
                curveTo(14.4f, 14.0f, 14.0f, 14.4f, 14.0f, 14.8f)
                verticalLineTo(17.6f)
                curveTo(14.0f, 17.8f, 14.1f, 18.0f, 14.2f, 18.2f)
                lineTo(17.8f, 21.8f)
                curveTo(17.9f, 21.9f, 18.1f, 22.0f, 18.4f, 22.0f)
                reflectiveCurveTo(18.8f, 21.9f, 19.0f, 21.8f)
                lineTo(21.8f, 19.0f)
                curveTo(21.9f, 18.9f, 22.0f, 18.7f, 22.0f, 18.4f)
                curveTo(22.0f, 18.2f, 21.9f, 18.0f, 21.8f, 17.8f)
                moveTo(10.0f, 4.0f)
                curveTo(7.8f, 4.0f, 6.0f, 5.8f, 6.0f, 8.0f)
                reflectiveCurveTo(7.8f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveTo(14.0f, 10.2f, 14.0f, 8.0f)
                reflectiveCurveTo(12.2f, 4.0f, 10.0f, 4.0f)
                moveTo(10.0f, 6.0f)
                curveTo(11.1f, 6.0f, 12.0f, 6.9f, 12.0f, 8.0f)
                reflectiveCurveTo(11.1f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveTo(8.0f, 9.1f, 8.0f, 8.0f)
                reflectiveCurveTo(8.9f, 6.0f, 10.0f, 6.0f)
                moveTo(10.0f, 13.0f)
                curveTo(7.3f, 13.0f, 2.0f, 14.3f, 2.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.2f)
                lineTo(12.8f, 19.6f)
                curveTo(12.4f, 19.2f, 12.1f, 18.7f, 12.0f, 18.1f)
                horizontalLineTo(3.9f)
                verticalLineTo(17.0f)
                curveTo(3.9f, 16.4f, 7.0f, 14.9f, 10.0f, 14.9f)
                curveTo(10.7f, 14.9f, 11.4f, 15.0f, 12.0f, 15.1f)
                verticalLineTo(14.8f)
                curveTo(12.0f, 14.2f, 12.2f, 13.7f, 12.5f, 13.3f)
                curveTo(11.6f, 13.1f, 10.7f, 13.0f, 10.0f, 13.0f)
                close()
            }
        }
        .build()
        return _accountTagOutline!!
    }

private var _accountTagOutline: ImageVector? = null
