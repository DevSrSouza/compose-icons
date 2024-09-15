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
                curveTo(1.343f, 7.5f, 0.0f, 8.843f, 0.0f, 10.5f)
                verticalLineTo(16.5f)
                curveTo(0.0f, 18.157f, 1.343f, 19.5f, 3.0f, 19.5f)
                horizontalLineTo(15.0f)
                curveTo(16.573f, 19.5f, 17.863f, 18.289f, 17.99f, 16.749f)
                lineTo(24.0f, 17.5f)
                verticalLineTo(9.5f)
                lineTo(17.99f, 10.251f)
                curveTo(17.863f, 8.711f, 16.573f, 7.5f, 15.0f, 7.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.5f)
                curveTo(14.0f, 4.948f, 13.552f, 4.5f, 13.0f, 4.5f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.0f, 12.266f)
                verticalLineTo(14.734f)
                lineTo(22.0f, 15.234f)
                verticalLineTo(11.766f)
                lineTo(18.0f, 12.266f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(16.0f, 9.948f, 15.552f, 9.5f, 15.0f, 9.5f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 9.5f, 2.0f, 9.948f, 2.0f, 10.5f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 17.052f, 2.448f, 17.5f, 3.0f, 17.5f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 17.5f, 16.0f, 17.052f, 16.0f, 16.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
