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

public val MaterialDesignIcons.SmokingOff: ImageVector
    get() {
        if (_smokingOff != null) {
            return _smokingOff!!
        }
        _smokingOff = Builder(name = "SmokingOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineTo(9.0f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                lineTo(19.0f, 23.0f)
                lineTo(20.25f, 21.75f)
                lineTo(3.25f, 4.75f)
                lineTo(2.0f, 6.0f)
                moveTo(20.5f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(13.0f)
                moveTo(18.0f, 13.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                moveTo(18.85f, 4.88f)
                curveTo(19.47f, 4.27f, 19.85f, 3.43f, 19.85f, 2.5f)
                horizontalLineTo(18.35f)
                curveTo(18.35f, 3.5f, 17.5f, 4.35f, 16.5f, 4.35f)
                verticalLineTo(5.85f)
                curveTo(18.74f, 5.85f, 20.5f, 7.68f, 20.5f, 9.92f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.92f)
                curveTo(22.0f, 7.69f, 20.72f, 5.77f, 18.85f, 4.88f)
                moveTo(14.5f, 8.7f)
                horizontalLineTo(16.03f)
                curveTo(17.08f, 8.7f, 18.0f, 9.44f, 18.0f, 10.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.41f)
                curveTo(19.5f, 8.61f, 17.9f, 7.25f, 16.03f, 7.25f)
                horizontalLineTo(14.5f)
                curveTo(13.5f, 7.25f, 12.65f, 6.27f, 12.65f, 5.25f)
                curveTo(12.65f, 4.23f, 13.5f, 3.5f, 14.5f, 3.5f)
                verticalLineTo(2.0f)
                arcTo(3.35f, 3.35f, 0.0f, false, false, 11.15f, 5.35f)
                arcTo(3.35f, 3.35f, 0.0f, false, false, 14.5f, 8.7f)
                moveTo(17.0f, 15.93f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.07f)
                lineTo(17.0f, 15.93f)
                close()
            }
        }
        .build()
        return _smokingOff!!
    }

private var _smokingOff: ImageVector? = null
