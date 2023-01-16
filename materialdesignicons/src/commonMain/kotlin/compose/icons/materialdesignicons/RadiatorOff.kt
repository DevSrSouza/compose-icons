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

public val MaterialDesignIcons.RadiatorOff: ImageVector
    get() {
        if (_radiatorOff != null) {
            return _radiatorOff!!
        }
        _radiatorOff = Builder(name = "RadiatorOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.28f, 2.0f)
                lineTo(2.0f, 3.27f)
                lineTo(4.77f, 6.04f)
                lineTo(5.64f, 7.39f)
                lineTo(4.22f, 9.6f)
                lineTo(5.95f, 10.5f)
                lineTo(7.23f, 8.5f)
                lineTo(10.73f, 12.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.73f)
                lineTo(20.0f, 21.27f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.73f)
                lineTo(22.0f, 20.72f)
                verticalLineTo(20.72f)
                lineTo(3.28f, 2.0f)
                moveTo(7.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 15.0f)
                verticalLineTo(17.0f)
                moveTo(11.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 15.0f)
                verticalLineTo(17.0f)
                moveTo(15.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 14.79f, 13.08f, 14.61f, 13.18f, 14.45f)
                lineTo(15.0f, 16.27f)
                verticalLineTo(17.0f)
                moveTo(16.25f, 9.5f)
                lineTo(17.67f, 7.3f)
                lineTo(16.25f, 5.1f)
                lineTo(18.25f, 2.0f)
                lineTo(20.0f, 2.89f)
                lineTo(18.56f, 5.1f)
                lineTo(20.0f, 7.3f)
                verticalLineTo(7.31f)
                lineTo(18.0f, 10.4f)
                lineTo(16.25f, 9.5f)
                moveTo(22.0f, 14.0f)
                verticalLineTo(18.18f)
                lineTo(19.0f, 15.18f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 14.0f)
                curveTo(17.95f, 14.0f, 17.9f, 14.0f, 17.85f, 14.03f)
                lineTo(15.82f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 12.0f, 22.0f, 12.9f, 22.0f, 14.0f)
                moveTo(11.64f, 7.3f)
                lineTo(10.22f, 5.1f)
                lineTo(12.22f, 2.0f)
                lineTo(13.95f, 2.89f)
                lineTo(12.53f, 5.1f)
                lineTo(13.95f, 7.3f)
                lineTo(13.94f, 7.31f)
                lineTo(12.84f, 9.0f)
                lineTo(11.44f, 7.62f)
                lineTo(11.64f, 7.3f)
                moveTo(7.5f, 3.69f)
                lineTo(6.1f, 2.28f)
                lineTo(6.22f, 2.09f)
                lineTo(7.95f, 3.0f)
                lineTo(7.5f, 3.69f)
                close()
            }
        }
        .build()
        return _radiatorOff!!
    }

private var _radiatorOff: ImageVector? = null
