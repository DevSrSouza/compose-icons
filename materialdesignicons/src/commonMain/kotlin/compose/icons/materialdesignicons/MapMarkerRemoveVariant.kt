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

public val MaterialDesignIcons.MapMarkerRemoveVariant: ImageVector
    get() {
        if (_mapMarkerRemoveVariant != null) {
            return _mapMarkerRemoveVariant!!
        }
        _mapMarkerRemoveVariant = Builder(name = "MapMarkerRemoveVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f)
                curveTo(5.0f, 14.25f, 12.0f, 22.0f, 12.0f, 22.0f)
                curveTo(12.0f, 22.0f, 19.0f, 14.25f, 19.0f, 9.0f)
                curveTo(19.0f, 5.14f, 15.86f, 2.0f, 12.0f, 2.0f)
                moveTo(9.59f, 5.17f)
                lineTo(12.0f, 7.58f)
                lineTo(14.41f, 5.17f)
                lineTo(15.83f, 6.58f)
                lineTo(13.41f, 9.0f)
                lineTo(15.83f, 11.41f)
                lineTo(14.41f, 12.83f)
                lineTo(12.0f, 10.41f)
                lineTo(9.59f, 12.83f)
                lineTo(8.17f, 11.41f)
                lineTo(10.59f, 9.0f)
                lineTo(8.17f, 6.58f)
            }
        }
        .build()
        return _mapMarkerRemoveVariant!!
    }

private var _mapMarkerRemoveVariant: ImageVector? = null
