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

public val MaterialDesignIcons.Mine: ImageVector
    get() {
        if (_mine != null) {
            return _mine!!
        }
        _mine = Builder(name = "Mine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.93f)
                curveTo(19.75f, 9.58f, 19.19f, 8.23f, 18.31f, 7.1f)
                lineTo(20.5f, 4.93f)
                lineTo(19.07f, 3.5f)
                lineTo(16.9f, 5.69f)
                curveTo(15.77f, 4.81f, 14.42f, 4.25f, 13.0f, 4.07f)
                verticalLineTo(1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.07f)
                curveTo(9.58f, 4.25f, 8.23f, 4.81f, 7.1f, 5.69f)
                lineTo(4.93f, 3.5f)
                lineTo(3.5f, 4.93f)
                lineTo(5.69f, 7.1f)
                curveTo(4.81f, 8.23f, 4.25f, 9.58f, 4.07f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.07f)
                curveTo(4.25f, 14.42f, 4.81f, 15.77f, 5.69f, 16.9f)
                lineTo(3.5f, 19.07f)
                lineTo(4.93f, 20.5f)
                lineTo(7.1f, 18.31f)
                curveTo(8.23f, 19.19f, 9.58f, 19.75f, 11.0f, 19.93f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.93f)
                curveTo(14.42f, 19.75f, 15.77f, 19.19f, 16.9f, 18.31f)
                lineTo(19.07f, 20.5f)
                lineTo(20.5f, 19.07f)
                lineTo(18.31f, 16.9f)
                curveTo(19.19f, 15.77f, 19.75f, 14.42f, 19.93f, 13.0f)
                horizontalLineTo(23.0f)
                moveTo(12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 12.0f)
                horizontalLineTo(6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _mine!!
    }

private var _mine: ImageVector? = null
