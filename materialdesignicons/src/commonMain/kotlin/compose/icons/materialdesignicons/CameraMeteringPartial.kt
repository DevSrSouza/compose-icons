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

public val MaterialDesignIcons.CameraMeteringPartial: ImageVector
    get() {
        if (_cameraMeteringPartial != null) {
            return _cameraMeteringPartial!!
        }
        _cameraMeteringPartial = Builder(name = "CameraMeteringPartial", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 4.0f)
                moveTo(4.0f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                moveTo(12.0f, 7.5f)
                curveTo(14.14f, 7.5f, 15.93f, 9.0f, 16.39f, 11.0f)
                horizontalLineTo(14.83f)
                curveTo(14.42f, 9.83f, 13.31f, 9.0f, 12.0f, 9.0f)
                curveTo(10.69f, 9.0f, 9.58f, 9.83f, 9.17f, 11.0f)
                horizontalLineTo(7.61f)
                curveTo(8.07f, 9.0f, 9.86f, 7.5f, 12.0f, 7.5f)
                moveTo(12.0f, 16.5f)
                curveTo(9.86f, 16.5f, 8.07f, 15.0f, 7.61f, 13.0f)
                horizontalLineTo(9.17f)
                curveTo(9.58f, 14.17f, 10.69f, 15.0f, 12.0f, 15.0f)
                curveTo(13.31f, 15.0f, 14.42f, 14.17f, 14.83f, 13.0f)
                horizontalLineTo(16.39f)
                curveTo(15.93f, 15.0f, 14.14f, 16.5f, 12.0f, 16.5f)
                close()
            }
        }
        .build()
        return _cameraMeteringPartial!!
    }

private var _cameraMeteringPartial: ImageVector? = null
