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

public val MaterialDesignIcons.PackageDown: ImageVector
    get() {
        if (_packageDown != null) {
            return _packageDown!!
        }
        _packageDown = Builder(name = "PackageDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.12f, 5.0f)
                lineTo(5.93f, 4.0f)
                horizontalLineTo(17.93f)
                lineTo(18.87f, 5.0f)
                moveTo(12.0f, 17.5f)
                lineTo(6.5f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                lineTo(12.0f, 17.5f)
                moveTo(20.54f, 5.23f)
                lineTo(19.15f, 3.55f)
                curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.53f, 3.0f, 5.12f, 3.21f, 4.84f, 3.55f)
                lineTo(3.46f, 5.23f)
                curveTo(3.17f, 5.57f, 3.0f, 6.0f, 3.0f, 6.5f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(6.5f)
                curveTo(21.0f, 6.0f, 20.83f, 5.57f, 20.54f, 5.23f)
                close()
            }
        }
        .build()
        return _packageDown!!
    }

private var _packageDown: ImageVector? = null
