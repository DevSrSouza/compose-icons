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

public val MaterialDesignIcons.DatabaseMarkerOutline: ImageVector
    get() {
        if (_databaseMarkerOutline != null) {
            return _databaseMarkerOutline!!
        }
        _databaseMarkerOutline = Builder(name = "DatabaseMarkerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(8.13f, 19.0f, 6.0f, 17.5f, 6.0f, 17.0f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16.0f, 12.0f, 16.0f)
                curveTo(12.35f, 16.0f, 12.69f, 15.97f, 13.03f, 15.95f)
                curveTo(13.0f, 15.8f, 13.0f, 15.65f, 13.0f, 15.5f)
                curveTo(13.0f, 14.96f, 13.09f, 14.44f, 13.24f, 13.94f)
                curveTo(12.83f, 14.0f, 12.42f, 14.0f, 12.0f, 14.0f)
                curveTo(9.58f, 14.0f, 7.3f, 13.4f, 6.0f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(16.53f, 10.47f, 18.0f, 9.64f)
                verticalLineTo(10.03f)
                curveTo(18.17f, 10.0f, 18.33f, 10.0f, 18.5f, 10.0f)
                curveTo(19.0f, 10.0f, 19.5f, 10.08f, 20.0f, 10.22f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.0f, 4.79f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.59f, 21.0f, 12.0f, 21.0f)
                curveTo(13.06f, 21.0f, 14.07f, 20.89f, 15.0f, 20.71f)
                curveTo(14.62f, 20.14f, 14.25f, 19.5f, 13.93f, 18.85f)
                curveTo(13.34f, 18.94f, 12.71f, 19.0f, 12.0f, 19.0f)
                moveTo(12.0f, 5.0f)
                curveTo(15.87f, 5.0f, 18.0f, 6.5f, 18.0f, 7.0f)
                reflectiveCurveTo(15.87f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(6.0f, 7.5f, 6.0f, 7.0f)
                reflectiveCurveTo(8.13f, 5.0f, 12.0f, 5.0f)
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
                close()
            }
        }
        .build()
        return _databaseMarkerOutline!!
    }

private var _databaseMarkerOutline: ImageVector? = null
