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

public val MaterialDesignIcons.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                lineTo(9.03f, 3.97f)
                lineTo(10.0f, 3.0f)
                lineTo(12.0f, 5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(15.0f, 4.0f)
                lineTo(13.0f, 6.0f)
                verticalLineTo(21.0f)
                moveTo(7.0f, 6.0f)
                curveTo(4.24f, 6.0f, 2.0f, 8.24f, 2.0f, 11.0f)
                curveTo(2.0f, 12.64f, 2.79f, 14.09f, 4.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 5.79f, 21.0f, 8.0f, 21.0f)
                curveTo(8.72f, 21.0f, 9.39f, 20.81f, 9.97f, 20.5f)
                lineTo(10.0f, 20.46f)
                verticalLineTo(7.0f)
                curveTo(9.16f, 6.37f, 8.13f, 6.0f, 7.0f, 6.0f)
                moveTo(6.5f, 12.5f)
                lineTo(5.0f, 11.0f)
                lineTo(6.5f, 9.5f)
                lineTo(8.0f, 11.0f)
                lineTo(6.5f, 12.5f)
                moveTo(22.0f, 11.0f)
                curveTo(22.0f, 8.24f, 19.76f, 6.0f, 17.0f, 6.0f)
                curveTo(15.88f, 6.0f, 14.85f, 6.37f, 14.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                verticalLineTo(20.46f)
                curveTo(14.59f, 20.81f, 15.27f, 21.0f, 16.0f, 21.0f)
                curveTo(18.21f, 21.0f, 20.0f, 19.21f, 20.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                curveTo(21.21f, 14.09f, 22.0f, 12.64f, 22.0f, 11.0f)
                moveTo(17.5f, 12.5f)
                lineTo(16.0f, 11.0f)
                lineTo(17.5f, 9.5f)
                lineTo(19.0f, 11.0f)
                lineTo(17.5f, 12.5f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
