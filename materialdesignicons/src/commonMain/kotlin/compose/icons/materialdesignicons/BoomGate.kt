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

public val MaterialDesignIcons.BoomGate: ImageVector
    get() {
        if (_boomGate != null) {
            return _boomGate!!
        }
        _boomGate = Builder(name = "BoomGate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                horizontalLineTo(8.22f)
                curveTo(7.11f, 7.77f, 5.21f, 7.68f, 4.0f, 8.8f)
                curveTo(3.36f, 9.36f, 3.0f, 10.16f, 3.0f, 11.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 9.0f)
                moveTo(6.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 12.5f)
                moveTo(10.5f, 12.0f)
                lineTo(9.0f, 10.0f)
                horizontalLineTo(10.5f)
                lineTo(12.0f, 12.0f)
                horizontalLineTo(10.5f)
                moveTo(14.5f, 12.0f)
                lineTo(13.0f, 10.0f)
                horizontalLineTo(14.5f)
                lineTo(16.0f, 12.0f)
                horizontalLineTo(14.5f)
                moveTo(18.5f, 12.0f)
                lineTo(17.0f, 10.0f)
                horizontalLineTo(18.5f)
                lineTo(20.0f, 12.0f)
                horizontalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _boomGate!!
    }

private var _boomGate: ImageVector? = null
