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

public val MaterialDesignIcons.MapMarkerQuestion: ImageVector
    get() {
        if (_mapMarkerQuestion != null) {
            return _mapMarkerQuestion!!
        }
        _mapMarkerQuestion = Builder(name = "MapMarkerQuestion", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f)
                curveTo(5.0f, 14.25f, 12.0f, 22.0f, 12.0f, 22.0f)
                curveTo(12.0f, 22.0f, 19.0f, 14.25f, 19.0f, 9.0f)
                curveTo(19.0f, 5.14f, 15.86f, 2.0f, 12.0f, 2.0f)
                moveTo(12.88f, 15.75f)
                horizontalLineTo(11.13f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.88f)
                moveTo(12.88f, 12.88f)
                horizontalLineTo(11.13f)
                curveTo(11.13f, 10.04f, 13.75f, 10.26f, 13.75f, 8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 12.0f, 6.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 10.25f, 8.5f)
                horizontalLineTo(8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.5f, 8.5f)
                curveTo(15.5f, 10.69f, 12.88f, 10.91f, 12.88f, 12.88f)
                close()
            }
        }
        .build()
        return _mapMarkerQuestion!!
    }

private var _mapMarkerQuestion: ImageVector? = null
