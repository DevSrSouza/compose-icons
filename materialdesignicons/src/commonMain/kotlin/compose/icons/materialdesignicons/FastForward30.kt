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

public val MaterialDesignIcons.FastForward30: ImageVector
    get() {
        if (_fastForward30 != null) {
            return _fastForward30!!
        }
        _fastForward30 = Builder(name = "FastForward30", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 3.0f)
                curveTo(6.85f, 3.0f, 2.92f, 6.03f, 1.53f, 10.22f)
                lineTo(3.9f, 11.0f)
                curveTo(4.95f, 7.81f, 7.96f, 5.5f, 11.5f, 5.5f)
                curveTo(13.46f, 5.5f, 15.23f, 6.22f, 16.62f, 7.38f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                lineTo(18.4f, 5.6f)
                curveTo(16.55f, 4.0f, 14.15f, 3.0f, 11.5f, 3.0f)
                moveTo(19.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 21.11f, 18.11f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 20.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 12.0f, 19.0f, 12.9f, 19.0f, 14.0f)
                moveTo(15.0f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 20.0f)
                curveTo(11.0f, 21.11f, 10.1f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 14.0f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 18.5f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _fastForward30!!
    }

private var _fastForward30: ImageVector? = null
