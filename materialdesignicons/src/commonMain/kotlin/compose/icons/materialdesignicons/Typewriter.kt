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

public val MaterialDesignIcons.Typewriter: ImageVector
    get() {
        if (_typewriter != null) {
            return _typewriter!!
        }
        _typewriter = Builder(name = "Typewriter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 14.1f, 15.1f, 15.0f, 14.0f, 15.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 15.0f, 8.0f, 14.1f, 8.0f, 13.0f)
                horizontalLineTo(4.0f)
                lineTo(2.0f, 18.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 22.0f, 22.0f, 21.1f, 22.0f, 20.0f)
                verticalLineTo(18.0f)
                moveTo(6.0f, 20.0f)
                curveTo(5.11f, 20.0f, 4.66f, 18.92f, 5.29f, 18.29f)
                curveTo(5.92f, 17.66f, 7.0f, 18.11f, 7.0f, 19.0f)
                curveTo(7.0f, 19.55f, 6.55f, 20.0f, 6.0f, 20.0f)
                moveTo(10.0f, 20.0f)
                curveTo(9.11f, 20.0f, 8.66f, 18.92f, 9.29f, 18.29f)
                curveTo(9.92f, 17.66f, 11.0f, 18.11f, 11.0f, 19.0f)
                curveTo(11.0f, 19.55f, 10.55f, 20.0f, 10.0f, 20.0f)
                moveTo(14.0f, 20.0f)
                curveTo(13.11f, 20.0f, 12.66f, 18.92f, 13.29f, 18.29f)
                curveTo(13.92f, 17.66f, 15.0f, 18.11f, 15.0f, 19.0f)
                curveTo(15.0f, 19.55f, 14.55f, 20.0f, 14.0f, 20.0f)
                moveTo(18.0f, 20.0f)
                curveTo(17.11f, 20.0f, 16.66f, 18.92f, 17.29f, 18.29f)
                curveTo(17.92f, 17.66f, 19.0f, 18.11f, 19.0f, 19.0f)
                curveTo(19.0f, 19.55f, 18.55f, 20.0f, 18.0f, 20.0f)
                moveTo(18.0f, 10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                moveTo(8.0f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
            }
        }
        .build()
        return _typewriter!!
    }

private var _typewriter: ImageVector? = null
