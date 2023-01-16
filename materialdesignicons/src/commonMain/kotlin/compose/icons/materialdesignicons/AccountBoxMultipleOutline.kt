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

public val MaterialDesignIcons.AccountBoxMultipleOutline: ImageVector
    get() {
        if (_accountBoxMultipleOutline != null) {
            return _accountBoxMultipleOutline!!
        }
        _accountBoxMultipleOutline = Builder(name = "AccountBoxMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveTo(18.5f, 14.25f)
                curveTo(18.5f, 12.75f, 15.5f, 12.0f, 14.0f, 12.0f)
                reflectiveCurveTo(9.5f, 12.75f, 9.5f, 14.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.5f)
                moveTo(14.0f, 10.25f)
                curveTo(15.24f, 10.25f, 16.25f, 9.24f, 16.25f, 8.0f)
                reflectiveCurveTo(15.24f, 5.75f, 14.0f, 5.75f)
                reflectiveCurveTo(11.75f, 6.76f, 11.75f, 8.0f)
                reflectiveCurveTo(12.76f, 10.25f, 14.0f, 10.25f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.11f, 6.9f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 18.0f, 22.0f, 17.11f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.89f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(20.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _accountBoxMultipleOutline!!
    }

private var _accountBoxMultipleOutline: ImageVector? = null
