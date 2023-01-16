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

public val MaterialDesignIcons.NetworkOffOutline: ImageVector
    get() {
        if (_networkOffOutline != null) {
            return _networkOffOutline!!
        }
        _networkOffOutline = Builder(name = "NetworkOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.04f, 5.27f)
                lineTo(5.0f, 9.23f)
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
                horizontalLineTo(17.77f)
                lineTo(19.77f, 24.0f)
                lineTo(21.04f, 22.72f)
                lineTo(2.32f, 4.0f)
                lineTo(1.04f, 5.27f)
                moveTo(7.0f, 11.23f)
                lineTo(10.77f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.23f)
                moveTo(15.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.23f)
                lineTo(15.77f, 20.0f)
                horizontalLineTo(15.0f)
                moveTo(22.0f, 20.0f)
                verticalLineTo(21.14f)
                lineTo(20.86f, 20.0f)
                horizontalLineTo(22.0f)
                moveTo(7.0f, 6.14f)
                lineTo(5.14f, 4.28f)
                curveTo(5.43f, 3.53f, 6.16f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 15.85f, 18.47f, 16.57f, 17.72f, 16.86f)
                lineTo(15.86f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.14f)
                close()
            }
        }
        .build()
        return _networkOffOutline!!
    }

private var _networkOffOutline: ImageVector? = null
