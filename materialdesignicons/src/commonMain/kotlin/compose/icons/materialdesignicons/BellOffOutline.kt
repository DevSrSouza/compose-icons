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

public val MaterialDesignIcons.BellOffOutline: ImageVector
    get() {
        if (_bellOffOutline != null) {
            return _bellOffOutline!!
        }
        _bellOffOutline = Builder(name = "BellOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.83f, 7.72f)
                curveTo(5.29f, 8.73f, 5.0f, 9.86f, 5.0f, 11.0f)
                verticalLineTo(17.0f)
                lineTo(3.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(7.0f, 18.0f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 10.39f, 7.11f, 9.79f, 7.34f, 9.23f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(7.0f)
                moveTo(10.0f, 21.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 21.0f)
                moveTo(8.29f, 5.09f)
                curveTo(8.82f, 4.75f, 9.4f, 4.5f, 10.0f, 4.29f)
                curveTo(10.0f, 4.19f, 10.0f, 4.1f, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 4.0f)
                curveTo(14.0f, 4.1f, 14.0f, 4.19f, 14.0f, 4.29f)
                curveTo(16.97f, 5.17f, 19.0f, 7.9f, 19.0f, 11.0f)
                verticalLineTo(15.8f)
                lineTo(17.0f, 13.8f)
                verticalLineTo(11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 6.0f)
                curveTo(11.22f, 6.0f, 10.45f, 6.2f, 9.76f, 6.56f)
                lineTo(8.29f, 5.09f)
                close()
            }
        }
        .build()
        return _bellOffOutline!!
    }

private var _bellOffOutline: ImageVector? = null
