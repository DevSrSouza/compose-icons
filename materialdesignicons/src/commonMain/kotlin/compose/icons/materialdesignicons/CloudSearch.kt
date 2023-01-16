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

public val MaterialDesignIcons.CloudSearch: ImageVector
    get() {
        if (_cloudSearch != null) {
            return _cloudSearch!!
        }
        _cloudSearch = Builder(name = "CloudSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.86f, 12.5f)
                curveTo(21.1f, 11.63f, 20.15f, 11.13f, 19.0f, 11.0f)
                curveTo(19.0f, 9.05f, 18.32f, 7.4f, 16.96f, 6.04f)
                curveTo(15.6f, 4.68f, 13.95f, 4.0f, 12.0f, 4.0f)
                curveTo(10.42f, 4.0f, 9.0f, 4.47f, 7.75f, 5.43f)
                reflectiveCurveTo(5.67f, 7.62f, 5.25f, 9.15f)
                curveTo(4.0f, 9.43f, 2.96f, 10.08f, 2.17f, 11.1f)
                reflectiveCurveTo(1.0f, 13.28f, 1.0f, 14.58f)
                curveTo(1.0f, 16.09f, 1.54f, 17.38f, 2.61f, 18.43f)
                curveTo(3.69f, 19.5f, 5.0f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(18.5f)
                curveTo(19.75f, 20.0f, 20.81f, 19.56f, 21.69f, 18.69f)
                curveTo(22.56f, 17.81f, 23.0f, 16.75f, 23.0f, 15.5f)
                curveTo(23.0f, 14.35f, 22.62f, 13.35f, 21.86f, 12.5f)
                moveTo(16.57f, 18.0f)
                lineTo(14.0f, 15.43f)
                curveTo(13.43f, 15.79f, 12.74f, 16.0f, 12.0f, 16.0f)
                curveTo(9.79f, 16.0f, 8.0f, 14.21f, 8.0f, 12.0f)
                reflectiveCurveTo(9.79f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(16.0f, 9.79f, 16.0f, 12.0f)
                curveTo(16.0f, 12.74f, 15.79f, 13.43f, 15.43f, 14.0f)
                lineTo(18.0f, 16.57f)
                lineTo(16.57f, 18.0f)
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.11f, 13.11f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(10.0f, 13.11f, 10.0f, 12.0f)
                reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _cloudSearch!!
    }

private var _cloudSearch: ImageVector? = null
