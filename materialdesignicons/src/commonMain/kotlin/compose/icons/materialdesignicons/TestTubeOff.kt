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

public val MaterialDesignIcons.TestTubeOff: ImageVector
    get() {
        if (_testTubeOff != null) {
            return _testTubeOff!!
        }
        _testTubeOff = Builder(name = "TestTubeOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(15.84f, 19.11f)
                curveTo(15.36f, 20.77f, 13.82f, 22.0f, 12.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 18.0f)
                verticalLineTo(11.27f)
                lineTo(2.0f, 5.27f)
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.18f)
                lineTo(13.63f, 11.81f)
                curveTo(13.86f, 11.63f, 14.0f, 11.35f, 14.0f, 11.0f)
                curveTo(14.0f, 10.4f, 13.6f, 10.0f, 13.0f, 10.0f)
                curveTo(12.65f, 10.0f, 12.37f, 10.14f, 12.19f, 10.37f)
                lineTo(8.0f, 6.18f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                moveTo(11.0f, 16.0f)
                curveTo(11.5f, 16.0f, 11.88f, 15.71f, 12.0f, 15.24f)
                lineTo(10.76f, 14.0f)
                curveTo(10.29f, 14.12f, 10.0f, 14.5f, 10.0f, 15.0f)
                curveTo(10.0f, 15.6f, 10.4f, 16.0f, 11.0f, 16.0f)
                moveTo(14.0f, 7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _testTubeOff!!
    }

private var _testTubeOff: ImageVector? = null
