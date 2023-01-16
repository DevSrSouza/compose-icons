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

public val MaterialDesignIcons.Drone: ImageVector
    get() {
        if (_drone != null) {
            return _drone!!
        }
        _drone = Builder(name = "Drone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                horizontalLineTo(21.0f)
                lineTo(20.0f, 9.0f)
                horizontalLineTo(13.75f)
                lineTo(16.0f, 12.5f)
                horizontalLineTo(14.0f)
                lineTo(10.75f, 9.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 9.0f, 2.0f, 8.55f, 2.0f, 8.0f)
                curveTo(2.0f, 7.45f, 3.5f, 5.5f, 5.5f, 5.5f)
                curveTo(7.5f, 5.5f, 7.67f, 6.5f, 9.0f, 7.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 8.0f)
                verticalLineTo(9.0f)
                lineTo(22.0f, 11.0f)
                moveTo(10.75f, 6.5f)
                lineTo(14.0f, 3.0f)
                horizontalLineTo(16.0f)
                lineTo(13.75f, 6.5f)
                horizontalLineTo(10.75f)
                moveTo(18.0f, 11.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.75f)
                lineTo(19.0f, 11.0f)
                horizontalLineTo(18.0f)
                moveTo(3.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 19.0f)
                moveTo(11.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 21.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 3.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 13.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 11.0f, 21.0f)
                close()
            }
        }
        .build()
        return _drone!!
    }

private var _drone: ImageVector? = null
