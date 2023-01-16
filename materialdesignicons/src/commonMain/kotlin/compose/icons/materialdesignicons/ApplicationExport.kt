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

public val MaterialDesignIcons.ApplicationExport: ImageVector
    get() {
        if (_applicationExport != null) {
            return _applicationExport!!
        }
        _applicationExport = Builder(name = "ApplicationExport", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                horizontalLineTo(18.8f)
                lineTo(16.3f, 9.5f)
                lineTo(17.7f, 8.1f)
                lineTo(22.6f, 13.0f)
                lineTo(17.7f, 17.9f)
                lineTo(16.3f, 16.5f)
                lineTo(18.8f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                moveTo(21.0f, 17.4f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.6f)
                lineTo(23.0f, 10.6f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.9f, 22.1f, 2.0f, 21.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 2.0f, 1.0f, 2.9f, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.1f, 1.9f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 22.0f, 23.0f, 21.1f, 23.0f, 20.0f)
                verticalLineTo(15.4f)
                lineTo(21.0f, 17.4f)
                close()
            }
        }
        .build()
        return _applicationExport!!
    }

private var _applicationExport: ImageVector? = null
