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

public val MaterialDesignIcons.ElevationRise: ImageVector
    get() {
        if (_elevationRise != null) {
            return _elevationRise!!
        }
        _elevationRise = Builder(name = "ElevationRise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                verticalLineTo(17.29f)
                lineTo(10.78f, 12.8f)
                lineTo(14.55f, 15.0f)
                lineTo(21.0f, 11.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                moveTo(21.0f, 8.94f)
                lineTo(14.55f, 12.67f)
                lineTo(10.78f, 10.5f)
                lineTo(3.0f, 15.0f)
                verticalLineTo(12.79f)
                lineTo(10.78f, 8.3f)
                lineTo(14.55f, 10.5f)
                lineTo(21.0f, 6.75f)
                verticalLineTo(8.94f)
                close()
            }
        }
        .build()
        return _elevationRise!!
    }

private var _elevationRise: ImageVector? = null
