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

public val MaterialDesignIcons.Piston: ImageVector
    get() {
        if (_piston != null) {
            return _piston!!
        }
        _piston = Builder(name = "Piston", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.18f)
                curveTo(13.5f, 16.35f, 13.9f, 16.63f, 14.23f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.21f)
                curveTo(13.89f, 21.35f, 13.5f, 21.63f, 13.0f, 21.8f)
                curveTo(11.85f, 22.22f, 10.58f, 21.87f, 9.78f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.77f)
                curveTo(10.1f, 16.63f, 10.5f, 16.35f, 11.0f, 16.18f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.18f)
                moveTo(12.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 20.0f)
                moveTo(17.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                moveTo(12.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _piston!!
    }

private var _piston: ImageVector? = null
