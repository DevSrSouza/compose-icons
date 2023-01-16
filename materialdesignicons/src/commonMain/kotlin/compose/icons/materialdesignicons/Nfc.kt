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

public val MaterialDesignIcons.Nfc: ImageVector
    get() {
        if (_nfc != null) {
            return _nfc!!
        }
        _nfc = Builder(name = "Nfc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.24f, 2.0f)
                curveTo(5.6f, 2.0f, 3.96f, 2.0f, 3.55f, 2.04f)
                curveTo(2.67f, 2.09f, 2.08f, 2.73f, 2.04f, 3.56f)
                curveTo(2.0f, 4.37f, 2.0f, 19.59f, 2.04f, 20.41f)
                curveTo(2.09f, 21.23f, 2.71f, 21.86f, 3.55f, 21.91f)
                curveTo(4.46f, 21.96f, 7.44f, 21.97f, 8.29f, 21.97f)
                curveTo(6.76f, 20.91f, 6.55f, 18.92f, 6.41f, 15.23f)
                curveTo(6.33f, 13.04f, 6.4f, 5.36f, 6.41f, 5.04f)
                lineTo(6.45f, 2.94f)
                lineTo(14.5f, 11.0f)
                verticalLineTo(13.5f)
                lineTo(8.09f, 7.11f)
                curveTo(8.08f, 8.38f, 8.06f, 10.03f, 8.06f, 11.54f)
                curveTo(8.06f, 13.0f, 8.08f, 14.34f, 8.12f, 15.05f)
                curveTo(8.36f, 19.07f, 8.74f, 20.96f, 10.83f, 21.7f)
                curveTo(11.5f, 21.93f, 12.07f, 22.0f, 13.07f, 22.0f)
                curveTo(13.89f, 22.0f, 19.63f, 22.0f, 20.45f, 21.96f)
                curveTo(21.33f, 21.91f, 21.93f, 21.27f, 21.97f, 20.44f)
                curveTo(22.0f, 19.63f, 22.0f, 4.45f, 21.97f, 3.62f)
                curveTo(21.91f, 2.8f, 21.29f, 2.18f, 20.45f, 2.13f)
                curveTo(19.54f, 2.08f, 16.57f, 2.03f, 15.71f, 2.03f)
                curveTo(17.24f, 3.09f, 17.44f, 5.08f, 17.59f, 8.78f)
                curveTo(17.67f, 10.97f, 17.6f, 18.64f, 17.59f, 18.97f)
                lineTo(17.55f, 21.06f)
                lineTo(9.53f, 13.0f)
                verticalLineTo(10.5f)
                lineTo(15.91f, 16.89f)
                curveTo(15.92f, 15.62f, 15.94f, 13.97f, 15.94f, 12.46f)
                curveTo(15.94f, 11.0f, 15.92f, 9.66f, 15.88f, 8.96f)
                curveTo(15.64f, 4.93f, 15.26f, 3.04f, 13.17f, 2.3f)
                curveTo(12.53f, 2.07f, 11.93f, 2.0f, 10.93f, 2.0f)
                horizontalLineTo(7.24f)
                close()
            }
        }
        .build()
        return _nfc!!
    }

private var _nfc: ImageVector? = null
