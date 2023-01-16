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

public val MaterialDesignIcons.Odnoklassniki: ImageVector
    get() {
        if (_odnoklassniki != null) {
            return _odnoklassniki!!
        }
        _odnoklassniki = Builder(name = "Odnoklassniki", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.83f, 12.74f)
                curveTo(17.55f, 12.17f, 16.76f, 11.69f, 15.71f, 12.5f)
                curveTo(14.28f, 13.64f, 12.0f, 13.64f, 12.0f, 13.64f)
                curveTo(12.0f, 13.64f, 9.72f, 13.64f, 8.29f, 12.5f)
                curveTo(7.24f, 11.69f, 6.45f, 12.17f, 6.17f, 12.74f)
                curveTo(5.67f, 13.74f, 6.23f, 14.23f, 7.5f, 15.04f)
                curveTo(8.59f, 15.74f, 10.08f, 16.0f, 11.04f, 16.1f)
                lineTo(10.24f, 16.9f)
                curveTo(9.1f, 18.03f, 8.0f, 19.12f, 7.25f, 19.88f)
                curveTo(6.8f, 20.34f, 6.8f, 21.07f, 7.25f, 21.5f)
                lineTo(7.39f, 21.66f)
                curveTo(7.84f, 22.11f, 8.58f, 22.11f, 9.03f, 21.66f)
                lineTo(12.0f, 18.68f)
                curveTo(13.15f, 19.81f, 14.24f, 20.9f, 15.0f, 21.66f)
                curveTo(15.45f, 22.11f, 16.18f, 22.11f, 16.64f, 21.66f)
                lineTo(16.77f, 21.5f)
                curveTo(17.23f, 21.07f, 17.23f, 20.34f, 16.77f, 19.88f)
                lineTo(13.79f, 16.9f)
                lineTo(13.0f, 16.09f)
                curveTo(13.95f, 16.0f, 15.42f, 15.73f, 16.5f, 15.04f)
                curveTo(17.77f, 14.23f, 18.33f, 13.74f, 17.83f, 12.74f)
                moveTo(12.0f, 4.57f)
                curveTo(13.38f, 4.57f, 14.5f, 5.69f, 14.5f, 7.06f)
                curveTo(14.5f, 8.44f, 13.38f, 9.55f, 12.0f, 9.55f)
                curveTo(10.62f, 9.55f, 9.5f, 8.44f, 9.5f, 7.06f)
                curveTo(9.5f, 5.69f, 10.62f, 4.57f, 12.0f, 4.57f)
                moveTo(12.0f, 12.12f)
                curveTo(14.8f, 12.12f, 17.06f, 9.86f, 17.06f, 7.06f)
                curveTo(17.06f, 4.27f, 14.8f, 2.0f, 12.0f, 2.0f)
                curveTo(9.2f, 2.0f, 6.94f, 4.27f, 6.94f, 7.06f)
                curveTo(6.94f, 9.86f, 9.2f, 12.12f, 12.0f, 12.12f)
                close()
            }
        }
        .build()
        return _odnoklassniki!!
    }

private var _odnoklassniki: ImageVector? = null
