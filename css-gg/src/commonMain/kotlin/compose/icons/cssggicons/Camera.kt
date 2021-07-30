package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 4.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(3.0f)
                curveTo(1.3432f, 7.5f, 0.0f, 8.8432f, 0.0f, 10.5f)
                verticalLineTo(16.5f)
                curveTo(0.0f, 18.1569f, 1.3432f, 19.5f, 3.0f, 19.5f)
                horizontalLineTo(15.0f)
                curveTo(16.5731f, 19.5f, 17.8634f, 18.2892f, 17.9898f, 16.7487f)
                lineTo(24.0f, 17.5f)
                verticalLineTo(9.5f)
                lineTo(17.9898f, 10.2513f)
                curveTo(17.8634f, 8.7108f, 16.5731f, 7.5f, 15.0f, 7.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.5f)
                curveTo(14.0f, 4.9477f, 13.5523f, 4.5f, 13.0f, 4.5f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.0f, 12.2656f)
                verticalLineTo(14.7344f)
                lineTo(22.0f, 15.2344f)
                verticalLineTo(11.7656f)
                lineTo(18.0f, 12.2656f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(16.0f, 9.9477f, 15.5523f, 9.5f, 15.0f, 9.5f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 9.5f, 2.0f, 9.9477f, 2.0f, 10.5f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 17.0523f, 2.4477f, 17.5f, 3.0f, 17.5f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 17.5f, 16.0f, 17.0523f, 16.0f, 16.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
