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

public val MaterialDesignIcons.CellphoneMarker: ImageVector
    get() {
        if (_cellphoneMarker != null) {
            return _cellphoneMarker!!
        }
        _cellphoneMarker = Builder(name = "CellphoneMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 13.0f)
                curveTo(16.6f, 13.0f, 15.0f, 14.61f, 15.0f, 16.5f)
                curveTo(15.0f, 19.11f, 18.5f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(22.0f, 19.11f, 22.0f, 16.5f)
                curveTo(22.0f, 14.61f, 20.4f, 13.0f, 18.5f, 13.0f)
                moveTo(18.5f, 17.81f)
                curveTo(17.8f, 17.81f, 17.3f, 17.21f, 17.3f, 16.61f)
                curveTo(17.3f, 15.91f, 17.9f, 15.41f, 18.5f, 15.41f)
                reflectiveCurveTo(19.7f, 16.0f, 19.7f, 16.61f)
                curveTo(19.8f, 17.21f, 19.2f, 17.81f, 18.5f, 17.81f)
                moveTo(15.91f, 23.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 23.0f, 5.0f, 22.11f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 1.89f, 5.89f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 1.0f, 19.0f, 1.89f, 19.0f, 3.0f)
                verticalLineTo(11.03f)
                curveTo(18.84f, 11.0f, 18.67f, 11.0f, 18.5f, 11.0f)
                curveTo(18.0f, 11.0f, 17.5f, 11.08f, 17.0f, 11.22f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.54f)
                curveTo(14.14f, 20.5f, 15.12f, 21.97f, 15.91f, 23.0f)
                close()
            }
        }
        .build()
        return _cellphoneMarker!!
    }

private var _cellphoneMarker: ImageVector? = null
