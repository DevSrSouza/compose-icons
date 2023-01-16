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

public val MaterialDesignIcons.AccessPoint: ImageVector
    get() {
        if (_accessPoint != null) {
            return _accessPoint!!
        }
        _accessPoint = Builder(name = "AccessPoint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.93f, 4.93f)
                curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f)
                curveTo(2.0f, 14.76f, 3.12f, 17.26f, 4.93f, 19.07f)
                lineTo(6.34f, 17.66f)
                curveTo(4.89f, 16.22f, 4.0f, 14.22f, 4.0f, 12.0f)
                curveTo(4.0f, 9.79f, 4.89f, 7.78f, 6.34f, 6.34f)
                lineTo(4.93f, 4.93f)
                moveTo(19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
                curveTo(19.11f, 7.78f, 20.0f, 9.79f, 20.0f, 12.0f)
                curveTo(20.0f, 14.22f, 19.11f, 16.22f, 17.66f, 17.66f)
                lineTo(19.07f, 19.07f)
                curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f)
                curveTo(22.0f, 9.24f, 20.88f, 6.74f, 19.07f, 4.93f)
                moveTo(7.76f, 7.76f)
                curveTo(6.67f, 8.85f, 6.0f, 10.35f, 6.0f, 12.0f)
                curveTo(6.0f, 13.65f, 6.67f, 15.15f, 7.76f, 16.24f)
                lineTo(9.17f, 14.83f)
                curveTo(8.45f, 14.11f, 8.0f, 13.11f, 8.0f, 12.0f)
                curveTo(8.0f, 10.89f, 8.45f, 9.89f, 9.17f, 9.17f)
                lineTo(7.76f, 7.76f)
                moveTo(16.24f, 7.76f)
                lineTo(14.83f, 9.17f)
                curveTo(15.55f, 9.89f, 16.0f, 10.89f, 16.0f, 12.0f)
                curveTo(16.0f, 13.11f, 15.55f, 14.11f, 14.83f, 14.83f)
                lineTo(16.24f, 16.24f)
                curveTo(17.33f, 15.15f, 18.0f, 13.65f, 18.0f, 12.0f)
                curveTo(18.0f, 10.35f, 17.33f, 8.85f, 16.24f, 7.76f)
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _accessPoint!!
    }

private var _accessPoint: ImageVector? = null
