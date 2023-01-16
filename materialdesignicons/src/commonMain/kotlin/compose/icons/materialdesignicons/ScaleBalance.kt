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

public val MaterialDesignIcons.ScaleBalance: ImageVector
    get() {
        if (_scaleBalance != null) {
            return _scaleBalance!!
        }
        _scaleBalance = Builder(name = "ScaleBalance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(10.73f, 3.0f, 9.6f, 3.8f, 9.18f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.95f)
                lineTo(2.0f, 14.0f)
                curveTo(1.53f, 16.0f, 3.0f, 17.0f, 5.5f, 17.0f)
                curveTo(8.0f, 17.0f, 9.56f, 16.0f, 9.0f, 14.0f)
                lineTo(6.05f, 7.0f)
                horizontalLineTo(9.17f)
                curveTo(9.5f, 7.85f, 10.15f, 8.5f, 11.0f, 8.83f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.82f)
                curveTo(13.85f, 8.5f, 14.5f, 7.85f, 14.82f, 7.0f)
                horizontalLineTo(17.95f)
                lineTo(15.0f, 14.0f)
                curveTo(14.53f, 16.0f, 16.0f, 17.0f, 18.5f, 17.0f)
                curveTo(21.0f, 17.0f, 22.56f, 16.0f, 22.0f, 14.0f)
                lineTo(19.05f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.83f)
                curveTo(14.4f, 3.8f, 13.27f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 5.0f)
                moveTo(5.5f, 10.25f)
                lineTo(7.0f, 14.0f)
                horizontalLineTo(4.0f)
                lineTo(5.5f, 10.25f)
                moveTo(18.5f, 10.25f)
                lineTo(20.0f, 14.0f)
                horizontalLineTo(17.0f)
                lineTo(18.5f, 10.25f)
                close()
            }
        }
        .build()
        return _scaleBalance!!
    }

private var _scaleBalance: ImageVector? = null
