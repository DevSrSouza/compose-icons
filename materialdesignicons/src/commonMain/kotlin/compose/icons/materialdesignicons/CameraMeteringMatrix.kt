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

public val MaterialDesignIcons.CameraMeteringMatrix: ImageVector
    get() {
        if (_cameraMeteringMatrix != null) {
            return _cameraMeteringMatrix!!
        }
        _cameraMeteringMatrix = Builder(name = "CameraMeteringMatrix", defaultWidth = 24.0.dp,
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
                moveTo(5.5f, 7.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.17f)
                curveTo(10.15f, 9.47f, 9.47f, 10.15f, 9.17f, 11.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(7.5f)
                moveTo(18.5f, 7.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.83f)
                curveTo(14.53f, 10.15f, 13.85f, 9.47f, 13.0f, 9.17f)
                verticalLineTo(7.5f)
                horizontalLineTo(18.5f)
                moveTo(18.5f, 16.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.83f)
                curveTo(13.85f, 14.53f, 14.53f, 13.85f, 14.83f, 13.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(16.5f)
                moveTo(5.5f, 16.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.17f)
                curveTo(9.47f, 13.85f, 10.15f, 14.53f, 11.0f, 14.83f)
                verticalLineTo(16.5f)
                horizontalLineTo(5.5f)
                moveTo(12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 10.5f)
                close()
            }
        }
        .build()
        return _cameraMeteringMatrix!!
    }

private var _cameraMeteringMatrix: ImageVector? = null
