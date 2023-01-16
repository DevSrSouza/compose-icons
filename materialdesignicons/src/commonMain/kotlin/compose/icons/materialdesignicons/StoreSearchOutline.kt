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

public val MaterialDesignIcons.StoreSearchOutline: ImageVector
    get() {
        if (_storeSearchOutline != null) {
            return _storeSearchOutline!!
        }
        _storeSearchOutline = Builder(name = "StoreSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                moveTo(13.04f, 10.0f)
                horizontalLineTo(3.04f)
                lineTo(3.64f, 7.0f)
                horizontalLineTo(16.36f)
                lineTo(16.76f, 9.0f)
                curveTo(17.5f, 9.04f, 18.21f, 9.19f, 18.89f, 9.46f)
                lineTo(18.0f, 5.0f)
                horizontalLineTo(2.0f)
                lineTo(1.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.5f)
                curveTo(10.17f, 17.2f, 10.0f, 16.35f, 10.0f, 15.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                curveTo(10.0f, 13.84f, 10.64f, 12.17f, 11.9f, 10.9f)
                curveTo(12.26f, 10.55f, 12.64f, 10.25f, 13.04f, 10.0f)
                moveTo(23.39f, 21.0f)
                lineTo(22.0f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20.0f, 16.5f, 20.0f)
                curveTo(14.0f, 20.0f, 12.0f, 18.0f, 12.0f, 15.5f)
                reflectiveCurveTo(14.0f, 11.0f, 16.5f, 11.0f)
                reflectiveCurveTo(21.0f, 13.0f, 21.0f, 15.5f)
                curveTo(21.0f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21.0f)
                moveTo(19.0f, 15.5f)
                curveTo(19.0f, 14.12f, 17.88f, 13.0f, 16.5f, 13.0f)
                reflectiveCurveTo(14.0f, 14.12f, 14.0f, 15.5f)
                reflectiveCurveTo(15.12f, 18.0f, 16.5f, 18.0f)
                reflectiveCurveTo(19.0f, 16.88f, 19.0f, 15.5f)
                close()
            }
        }
        .build()
        return _storeSearchOutline!!
    }

private var _storeSearchOutline: ImageVector? = null
