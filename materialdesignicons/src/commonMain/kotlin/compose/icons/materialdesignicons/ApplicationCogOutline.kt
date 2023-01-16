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

public val MaterialDesignIcons.ApplicationCogOutline: ImageVector
    get() {
        if (_applicationCogOutline != null) {
            return _applicationCogOutline!!
        }
        _applicationCogOutline = Builder(name = "ApplicationCogOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7f, 18.6f)
                verticalLineTo(17.6f)
                lineTo(22.8f, 16.8f)
                curveTo(22.9f, 16.7f, 23.0f, 16.6f, 22.9f, 16.5f)
                lineTo(21.9f, 14.8f)
                curveTo(21.9f, 14.7f, 21.7f, 14.7f, 21.6f, 14.7f)
                lineTo(20.4f, 15.2f)
                curveTo(20.1f, 15.0f, 19.8f, 14.8f, 19.5f, 14.7f)
                lineTo(19.3f, 13.4f)
                curveTo(19.3f, 13.3f, 19.2f, 13.2f, 19.1f, 13.2f)
                horizontalLineTo(17.1f)
                curveTo(16.9f, 13.2f, 16.8f, 13.3f, 16.8f, 13.4f)
                lineTo(16.6f, 14.7f)
                curveTo(16.3f, 14.9f, 16.1f, 15.0f, 15.8f, 15.2f)
                lineTo(14.6f, 14.7f)
                curveTo(14.5f, 14.7f, 14.4f, 14.7f, 14.3f, 14.8f)
                lineTo(13.3f, 16.5f)
                curveTo(13.3f, 16.6f, 13.3f, 16.7f, 13.4f, 16.8f)
                lineTo(14.5f, 17.6f)
                verticalLineTo(18.6f)
                lineTo(13.4f, 19.4f)
                curveTo(13.3f, 19.5f, 13.2f, 19.6f, 13.3f, 19.7f)
                lineTo(14.3f, 21.4f)
                curveTo(14.4f, 21.5f, 14.5f, 21.5f, 14.6f, 21.5f)
                lineTo(15.8f, 21.0f)
                curveTo(16.0f, 21.2f, 16.3f, 21.4f, 16.6f, 21.5f)
                lineTo(16.8f, 22.8f)
                curveTo(16.9f, 22.9f, 17.0f, 23.0f, 17.1f, 23.0f)
                horizontalLineTo(19.1f)
                curveTo(19.2f, 23.0f, 19.3f, 22.9f, 19.3f, 22.8f)
                lineTo(19.5f, 21.5f)
                curveTo(19.8f, 21.3f, 20.0f, 21.2f, 20.3f, 21.0f)
                lineTo(21.5f, 21.4f)
                curveTo(21.6f, 21.4f, 21.7f, 21.4f, 21.8f, 21.3f)
                lineTo(22.8f, 19.6f)
                curveTo(22.9f, 19.5f, 22.9f, 19.4f, 22.8f, 19.4f)
                lineTo(21.7f, 18.6f)
                moveTo(18.0f, 19.5f)
                curveTo(17.2f, 19.5f, 16.5f, 18.8f, 16.5f, 18.0f)
                reflectiveCurveTo(17.2f, 16.5f, 18.0f, 16.5f)
                reflectiveCurveTo(19.5f, 17.2f, 19.5f, 18.0f)
                reflectiveCurveTo(18.8f, 19.5f, 18.0f, 19.5f)
                moveTo(12.3f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 22.0f, 1.0f, 21.1f, 1.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 2.9f, 1.9f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 2.0f, 23.0f, 2.9f, 23.0f, 4.0f)
                verticalLineTo(13.1f)
                curveTo(22.4f, 12.5f, 21.7f, 12.0f, 21.0f, 11.7f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.3f)
                curveTo(11.5f, 20.7f, 11.8f, 21.4f, 12.3f, 22.0f)
                close()
            }
        }
        .build()
        return _applicationCogOutline!!
    }

private var _applicationCogOutline: ImageVector? = null
