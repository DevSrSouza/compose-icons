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

public val MaterialDesignIcons.BriefcaseClock: ImageVector
    get() {
        if (_briefcaseClock != null) {
            return _briefcaseClock!!
        }
        _briefcaseClock = Builder(name = "BriefcaseClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.11f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 1.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 7.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 20.0f)
                horizontalLineTo(10.26f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 21.0f, 11.11f)
                moveTo(9.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                moveTo(19.0f, 20.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 20.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 19.0f, 20.0f)
                moveTo(15.0f, 13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15.0f, 16.69f)
                verticalLineTo(13.0f)
            }
        }
        .build()
        return _briefcaseClock!!
    }

private var _briefcaseClock: ImageVector? = null
