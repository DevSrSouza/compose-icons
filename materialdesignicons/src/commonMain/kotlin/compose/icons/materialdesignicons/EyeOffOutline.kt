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

public val MaterialDesignIcons.EyeOffOutline: ImageVector
    get() {
        if (_eyeOffOutline != null) {
            return _eyeOffOutline!!
        }
        _eyeOffOutline = Builder(name = "EyeOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(15.65f, 18.92f)
                curveTo(14.5f, 19.3f, 13.28f, 19.5f, 12.0f, 19.5f)
                curveTo(7.0f, 19.5f, 2.73f, 16.39f, 1.0f, 12.0f)
                curveTo(1.69f, 10.24f, 2.79f, 8.69f, 4.19f, 7.46f)
                lineTo(2.0f, 5.27f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                curveTo(15.0f, 12.35f, 14.94f, 12.69f, 14.83f, 13.0f)
                lineTo(11.0f, 9.17f)
                curveTo(11.31f, 9.06f, 11.65f, 9.0f, 12.0f, 9.0f)
                moveTo(12.0f, 4.5f)
                curveTo(17.0f, 4.5f, 21.27f, 7.61f, 23.0f, 12.0f)
                curveTo(22.18f, 14.08f, 20.79f, 15.88f, 19.0f, 17.19f)
                lineTo(17.58f, 15.76f)
                curveTo(18.94f, 14.82f, 20.06f, 13.54f, 20.82f, 12.0f)
                curveTo(19.17f, 8.64f, 15.76f, 6.5f, 12.0f, 6.5f)
                curveTo(10.91f, 6.5f, 9.84f, 6.68f, 8.84f, 7.0f)
                lineTo(7.3f, 5.47f)
                curveTo(8.74f, 4.85f, 10.33f, 4.5f, 12.0f, 4.5f)
                moveTo(3.18f, 12.0f)
                curveTo(4.83f, 15.36f, 8.24f, 17.5f, 12.0f, 17.5f)
                curveTo(12.69f, 17.5f, 13.37f, 17.43f, 14.0f, 17.29f)
                lineTo(11.72f, 15.0f)
                curveTo(10.29f, 14.85f, 9.15f, 13.71f, 9.0f, 12.28f)
                lineTo(5.6f, 8.87f)
                curveTo(4.61f, 9.72f, 3.78f, 10.78f, 3.18f, 12.0f)
                close()
            }
        }
        .build()
        return _eyeOffOutline!!
    }

private var _eyeOffOutline: ImageVector? = null
