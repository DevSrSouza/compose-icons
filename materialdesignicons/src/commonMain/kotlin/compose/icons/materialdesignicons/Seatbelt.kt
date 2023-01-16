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

public val MaterialDesignIcons.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) {
            return _seatbelt!!
        }
        _seatbelt = Builder(name = "Seatbelt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.11f, 2.0f, 14.0f, 2.9f, 14.0f, 4.0f)
                curveTo(14.0f, 5.11f, 13.11f, 6.0f, 12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.39f, 14.79f)
                curveTo(14.03f, 14.79f, 15.46f, 14.89f, 16.64f, 15.04f)
                curveTo(16.7f, 12.32f, 16.46f, 9.92f, 16.0f, 9.0f)
                curveTo(15.87f, 8.73f, 15.69f, 8.5f, 15.5f, 8.3f)
                lineTo(7.43f, 15.22f)
                curveTo(8.79f, 15.0f, 10.5f, 14.79f, 12.39f, 14.79f)
                moveTo(7.46f, 17.0f)
                curveTo(7.59f, 18.74f, 7.85f, 20.5f, 8.27f, 22.0f)
                horizontalLineTo(10.34f)
                curveTo(10.05f, 21.12f, 9.84f, 20.09f, 9.68f, 19.0f)
                curveTo(9.68f, 19.0f, 12.0f, 18.56f, 14.32f, 19.0f)
                curveTo(14.16f, 20.09f, 13.95f, 21.12f, 13.66f, 22.0f)
                horizontalLineTo(15.73f)
                curveTo(16.17f, 20.45f, 16.43f, 18.61f, 16.56f, 16.79f)
                curveTo(15.41f, 16.65f, 14.0f, 16.54f, 12.39f, 16.54f)
                curveTo(10.46f, 16.54f, 8.78f, 16.75f, 7.46f, 17.0f)
                moveTo(12.0f, 7.0f)
                curveTo(12.0f, 7.0f, 9.0f, 7.0f, 8.0f, 9.0f)
                curveTo(7.66f, 9.68f, 7.44f, 11.15f, 7.37f, 12.96f)
                lineTo(13.92f, 7.34f)
                curveTo(12.93f, 7.0f, 12.0f, 7.0f, 12.0f, 7.0f)
                moveTo(18.57f, 5.67f)
                lineTo(17.43f, 4.34f)
                lineTo(13.92f, 7.35f)
                curveTo(14.47f, 7.54f, 15.05f, 7.84f, 15.5f, 8.3f)
                lineTo(18.57f, 5.67f)
                moveTo(20.67f, 15.83f)
                curveTo(20.58f, 15.8f, 19.14f, 15.33f, 16.64f, 15.04f)
                curveTo(16.63f, 15.61f, 16.6f, 16.2f, 16.56f, 16.79f)
                curveTo(18.81f, 17.07f, 20.1f, 17.5f, 20.12f, 17.5f)
                lineTo(20.67f, 15.83f)
                moveTo(7.37f, 12.96f)
                lineTo(3.43f, 16.34f)
                lineTo(4.32f, 17.82f)
                curveTo(4.34f, 17.81f, 5.5f, 17.36f, 7.46f, 17.0f)
                curveTo(7.35f, 15.59f, 7.32f, 14.2f, 7.37f, 12.96f)
                close()
            }
        }
        .build()
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
