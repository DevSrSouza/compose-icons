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

public val MaterialDesignIcons.GhostOffOutline: ImageVector
    get() {
        if (_ghostOffOutline != null) {
            return _ghostOffOutline!!
        }
        _ghostOffOutline = Builder(name = "GhostOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.29f, 5.09f)
                lineTo(6.84f, 3.64f)
                curveTo(8.3f, 2.61f, 10.08f, 2.0f, 12.0f, 2.0f)
                curveTo(16.97f, 2.0f, 21.0f, 6.03f, 21.0f, 11.0f)
                verticalLineTo(17.8f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 7.14f, 15.86f, 4.0f, 12.0f, 4.0f)
                curveTo(10.63f, 4.0f, 9.36f, 4.4f, 8.29f, 5.09f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.56f, 19.45f)
                lineTo(15.0f, 22.0f)
                lineTo(12.0f, 19.0f)
                lineTo(9.0f, 22.0f)
                lineTo(6.0f, 19.0f)
                lineTo(3.0f, 22.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 9.26f, 3.5f, 7.63f, 4.36f, 6.25f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(6.89f, 6.23f)
                lineTo(8.69f, 8.03f)
                horizontalLineTo(8.69f)
                lineTo(10.97f, 10.31f)
                verticalLineTo(10.31f)
                lineTo(17.41f, 16.76f)
                lineTo(17.42f, 16.76f)
                lineTo(21.0f, 20.34f)
                verticalLineTo(20.35f)
                lineTo(22.11f, 21.46f)
                moveTo(16.14f, 18.03f)
                lineTo(9.89f, 11.78f)
                curveTo(9.62f, 11.92f, 9.32f, 12.0f, 9.0f, 12.0f)
                curveTo(7.9f, 12.0f, 7.0f, 11.11f, 7.0f, 10.0f)
                curveTo(7.0f, 9.68f, 7.08f, 9.38f, 7.22f, 9.11f)
                lineTo(5.82f, 7.71f)
                curveTo(5.3f, 8.69f, 5.0f, 9.81f, 5.0f, 11.0f)
                verticalLineTo(17.17f)
                lineTo(6.0f, 16.17f)
                lineTo(7.41f, 17.59f)
                lineTo(9.0f, 19.17f)
                lineTo(10.59f, 17.59f)
                lineTo(12.0f, 16.17f)
                lineTo(13.41f, 17.59f)
                lineTo(15.0f, 19.17f)
                lineTo(16.14f, 18.03f)
                moveTo(15.0f, 8.0f)
                curveTo(13.96f, 8.0f, 13.11f, 8.8f, 13.0f, 9.82f)
                lineTo(15.18f, 12.0f)
                curveTo(16.2f, 11.89f, 17.0f, 11.04f, 17.0f, 10.0f)
                curveTo(17.0f, 8.9f, 16.11f, 8.0f, 15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _ghostOffOutline!!
    }

private var _ghostOffOutline: ImageVector? = null
