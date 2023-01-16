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

public val MaterialDesignIcons.SetCenter: ImageVector
    get() {
        if (_setCenter != null) {
            return _setCenter!!
        }
        _setCenter = Builder(name = "SetCenter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 9.0f, 19.0f)
                curveTo(10.04f, 19.0f, 11.06f, 18.76f, 12.0f, 18.32f)
                curveTo(12.94f, 18.76f, 13.96f, 19.0f, 15.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 15.0f, 5.0f)
                curveTo(13.96f, 5.0f, 12.94f, 5.24f, 12.0f, 5.68f)
                curveTo(11.06f, 5.24f, 10.04f, 5.0f, 9.0f, 5.0f)
                moveTo(9.0f, 7.0f)
                curveTo(9.34f, 7.0f, 9.67f, 7.03f, 10.0f, 7.1f)
                curveTo(8.72f, 8.41f, 8.0f, 10.17f, 8.0f, 12.0f)
                curveTo(8.0f, 13.83f, 8.72f, 15.59f, 10.0f, 16.89f)
                curveTo(9.67f, 16.96f, 9.34f, 17.0f, 9.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 9.0f, 7.0f)
                moveTo(15.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 15.0f, 17.0f)
                curveTo(14.66f, 17.0f, 14.33f, 16.97f, 14.0f, 16.9f)
                curveTo(15.28f, 15.59f, 16.0f, 13.83f, 16.0f, 12.0f)
                curveTo(16.0f, 10.17f, 15.28f, 8.41f, 14.0f, 7.11f)
                curveTo(14.33f, 7.04f, 14.66f, 7.0f, 15.0f, 7.0f)
                close()
            }
        }
        .build()
        return _setCenter!!
    }

private var _setCenter: ImageVector? = null
