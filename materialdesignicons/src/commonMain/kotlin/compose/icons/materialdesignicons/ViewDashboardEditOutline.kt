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

public val MaterialDesignIcons.ViewDashboardEditOutline: ImageVector
    get() {
        if (_viewDashboardEditOutline != null) {
            return _viewDashboardEditOutline!!
        }
        _viewDashboardEditOutline = Builder(name = "ViewDashboardEditOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.1f)
                curveTo(20.9f, 13.1f, 20.7f, 13.2f, 20.6f, 13.3f)
                lineTo(19.6f, 14.3f)
                lineTo(21.7f, 16.4f)
                lineTo(22.7f, 15.4f)
                curveTo(22.9f, 15.2f, 22.9f, 14.8f, 22.7f, 14.6f)
                lineTo(21.4f, 13.3f)
                curveTo(21.3f, 13.2f, 21.2f, 13.1f, 21.0f, 13.1f)
                moveTo(19.1f, 14.9f)
                lineTo(13.0f, 20.9f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.1f)
                lineTo(21.2f, 16.9f)
                lineTo(19.1f, 14.9f)
                moveTo(21.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                moveTo(13.0f, 18.06f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.1f)
                curveTo(20.24f, 11.1f, 19.57f, 11.5f, 19.19f, 11.89f)
                lineTo(18.07f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.07f)
                lineTo(13.0f, 18.06f)
                moveTo(11.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                moveTo(9.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                moveTo(11.0f, 20.06f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.06f)
                moveTo(9.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _viewDashboardEditOutline!!
    }

private var _viewDashboardEditOutline: ImageVector? = null
