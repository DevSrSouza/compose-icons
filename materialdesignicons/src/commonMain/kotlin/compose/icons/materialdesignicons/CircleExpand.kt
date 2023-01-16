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

public val MaterialDesignIcons.CircleExpand: ImageVector
    get() {
        if (_circleExpand != null) {
            return _circleExpand!!
        }
        _circleExpand = Builder(name = "CircleExpand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(4.0f)
                moveTo(20.0f, 16.0f)
                lineTo(16.0f, 20.0f)
                horizontalLineTo(20.0f)
                moveTo(8.0f, 20.0f)
                lineTo(4.0f, 16.0f)
                verticalLineTo(20.0f)
                moveTo(4.0f, 8.0f)
                lineTo(8.0f, 4.0f)
                horizontalLineTo(4.0f)
                moveTo(16.95f, 7.05f)
                curveTo(14.22f, 4.32f, 9.78f, 4.32f, 7.05f, 7.05f)
                curveTo(4.32f, 9.78f, 4.32f, 14.22f, 7.05f, 16.95f)
                curveTo(9.78f, 19.68f, 14.22f, 19.68f, 16.95f, 16.95f)
                curveTo(19.68f, 14.22f, 19.68f, 9.79f, 16.95f, 7.05f)
                moveTo(15.85f, 15.85f)
                curveTo(13.72f, 18.0f, 10.28f, 18.0f, 8.15f, 15.85f)
                curveTo(6.0f, 13.72f, 6.0f, 10.28f, 8.15f, 8.15f)
                curveTo(10.28f, 6.0f, 13.72f, 6.0f, 15.85f, 8.15f)
                curveTo(18.0f, 10.28f, 18.0f, 13.72f, 15.85f, 15.85f)
                close()
            }
        }
        .build()
        return _circleExpand!!
    }

private var _circleExpand: ImageVector? = null
