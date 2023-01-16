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

public val MaterialDesignIcons.ImageFilterCenterFocusStrongOutline: ImageVector
    get() {
        if (_imageFilterCenterFocusStrongOutline != null) {
            return _imageFilterCenterFocusStrongOutline!!
        }
        _imageFilterCenterFocusStrongOutline = Builder(name = "ImageFilterCenterFocusStrongOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 7.55f, 11.62f, 5.31f, 8.46f, 8.46f)
                curveTo(5.31f, 11.61f, 7.55f, 17.0f, 12.0f, 17.0f)
                curveTo(14.76f, 17.0f, 17.0f, 14.76f, 17.0f, 12.0f)
                moveTo(12.0f, 15.0f)
                curveTo(9.33f, 15.0f, 8.0f, 11.77f, 9.88f, 9.88f)
                curveTo(11.77f, 8.0f, 15.0f, 9.33f, 15.0f, 12.0f)
                curveTo(15.0f, 13.66f, 13.66f, 15.0f, 12.0f, 15.0f)
                moveTo(5.0f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
            }
        }
        .build()
        return _imageFilterCenterFocusStrongOutline!!
    }

private var _imageFilterCenterFocusStrongOutline: ImageVector? = null
