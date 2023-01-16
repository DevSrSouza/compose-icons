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

public val MaterialDesignIcons.GoogleChrome: ImageVector
    get() {
        if (_googleChrome != null) {
            return _googleChrome!!
        }
        _googleChrome = Builder(name = "GoogleChrome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                lineTo(15.46f, 14.0f)
                horizontalLineTo(15.45f)
                curveTo(15.79f, 13.4f, 16.0f, 12.73f, 16.0f, 12.0f)
                curveTo(16.0f, 10.8f, 15.46f, 9.73f, 14.62f, 9.0f)
                horizontalLineTo(19.41f)
                curveTo(19.79f, 9.93f, 20.0f, 10.94f, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 10.54f, 4.39f, 9.18f, 5.07f, 8.0f)
                lineTo(8.54f, 14.0f)
                horizontalLineTo(8.55f)
                curveTo(9.24f, 15.19f, 10.5f, 16.0f, 12.0f, 16.0f)
                curveTo(12.45f, 16.0f, 12.88f, 15.91f, 13.29f, 15.77f)
                lineTo(10.89f, 19.91f)
                curveTo(7.0f, 19.37f, 4.0f, 16.04f, 4.0f, 12.0f)
                moveTo(15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                moveTo(12.0f, 4.0f)
                curveTo(14.96f, 4.0f, 17.54f, 5.61f, 18.92f, 8.0f)
                horizontalLineTo(12.0f)
                curveTo(10.06f, 8.0f, 8.45f, 9.38f, 8.08f, 11.21f)
                lineTo(5.7f, 7.08f)
                curveTo(7.16f, 5.21f, 9.44f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _googleChrome!!
    }

private var _googleChrome: ImageVector? = null
