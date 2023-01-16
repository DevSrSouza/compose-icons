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

public val MaterialDesignIcons.PackageCheck: ImageVector
    get() {
        if (_packageCheck != null) {
            return _packageCheck!!
        }
        _packageCheck = Builder(name = "PackageCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(5.5f, 3.0f, 5.1f, 3.2f, 4.8f, 3.6f)
                lineTo(3.5f, 5.2f)
                curveTo(3.2f, 5.6f, 3.0f, 6.0f, 3.0f, 6.5f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(13.3f)
                curveTo(13.1f, 20.4f, 13.0f, 19.7f, 13.0f, 19.0f)
                curveTo(13.0f, 15.7f, 15.7f, 13.0f, 19.0f, 13.0f)
                curveTo(19.7f, 13.0f, 20.4f, 13.1f, 21.0f, 13.3f)
                verticalLineTo(6.5f)
                curveTo(21.0f, 6.0f, 20.8f, 5.6f, 20.5f, 5.2f)
                lineTo(19.1f, 3.5f)
                curveTo(18.9f, 3.2f, 18.5f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                moveTo(5.9f, 4.0f)
                horizontalLineTo(17.9f)
                lineTo(18.8f, 5.0f)
                horizontalLineTo(5.1f)
                lineTo(5.9f, 4.0f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                moveTo(21.3f, 15.8f)
                lineTo(17.7f, 19.4f)
                lineTo(16.1f, 17.8f)
                lineTo(15.0f, 19.0f)
                lineTo(17.8f, 22.0f)
                lineTo(22.6f, 17.2f)
                lineTo(21.3f, 15.8f)
                close()
            }
        }
        .build()
        return _packageCheck!!
    }

private var _packageCheck: ImageVector? = null
