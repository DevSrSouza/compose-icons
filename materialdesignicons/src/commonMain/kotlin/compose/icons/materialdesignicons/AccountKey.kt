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

public val MaterialDesignIcons.AccountKey: ImageVector
    get() {
        if (_accountKey != null) {
            return _accountKey!!
        }
        _accountKey = Builder(name = "AccountKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.8f)
                curveTo(5.4f, 13.2f, 4.3f, 14.0f, 3.0f, 14.0f)
                curveTo(1.3f, 14.0f, 0.0f, 12.7f, 0.0f, 11.0f)
                reflectiveCurveTo(1.3f, 8.0f, 3.0f, 8.0f)
                curveTo(4.3f, 8.0f, 5.4f, 8.8f, 5.8f, 10.0f)
                horizontalLineTo(11.0f)
                moveTo(3.0f, 10.0f)
                curveTo(2.4f, 10.0f, 2.0f, 10.4f, 2.0f, 11.0f)
                reflectiveCurveTo(2.4f, 12.0f, 3.0f, 12.0f)
                reflectiveCurveTo(4.0f, 11.6f, 4.0f, 11.0f)
                reflectiveCurveTo(3.6f, 10.0f, 3.0f, 10.0f)
                moveTo(16.0f, 14.0f)
                curveTo(18.7f, 14.0f, 24.0f, 15.3f, 24.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                curveTo(8.0f, 15.3f, 13.3f, 14.0f, 16.0f, 14.0f)
                moveTo(16.0f, 12.0f)
                curveTo(13.8f, 12.0f, 12.0f, 10.2f, 12.0f, 8.0f)
                reflectiveCurveTo(13.8f, 4.0f, 16.0f, 4.0f)
                reflectiveCurveTo(20.0f, 5.8f, 20.0f, 8.0f)
                reflectiveCurveTo(18.2f, 12.0f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _accountKey!!
    }

private var _accountKey: ImageVector? = null
