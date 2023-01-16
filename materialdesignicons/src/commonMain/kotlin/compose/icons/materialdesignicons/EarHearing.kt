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

public val MaterialDesignIcons.EarHearing: ImageVector
    get() {
        if (_earHearing != null) {
            return _earHearing!!
        }
        _earHearing = Builder(name = "EarHearing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                curveTo(16.71f, 20.0f, 16.44f, 19.94f, 16.24f, 19.85f)
                curveTo(15.53f, 19.5f, 15.03f, 18.97f, 14.53f, 17.47f)
                curveTo(14.0f, 15.91f, 13.06f, 15.18f, 12.14f, 14.47f)
                curveTo(11.35f, 13.86f, 10.53f, 13.23f, 9.82f, 11.94f)
                curveTo(9.29f, 11.0f, 9.0f, 9.93f, 9.0f, 9.0f)
                curveTo(9.0f, 6.2f, 11.2f, 4.0f, 14.0f, 4.0f)
                curveTo(16.8f, 4.0f, 19.0f, 6.2f, 19.0f, 9.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 5.07f, 17.93f, 2.0f, 14.0f, 2.0f)
                curveTo(10.07f, 2.0f, 7.0f, 5.07f, 7.0f, 9.0f)
                curveTo(7.0f, 10.26f, 7.38f, 11.65f, 8.07f, 12.9f)
                curveTo(9.0f, 14.55f, 10.05f, 15.38f, 10.92f, 16.05f)
                curveTo(11.73f, 16.67f, 12.31f, 17.12f, 12.63f, 18.1f)
                curveTo(13.23f, 19.92f, 14.0f, 20.94f, 15.36f, 21.65f)
                curveTo(15.87f, 21.88f, 16.43f, 22.0f, 17.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 21.0f, 18.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 20.0f)
                moveTo(7.64f, 2.64f)
                lineTo(6.22f, 1.22f)
                curveTo(4.23f, 3.21f, 3.0f, 5.96f, 3.0f, 9.0f)
                curveTo(3.0f, 12.04f, 4.23f, 14.79f, 6.22f, 16.78f)
                lineTo(7.63f, 15.37f)
                curveTo(6.0f, 13.74f, 5.0f, 11.5f, 5.0f, 9.0f)
                curveTo(5.0f, 6.5f, 6.0f, 4.26f, 7.64f, 2.64f)
                moveTo(11.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.5f, 9.0f)
                close()
            }
        }
        .build()
        return _earHearing!!
    }

private var _earHearing: ImageVector? = null
