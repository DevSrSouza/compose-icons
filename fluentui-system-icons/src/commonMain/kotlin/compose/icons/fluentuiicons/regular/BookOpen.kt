package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = Builder(name = "BookOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.1375f)
                curveTo(11.4986f, 19.6686f, 10.788f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 20.0f, 2.0f, 19.2165f, 2.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(2.0f, 4.7835f, 2.7835f, 4.0f, 3.75f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(10.788f, 4.0f, 11.4986f, 4.3314f, 12.0f, 4.8625f)
                curveTo(12.5014f, 4.3314f, 13.212f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(20.25f)
                curveTo(21.2165f, 4.0f, 22.0f, 4.7835f, 22.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(22.0f, 19.2165f, 21.2165f, 20.0f, 20.25f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(13.212f, 20.0f, 12.5014f, 19.6686f, 12.0f, 19.1375f)
                close()
                moveTo(3.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.5f, 18.3881f, 3.6119f, 18.5f, 3.75f, 18.5f)
                horizontalLineTo(10.0f)
                curveTo(10.6904f, 18.5f, 11.25f, 17.9404f, 11.25f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(11.25f, 6.0596f, 10.6904f, 5.5f, 10.0f, 5.5f)
                horizontalLineTo(3.75f)
                curveTo(3.6119f, 5.5f, 3.5f, 5.6119f, 3.5f, 5.75f)
                close()
                moveTo(12.75f, 17.25f)
                curveTo(12.75f, 17.9404f, 13.3096f, 18.5f, 14.0f, 18.5f)
                horizontalLineTo(20.25f)
                curveTo(20.3881f, 18.5f, 20.5f, 18.3881f, 20.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(20.5f, 5.6119f, 20.3881f, 5.5f, 20.25f, 5.5f)
                horizontalLineTo(14.0f)
                curveTo(13.3096f, 5.5f, 12.75f, 6.0596f, 12.75f, 6.75f)
                verticalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
