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

public val MaterialDesignIcons.WaterPump: ImageVector
    get() {
        if (_waterPump != null) {
            return _waterPump!!
        }
        _waterPump = Builder(name = "WaterPump", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 14.5f, 21.0f, 16.67f, 21.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 18.0f)
                curveTo(17.0f, 16.67f, 19.0f, 14.5f, 19.0f, 14.5f)
                moveTo(5.0f, 18.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 7.0f)
                verticalLineTo(9.0f)
                lineTo(21.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 13.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 18.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _waterPump!!
    }

private var _waterPump: ImageVector? = null
