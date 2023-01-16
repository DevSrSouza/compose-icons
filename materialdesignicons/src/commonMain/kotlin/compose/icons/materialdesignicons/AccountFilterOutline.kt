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

public val MaterialDesignIcons.AccountFilterOutline: ImageVector
    get() {
        if (_accountFilterOutline != null) {
            return _accountFilterOutline!!
        }
        _accountFilterOutline = Builder(name = "AccountFilterOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                lineTo(18.8f, 22.77f)
                curveTo(19.3f, 23.27f, 20.0f, 22.87f, 20.0f, 22.28f)
                verticalLineTo(18.0f)
                lineTo(22.8f, 14.6f)
                curveTo(23.3f, 13.9f, 22.8f, 13.0f, 22.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(14.2f, 13.0f, 13.7f, 14.0f, 14.2f, 14.6f)
                lineTo(17.0f, 18.0f)
                verticalLineTo(21.0f)
                moveTo(15.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 14.3f, 7.3f, 13.0f, 10.0f, 13.0f)
                curveTo(10.6f, 13.0f, 11.3f, 13.1f, 12.1f, 13.2f)
                curveTo(11.9f, 13.8f, 12.0f, 14.5f, 12.2f, 15.1f)
                curveTo(11.5f, 15.0f, 10.7f, 14.9f, 10.0f, 14.9f)
                curveTo(7.0f, 14.9f, 3.9f, 16.4f, 3.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(14.5f)
                lineTo(15.0f, 18.7f)
                verticalLineTo(20.0f)
                moveTo(10.0f, 4.0f)
                curveTo(7.8f, 4.0f, 6.0f, 5.8f, 6.0f, 8.0f)
                reflectiveCurveTo(7.8f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveTo(14.0f, 10.2f, 14.0f, 8.0f)
                reflectiveCurveTo(12.2f, 4.0f, 10.0f, 4.0f)
                moveTo(10.0f, 10.0f)
                curveTo(8.9f, 10.0f, 8.0f, 9.1f, 8.0f, 8.0f)
                reflectiveCurveTo(8.9f, 6.0f, 10.0f, 6.0f)
                reflectiveCurveTo(12.0f, 6.9f, 12.0f, 8.0f)
                reflectiveCurveTo(11.1f, 10.0f, 10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _accountFilterOutline!!
    }

private var _accountFilterOutline: ImageVector? = null
