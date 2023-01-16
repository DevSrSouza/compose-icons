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

public val MaterialDesignIcons.AccountWrench: ImageVector
    get() {
        if (_accountWrench != null) {
            return _accountWrench!!
        }
        _accountWrench = Builder(name = "AccountWrench", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.9f, 21.2f)
                lineTo(18.8f, 17.1f)
                curveTo(19.2f, 16.1f, 19.0f, 14.8f, 18.1f, 14.0f)
                curveTo(17.2f, 13.1f, 15.9f, 12.9f, 14.8f, 13.4f)
                lineTo(16.7f, 15.3f)
                lineTo(15.3f, 16.7f)
                lineTo(13.3f, 14.7f)
                curveTo(12.8f, 15.8f, 13.0f, 17.1f, 13.9f, 18.1f)
                curveTo(14.8f, 19.0f, 16.0f, 19.2f, 17.0f, 18.8f)
                lineTo(21.1f, 22.9f)
                curveTo(21.3f, 23.1f, 21.6f, 23.1f, 21.7f, 22.9f)
                lineTo(22.7f, 21.9f)
                curveTo(23.0f, 21.6f, 23.0f, 21.3f, 22.9f, 21.2f)
                moveTo(13.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 15.8f, 5.6f, 14.0f, 10.0f, 14.0f)
                curveTo(10.5f, 14.0f, 11.0f, 14.0f, 11.4f, 14.1f)
                curveTo(11.1f, 14.7f, 11.0f, 15.3f, 11.0f, 16.0f)
                curveTo(11.0f, 17.6f, 11.8f, 19.1f, 13.0f, 20.0f)
                moveTo(10.0f, 4.0f)
                curveTo(7.8f, 4.0f, 6.0f, 5.8f, 6.0f, 8.0f)
                reflectiveCurveTo(7.8f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveTo(14.0f, 10.2f, 14.0f, 8.0f)
                reflectiveCurveTo(12.2f, 4.0f, 10.0f, 4.0f)
            }
        }
        .build()
        return _accountWrench!!
    }

private var _accountWrench: ImageVector? = null
