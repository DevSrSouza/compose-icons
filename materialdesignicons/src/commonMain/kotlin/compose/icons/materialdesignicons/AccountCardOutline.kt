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

public val MaterialDesignIcons.AccountCardOutline: ImageVector
    get() {
        if (_accountCardOutline != null) {
            return _accountCardOutline!!
        }
        _accountCardOutline = Builder(name = "AccountCardOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                curveTo(4.8f, 4.0f, 3.0f, 5.8f, 3.0f, 8.0f)
                reflectiveCurveTo(4.8f, 12.0f, 7.0f, 12.0f)
                reflectiveCurveTo(11.0f, 10.2f, 11.0f, 8.0f)
                reflectiveCurveTo(9.2f, 4.0f, 7.0f, 4.0f)
                moveTo(7.0f, 10.0f)
                curveTo(5.9f, 10.0f, 5.0f, 9.1f, 5.0f, 8.0f)
                reflectiveCurveTo(5.9f, 6.0f, 7.0f, 6.0f)
                reflectiveCurveTo(9.0f, 6.9f, 9.0f, 8.0f)
                reflectiveCurveTo(8.1f, 10.0f, 7.0f, 10.0f)
                moveTo(0.0f, 18.0f)
                curveTo(0.0f, 15.8f, 3.1f, 14.0f, 7.0f, 14.0f)
                curveTo(8.5f, 14.0f, 9.9f, 14.3f, 11.0f, 14.7f)
                verticalLineTo(17.0f)
                curveTo(10.2f, 16.5f, 8.8f, 16.0f, 7.0f, 16.0f)
                curveTo(3.8f, 16.0f, 2.0f, 17.4f, 2.0f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(18.0f)
                moveTo(22.0f, 4.0f)
                horizontalLineTo(15.0f)
                curveTo(13.9f, 4.0f, 13.0f, 4.9f, 13.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(13.0f, 19.1f, 13.9f, 20.0f, 15.0f, 20.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1f, 20.0f, 24.0f, 19.1f, 24.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 4.9f, 23.1f, 4.0f, 22.0f, 4.0f)
                moveTo(22.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _accountCardOutline!!
    }

private var _accountCardOutline: ImageVector? = null
