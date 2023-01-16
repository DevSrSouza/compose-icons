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

public val MaterialDesignIcons.DatabaseClock: ImageVector
    get() {
        if (_databaseClock != null) {
            return _databaseClock!!
        }
        _databaseClock = Builder(name = "DatabaseClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                moveTo(23.0f, 16.0f)
                curveTo(23.0f, 19.87f, 19.87f, 23.0f, 16.0f, 23.0f)
                curveTo(13.61f, 23.0f, 11.5f, 21.8f, 10.25f, 20.0f)
                curveTo(6.18f, 19.79f, 3.0f, 18.08f, 3.0f, 16.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 14.88f, 5.58f, 16.44f, 9.06f, 16.88f)
                curveTo(9.03f, 16.59f, 9.0f, 16.3f, 9.0f, 16.0f)
                curveTo(9.0f, 15.62f, 9.04f, 15.25f, 9.1f, 14.88f)
                curveTo(5.6f, 14.45f, 3.0f, 12.88f, 3.0f, 11.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 10.09f, 6.2f, 11.8f, 10.27f, 12.0f)
                curveTo(10.87f, 11.14f, 11.64f, 10.44f, 12.53f, 9.93f)
                curveTo(12.04f, 9.97f, 11.5f, 10.0f, 11.0f, 10.0f)
                curveTo(6.58f, 10.0f, 3.0f, 8.21f, 3.0f, 6.0f)
                reflectiveCurveTo(6.58f, 2.0f, 11.0f, 2.0f)
                reflectiveCurveTo(19.0f, 3.79f, 19.0f, 6.0f)
                curveTo(19.0f, 7.2f, 17.93f, 8.28f, 16.25f, 9.0f)
                curveTo(17.0f, 9.04f, 17.75f, 9.19f, 18.44f, 9.45f)
                curveTo(18.79f, 9.0f, 19.0f, 8.5f, 19.0f, 8.0f)
                verticalLineTo(9.68f)
                curveTo(21.36f, 10.81f, 23.0f, 13.21f, 23.0f, 16.0f)
                moveTo(21.0f, 16.0f)
                curveTo(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(11.0f, 13.24f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 21.0f, 16.0f, 21.0f)
                reflectiveCurveTo(21.0f, 18.76f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _databaseClock!!
    }

private var _databaseClock: ImageVector? = null
