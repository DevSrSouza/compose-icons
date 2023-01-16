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

public val MaterialDesignIcons.HeadsetOff: ImageVector
    get() {
        if (_headsetOff != null) {
            return _headsetOff!!
        }
        _headsetOff = Builder(name = "HeadsetOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 4.77f)
                lineTo(3.57f, 6.84f)
                curveTo(3.2f, 7.82f, 3.0f, 8.89f, 3.0f, 10.0f)
                verticalLineTo(20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 23.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.27f)
                lineTo(15.0f, 18.27f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.73f)
                lineTo(19.23f, 22.5f)
                lineTo(20.5f, 21.22f)
                lineTo(2.78f, 3.5f)
                lineTo(1.5f, 4.77f)
                moveTo(12.0f, 1.0f)
                curveTo(9.47f, 1.0f, 7.18f, 2.04f, 5.55f, 3.72f)
                lineTo(6.96f, 5.14f)
                curveTo(8.23f, 3.82f, 10.0f, 3.0f, 12.0f, 3.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.18f)
                lineTo(20.5f, 18.67f)
                curveTo(20.81f, 18.19f, 21.0f, 17.62f, 21.0f, 17.0f)
                verticalLineTo(10.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 1.0f)
                moveTo(5.0f, 12.0f)
                verticalLineTo(10.0f)
                curveTo(5.0f, 9.46f, 5.06f, 8.94f, 5.17f, 8.44f)
                lineTo(8.73f, 12.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _headsetOff!!
    }

private var _headsetOff: ImageVector? = null
