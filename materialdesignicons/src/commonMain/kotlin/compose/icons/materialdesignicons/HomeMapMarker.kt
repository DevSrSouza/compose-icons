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

public val MaterialDesignIcons.HomeMapMarker: ImageVector
    get() {
        if (_homeMapMarker != null) {
            return _homeMapMarker!!
        }
        _homeMapMarker = Builder(name = "HomeMapMarker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(2.0f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                lineTo(12.0f, 3.0f)
                moveTo(12.0f, 7.7f)
                curveTo(14.1f, 7.7f, 15.8f, 9.4f, 15.8f, 11.5f)
                curveTo(15.8f, 14.5f, 12.0f, 18.0f, 12.0f, 18.0f)
                curveTo(12.0f, 18.0f, 8.2f, 14.5f, 8.2f, 11.5f)
                curveTo(8.2f, 9.4f, 9.9f, 7.7f, 12.0f, 7.7f)
                moveTo(12.0f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _homeMapMarker!!
    }

private var _homeMapMarker: ImageVector? = null
