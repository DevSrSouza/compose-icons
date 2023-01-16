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

public val MaterialDesignIcons.AirHorn: ImageVector
    get() {
        if (_airHorn != null) {
            return _airHorn!!
        }
        _airHorn = Builder(name = "AirHorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.8f)
                verticalLineTo(6.0f)
                lineTo(19.0f, 9.2f)
                curveTo(19.0f, 9.5f, 18.7f, 9.8f, 18.4f, 9.7f)
                curveTo(18.4f, 9.7f, 14.5f, 7.1f, 10.0f, 7.1f)
                verticalLineTo(9.5f)
                horizontalLineTo(10.2f)
                curveTo(10.7f, 9.5f, 11.2f, 9.7f, 11.4f, 10.1f)
                lineTo(12.7f, 11.9f)
                curveTo(12.9f, 12.1f, 13.0f, 12.4f, 13.0f, 12.6f)
                verticalLineTo(20.6f)
                curveTo(13.0f, 21.3f, 12.3f, 22.0f, 11.5f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.7f, 22.0f, 5.0f, 21.4f, 5.0f, 20.6f)
                verticalLineTo(12.6f)
                curveTo(5.0f, 12.3f, 5.1f, 12.1f, 5.3f, 11.9f)
                lineTo(6.6f, 10.1f)
                curveTo(6.9f, 9.7f, 7.3f, 9.5f, 7.8f, 9.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                curveTo(7.6f, 8.5f, 7.0f, 8.8f, 6.4f, 8.8f)
                curveTo(5.1f, 8.8f, 4.0f, 7.5f, 4.0f, 6.0f)
                curveTo(4.0f, 4.5f, 5.1f, 3.2f, 6.4f, 3.2f)
                curveTo(7.0f, 3.3f, 7.6f, 3.6f, 8.0f, 4.0f)
                verticalLineTo(2.6f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                curveTo(14.5f, 5.0f, 18.4f, 2.4f, 18.4f, 2.4f)
                curveTo(18.7f, 2.3f, 19.0f, 2.5f, 19.0f, 2.8f)
                close()
            }
        }
        .build()
        return _airHorn!!
    }

private var _airHorn: ImageVector? = null
