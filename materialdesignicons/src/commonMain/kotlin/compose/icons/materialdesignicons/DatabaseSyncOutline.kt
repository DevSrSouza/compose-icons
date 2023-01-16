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

public val MaterialDesignIcons.DatabaseSyncOutline: ImageVector
    get() {
        if (_databaseSyncOutline != null) {
            return _databaseSyncOutline!!
        }
        _databaseSyncOutline = Builder(name = "DatabaseSyncOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveTo(12.41f, 16.0f, 12.81f, 15.97f, 13.21f, 15.94f)
                curveTo(13.4f, 15.18f, 13.72f, 14.46f, 14.16f, 13.83f)
                curveTo(13.47f, 13.94f, 12.74f, 14.0f, 12.0f, 14.0f)
                curveTo(9.58f, 14.0f, 7.3f, 13.4f, 6.0f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(16.53f, 10.47f, 18.0f, 9.64f)
                verticalLineTo(11.19f)
                curveTo(18.5f, 11.07f, 19.0f, 11.0f, 19.55f, 11.0f)
                curveTo(19.7f, 11.0f, 19.85f, 11.0f, 20.0f, 11.03f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.0f, 4.79f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.59f, 21.0f, 12.0f, 21.0f)
                curveTo(12.66f, 21.0f, 13.31f, 20.96f, 13.92f, 20.88f)
                curveTo(13.57f, 20.29f, 13.31f, 19.64f, 13.16f, 18.94f)
                curveTo(12.79f, 19.0f, 12.41f, 19.0f, 12.0f, 19.0f)
                curveTo(8.13f, 19.0f, 6.0f, 17.5f, 6.0f, 17.0f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16.0f, 12.0f, 16.0f)
                moveTo(12.0f, 5.0f)
                curveTo(15.87f, 5.0f, 18.0f, 6.5f, 18.0f, 7.0f)
                reflectiveCurveTo(15.87f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(6.0f, 7.5f, 6.0f, 7.0f)
                reflectiveCurveTo(8.13f, 5.0f, 12.0f, 5.0f)
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 18.32f, 22.75f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                curveTo(21.5f, 16.12f, 20.38f, 15.0f, 19.0f, 15.0f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19.0f, 12.0f)
                verticalLineTo(13.5f)
                curveTo(21.21f, 13.5f, 23.0f, 15.29f, 23.0f, 17.5f)
                moveTo(19.0f, 18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19.0f, 23.0f)
                verticalLineTo(21.5f)
                curveTo(16.79f, 21.5f, 15.0f, 19.71f, 15.0f, 17.5f)
                curveTo(15.0f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                curveTo(16.5f, 18.88f, 17.62f, 20.0f, 19.0f, 20.0f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _databaseSyncOutline!!
    }

private var _databaseSyncOutline: ImageVector? = null
