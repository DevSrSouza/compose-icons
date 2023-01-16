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

public val MaterialDesignIcons.LeafCircle: ImageVector
    get() {
        if (_leafCircle != null) {
            return _leafCircle!!
        }
        _leafCircle = Builder(name = "LeafCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(9.6f, 17.2f)
                curveTo(9.38f, 17.2f, 9.08f, 17.12f, 8.8f, 17.0f)
                lineTo(8.23f, 18.4f)
                lineTo(7.09f, 18.0f)
                lineTo(7.25f, 17.61f)
                curveTo(8.45f, 14.59f, 9.83f, 11.15f, 15.0f, 10.0f)
                curveTo(15.0f, 10.0f, 9.0f, 10.0f, 7.05f, 15.55f)
                curveTo(7.05f, 15.55f, 6.0f, 14.5f, 6.0f, 13.3f)
                reflectiveCurveTo(7.2f, 9.55f, 10.2f, 8.95f)
                curveTo(11.05f, 8.78f, 12.0f, 8.65f, 12.94f, 8.5f)
                curveTo(15.3f, 8.18f, 17.57f, 7.86f, 18.0f, 7.0f)
                curveTo(18.0f, 7.0f, 16.2f, 17.2f, 9.6f, 17.2f)
                close()
            }
        }
        .build()
        return _leafCircle!!
    }

private var _leafCircle: ImageVector? = null
