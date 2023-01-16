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

public val MaterialDesignIcons.AccountLock: ImageVector
    get() {
        if (_accountLock != null) {
            return _accountLock!!
        }
        _accountLock = Builder(name = "AccountLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 5.79f, 7.79f, 4.0f, 10.0f, 4.0f)
                reflectiveCurveTo(14.0f, 5.79f, 14.0f, 8.0f)
                reflectiveCurveTo(12.21f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveTo(6.0f, 10.21f, 6.0f, 8.0f)
                moveTo(12.0f, 18.2f)
                curveTo(12.0f, 17.24f, 12.5f, 16.34f, 13.2f, 15.74f)
                verticalLineTo(15.5f)
                curveTo(13.2f, 15.11f, 13.27f, 14.74f, 13.38f, 14.38f)
                curveTo(12.35f, 14.14f, 11.21f, 14.0f, 10.0f, 14.0f)
                curveTo(5.58f, 14.0f, 2.0f, 15.79f, 2.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.2f)
                moveTo(22.0f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(22.0f, 22.4f, 21.4f, 23.0f, 20.7f, 23.0f)
                horizontalLineTo(15.2f)
                curveTo(14.6f, 23.0f, 14.0f, 22.4f, 14.0f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(14.0f, 17.6f, 14.6f, 17.0f, 15.2f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(15.2f, 14.1f, 16.6f, 13.0f, 18.0f, 13.0f)
                curveTo(19.4f, 13.0f, 20.8f, 14.1f, 20.8f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(21.4f, 17.0f, 22.0f, 17.6f, 22.0f, 18.3f)
                moveTo(19.5f, 15.5f)
                curveTo(19.5f, 14.7f, 18.8f, 14.2f, 18.0f, 14.2f)
                curveTo(17.2f, 14.2f, 16.5f, 14.7f, 16.5f, 15.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _accountLock!!
    }

private var _accountLock: ImageVector? = null
