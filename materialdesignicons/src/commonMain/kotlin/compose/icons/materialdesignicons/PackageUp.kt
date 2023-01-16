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

public val MaterialDesignIcons.PackageUp: ImageVector
    get() {
        if (_packageUp != null) {
            return _packageUp!!
        }
        _packageUp = Builder(name = "PackageUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.54f, 5.23f)
                curveTo(20.83f, 5.57f, 21.0f, 6.0f, 21.0f, 6.5f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(6.5f)
                curveTo(3.0f, 6.0f, 3.17f, 5.57f, 3.46f, 5.23f)
                lineTo(4.84f, 3.55f)
                curveTo(5.12f, 3.21f, 5.53f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(18.47f, 3.0f, 18.88f, 3.21f, 19.15f, 3.55f)
                lineTo(20.54f, 5.23f)
                moveTo(5.12f, 5.0f)
                horizontalLineTo(18.87f)
                lineTo(17.93f, 4.0f)
                horizontalLineTo(5.93f)
                lineTo(5.12f, 5.0f)
                moveTo(12.0f, 9.5f)
                lineTo(6.5f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.5f)
                lineTo(12.0f, 9.5f)
                close()
            }
        }
        .build()
        return _packageUp!!
    }

private var _packageUp: ImageVector? = null
