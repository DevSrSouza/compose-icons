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

public val MaterialDesignIcons.FacebookMessenger: ImageVector
    get() {
        if (_facebookMessenger != null) {
            return _facebookMessenger!!
        }
        _facebookMessenger = Builder(name = "FacebookMessenger", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.36f, 2.0f, 2.0f, 6.13f, 2.0f, 11.7f)
                curveTo(2.0f, 14.61f, 3.19f, 17.14f, 5.14f, 18.87f)
                curveTo(5.3f, 19.0f, 5.4f, 19.22f, 5.41f, 19.44f)
                lineTo(5.46f, 21.22f)
                curveTo(5.5f, 21.79f, 6.07f, 22.16f, 6.59f, 21.93f)
                lineTo(8.57f, 21.06f)
                curveTo(8.74f, 21.0f, 8.93f, 20.97f, 9.1f, 21.0f)
                curveTo(10.0f, 21.27f, 11.0f, 21.4f, 12.0f, 21.4f)
                curveTo(17.64f, 21.4f, 22.0f, 17.27f, 22.0f, 11.7f)
                curveTo(22.0f, 6.13f, 17.64f, 2.0f, 12.0f, 2.0f)
                moveTo(18.0f, 9.46f)
                lineTo(15.07f, 14.13f)
                curveTo(14.6f, 14.86f, 13.6f, 15.05f, 12.9f, 14.5f)
                lineTo(10.56f, 12.77f)
                curveTo(10.35f, 12.61f, 10.05f, 12.61f, 9.84f, 12.77f)
                lineTo(6.68f, 15.17f)
                curveTo(6.26f, 15.5f, 5.71f, 15.0f, 6.0f, 14.54f)
                lineTo(8.93f, 9.87f)
                curveTo(9.4f, 9.14f, 10.4f, 8.95f, 11.1f, 9.47f)
                lineTo(13.44f, 11.23f)
                curveTo(13.66f, 11.39f, 13.95f, 11.39f, 14.16f, 11.23f)
                lineTo(17.32f, 8.83f)
                curveTo(17.74f, 8.5f, 18.29f, 9.0f, 18.0f, 9.46f)
                close()
            }
        }
        .build()
        return _facebookMessenger!!
    }

private var _facebookMessenger: ImageVector? = null
