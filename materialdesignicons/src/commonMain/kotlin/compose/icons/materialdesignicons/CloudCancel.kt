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

public val MaterialDesignIcons.CloudCancel: ImageVector
    get() {
        if (_cloudCancel != null) {
            return _cloudCancel!!
        }
        _cloudCancel = Builder(name = "CloudCancel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.5f)
                curveTo(12.0f, 19.0f, 12.07f, 19.5f, 12.18f, 20.0f)
                horizontalLineTo(6.5f)
                curveTo(5.0f, 20.0f, 3.69f, 19.5f, 2.61f, 18.43f)
                curveTo(1.54f, 17.38f, 1.0f, 16.09f, 1.0f, 14.58f)
                curveTo(1.0f, 13.28f, 1.39f, 12.12f, 2.17f, 11.1f)
                reflectiveCurveTo(4.0f, 9.43f, 5.25f, 9.15f)
                curveTo(5.67f, 7.62f, 6.5f, 6.38f, 7.75f, 5.43f)
                reflectiveCurveTo(10.42f, 4.0f, 12.0f, 4.0f)
                curveTo(13.95f, 4.0f, 15.6f, 4.68f, 16.96f, 6.04f)
                curveTo(18.32f, 7.4f, 19.0f, 9.05f, 19.0f, 11.0f)
                curveTo(20.15f, 11.13f, 21.1f, 11.63f, 21.86f, 12.5f)
                curveTo(22.1f, 12.76f, 22.29f, 13.05f, 22.46f, 13.36f)
                curveTo(21.36f, 12.5f, 20.0f, 12.0f, 18.5f, 12.0f)
                curveTo(14.91f, 12.0f, 12.0f, 14.91f, 12.0f, 18.5f)
                moveTo(23.0f, 18.5f)
                curveTo(23.0f, 21.0f, 21.0f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(14.0f, 21.0f, 14.0f, 18.5f)
                reflectiveCurveTo(16.0f, 14.0f, 18.5f, 14.0f)
                reflectiveCurveTo(23.0f, 16.0f, 23.0f, 18.5f)
                moveTo(20.0f, 21.08f)
                lineTo(15.92f, 17.0f)
                curveTo(15.65f, 17.42f, 15.5f, 17.94f, 15.5f, 18.5f)
                curveTo(15.5f, 20.16f, 16.84f, 21.5f, 18.5f, 21.5f)
                curveTo(19.06f, 21.5f, 19.58f, 21.35f, 20.0f, 21.08f)
                moveTo(21.5f, 18.5f)
                curveTo(21.5f, 16.84f, 20.16f, 15.5f, 18.5f, 15.5f)
                curveTo(17.94f, 15.5f, 17.42f, 15.65f, 17.0f, 15.92f)
                lineTo(21.08f, 20.0f)
                curveTo(21.35f, 19.58f, 21.5f, 19.06f, 21.5f, 18.5f)
                close()
            }
        }
        .build()
        return _cloudCancel!!
    }

private var _cloudCancel: ImageVector? = null
