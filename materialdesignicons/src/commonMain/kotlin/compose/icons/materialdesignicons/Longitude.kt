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

public val MaterialDesignIcons.Longitude: ImageVector
    get() {
        if (_longitude != null) {
            return _longitude!!
        }
        _longitude = Builder(name = "Longitude", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.03f, 10.03f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(9.4f, 19.6f)
                arcTo(8.05f, 8.05f, 0.0f, false, true, 9.4f, 4.4f)
                arcTo(16.45f, 16.45f, 0.0f, false, false, 7.5f, 12.0f)
                arcTo(16.45f, 16.45f, 0.0f, false, false, 9.4f, 19.6f)
                moveTo(12.0f, 20.0f)
                arcTo(13.81f, 13.81f, 0.0f, false, true, 9.5f, 12.0f)
                arcTo(13.81f, 13.81f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(13.81f, 13.81f, 0.0f, false, true, 14.5f, 12.0f)
                arcTo(13.81f, 13.81f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(14.6f, 19.6f)
                arcTo(16.15f, 16.15f, 0.0f, false, false, 14.6f, 4.4f)
                arcTo(8.03f, 8.03f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 14.6f, 19.6f)
                close()
            }
        }
        .build()
        return _longitude!!
    }

private var _longitude: ImageVector? = null
