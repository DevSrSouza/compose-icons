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

public val RegularGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5495f, 2.5319f)
                curveTo(11.3874f, 1.8253f, 12.6126f, 1.8253f, 13.4505f, 2.5319f)
                lineTo(20.2005f, 8.224f)
                curveTo(20.7074f, 8.6515f, 21.0f, 9.2809f, 21.0f, 9.9441f)
                verticalLineTo(19.7468f)
                curveTo(21.0f, 20.7133f, 20.2165f, 21.4968f, 19.25f, 21.4968f)
                horizontalLineTo(15.75f)
                curveTo(14.7835f, 21.4968f, 14.0f, 20.7133f, 14.0f, 19.7468f)
                verticalLineTo(14.2468f)
                curveTo(14.0f, 14.1088f, 13.8881f, 13.9968f, 13.75f, 13.9968f)
                horizontalLineTo(10.25f)
                curveTo(10.1119f, 13.9968f, 10.0f, 14.1088f, 10.0f, 14.2468f)
                verticalLineTo(19.7468f)
                curveTo(10.0f, 20.7133f, 9.2165f, 21.4968f, 8.25f, 21.4968f)
                horizontalLineTo(4.75f)
                curveTo(3.7835f, 21.4968f, 3.0f, 20.7133f, 3.0f, 19.7468f)
                verticalLineTo(9.9441f)
                curveTo(3.0f, 9.2809f, 3.2926f, 8.6515f, 3.7995f, 8.224f)
                lineTo(10.5495f, 2.5319f)
                close()
                moveTo(12.4835f, 3.6786f)
                curveTo(12.2042f, 3.4431f, 11.7958f, 3.4431f, 11.5165f, 3.6786f)
                lineTo(4.7665f, 9.3707f)
                curveTo(4.5975f, 9.5132f, 4.5f, 9.723f, 4.5f, 9.9441f)
                verticalLineTo(19.7468f)
                curveTo(4.5f, 19.8849f, 4.6119f, 19.9968f, 4.75f, 19.9968f)
                horizontalLineTo(8.25f)
                curveTo(8.3881f, 19.9968f, 8.5f, 19.8849f, 8.5f, 19.7468f)
                verticalLineTo(14.2468f)
                curveTo(8.5f, 13.2803f, 9.2835f, 12.4968f, 10.25f, 12.4968f)
                horizontalLineTo(13.75f)
                curveTo(14.7165f, 12.4968f, 15.5f, 13.2803f, 15.5f, 14.2468f)
                verticalLineTo(19.7468f)
                curveTo(15.5f, 19.8849f, 15.6119f, 19.9968f, 15.75f, 19.9968f)
                horizontalLineTo(19.25f)
                curveTo(19.3881f, 19.9968f, 19.5f, 19.8849f, 19.5f, 19.7468f)
                verticalLineTo(9.9441f)
                curveTo(19.5f, 9.723f, 19.4025f, 9.5132f, 19.2335f, 9.3707f)
                lineTo(12.4835f, 3.6786f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
