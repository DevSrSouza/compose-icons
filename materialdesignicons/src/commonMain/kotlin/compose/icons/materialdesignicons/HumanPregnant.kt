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

public val MaterialDesignIcons.HumanPregnant: ImageVector
    get() {
        if (_humanPregnant != null) {
            return _humanPregnant!!
        }
        _humanPregnant = Builder(name = "HumanPregnant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(9.0f, 2.89f, 9.89f, 2.0f, 11.0f, 2.0f)
                curveTo(12.11f, 2.0f, 13.0f, 2.89f, 13.0f, 4.0f)
                curveTo(13.0f, 5.11f, 12.11f, 6.0f, 11.0f, 6.0f)
                curveTo(9.89f, 6.0f, 9.0f, 5.11f, 9.0f, 4.0f)
                moveTo(16.0f, 13.0f)
                curveTo(16.0f, 11.66f, 15.17f, 10.5f, 14.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _humanPregnant!!
    }

private var _humanPregnant: ImageVector? = null
