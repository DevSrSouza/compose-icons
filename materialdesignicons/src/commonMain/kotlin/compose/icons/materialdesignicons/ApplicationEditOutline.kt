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

public val MaterialDesignIcons.ApplicationEditOutline: ImageVector
    get() {
        if (_applicationEditOutline != null) {
            return _applicationEditOutline!!
        }
        _applicationEditOutline = Builder(name = "ApplicationEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 22.0f, 1.0f, 21.1f, 1.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 2.9f, 1.9f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 2.0f, 23.0f, 2.9f, 23.0f, 4.0f)
                verticalLineTo(12.1f)
                lineTo(22.8f, 11.9f)
                curveTo(22.3f, 11.4f, 21.7f, 11.1f, 21.0f, 11.1f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                moveTo(21.4f, 13.3f)
                lineTo(22.7f, 14.6f)
                curveTo(22.9f, 14.8f, 22.9f, 15.2f, 22.7f, 15.4f)
                lineTo(21.7f, 16.4f)
                lineTo(19.6f, 14.3f)
                lineTo(20.6f, 13.3f)
                curveTo(20.7f, 13.2f, 20.8f, 13.1f, 21.0f, 13.1f)
                curveTo(21.2f, 13.1f, 21.3f, 13.2f, 21.4f, 13.3f)
                moveTo(21.1f, 16.9f)
                lineTo(15.1f, 23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.9f)
                lineTo(19.1f, 14.8f)
                lineTo(21.1f, 16.9f)
                close()
            }
        }
        .build()
        return _applicationEditOutline!!
    }

private var _applicationEditOutline: ImageVector? = null
