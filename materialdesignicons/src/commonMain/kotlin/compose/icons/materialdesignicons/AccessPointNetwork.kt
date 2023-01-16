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

public val MaterialDesignIcons.AccessPointNetwork: ImageVector
    get() {
        if (_accessPointNetwork != null) {
            return _accessPointNetwork!!
        }
        _accessPointNetwork = Builder(name = "AccessPointNetwork", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.93f, 3.93f)
                curveTo(3.12f, 5.74f, 2.0f, 8.24f, 2.0f, 11.0f)
                curveTo(2.0f, 13.76f, 3.12f, 16.26f, 4.93f, 18.07f)
                lineTo(6.34f, 16.66f)
                curveTo(4.89f, 15.22f, 4.0f, 13.22f, 4.0f, 11.0f)
                curveTo(4.0f, 8.79f, 4.89f, 6.78f, 6.34f, 5.34f)
                lineTo(4.93f, 3.93f)
                moveTo(19.07f, 3.93f)
                lineTo(17.66f, 5.34f)
                curveTo(19.11f, 6.78f, 20.0f, 8.79f, 20.0f, 11.0f)
                curveTo(20.0f, 13.22f, 19.11f, 15.22f, 17.66f, 16.66f)
                lineTo(19.07f, 18.07f)
                curveTo(20.88f, 16.26f, 22.0f, 13.76f, 22.0f, 11.0f)
                curveTo(22.0f, 8.24f, 20.88f, 5.74f, 19.07f, 3.93f)
                moveTo(7.76f, 6.76f)
                curveTo(6.67f, 7.85f, 6.0f, 9.35f, 6.0f, 11.0f)
                curveTo(6.0f, 12.65f, 6.67f, 14.15f, 7.76f, 15.24f)
                lineTo(9.17f, 13.83f)
                curveTo(8.45f, 13.11f, 8.0f, 12.11f, 8.0f, 11.0f)
                curveTo(8.0f, 9.89f, 8.45f, 8.89f, 9.17f, 8.17f)
                lineTo(7.76f, 6.76f)
                moveTo(16.24f, 6.76f)
                lineTo(14.83f, 8.17f)
                curveTo(15.55f, 8.89f, 16.0f, 9.89f, 16.0f, 11.0f)
                curveTo(16.0f, 12.11f, 15.55f, 13.11f, 14.83f, 13.83f)
                lineTo(16.24f, 15.24f)
                curveTo(17.33f, 14.15f, 18.0f, 12.65f, 18.0f, 11.0f)
                curveTo(18.0f, 9.35f, 17.33f, 7.85f, 16.24f, 6.76f)
                moveTo(12.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 9.0f)
                moveTo(11.0f, 15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 23.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _accessPointNetwork!!
    }

private var _accessPointNetwork: ImageVector? = null
