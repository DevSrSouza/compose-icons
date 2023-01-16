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

public val MaterialDesignIcons.HumanHandsup: ImageVector
    get() {
        if (_humanHandsup != null) {
            return _humanHandsup!!
        }
        _humanHandsup = Builder(name = "HumanHandsup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 1.0f)
                curveTo(5.0f, 3.7f, 6.56f, 6.16f, 9.0f, 7.32f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.31f)
                curveTo(17.44f, 6.16f, 19.0f, 3.7f, 19.0f, 1.0f)
                horizontalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 1.0f)
                moveTo(12.0f, 1.0f)
                curveTo(10.89f, 1.0f, 10.0f, 1.89f, 10.0f, 3.0f)
                curveTo(10.0f, 4.11f, 10.89f, 5.0f, 12.0f, 5.0f)
                curveTo(13.11f, 5.0f, 14.0f, 4.11f, 14.0f, 3.0f)
                curveTo(14.0f, 1.89f, 13.11f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _humanHandsup!!
    }

private var _humanHandsup: ImageVector? = null
