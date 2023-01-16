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

public val MaterialDesignIcons.HumanDolly: ImageVector
    get() {
        if (_humanDolly != null) {
            return _humanDolly!!
        }
        _humanDolly = Builder(name = "HumanDolly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.78f, 21.84f)
                curveTo(15.77f, 22.27f, 14.59f, 21.8f, 14.16f, 20.78f)
                curveTo(13.73f, 19.77f, 14.2f, 18.59f, 15.22f, 18.16f)
                curveTo(16.23f, 17.73f, 17.41f, 18.2f, 17.84f, 19.22f)
                curveTo(18.27f, 20.23f, 17.8f, 21.41f, 16.78f, 21.84f)
                moveTo(7.62f, 6.0f)
                curveTo(8.73f, 6.0f, 9.62f, 5.11f, 9.62f, 4.0f)
                curveTo(9.62f, 2.9f, 8.73f, 2.0f, 7.62f, 2.0f)
                curveTo(6.5f, 2.0f, 5.62f, 2.9f, 5.62f, 4.0f)
                curveTo(5.62f, 5.11f, 6.5f, 6.0f, 7.62f, 6.0f)
                moveTo(22.05f, 16.34f)
                lineTo(18.2f, 18.0f)
                curveTo(18.42f, 18.22f, 18.62f, 18.5f, 18.76f, 18.82f)
                curveTo(18.9f, 19.15f, 18.96f, 19.5f, 19.0f, 19.82f)
                lineTo(22.83f, 18.18f)
                lineTo(22.05f, 16.34f)
                moveTo(10.16f, 8.78f)
                lineTo(10.9f, 10.59f)
                curveTo(10.66f, 10.5f, 10.44f, 10.38f, 10.26f, 10.26f)
                curveTo(9.66f, 9.87f, 9.22f, 9.38f, 8.93f, 8.8f)
                lineTo(8.19f, 7.23f)
                curveTo(8.0f, 6.88f, 7.77f, 6.62f, 7.45f, 6.44f)
                curveTo(7.16f, 6.27f, 6.85f, 6.18f, 6.53f, 6.18f)
                curveTo(6.21f, 6.18f, 5.91f, 6.26f, 5.62f, 6.4f)
                curveTo(4.22f, 7.5f, 3.87f, 9.54f, 3.87f, 9.54f)
                lineTo(3.53f, 11.11f)
                curveTo(3.44f, 11.63f, 3.39f, 12.15f, 3.39f, 12.68f)
                verticalLineTo(17.64f)
                lineTo(1.0f, 20.87f)
                lineTo(2.5f, 22.0f)
                lineTo(5.27f, 18.25f)
                lineTo(5.44f, 15.0f)
                lineTo(7.12f, 17.34f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.97f)
                verticalLineTo(15.94f)
                lineTo(7.12f, 13.33f)
                verticalLineTo(12.68f)
                curveTo(7.12f, 12.24f, 7.12f, 11.81f, 7.23f, 11.39f)
                lineTo(7.58f, 10.19f)
                curveTo(7.96f, 10.74f, 8.42f, 11.22f, 8.97f, 11.63f)
                curveTo(9.42f, 11.97f, 10.68f, 12.57f, 11.87f, 12.86f)
                lineTo(14.0f, 17.8f)
                curveTo(14.22f, 17.58f, 14.5f, 17.38f, 14.83f, 17.24f)
                curveTo(15.15f, 17.1f, 15.5f, 17.04f, 15.82f, 17.0f)
                lineTo(12.0f, 8.0f)
                lineTo(10.16f, 8.78f)
                moveTo(15.36f, 12.12f)
                lineTo(17.32f, 16.72f)
                lineTo(22.95f, 14.31f)
                lineTo(21.0f, 9.72f)
            }
        }
        .build()
        return _humanDolly!!
    }

private var _humanDolly: ImageVector? = null
