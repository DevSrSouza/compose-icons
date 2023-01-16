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

public val MaterialDesignIcons.MarkerCancel: ImageVector
    get() {
        if (_markerCancel != null) {
            return _markerCancel!!
        }
        _markerCancel = Builder(name = "MarkerCancel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 13.0f)
                curveTo(20.0f, 13.0f, 22.0f, 15.0f, 22.0f, 17.5f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 17.5f, 22.0f)
                curveTo(15.0f, 22.0f, 13.0f, 20.0f, 13.0f, 17.5f)
                curveTo(13.0f, 15.0f, 15.0f, 13.0f, 17.5f, 13.0f)
                moveTo(17.5f, 14.5f)
                curveTo(16.94f, 14.5f, 16.42f, 14.65f, 16.0f, 14.92f)
                lineTo(20.08f, 19.0f)
                curveTo(20.35f, 18.58f, 20.5f, 18.06f, 20.5f, 17.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.5f, 14.5f)
                moveTo(14.5f, 17.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.5f, 20.5f)
                curveTo(18.06f, 20.5f, 18.58f, 20.35f, 19.0f, 20.08f)
                lineTo(14.92f, 16.0f)
                curveTo(14.65f, 16.42f, 14.5f, 16.94f, 14.5f, 17.5f)
                moveTo(18.5f, 1.15f)
                curveTo(19.0f, 1.15f, 19.5f, 1.34f, 19.89f, 1.73f)
                lineTo(22.73f, 4.56f)
                curveTo(23.5f, 5.35f, 23.5f, 6.61f, 22.73f, 7.39f)
                lineTo(18.95f, 11.16f)
                curveTo(18.5f, 11.06f, 18.0f, 11.0f, 17.5f, 11.0f)
                curveTo(16.67f, 11.0f, 15.88f, 11.16f, 15.15f, 11.44f)
                lineTo(11.26f, 7.55f)
                lineTo(17.07f, 1.73f)
                curveTo(17.46f, 1.34f, 17.97f, 1.15f, 18.5f, 1.15f)
                moveTo(10.3f, 8.5f)
                lineTo(13.89f, 12.1f)
                curveTo(12.15f, 13.26f, 11.0f, 15.25f, 11.0f, 17.5f)
                curveTo(11.0f, 18.0f, 11.06f, 18.5f, 11.16f, 18.95f)
                lineTo(10.0f, 20.12f)
                curveTo(9.22f, 20.89f, 7.97f, 20.9f, 7.19f, 20.14f)
                lineTo(6.33f, 21.0f)
                horizontalLineTo(0.67f)
                lineTo(4.36f, 17.31f)
                curveTo(3.56f, 16.5f, 3.56f, 15.24f, 4.34f, 14.46f)
                lineTo(10.3f, 8.5f)
                close()
            }
        }
        .build()
        return _markerCancel!!
    }

private var _markerCancel: ImageVector? = null
