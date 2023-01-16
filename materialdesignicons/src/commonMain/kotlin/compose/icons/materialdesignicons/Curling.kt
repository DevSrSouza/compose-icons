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

public val MaterialDesignIcons.Curling: ImageVector
    get() {
        if (_curling != null) {
            return _curling!!
        }
        _curling = Builder(name = "Curling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(12.5f, 5.0f, 13.9f, 5.05f, 14.72f, 5.41f)
                curveTo(15.26f, 5.65f, 15.73f, 6.21f, 16.25f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.62f)
                lineTo(18.89f, 7.55f)
                curveTo(17.86f, 5.5f, 16.96f, 4.22f, 15.53f, 3.59f)
                curveTo(14.1f, 2.95f, 12.5f, 3.0f, 10.0f, 3.0f)
                moveTo(6.0f, 11.0f)
                curveTo(3.78f, 11.0f, 2.0f, 12.78f, 2.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 20.22f, 3.78f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(20.22f, 22.0f, 22.0f, 20.22f, 22.0f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 12.78f, 20.22f, 11.0f, 18.0f, 11.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _curling!!
    }

private var _curling: ImageVector? = null
