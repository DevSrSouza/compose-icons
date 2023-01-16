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

public val MaterialDesignIcons.SmokeDetectorOffOutline: ImageVector
    get() {
        if (_smokeDetectorOffOutline != null) {
            return _smokeDetectorOffOutline!!
        }
        _smokeDetectorOffOutline = Builder(name = "SmokeDetectorOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2f, 5.0f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(17.8f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.2f)
                moveTo(17.5f, 14.32f)
                curveTo(17.82f, 13.6f, 18.0f, 12.83f, 18.0f, 12.0f)
                curveTo(18.0f, 8.68f, 15.31f, 6.0f, 12.0f, 6.0f)
                curveTo(11.17f, 6.0f, 10.4f, 6.18f, 9.68f, 6.5f)
                lineTo(11.27f, 8.07f)
                curveTo(11.5f, 8.03f, 11.75f, 8.0f, 12.0f, 8.0f)
                curveTo(14.21f, 8.0f, 16.0f, 9.79f, 16.0f, 12.0f)
                curveTo(16.0f, 12.25f, 15.97f, 12.5f, 15.93f, 12.73f)
                lineTo(17.5f, 14.32f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.1f, 21.0f)
                curveTo(19.07f, 21.0f, 19.03f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.97f, 3.0f, 4.93f, 3.0f, 4.9f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8.0f, 12.0f)
                curveTo(8.0f, 14.21f, 9.79f, 16.0f, 12.0f, 16.0f)
                curveTo(12.62f, 16.0f, 13.19f, 15.85f, 13.71f, 15.6f)
                lineTo(8.4f, 10.29f)
                curveTo(8.15f, 10.81f, 8.0f, 11.39f, 8.0f, 12.0f)
                moveTo(17.11f, 19.0f)
                lineTo(15.19f, 17.08f)
                curveTo(14.26f, 17.66f, 13.17f, 18.0f, 12.0f, 18.0f)
                curveTo(8.69f, 18.0f, 6.0f, 15.31f, 6.0f, 12.0f)
                curveTo(6.0f, 10.83f, 6.34f, 9.74f, 6.92f, 8.81f)
                lineTo(5.0f, 6.89f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.11f)
                close()
            }
        }
        .build()
        return _smokeDetectorOffOutline!!
    }

private var _smokeDetectorOffOutline: ImageVector? = null
