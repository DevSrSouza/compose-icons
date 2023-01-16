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

public val MaterialDesignIcons.OfficeBuildingMarkerOutline: ImageVector
    get() {
        if (_officeBuildingMarkerOutline != null) {
            return _officeBuildingMarkerOutline!!
        }
        _officeBuildingMarkerOutline = Builder(name = "OfficeBuildingMarkerOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                moveTo(17.0f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                moveTo(13.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                moveTo(11.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                moveTo(9.0f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                moveTo(9.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                moveTo(14.55f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.03f)
                curveTo(19.71f, 11.09f, 20.39f, 11.31f, 21.0f, 11.63f)
                verticalLineTo(1.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.91f)
                curveTo(15.5f, 22.44f, 15.0f, 21.76f, 14.55f, 21.0f)
                moveTo(7.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                moveTo(9.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                moveTo(22.0f, 16.5f)
                curveTo(22.0f, 19.1f, 18.5f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(15.0f, 19.1f, 15.0f, 16.5f)
                curveTo(15.0f, 14.6f, 16.6f, 13.0f, 18.5f, 13.0f)
                reflectiveCurveTo(22.0f, 14.6f, 22.0f, 16.5f)
                moveTo(19.7f, 16.6f)
                curveTo(19.7f, 16.0f, 19.1f, 15.4f, 18.5f, 15.4f)
                reflectiveCurveTo(17.3f, 15.9f, 17.3f, 16.6f)
                curveTo(17.3f, 17.2f, 17.8f, 17.8f, 18.5f, 17.8f)
                reflectiveCurveTo(19.8f, 17.2f, 19.7f, 16.6f)
                close()
            }
        }
        .build()
        return _officeBuildingMarkerOutline!!
    }

private var _officeBuildingMarkerOutline: ImageVector? = null
