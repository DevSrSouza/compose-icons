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

public val MaterialDesignIcons.EyeCheckOutline: ImageVector
    get() {
        if (_eyeCheckOutline != null) {
            return _eyeCheckOutline!!
        }
        _eyeCheckOutline = Builder(name = "EyeCheckOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 17.0f)
                lineTo(18.5f, 22.0f)
                lineTo(15.0f, 18.5f)
                lineTo(16.5f, 17.0f)
                lineTo(18.5f, 19.0f)
                lineTo(22.0f, 15.5f)
                lineTo(23.5f, 17.0f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 9.0f)
                moveTo(12.0f, 4.5f)
                curveTo(17.0f, 4.5f, 21.27f, 7.61f, 23.0f, 12.0f)
                curveTo(22.75f, 12.65f, 22.44f, 13.26f, 22.08f, 13.85f)
                curveTo(21.5f, 13.5f, 20.86f, 13.25f, 20.18f, 13.12f)
                lineTo(20.82f, 12.0f)
                curveTo(19.17f, 8.64f, 15.76f, 6.5f, 12.0f, 6.5f)
                curveTo(8.24f, 6.5f, 4.83f, 8.64f, 3.18f, 12.0f)
                curveTo(4.83f, 15.36f, 8.24f, 17.5f, 12.0f, 17.5f)
                lineTo(13.21f, 17.43f)
                curveTo(13.07f, 17.93f, 13.0f, 18.46f, 13.0f, 19.0f)
                verticalLineTo(19.46f)
                lineTo(12.0f, 19.5f)
                curveTo(7.0f, 19.5f, 2.73f, 16.39f, 1.0f, 12.0f)
                curveTo(2.73f, 7.61f, 7.0f, 4.5f, 12.0f, 4.5f)
                close()
            }
        }
        .build()
        return _eyeCheckOutline!!
    }

private var _eyeCheckOutline: ImageVector? = null
