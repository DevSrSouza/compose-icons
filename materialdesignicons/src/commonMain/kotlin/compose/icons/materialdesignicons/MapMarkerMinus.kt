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

public val MaterialDesignIcons.MapMarkerMinus: ImageVector
    get() {
        if (_mapMarkerMinus != null) {
            return _mapMarkerMinus!!
        }
        _mapMarkerMinus = Builder(name = "MapMarkerMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 11.5f)
                moveTo(9.0f, 2.0f)
                curveTo(12.86f, 2.0f, 16.0f, 5.13f, 16.0f, 9.0f)
                curveTo(16.0f, 14.25f, 9.0f, 22.0f, 9.0f, 22.0f)
                curveTo(9.0f, 22.0f, 2.0f, 14.25f, 2.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 9.0f, 2.0f)
                moveTo(15.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
