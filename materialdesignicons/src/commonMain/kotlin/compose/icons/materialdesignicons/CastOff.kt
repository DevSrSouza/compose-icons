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

public val MaterialDesignIcons.CastOff: ImageVector
    get() {
        if (_castOff != null) {
            return _castOff!!
        }
        _castOff = Builder(name = "CastOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.6f, 1.27f)
                lineTo(0.25f, 2.75f)
                lineTo(1.41f, 3.8f)
                curveTo(1.16f, 4.13f, 1.0f, 4.55f, 1.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.23f)
                lineTo(18.2f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.41f)
                lineTo(22.31f, 22.72f)
                lineTo(23.65f, 21.24f)
                moveTo(6.5f, 3.0f)
                lineTo(8.7f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.14f)
                lineTo(23.0f, 17.95f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.89f, 22.1f, 3.0f, 21.0f, 3.0f)
                moveTo(1.0f, 10.0f)
                verticalLineTo(12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 10.0f, 21.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 14.92f, 7.08f, 10.0f, 1.0f, 10.0f)
                moveTo(1.0f, 14.0f)
                verticalLineTo(16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 21.0f)
                horizontalLineTo(8.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.0f, 14.0f)
                moveTo(1.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.0f, 18.0f)
                close()
            }
        }
        .build()
        return _castOff!!
    }

private var _castOff: ImageVector? = null
