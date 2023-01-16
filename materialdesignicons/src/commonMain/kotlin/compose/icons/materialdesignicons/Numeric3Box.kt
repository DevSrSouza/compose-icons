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

public val MaterialDesignIcons.Numeric3Box: ImageVector
    get() {
        if (_numeric3Box != null) {
            return _numeric3Box!!
        }
        _numeric3Box = Builder(name = "Numeric3Box", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 12.0f)
                curveTo(14.34f, 12.0f, 15.0f, 12.67f, 15.0f, 13.5f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 16.11f, 14.11f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                curveTo(14.11f, 7.0f, 15.0f, 7.89f, 15.0f, 9.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.91f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _numeric3Box!!
    }

private var _numeric3Box: ImageVector? = null
