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

public val MaterialDesignIcons.Looks: ImageVector
    get() {
        if (_looks != null) {
            return _looks!!
        }
        _looks = Builder(name = "Looks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 1.0f, 17.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 12.04f, 7.04f, 8.0f, 12.0f, 8.0f)
                curveTo(16.96f, 8.0f, 21.0f, 12.04f, 21.0f, 17.0f)
                horizontalLineTo(23.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 12.0f, 6.0f)
                moveTo(12.0f, 10.0f)
                curveTo(8.14f, 10.0f, 5.0f, 13.14f, 5.0f, 17.0f)
                horizontalLineTo(7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 13.14f, 15.86f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _looks!!
    }

private var _looks: ImageVector? = null
