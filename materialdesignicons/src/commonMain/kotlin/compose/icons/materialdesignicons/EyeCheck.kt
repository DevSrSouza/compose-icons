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

public val MaterialDesignIcons.EyeCheck: ImageVector
    get() {
        if (_eyeCheck != null) {
            return _eyeCheck!!
        }
        _eyeCheck = Builder(name = "EyeCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 17.0f)
                curveTo(12.5f, 17.0f, 12.97f, 16.93f, 13.42f, 16.79f)
                curveTo(13.15f, 17.5f, 13.0f, 18.22f, 13.0f, 19.0f)
                verticalLineTo(19.45f)
                lineTo(12.0f, 19.5f)
                curveTo(7.0f, 19.5f, 2.73f, 16.39f, 1.0f, 12.0f)
                curveTo(2.73f, 7.61f, 7.0f, 4.5f, 12.0f, 4.5f)
                curveTo(17.0f, 4.5f, 21.27f, 7.61f, 23.0f, 12.0f)
                curveTo(22.75f, 12.64f, 22.44f, 13.26f, 22.08f, 13.85f)
                curveTo(21.18f, 13.31f, 20.12f, 13.0f, 19.0f, 13.0f)
                curveTo(18.22f, 13.0f, 17.5f, 13.15f, 16.79f, 13.42f)
                curveTo(16.93f, 12.97f, 17.0f, 12.5f, 17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _eyeCheck!!
    }

private var _eyeCheck: ImageVector? = null
