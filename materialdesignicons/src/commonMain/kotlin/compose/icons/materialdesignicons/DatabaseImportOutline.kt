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

public val MaterialDesignIcons.DatabaseImportOutline: ImageVector
    get() {
        if (_databaseImportOutline != null) {
            return _databaseImportOutline!!
        }
        _databaseImportOutline = Builder(name = "DatabaseImportOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.84f, 12.0f)
                lineTo(3.92f, 16.92f)
                lineTo(2.5f, 15.5f)
                lineTo(5.0f, 13.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                lineTo(2.5f, 8.5f)
                lineTo(3.92f, 7.08f)
                lineTo(8.84f, 12.0f)
                moveTo(12.0f, 3.0f)
                curveTo(8.59f, 3.0f, 5.68f, 4.07f, 4.53f, 5.57f)
                lineTo(5.0f, 6.0f)
                lineTo(6.03f, 7.07f)
                curveTo(6.0f, 7.05f, 6.0f, 7.0f, 6.0f, 7.0f)
                curveTo(6.0f, 6.5f, 8.13f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(18.0f, 6.5f, 18.0f, 7.0f)
                reflectiveCurveTo(15.87f, 9.0f, 12.0f, 9.0f)
                curveTo(9.38f, 9.0f, 7.58f, 8.31f, 6.68f, 7.72f)
                lineTo(9.8f, 10.84f)
                curveTo(10.5f, 10.94f, 11.24f, 11.0f, 12.0f, 11.0f)
                curveTo(14.39f, 11.0f, 16.53f, 10.47f, 18.0f, 9.64f)
                verticalLineTo(12.45f)
                curveTo(16.7f, 13.4f, 14.42f, 14.0f, 12.0f, 14.0f)
                curveTo(11.04f, 14.0f, 10.1f, 13.9f, 9.24f, 13.73f)
                lineTo(7.59f, 15.37f)
                curveTo(8.91f, 15.77f, 10.41f, 16.0f, 12.0f, 16.0f)
                curveTo(14.28f, 16.0f, 16.39f, 15.55f, 18.0f, 14.77f)
                verticalLineTo(17.0f)
                curveTo(18.0f, 17.5f, 15.87f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveTo(6.0f, 17.5f, 6.0f, 17.0f)
                verticalLineTo(16.96f)
                lineTo(5.0f, 18.0f)
                lineTo(4.54f, 18.43f)
                curveTo(5.69f, 19.93f, 8.6f, 21.0f, 12.0f, 21.0f)
                curveTo(16.41f, 21.0f, 20.0f, 19.21f, 20.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _databaseImportOutline!!
    }

private var _databaseImportOutline: ImageVector? = null
