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

public val MaterialDesignIcons.CloudPrint: ImageVector
    get() {
        if (_cloudPrint != null) {
            return _cloudPrint!!
        }
        _cloudPrint = Builder(name = "CloudPrint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.86f, 10.5f)
                curveTo(21.1f, 9.63f, 20.15f, 9.13f, 19.0f, 9.0f)
                curveTo(19.0f, 7.05f, 18.32f, 5.4f, 16.96f, 4.04f)
                curveTo(15.6f, 2.68f, 13.95f, 2.0f, 12.0f, 2.0f)
                curveTo(10.42f, 2.0f, 9.0f, 2.5f, 7.75f, 3.43f)
                reflectiveCurveTo(5.67f, 5.62f, 5.25f, 7.15f)
                curveTo(4.0f, 7.43f, 2.96f, 8.08f, 2.17f, 9.1f)
                reflectiveCurveTo(1.0f, 11.28f, 1.0f, 12.58f)
                curveTo(1.0f, 14.09f, 1.54f, 15.38f, 2.61f, 16.43f)
                curveTo(3.57f, 17.36f, 4.7f, 17.85f, 6.0f, 17.95f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.5f)
                curveTo(19.75f, 18.0f, 20.81f, 17.56f, 21.69f, 16.69f)
                curveTo(22.56f, 15.81f, 23.0f, 14.75f, 23.0f, 13.5f)
                curveTo(23.0f, 12.35f, 22.62f, 11.35f, 21.86f, 10.5f)
                moveTo(16.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                moveTo(15.0f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                moveTo(15.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                moveTo(15.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _cloudPrint!!
    }

private var _cloudPrint: ImageVector? = null
