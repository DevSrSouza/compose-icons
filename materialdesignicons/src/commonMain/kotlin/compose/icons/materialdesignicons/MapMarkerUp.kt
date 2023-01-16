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

public val MaterialDesignIcons.MapMarkerUp: ImageVector
    get() {
        if (_mapMarkerUp != null) {
            return _mapMarkerUp!!
        }
        _mapMarkerUp = Builder(name = "MapMarkerUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 9.0f)
                curveTo(5.0f, 14.25f, 12.0f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(19.0f, 14.25f, 19.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(16.5f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                lineTo(12.0f, 4.5f)
                close()
            }
        }
        .build()
        return _mapMarkerUp!!
    }

private var _mapMarkerUp: ImageVector? = null
