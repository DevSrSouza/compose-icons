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

public val MaterialDesignIcons.AccountBadge: ImageVector
    get() {
        if (_accountBadge != null) {
            return _accountBadge!!
        }
        _accountBadge = Builder(name = "AccountBadge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.5f)
                curveTo(14.0f, 17.5f, 15.1f, 15.7f, 16.7f, 14.8f)
                curveTo(15.4f, 14.3f, 13.8f, 14.0f, 12.0f, 14.0f)
                curveTo(7.6f, 14.0f, 4.0f, 15.8f, 4.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.5f)
                moveTo(19.5f, 16.0f)
                curveTo(17.6f, 16.0f, 16.0f, 17.6f, 16.0f, 19.5f)
                reflectiveCurveTo(17.6f, 23.0f, 19.5f, 23.0f)
                reflectiveCurveTo(23.0f, 21.4f, 23.0f, 19.5f)
                reflectiveCurveTo(21.4f, 16.0f, 19.5f, 16.0f)
                moveTo(16.0f, 8.0f)
                curveTo(16.0f, 10.2f, 14.2f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(8.0f, 10.2f, 8.0f, 8.0f)
                reflectiveCurveTo(9.8f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(16.0f, 5.8f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _accountBadge!!
    }

private var _accountBadge: ImageVector? = null
