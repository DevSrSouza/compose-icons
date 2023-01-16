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

public val MaterialDesignIcons.PipeValve: ImageVector
    get() {
        if (_pipeValve != null) {
            return _pipeValve!!
        }
        _pipeValve = Builder(name = "PipeValve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.58f)
                curveTo(15.81f, 20.76f, 14.05f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(8.19f, 20.76f, 7.42f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.43f)
                curveTo(7.93f, 13.85f, 8.85f, 12.93f, 10.0f, 12.42f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.42f)
                curveTo(15.15f, 12.93f, 16.07f, 13.85f, 16.57f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(6.45f, 2.0f, 6.0f, 2.45f, 6.0f, 3.0f)
                reflectiveCurveTo(6.45f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                curveTo(17.55f, 4.0f, 18.0f, 3.55f, 18.0f, 3.0f)
                reflectiveCurveTo(17.55f, 2.0f, 17.0f, 2.0f)
                close()
            }
        }
        .build()
        return _pipeValve!!
    }

private var _pipeValve: ImageVector? = null
