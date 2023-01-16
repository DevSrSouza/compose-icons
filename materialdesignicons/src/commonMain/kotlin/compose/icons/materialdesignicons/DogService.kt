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

public val MaterialDesignIcons.DogService: ImageVector
    get() {
        if (_dogService != null) {
            return _dogService!!
        }
        _dogService = Builder(name = "DogService", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                lineTo(17.0f, 11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                lineTo(6.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                lineTo(5.0f, 14.0f)
                verticalLineTo(11.0f)
                lineTo(2.0f, 8.0f)
                lineTo(3.0f, 7.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 13.0f)
                horizontalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 12.0f)
                verticalLineTo(9.0f)
                lineTo(14.0f, 8.0f)
                moveTo(19.0f, 5.0f)
                verticalLineTo(3.0f)
                lineTo(15.0f, 7.0f)
                lineTo(18.0f, 10.0f)
                lineTo(19.0f, 9.0f)
                lineTo(20.0f, 10.0f)
                lineTo(22.0f, 8.0f)
                lineTo(19.0f, 5.0f)
                moveTo(11.5f, 9.5f)
                lineTo(4.5f, 2.5f)
                curveTo(4.23f, 2.22f, 3.79f, 2.22f, 3.5f, 2.5f)
                verticalLineTo(2.5f)
                curveTo(3.22f, 2.77f, 3.22f, 3.21f, 3.5f, 3.5f)
                lineTo(10.5f, 10.5f)
                curveTo(10.77f, 10.78f, 11.21f, 10.78f, 11.5f, 10.5f)
                verticalLineTo(10.5f)
                curveTo(11.78f, 10.23f, 11.78f, 9.79f, 11.5f, 9.5f)
                close()
            }
        }
        .build()
        return _dogService!!
    }

private var _dogService: ImageVector? = null
