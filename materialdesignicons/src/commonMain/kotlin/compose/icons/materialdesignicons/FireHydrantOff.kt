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

public val MaterialDesignIcons.FireHydrantOff: ImageVector
    get() {
        if (_fireHydrantOff != null) {
            return _fireHydrantOff!!
        }
        _fireHydrantOff = Builder(name = "FireHydrantOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(8.0f, 9.89f)
                verticalLineTo(20.0f)
                curveTo(6.9f, 20.0f, 6.0f, 20.9f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 20.9f, 17.11f, 20.0f, 16.0f, 20.0f)
                verticalLineTo(17.89f)
                lineTo(20.84f, 22.73f)
                moveTo(10.22f, 12.11f)
                lineTo(12.89f, 14.78f)
                curveTo(12.62f, 14.92f, 12.32f, 15.0f, 12.0f, 15.0f)
                curveTo(10.9f, 15.0f, 10.0f, 14.11f, 10.0f, 13.0f)
                curveTo(10.0f, 12.68f, 10.08f, 12.38f, 10.22f, 12.11f)
                moveTo(11.2f, 8.0f)
                lineTo(8.44f, 5.24f)
                curveTo(8.94f, 4.21f, 9.87f, 3.43f, 11.0f, 3.14f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.14f)
                curveTo(14.4f, 3.5f, 15.5f, 4.6f, 15.86f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.2f)
                moveTo(19.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.2f)
                lineTo(17.0f, 13.8f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                moveTo(5.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                moveTo(16.0f, 12.8f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.8f)
                close()
            }
        }
        .build()
        return _fireHydrantOff!!
    }

private var _fireHydrantOff: ImageVector? = null
