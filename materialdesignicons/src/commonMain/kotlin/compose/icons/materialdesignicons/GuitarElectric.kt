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

public val MaterialDesignIcons.GuitarElectric: ImageVector
    get() {
        if (_guitarElectric != null) {
            return _guitarElectric!!
        }
        _guitarElectric = Builder(name = "GuitarElectric", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.59f, 3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.41f)
                lineTo(15.12f, 10.29f)
                lineTo(13.71f, 8.9f)
                lineTo(19.59f, 3.0f)
                moveTo(12.0f, 9.0f)
                curveTo(12.26f, 9.0f, 12.5f, 9.1f, 12.71f, 9.3f)
                lineTo(14.71f, 11.3f)
                curveTo(14.89f, 11.5f, 15.0f, 11.73f, 15.0f, 12.0f)
                lineTo(14.9f, 12.4f)
                lineTo(10.9f, 20.4f)
                curveTo(10.71f, 20.75f, 10.36f, 20.93f, 10.0f, 20.93f)
                curveTo(9.65f, 20.93f, 9.29f, 20.75f, 9.11f, 20.4f)
                lineTo(7.25f, 16.7f)
                lineTo(3.55f, 14.9f)
                curveTo(3.18f, 14.7f, 3.0f, 14.35f, 3.0f, 14.0f)
                curveTo(3.0f, 13.65f, 3.18f, 13.3f, 3.55f, 13.1f)
                lineTo(11.55f, 9.1f)
                curveTo(11.69f, 9.0f, 11.84f, 9.0f, 12.0f, 9.0f)
                moveTo(9.35f, 11.82f)
                lineTo(8.65f, 12.5f)
                lineTo(11.5f, 15.35f)
                lineTo(12.18f, 14.65f)
                lineTo(9.35f, 11.82f)
                moveTo(7.94f, 13.23f)
                lineTo(7.23f, 13.94f)
                lineTo(10.06f, 16.77f)
                lineTo(10.77f, 16.06f)
                lineTo(7.94f, 13.23f)
                close()
            }
        }
        .build()
        return _guitarElectric!!
    }

private var _guitarElectric: ImageVector? = null
