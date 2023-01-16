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

public val MaterialDesignIcons.CompassOffOutline: ImageVector
    get() {
        if (_compassOffOutline != null) {
            return _compassOffOutline!!
        }
        _compassOffOutline = Builder(name = "CompassOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.5f)
                lineTo(2.28f, 2.25f)
                lineTo(21.75f, 21.72f)
                lineTo(20.5f, 23.0f)
                lineTo(17.7f, 20.22f)
                curveTo(16.08f, 21.34f, 14.12f, 22.0f, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 9.88f, 2.66f, 7.92f, 3.78f, 6.3f)
                lineTo(1.0f, 3.5f)
                moveTo(7.0f, 17.0f)
                lineTo(9.39f, 11.91f)
                lineTo(5.23f, 7.74f)
                curveTo(4.45f, 9.0f, 4.0f, 10.44f, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                curveTo(13.56f, 20.0f, 15.0f, 19.55f, 16.26f, 18.77f)
                lineTo(12.09f, 14.61f)
                lineTo(7.0f, 17.0f)
                moveTo(17.0f, 7.0f)
                lineTo(14.62f, 12.05f)
                lineTo(11.95f, 9.38f)
                lineTo(17.0f, 7.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                curveTo(22.0f, 14.1f, 21.35f, 16.06f, 20.24f, 17.67f)
                lineTo(18.8f, 16.22f)
                curveTo(19.56f, 15.0f, 20.0f, 13.55f, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                curveTo(10.45f, 4.0f, 9.0f, 4.44f, 7.78f, 5.2f)
                lineTo(6.33f, 3.76f)
                curveTo(7.94f, 2.65f, 9.9f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _compassOffOutline!!
    }

private var _compassOffOutline: ImageVector? = null
