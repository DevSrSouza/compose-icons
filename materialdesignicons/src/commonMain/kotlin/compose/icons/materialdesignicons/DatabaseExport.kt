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

public val MaterialDesignIcons.DatabaseExport: ImageVector
    get() {
        if (_databaseExport != null) {
            return _databaseExport!!
        }
        _databaseExport = Builder(name = "DatabaseExport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.58f, 3.0f, 4.0f, 4.79f, 4.0f, 7.0f)
                curveTo(4.0f, 9.21f, 7.58f, 11.0f, 12.0f, 11.0f)
                curveTo(12.5f, 11.0f, 13.0f, 10.97f, 13.5f, 10.92f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.39f)
                lineTo(15.39f, 8.5f)
                lineTo(18.9f, 5.0f)
                curveTo(17.5f, 3.8f, 14.94f, 3.0f, 12.0f, 3.0f)
                moveTo(18.92f, 7.08f)
                lineTo(17.5f, 8.5f)
                lineTo(20.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                lineTo(17.5f, 15.5f)
                lineTo(18.92f, 16.92f)
                lineTo(23.84f, 12.0f)
                moveTo(4.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 14.21f, 7.58f, 16.0f, 12.0f, 16.0f)
                curveTo(13.17f, 16.0f, 14.26f, 15.85f, 15.25f, 15.63f)
                lineTo(16.38f, 14.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.92f)
                curveTo(13.0f, 12.97f, 12.5f, 13.0f, 12.0f, 13.0f)
                curveTo(7.58f, 13.0f, 4.0f, 11.21f, 4.0f, 9.0f)
                moveTo(4.0f, 14.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.58f, 21.0f, 12.0f, 21.0f)
                curveTo(14.94f, 21.0f, 17.5f, 20.2f, 18.9f, 19.0f)
                lineTo(17.0f, 17.1f)
                curveTo(15.61f, 17.66f, 13.9f, 18.0f, 12.0f, 18.0f)
                curveTo(7.58f, 18.0f, 4.0f, 16.21f, 4.0f, 14.0f)
                close()
            }
        }
        .build()
        return _databaseExport!!
    }

private var _databaseExport: ImageVector? = null
