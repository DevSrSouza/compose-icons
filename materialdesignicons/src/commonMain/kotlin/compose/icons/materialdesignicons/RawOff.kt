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

public val MaterialDesignIcons.RawOff: ImageVector
    get() {
        if (_rawOff != null) {
            return _rawOff!!
        }
        _rawOff = Builder(name = "RawOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.15f, 14.32f)
                lineTo(14.72f, 11.9f)
                lineTo(14.0f, 9.0f)
                horizontalLineTo(15.5f)
                lineTo(16.24f, 12.0f)
                lineTo(17.0f, 9.0f)
                horizontalLineTo(18.5f)
                lineTo(19.24f, 12.0f)
                lineTo(20.0f, 9.0f)
                horizontalLineTo(21.5f)
                lineTo(20.0f, 15.0f)
                horizontalLineTo(18.5f)
                lineTo(17.74f, 11.96f)
                lineTo(17.15f, 14.32f)
                moveTo(1.39f, 4.22f)
                lineTo(2.81f, 2.81f)
                lineTo(21.19f, 21.2f)
                lineTo(19.78f, 22.61f)
                lineTo(10.67f, 13.5f)
                horizontalLineTo(10.63f)
                lineTo(10.25f, 15.0f)
                horizontalLineTo(8.75f)
                lineTo(9.43f, 12.26f)
                lineTo(8.0f, 10.83f)
                verticalLineTo(11.5f)
                curveTo(8.0f, 12.1f, 7.6f, 12.6f, 7.1f, 12.9f)
                lineTo(8.0f, 15.0f)
                horizontalLineTo(6.5f)
                lineTo(5.6f, 13.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.17f)
                lineTo(1.39f, 4.22f)
                moveTo(6.5f, 11.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _rawOff!!
    }

private var _rawOff: ImageVector? = null
