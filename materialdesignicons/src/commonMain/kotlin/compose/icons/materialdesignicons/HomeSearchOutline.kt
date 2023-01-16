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

public val MaterialDesignIcons.HomeSearchOutline: ImageVector
    get() {
        if (_homeSearchOutline != null) {
            return _homeSearchOutline!!
        }
        _homeSearchOutline = Builder(name = "HomeSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.31f, 18.9f)
                curveTo(19.75f, 18.21f, 20.0f, 17.38f, 20.0f, 16.5f)
                curveTo(20.0f, 14.0f, 18.0f, 12.0f, 15.5f, 12.0f)
                reflectiveCurveTo(11.0f, 14.0f, 11.0f, 16.5f)
                reflectiveCurveTo(13.0f, 21.0f, 15.5f, 21.0f)
                curveTo(16.37f, 21.0f, 17.19f, 20.75f, 17.88f, 20.32f)
                lineTo(21.0f, 23.39f)
                lineTo(22.39f, 22.0f)
                lineTo(19.31f, 18.9f)
                moveTo(15.5f, 19.0f)
                curveTo(14.12f, 19.0f, 13.0f, 17.88f, 13.0f, 16.5f)
                reflectiveCurveTo(14.12f, 14.0f, 15.5f, 14.0f)
                reflectiveCurveTo(18.0f, 15.12f, 18.0f, 16.5f)
                reflectiveCurveTo(16.88f, 19.0f, 15.5f, 19.0f)
                moveTo(5.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                lineTo(12.0f, 3.0f)
                lineTo(22.0f, 12.0f)
                horizontalLineTo(20.18f)
                curveTo(19.33f, 11.11f, 18.23f, 10.47f, 17.0f, 10.18f)
                lineTo(12.0f, 5.69f)
                lineTo(7.0f, 10.19f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.18f)
                curveTo(9.35f, 18.72f, 9.64f, 19.39f, 10.03f, 20.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _homeSearchOutline!!
    }

private var _homeSearchOutline: ImageVector? = null
