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

public val MaterialDesignIcons.HumanScooter: ImageVector
    get() {
        if (_humanScooter != null) {
            return _humanScooter!!
        }
        _humanScooter = Builder(name = "HumanScooter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 2.25f)
                curveTo(17.33f, 2.25f, 18.0f, 2.92f, 18.0f, 3.75f)
                curveTo(18.0f, 4.58f, 17.33f, 5.25f, 16.5f, 5.25f)
                curveTo(15.67f, 5.25f, 15.0f, 4.58f, 15.0f, 3.75f)
                curveTo(15.0f, 2.92f, 15.67f, 2.25f, 16.5f, 2.25f)
                moveTo(20.0f, 18.0f)
                curveTo(21.11f, 18.0f, 22.0f, 18.9f, 22.0f, 20.0f)
                curveTo(22.0f, 21.11f, 21.11f, 22.0f, 20.0f, 22.0f)
                curveTo(19.26f, 22.0f, 18.61f, 21.6f, 18.27f, 21.0f)
                horizontalLineTo(8.73f)
                curveTo(8.39f, 21.6f, 7.74f, 22.0f, 7.0f, 22.0f)
                curveTo(5.9f, 22.0f, 5.0f, 21.11f, 5.0f, 20.0f)
                curveTo(5.0f, 18.9f, 5.9f, 18.0f, 7.0f, 18.0f)
                curveTo(7.74f, 18.0f, 8.39f, 18.4f, 8.73f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.5f)
                lineTo(9.73f, 11.23f)
                lineTo(6.77f, 14.0f)
                curveTo(6.36f, 14.37f, 5.73f, 14.34f, 5.35f, 13.94f)
                lineTo(2.28f, 10.65f)
                curveTo(1.91f, 10.24f, 1.93f, 9.61f, 2.33f, 9.23f)
                curveTo(2.74f, 8.86f, 3.37f, 8.88f, 3.74f, 9.28f)
                lineTo(6.13f, 11.84f)
                lineTo(13.26f, 5.2f)
                lineTo(13.3f, 5.18f)
                curveTo(13.72f, 4.82f, 14.35f, 4.88f, 14.71f, 5.3f)
                lineTo(16.97f, 8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 8.0f, 21.0f, 8.45f, 21.0f, 9.0f)
                curveTo(21.0f, 9.55f, 20.55f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(16.5f)
                curveTo(16.15f, 10.0f, 15.85f, 9.82f, 15.67f, 9.56f)
                lineTo(14.17f, 7.77f)
                lineTo(11.64f, 10.13f)
                lineTo(14.57f, 12.18f)
                horizontalLineTo(14.57f)
                curveTo(14.83f, 12.36f, 15.0f, 12.66f, 15.0f, 13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.61f)
                curveTo(16.04f, 17.13f, 17.63f, 15.7f, 19.58f, 15.5f)
                lineTo(18.81f, 11.0f)
                horizontalLineTo(20.31f)
                lineTo(21.39f, 17.34f)
                curveTo(20.97f, 17.12f, 20.5f, 17.0f, 20.0f, 17.0f)
                curveTo(18.69f, 17.0f, 17.58f, 17.84f, 17.17f, 19.0f)
                horizontalLineTo(18.27f)
                curveTo(18.61f, 18.4f, 19.26f, 18.0f, 20.0f, 18.0f)
                close()
            }
        }
        .build()
        return _humanScooter!!
    }

private var _humanScooter: ImageVector? = null
