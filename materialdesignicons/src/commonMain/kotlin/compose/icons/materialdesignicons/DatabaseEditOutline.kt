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

public val MaterialDesignIcons.DatabaseEditOutline: ImageVector
    get() {
        if (_databaseEditOutline != null) {
            return _databaseEditOutline!!
        }
        _databaseEditOutline = Builder(name = "DatabaseEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveTo(12.8f, 16.0f, 13.57f, 15.93f, 14.31f, 15.82f)
                lineTo(17.22f, 12.91f)
                curveTo(15.89f, 13.59f, 14.0f, 14.0f, 12.0f, 14.0f)
                curveTo(9.58f, 14.0f, 7.3f, 13.4f, 6.0f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(16.53f, 10.47f, 18.0f, 9.64f)
                verticalLineTo(12.13f)
                lineTo(19.39f, 10.74f)
                curveTo(19.57f, 10.56f, 19.78f, 10.42f, 20.0f, 10.3f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.0f, 4.79f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.04f, 7.06f, 20.72f, 11.0f, 20.97f)
                verticalLineTo(19.13f)
                lineTo(11.17f, 18.96f)
                curveTo(7.84f, 18.76f, 6.0f, 17.46f, 6.0f, 17.0f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16.0f, 12.0f, 16.0f)
                moveTo(12.0f, 5.0f)
                curveTo(15.87f, 5.0f, 18.0f, 6.5f, 18.0f, 7.0f)
                reflectiveCurveTo(15.87f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(6.0f, 7.5f, 6.0f, 7.0f)
                reflectiveCurveTo(8.13f, 5.0f, 12.0f, 5.0f)
                moveTo(19.13f, 13.83f)
                lineTo(21.17f, 15.87f)
                lineTo(15.04f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.96f)
                lineTo(19.13f, 13.83f)
                moveTo(22.85f, 14.19f)
                lineTo(21.87f, 15.17f)
                lineTo(19.83f, 13.13f)
                lineTo(20.81f, 12.15f)
                curveTo(21.0f, 11.95f, 21.33f, 11.95f, 21.53f, 12.15f)
                lineTo(22.85f, 13.47f)
                curveTo(23.05f, 13.67f, 23.05f, 14.0f, 22.85f, 14.19f)
                close()
            }
        }
        .build()
        return _databaseEditOutline!!
    }

private var _databaseEditOutline: ImageVector? = null
