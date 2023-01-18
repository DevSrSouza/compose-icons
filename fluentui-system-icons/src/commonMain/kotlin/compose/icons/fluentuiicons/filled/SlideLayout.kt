package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.SlideLayout: ImageVector
    get() {
        if (_slideLayout != null) {
            return _slideLayout!!
        }
        _slideLayout = Builder(name = "SlideLayout", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 8.75f)
                curveTo(6.5f, 8.6119f, 6.6119f, 8.5f, 6.75f, 8.5f)
                horizontalLineTo(17.25f)
                curveTo(17.3881f, 8.5f, 17.5f, 8.6119f, 17.5f, 8.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(8.75f)
                close()
                moveTo(6.5f, 12.0f)
                verticalLineTo(15.25f)
                curveTo(6.5f, 15.3881f, 6.6119f, 15.5f, 6.75f, 15.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(17.25f, 15.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.25f)
                curveTo(17.5f, 15.3881f, 17.3881f, 15.5f, 17.25f, 15.5f)
                close()
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.7688f, 20.7688f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(6.75f, 7.0f)
                curveTo(5.7835f, 7.0f, 5.0f, 7.7835f, 5.0f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(5.0f, 16.2165f, 5.7835f, 17.0f, 6.75f, 17.0f)
                horizontalLineTo(17.25f)
                curveTo(18.2165f, 17.0f, 19.0f, 16.2165f, 19.0f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(19.0f, 7.7835f, 18.2165f, 7.0f, 17.25f, 7.0f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _slideLayout!!
    }

private var _slideLayout: ImageVector? = null
