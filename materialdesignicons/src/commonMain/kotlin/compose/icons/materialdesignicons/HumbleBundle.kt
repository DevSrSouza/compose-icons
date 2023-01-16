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

public val MaterialDesignIcons.HumbleBundle: ImageVector
    get() {
        if (_humbleBundle != null) {
            return _humbleBundle!!
        }
        _humbleBundle = Builder(name = "HumbleBundle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.91f, 18.12f)
                curveTo(14.09f, 18.12f, 18.43f, 2.13f, 18.43f, 2.13f)
                horizontalLineTo(15.53f)
                curveTo(15.53f, 2.13f, 14.34f, 5.89f, 13.55f, 10.07f)
                horizontalLineTo(11.05f)
                curveTo(11.11f, 9.21f, 11.15f, 8.34f, 11.13f, 7.5f)
                curveTo(11.0f, 0.59f, 7.0f, 1.87f, 5.18f, 3.45f)
                curveTo(3.47f, 4.95f, 2.03f, 7.8f, 2.0f, 10.0f)
                curveTo(2.27f, 10.0f, 3.35f, 10.0f, 3.35f, 10.0f)
                curveTo(3.35f, 10.0f, 4.25f, 5.88f, 7.07f, 5.88f)
                curveTo(9.89f, 5.88f, 5.54f, 21.87f, 5.54f, 21.87f)
                horizontalLineTo(8.45f)
                curveTo(8.45f, 21.87f, 9.95f, 17.59f, 10.7f, 12.81f)
                lineTo(13.09f, 12.8f)
                curveTo(12.95f, 14.04f, 12.91f, 15.4f, 12.93f, 16.67f)
                curveTo(13.04f, 23.56f, 17.06f, 22.08f, 18.86f, 20.5f)
                curveTo(20.67f, 18.92f, 22.0f, 15.58f, 22.0f, 14.0f)
                horizontalLineTo(20.61f)
                curveTo(20.62f, 14.12f, 19.73f, 18.12f, 16.91f, 18.12f)
                verticalLineTo(18.12f)
                close()
            }
        }
        .build()
        return _humbleBundle!!
    }

private var _humbleBundle: ImageVector? = null
