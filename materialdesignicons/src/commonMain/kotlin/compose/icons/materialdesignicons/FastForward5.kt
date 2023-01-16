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

public val MaterialDesignIcons.FastForward5: ImageVector
    get() {
        if (_fastForward5 != null) {
            return _fastForward5!!
        }
        _fastForward5 = Builder(name = "FastForward5", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 3.0f)
                curveTo(14.15f, 3.0f, 16.55f, 4.0f, 18.4f, 5.6f)
                lineTo(21.0f, 3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                lineTo(16.62f, 7.38f)
                curveTo(15.23f, 6.22f, 13.46f, 5.5f, 11.5f, 5.5f)
                curveTo(7.96f, 5.5f, 4.95f, 7.81f, 3.9f, 11.0f)
                lineTo(1.53f, 10.22f)
                curveTo(2.92f, 6.03f, 6.85f, 3.0f, 11.5f, 3.0f)
                moveTo(9.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                curveTo(14.11f, 16.0f, 15.0f, 16.9f, 15.0f, 18.0f)
                verticalLineTo(20.0f)
                curveTo(15.0f, 21.11f, 14.11f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _fastForward5!!
    }

private var _fastForward5: ImageVector? = null
