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

public val MaterialDesignIcons.VideoInputComponent: ImageVector
    get() {
        if (_videoInputComponent != null) {
            return _videoInputComponent!!
        }
        _videoInputComponent = Builder(name = "VideoInputComponent", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                moveTo(9.0f, 16.0f)
                curveTo(9.0f, 17.3f, 9.84f, 18.4f, 11.0f, 18.82f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.82f)
                curveTo(14.16f, 18.41f, 15.0f, 17.31f, 15.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                moveTo(1.0f, 16.0f)
                curveTo(1.0f, 17.3f, 1.84f, 18.4f, 3.0f, 18.82f)
                verticalLineTo(23.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.82f)
                curveTo(6.16f, 18.4f, 7.0f, 17.3f, 7.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(16.0f)
                moveTo(21.0f, 6.0f)
                verticalLineTo(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                moveTo(13.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                moveTo(17.0f, 16.0f)
                curveTo(17.0f, 17.3f, 17.84f, 18.4f, 19.0f, 18.82f)
                verticalLineTo(23.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.82f)
                curveTo(22.16f, 18.41f, 23.0f, 17.31f, 23.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _videoInputComponent!!
    }

private var _videoInputComponent: ImageVector? = null
