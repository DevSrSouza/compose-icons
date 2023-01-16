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

public val MaterialDesignIcons.CompassOutline: ImageVector
    get() {
        if (_compassOutline != null) {
            return _compassOutline!!
        }
        _compassOutline = Builder(name = "CompassOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 17.0f)
                lineTo(10.2f, 10.2f)
                lineTo(17.0f, 7.0f)
                lineTo(13.8f, 13.8f)
                lineTo(7.0f, 17.0f)
                moveTo(12.0f, 11.1f)
                arcTo(0.9f, 0.9f, 0.0f, false, false, 11.1f, 12.0f)
                arcTo(0.9f, 0.9f, 0.0f, false, false, 12.0f, 12.9f)
                arcTo(0.9f, 0.9f, 0.0f, false, false, 12.9f, 12.0f)
                arcTo(0.9f, 0.9f, 0.0f, false, false, 12.0f, 11.1f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _compassOutline!!
    }

private var _compassOutline: ImageVector? = null
