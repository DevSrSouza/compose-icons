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

public val MaterialDesignIcons.OfficeBuildingMarker: ImageVector
    get() {
        if (_officeBuildingMarker != null) {
            return _officeBuildingMarker!!
        }
        _officeBuildingMarker = Builder(name = "OfficeBuildingMarker", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.19f, 21.0f)
                curveTo(14.12f, 19.43f, 13.0f, 17.36f, 13.0f, 15.5f)
                curveTo(13.0f, 13.67f, 13.96f, 12.0f, 15.4f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.23f)
                curveTo(17.5f, 10.09f, 18.0f, 10.0f, 18.5f, 10.0f)
                curveTo(18.67f, 10.0f, 18.84f, 10.0f, 19.0f, 10.03f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.19f)
                moveTo(15.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                moveTo(9.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                moveTo(9.0f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                moveTo(9.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                moveTo(9.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                moveTo(11.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                moveTo(11.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                moveTo(11.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                moveTo(18.5f, 12.0f)
                curveTo(16.6f, 12.0f, 15.0f, 13.61f, 15.0f, 15.5f)
                curveTo(15.0f, 18.11f, 18.5f, 22.0f, 18.5f, 22.0f)
                reflectiveCurveTo(22.0f, 18.11f, 22.0f, 15.5f)
                curveTo(22.0f, 13.61f, 20.4f, 12.0f, 18.5f, 12.0f)
                moveTo(18.5f, 16.81f)
                curveTo(17.8f, 16.81f, 17.3f, 16.21f, 17.3f, 15.61f)
                curveTo(17.3f, 14.91f, 17.9f, 14.41f, 18.5f, 14.41f)
                reflectiveCurveTo(19.7f, 15.0f, 19.7f, 15.61f)
                curveTo(19.8f, 16.21f, 19.2f, 16.81f, 18.5f, 16.81f)
                close()
            }
        }
        .build()
        return _officeBuildingMarker!!
    }

private var _officeBuildingMarker: ImageVector? = null
