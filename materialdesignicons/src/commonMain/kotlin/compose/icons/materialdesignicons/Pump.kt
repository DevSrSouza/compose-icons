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

public val MaterialDesignIcons.Pump: ImageVector
    get() {
        if (_pump != null) {
            return _pump!!
        }
        _pump = Builder(name = "Pump", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.5f)
                curveTo(3.18f, 14.06f, 3.0f, 13.05f, 3.0f, 12.0f)
                curveTo(3.0f, 7.03f, 7.03f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.5f)
                curveTo(20.82f, 9.94f, 21.0f, 10.95f, 21.0f, 12.0f)
                curveTo(21.0f, 16.97f, 16.97f, 21.0f, 12.0f, 21.0f)
                horizontalLineTo(2.0f)
                moveTo(5.0f, 12.0f)
                curveTo(5.0f, 13.28f, 5.34f, 14.47f, 5.94f, 15.5f)
                lineTo(9.4f, 13.5f)
                curveTo(9.15f, 13.06f, 9.0f, 12.55f, 9.0f, 12.0f)
                curveTo(9.0f, 11.35f, 9.21f, 10.75f, 9.56f, 10.26f)
                lineTo(6.3f, 7.93f)
                curveTo(5.5f, 9.08f, 5.0f, 10.5f, 5.0f, 12.0f)
                moveTo(12.0f, 19.0f)
                curveTo(14.59f, 19.0f, 16.85f, 17.59f, 18.06f, 15.5f)
                lineTo(14.6f, 13.5f)
                curveTo(14.08f, 14.4f, 13.11f, 15.0f, 12.0f, 15.0f)
                lineTo(11.71f, 15.0f)
                lineTo(11.33f, 18.97f)
                lineTo(12.0f, 19.0f)
                moveTo(12.0f, 9.0f)
                curveTo(13.21f, 9.0f, 14.26f, 9.72f, 14.73f, 10.76f)
                lineTo(18.37f, 9.1f)
                curveTo(17.27f, 6.68f, 14.83f, 5.0f, 12.0f, 5.0f)
                verticalLineTo(9.0f)
                moveTo(12.0f, 11.0f)
                curveTo(11.45f, 11.0f, 11.0f, 11.45f, 11.0f, 12.0f)
                curveTo(11.0f, 12.55f, 11.45f, 13.0f, 12.0f, 13.0f)
                curveTo(12.55f, 13.0f, 13.0f, 12.55f, 13.0f, 12.0f)
                curveTo(13.0f, 11.45f, 12.55f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _pump!!
    }

private var _pump: ImageVector? = null
