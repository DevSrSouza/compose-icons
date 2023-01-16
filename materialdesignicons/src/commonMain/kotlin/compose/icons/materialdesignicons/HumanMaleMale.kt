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

public val MaterialDesignIcons.HumanMaleMale: ImageVector
    get() {
        if (_humanMaleMale != null) {
            return _humanMaleMale!!
        }
        _humanMaleMale = Builder(name = "HumanMaleMale", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.5f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.5f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.5f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.5f, 2.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 9.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 7.0f)
                moveTo(16.5f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.5f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.5f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.5f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.5f, 2.0f)
                moveTo(15.0f, 7.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 9.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 7.0f)
                close()
            }
        }
        .build()
        return _humanMaleMale!!
    }

private var _humanMaleMale: ImageVector? = null
