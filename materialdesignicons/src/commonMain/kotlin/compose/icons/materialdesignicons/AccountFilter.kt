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

public val MaterialDesignIcons.AccountFilter: ImageVector
    get() {
        if (_accountFilter != null) {
            return _accountFilter!!
        }
        _accountFilter = Builder(name = "AccountFilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                curveTo(12.2f, 4.0f, 14.0f, 5.8f, 14.0f, 8.0f)
                reflectiveCurveTo(12.2f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveTo(6.0f, 10.2f, 6.0f, 8.0f)
                reflectiveCurveTo(7.8f, 4.0f, 10.0f, 4.0f)
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
                moveTo(15.0f, 18.7f)
                lineTo(12.7f, 15.9f)
                curveTo(12.3f, 15.4f, 12.1f, 14.8f, 12.1f, 14.2f)
                curveTo(11.4f, 14.0f, 10.7f, 14.0f, 10.0f, 14.0f)
                curveTo(5.6f, 14.0f, 2.0f, 15.8f, 2.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.7f)
                close()
            }
        }
        .build()
        return _accountFilter!!
    }

private var _accountFilter: ImageVector? = null
