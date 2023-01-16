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

public val MaterialDesignIcons.HumanFemaleBoy: ImageVector
    get() {
        if (_humanFemaleBoy != null) {
            return _humanFemaleBoy!!
        }
        _humanFemaleBoy = Builder(name = "HumanFemaleBoy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.5f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.5f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.5f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.5f, 2.0f)
                moveTo(6.0f, 22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                lineTo(5.6f, 8.4f)
                curveTo(5.9f, 7.6f, 6.6f, 7.0f, 7.5f, 7.0f)
                curveTo(8.4f, 7.0f, 9.2f, 7.6f, 9.4f, 8.4f)
                lineTo(12.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                moveTo(14.5f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.5f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.5f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.5f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.5f, 12.0f)
                moveTo(13.5f, 15.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _humanFemaleBoy!!
    }

private var _humanFemaleBoy: ImageVector? = null
