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

public val MaterialDesignIcons.DatabaseMarker: ImageVector
    get() {
        if (_databaseMarker != null) {
            return _databaseMarker!!
        }
        _databaseMarker = Builder(name = "DatabaseMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                curveTo(16.6f, 12.0f, 15.0f, 13.6f, 15.0f, 15.5f)
                curveTo(15.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                reflectiveCurveTo(22.0f, 18.1f, 22.0f, 15.5f)
                curveTo(22.0f, 13.6f, 20.4f, 12.0f, 18.5f, 12.0f)
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(19.7f, 15.0f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                moveTo(4.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 11.21f, 7.58f, 13.0f, 12.0f, 13.0f)
                curveTo(12.57f, 13.0f, 13.13f, 12.97f, 13.67f, 12.91f)
                curveTo(13.25f, 13.69f, 13.0f, 14.57f, 13.0f, 15.5f)
                curveTo(13.0f, 15.65f, 13.0f, 15.81f, 13.03f, 15.96f)
                curveTo(12.69f, 16.0f, 12.35f, 16.0f, 12.0f, 16.0f)
                curveTo(7.58f, 16.0f, 4.0f, 14.21f, 4.0f, 12.0f)
                moveTo(4.0f, 7.0f)
                curveTo(4.0f, 4.79f, 7.58f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(20.0f, 4.79f, 20.0f, 7.0f)
                reflectiveCurveTo(16.42f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(4.0f, 9.21f, 4.0f, 7.0f)
                moveTo(15.0f, 20.71f)
                curveTo(14.07f, 20.9f, 13.06f, 21.0f, 12.0f, 21.0f)
                curveTo(7.58f, 21.0f, 4.0f, 19.21f, 4.0f, 17.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 16.21f, 7.58f, 18.0f, 12.0f, 18.0f)
                curveTo(12.5f, 18.0f, 13.03f, 17.97f, 13.5f, 17.93f)
                curveTo(13.9f, 18.91f, 14.44f, 19.87f, 15.0f, 20.71f)
                close()
            }
        }
        .build()
        return _databaseMarker!!
    }

private var _databaseMarker: ImageVector? = null
