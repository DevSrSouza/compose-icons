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

public val MaterialDesignIcons.MicrosoftInternetExplorer: ImageVector
    get() {
        if (_microsoftInternetExplorer != null) {
            return _microsoftInternetExplorer!!
        }
        _microsoftInternetExplorer = Builder(name = "MicrosoftInternetExplorer", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                lineTo(14.0f, 3.06f)
                curveTo(16.8f, 1.79f, 19.23f, 1.64f, 20.5f, 2.92f)
                curveTo(21.5f, 3.93f, 21.58f, 5.67f, 20.92f, 7.72f)
                curveTo(21.61f, 9.0f, 22.0f, 10.45f, 22.0f, 12.0f)
                lineTo(21.95f, 13.0f)
                horizontalLineTo(9.08f)
                curveTo(9.45f, 15.28f, 11.06f, 17.0f, 13.0f, 17.0f)
                curveTo(14.31f, 17.0f, 15.47f, 16.21f, 16.2f, 15.0f)
                horizontalLineTo(21.5f)
                curveTo(20.25f, 18.5f, 16.92f, 21.0f, 13.0f, 21.0f)
                curveTo(11.72f, 21.0f, 10.5f, 20.73f, 9.41f, 20.25f)
                curveTo(6.5f, 21.68f, 3.89f, 21.9f, 2.57f, 20.56f)
                curveTo(1.0f, 18.96f, 1.68f, 15.57f, 4.0f, 12.0f)
                curveTo(4.93f, 10.54f, 6.14f, 9.06f, 7.57f, 7.65f)
                lineTo(8.38f, 6.88f)
                curveTo(7.21f, 7.57f, 5.71f, 8.62f, 4.19f, 10.17f)
                curveTo(5.03f, 6.08f, 8.66f, 3.0f, 13.0f, 3.0f)
                moveTo(13.0f, 7.0f)
                curveTo(11.21f, 7.0f, 9.69f, 8.47f, 9.18f, 10.5f)
                horizontalLineTo(16.82f)
                curveTo(16.31f, 8.47f, 14.79f, 7.0f, 13.0f, 7.0f)
                moveTo(20.06f, 4.06f)
                curveTo(19.4f, 3.39f, 18.22f, 3.35f, 16.74f, 3.81f)
                curveTo(18.22f, 4.5f, 19.5f, 5.56f, 20.41f, 6.89f)
                curveTo(20.73f, 5.65f, 20.64f, 4.65f, 20.06f, 4.06f)
                moveTo(3.89f, 20.0f)
                curveTo(4.72f, 20.84f, 6.4f, 20.69f, 8.44f, 19.76f)
                curveTo(6.59f, 18.67f, 5.17f, 16.94f, 4.47f, 14.88f)
                curveTo(3.27f, 17.15f, 3.0f, 19.07f, 3.89f, 20.0f)
                close()
            }
        }
        .build()
        return _microsoftInternetExplorer!!
    }

private var _microsoftInternetExplorer: ImageVector? = null
