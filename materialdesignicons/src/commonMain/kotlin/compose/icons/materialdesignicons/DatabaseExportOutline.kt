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

public val MaterialDesignIcons.DatabaseExportOutline: ImageVector
    get() {
        if (_databaseExportOutline != null) {
            return _databaseExportOutline!!
        }
        _databaseExportOutline = Builder(name = "DatabaseExportOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.86f, 18.0f)
                lineTo(18.9f, 19.0f)
                curveTo(17.5f, 20.2f, 14.94f, 21.0f, 12.0f, 21.0f)
                curveTo(7.59f, 21.0f, 4.0f, 19.21f, 4.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 4.79f, 7.58f, 3.0f, 12.0f, 3.0f)
                curveTo(14.95f, 3.0f, 17.5f, 3.8f, 18.9f, 5.0f)
                lineTo(17.86f, 6.0f)
                lineTo(17.5f, 6.4f)
                curveTo(16.65f, 5.77f, 14.78f, 5.0f, 12.0f, 5.0f)
                curveTo(8.13f, 5.0f, 6.0f, 6.5f, 6.0f, 7.0f)
                reflectiveCurveTo(8.13f, 9.0f, 12.0f, 9.0f)
                curveTo(13.37f, 9.0f, 14.5f, 8.81f, 15.42f, 8.54f)
                lineTo(16.38f, 9.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.92f)
                curveTo(13.0f, 10.97f, 12.5f, 11.0f, 12.0f, 11.0f)
                curveTo(9.61f, 11.0f, 7.47f, 10.47f, 6.0f, 9.64f)
                verticalLineTo(12.45f)
                curveTo(7.3f, 13.4f, 9.58f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5f, 14.0f, 13.0f, 13.97f, 13.5f, 13.92f)
                verticalLineTo(14.5f)
                horizontalLineTo(16.38f)
                lineTo(15.38f, 15.5f)
                lineTo(15.5f, 15.61f)
                curveTo(14.41f, 15.86f, 13.24f, 16.0f, 12.0f, 16.0f)
                curveTo(9.72f, 16.0f, 7.61f, 15.55f, 6.0f, 14.77f)
                verticalLineTo(17.0f)
                curveTo(6.0f, 17.5f, 8.13f, 19.0f, 12.0f, 19.0f)
                curveTo(14.78f, 19.0f, 16.65f, 18.23f, 17.5f, 17.61f)
                lineTo(17.86f, 18.0f)
                moveTo(18.92f, 7.08f)
                lineTo(17.5f, 8.5f)
                lineTo(20.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                lineTo(17.5f, 15.5f)
                lineTo(18.92f, 16.92f)
                lineTo(23.84f, 12.0f)
                lineTo(18.92f, 7.08f)
                close()
            }
        }
        .build()
        return _databaseExportOutline!!
    }

private var _databaseExportOutline: ImageVector? = null
