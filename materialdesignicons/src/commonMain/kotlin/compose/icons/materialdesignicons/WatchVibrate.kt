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

public val MaterialDesignIcons.WatchVibrate: ImageVector
    get() {
        if (_watchVibrate != null) {
            return _watchVibrate!!
        }
        _watchVibrate = Builder(name = "WatchVibrate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                moveTo(19.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                moveTo(22.0f, 9.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                moveTo(0.0f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(0.0f)
                moveTo(17.96f, 11.97f)
                curveTo(17.96f, 13.87f, 17.07f, 15.57f, 15.68f, 16.67f)
                lineTo(14.97f, 20.95f)
                horizontalLineTo(9.0f)
                lineTo(8.27f, 16.67f)
                curveTo(6.88f, 15.57f, 6.0f, 13.87f, 6.0f, 11.97f)
                curveTo(6.0f, 10.07f, 6.88f, 8.37f, 8.27f, 7.28f)
                lineTo(9.0f, 3.0f)
                horizontalLineTo(14.97f)
                lineTo(15.68f, 7.28f)
                curveTo(17.07f, 8.37f, 17.96f, 10.07f, 17.96f, 11.97f)
                moveTo(7.5f, 11.97f)
                curveTo(7.5f, 14.45f, 9.5f, 16.46f, 11.97f, 16.46f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 16.46f, 11.97f)
                curveTo(16.46f, 9.5f, 14.45f, 7.5f, 11.97f, 7.5f)
                arcTo(4.47f, 4.47f, 0.0f, false, false, 7.5f, 11.97f)
                close()
            }
        }
        .build()
        return _watchVibrate!!
    }

private var _watchVibrate: ImageVector? = null
