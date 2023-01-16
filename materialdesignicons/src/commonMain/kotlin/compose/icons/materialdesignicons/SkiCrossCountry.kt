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

public val MaterialDesignIcons.SkiCrossCountry: ImageVector
    get() {
        if (_skiCrossCountry != null) {
            return _skiCrossCountry!!
        }
        _skiCrossCountry = Builder(name = "SkiCrossCountry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                horizontalLineTo(17.6f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                moveTo(6.44f, 22.0f)
                horizontalLineTo(5.0f)
                lineTo(7.0f, 14.0f)
                horizontalLineTo(8.44f)
                lineTo(6.44f, 22.0f)
                moveTo(8.76f, 9.54f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.32f)
                lineTo(11.61f, 6.31f)
                curveTo(12.04f, 6.14f, 12.5f, 6.13f, 12.96f, 6.27f)
                reflectiveCurveTo(13.79f, 6.69f, 14.06f, 7.1f)
                lineTo(15.0f, 8.58f)
                curveTo(15.37f, 9.25f, 15.9f, 9.95f, 16.62f, 10.37f)
                curveTo(17.33f, 10.79f, 18.13f, 11.0f, 19.0f, 11.0f)
                verticalLineTo(12.83f)
                curveTo(18.0f, 12.83f, 17.0f, 12.62f, 16.13f, 12.2f)
                reflectiveCurveTo(14.5f, 11.06f, 13.88f, 10.37f)
                lineTo(13.31f, 13.16f)
                lineTo(15.28f, 15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.4f)
                verticalLineTo(16.5f)
                lineTo(11.5f, 14.55f)
                lineTo(9.77f, 22.0f)
                horizontalLineTo(7.8f)
                lineTo(10.43f, 8.89f)
                lineTo(8.76f, 9.54f)
                moveTo(16.0f, 4.0f)
                curveTo(16.0f, 5.11f, 15.11f, 6.0f, 14.0f, 6.0f)
                reflectiveCurveTo(12.0f, 5.11f, 12.0f, 4.0f)
                reflectiveCurveTo(12.9f, 2.0f, 14.0f, 2.0f)
                reflectiveCurveTo(16.0f, 2.9f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _skiCrossCountry!!
    }

private var _skiCrossCountry: ImageVector? = null
