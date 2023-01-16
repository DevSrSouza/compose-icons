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

public val MaterialDesignIcons.AccountArrowLeftOutline: ImageVector
    get() {
        if (_accountArrowLeftOutline != null) {
            return _accountArrowLeftOutline!!
        }
        _accountArrowLeftOutline = Builder(name = "AccountArrowLeftOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                lineTo(14.0f, 17.0f)
                lineTo(17.0f, 20.0f)
                verticalLineTo(18.0f)
                moveTo(11.0f, 4.0f)
                curveTo(8.8f, 4.0f, 7.0f, 5.8f, 7.0f, 8.0f)
                reflectiveCurveTo(8.8f, 12.0f, 11.0f, 12.0f)
                reflectiveCurveTo(15.0f, 10.2f, 15.0f, 8.0f)
                reflectiveCurveTo(13.2f, 4.0f, 11.0f, 4.0f)
                moveTo(11.0f, 6.0f)
                curveTo(12.1f, 6.0f, 13.0f, 6.9f, 13.0f, 8.0f)
                reflectiveCurveTo(12.1f, 10.0f, 11.0f, 10.0f)
                reflectiveCurveTo(9.0f, 9.1f, 9.0f, 8.0f)
                reflectiveCurveTo(9.9f, 6.0f, 11.0f, 6.0f)
                moveTo(11.0f, 13.0f)
                curveTo(8.3f, 13.0f, 3.0f, 14.3f, 3.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.5f)
                curveTo(12.2f, 19.4f, 12.1f, 18.8f, 12.0f, 18.1f)
                horizontalLineTo(4.9f)
                verticalLineTo(17.0f)
                curveTo(4.9f, 16.4f, 8.0f, 14.9f, 11.0f, 14.9f)
                curveTo(11.5f, 14.9f, 12.0f, 15.0f, 12.5f, 15.0f)
                curveTo(12.8f, 14.4f, 13.1f, 13.8f, 13.6f, 13.3f)
                curveTo(12.6f, 13.1f, 11.7f, 13.0f, 11.0f, 13.0f)
            }
        }
        .build()
        return _accountArrowLeftOutline!!
    }

private var _accountArrowLeftOutline: ImageVector? = null
