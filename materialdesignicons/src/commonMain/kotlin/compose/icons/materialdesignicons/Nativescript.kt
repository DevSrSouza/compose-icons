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

public val MaterialDesignIcons.Nativescript: ImageVector
    get() {
        if (_nativescript != null) {
            return _nativescript!!
        }
        _nativescript = Builder(name = "Nativescript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 3.0f)
                horizontalLineTo(16.5f)
                curveTo(19.0f, 3.0f, 21.0f, 5.0f, 21.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 19.0f, 19.0f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(7.5f)
                curveTo(5.0f, 21.0f, 3.0f, 19.0f, 3.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 5.0f, 5.0f, 3.0f, 7.5f, 3.0f)
                moveTo(6.0f, 13.5f)
                verticalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.5f)
                lineTo(15.0f, 18.0f)
                horizontalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 16.5f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 10.5f)
                verticalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.5f)
                lineTo(9.0f, 6.0f)
                horizontalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 7.5f)
                verticalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 13.5f)
                close()
            }
        }
        .build()
        return _nativescript!!
    }

private var _nativescript: ImageVector? = null
