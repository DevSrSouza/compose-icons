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

public val MaterialDesignIcons.HumanGreetingVariant: ImageVector
    get() {
        if (_humanGreetingVariant != null) {
            return _humanGreetingVariant!!
        }
        _humanGreetingVariant = Builder(name = "HumanGreetingVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 4.0f)
                verticalLineTo(5.5f)
                curveTo(1.5f, 9.65f, 3.71f, 13.28f, 7.0f, 15.3f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 15.34f, 16.67f, 14.0f, 14.0f, 14.0f)
                curveTo(14.0f, 14.0f, 13.83f, 14.0f, 13.75f, 14.0f)
                curveTo(9.0f, 14.0f, 5.0f, 10.0f, 5.0f, 5.5f)
                verticalLineTo(4.0f)
                moveTo(14.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _humanGreetingVariant!!
    }

private var _humanGreetingVariant: ImageVector? = null
