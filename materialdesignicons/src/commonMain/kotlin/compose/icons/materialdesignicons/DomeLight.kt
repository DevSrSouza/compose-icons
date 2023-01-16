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

public val MaterialDesignIcons.DomeLight: ImageVector
    get() {
        if (_domeLight != null) {
            return _domeLight!!
        }
        _domeLight = Builder(name = "DomeLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                curveTo(21.0f, 14.97f, 16.97f, 19.0f, 12.0f, 19.0f)
                curveTo(7.03f, 19.0f, 3.0f, 14.97f, 3.0f, 10.0f)
                verticalLineTo(9.03f)
                curveTo(3.0f, 8.76f, 3.11f, 8.5f, 3.3f, 8.3f)
                curveTo(3.5f, 8.11f, 3.76f, 8.0f, 4.03f, 8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.25f, 8.0f, 20.5f, 8.11f, 20.7f, 8.3f)
                curveTo(20.89f, 8.5f, 21.0f, 8.75f, 21.0f, 9.0f)
                verticalLineTo(10.0f)
                moveTo(5.0f, 10.0f)
                curveTo(5.0f, 13.86f, 8.14f, 17.0f, 12.0f, 17.0f)
                curveTo(15.86f, 17.0f, 19.0f, 13.86f, 19.0f, 10.0f)
                horizontalLineTo(5.0f)
                moveTo(20.0f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                curveTo(4.0f, 5.73f, 4.1f, 5.5f, 4.29f, 5.29f)
                curveTo(4.5f, 5.1f, 4.73f, 5.0f, 5.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                curveTo(19.25f, 5.0f, 19.5f, 5.11f, 19.7f, 5.3f)
                curveTo(19.89f, 5.5f, 20.0f, 5.75f, 20.0f, 6.0f)
                close()
            }
        }
        .build()
        return _domeLight!!
    }

private var _domeLight: ImageVector? = null
