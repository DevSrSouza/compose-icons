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

public val MaterialDesignIcons.DatabaseImport: ImageVector
    get() {
        if (_databaseImport != null) {
            return _databaseImport!!
        }
        _databaseImport = Builder(name = "DatabaseImport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(8.59f, 3.0f, 5.69f, 4.07f, 4.54f, 5.57f)
                lineTo(9.79f, 10.82f)
                curveTo(10.5f, 10.93f, 11.22f, 11.0f, 12.0f, 11.0f)
                curveTo(16.42f, 11.0f, 20.0f, 9.21f, 20.0f, 7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                moveTo(3.92f, 7.08f)
                lineTo(2.5f, 8.5f)
                lineTo(5.0f, 11.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                lineTo(2.5f, 15.5f)
                lineTo(3.92f, 16.92f)
                lineTo(8.84f, 12.0f)
                moveTo(20.0f, 9.0f)
                curveTo(20.0f, 11.21f, 16.42f, 13.0f, 12.0f, 13.0f)
                curveTo(11.34f, 13.0f, 10.7f, 12.95f, 10.09f, 12.87f)
                lineTo(7.62f, 15.34f)
                curveTo(8.88f, 15.75f, 10.38f, 16.0f, 12.0f, 16.0f)
                curveTo(16.42f, 16.0f, 20.0f, 14.21f, 20.0f, 12.0f)
                moveTo(20.0f, 14.0f)
                curveTo(20.0f, 16.21f, 16.42f, 18.0f, 12.0f, 18.0f)
                curveTo(9.72f, 18.0f, 7.67f, 17.5f, 6.21f, 16.75f)
                lineTo(4.53f, 18.43f)
                curveTo(5.68f, 19.93f, 8.59f, 21.0f, 12.0f, 21.0f)
                curveTo(16.42f, 21.0f, 20.0f, 19.21f, 20.0f, 17.0f)
            }
        }
        .build()
        return _databaseImport!!
    }

private var _databaseImport: ImageVector? = null
