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

public val MaterialDesignIcons.CameraPlusOutline: ImageVector
    get() {
        if (_cameraPlusOutline != null) {
            return _cameraPlusOutline!!
        }
        _cameraPlusOutline = Builder(name = "CameraPlusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(17.8f)
                lineTo(16.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.1f)
                lineTo(17.0f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 21.1f, 3.9f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 22.0f, 23.0f, 21.1f, 23.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(23.0f, 6.9f, 22.1f, 6.0f, 21.0f, 6.0f)
                moveTo(8.0f, 14.0f)
                curveTo(8.0f, 18.45f, 13.39f, 20.69f, 16.54f, 17.54f)
                curveTo(19.69f, 14.39f, 17.45f, 9.0f, 13.0f, 9.0f)
                curveTo(10.24f, 9.0f, 8.0f, 11.24f, 8.0f, 14.0f)
                moveTo(13.0f, 11.0f)
                curveTo(14.64f, 11.05f, 15.95f, 12.36f, 16.0f, 14.0f)
                curveTo(15.95f, 15.64f, 14.64f, 16.95f, 13.0f, 17.0f)
                curveTo(11.36f, 16.95f, 10.05f, 15.64f, 10.0f, 14.0f)
                curveTo(10.05f, 12.36f, 11.36f, 11.05f, 13.0f, 11.0f)
                moveTo(5.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
            }
        }
        .build()
        return _cameraPlusOutline!!
    }

private var _cameraPlusOutline: ImageVector? = null
