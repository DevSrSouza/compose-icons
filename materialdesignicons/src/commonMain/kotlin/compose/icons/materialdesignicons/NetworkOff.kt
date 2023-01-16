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

public val MaterialDesignIcons.NetworkOff: ImageVector
    get() {
        if (_networkOff != null) {
            return _networkOff!!
        }
        _networkOff = Builder(name = "NetworkOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 5.27f)
                lineTo(5.0f, 9.27f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 23.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 22.0f)
                horizontalLineTo(17.73f)
                lineTo(19.73f, 24.0f)
                lineTo(21.0f, 22.72f)
                lineTo(2.28f, 4.0f)
                lineTo(1.0f, 5.27f)
                moveTo(15.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.27f)
                lineTo(15.73f, 20.0f)
                horizontalLineTo(15.0f)
                moveTo(17.69f, 16.87f)
                lineTo(5.13f, 4.31f)
                curveTo(5.41f, 3.55f, 6.14f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 15.86f, 18.45f, 16.59f, 17.69f, 16.87f)
                moveTo(22.0f, 20.0f)
                verticalLineTo(21.18f)
                lineTo(20.82f, 20.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _networkOff!!
    }

private var _networkOff: ImageVector? = null
