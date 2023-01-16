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

public val MaterialDesignIcons.ClockTimeTwoOutline: ImageVector
    get() {
        if (_clockTimeTwoOutline != null) {
            return _clockTimeTwoOutline!!
        }
        _clockTimeTwoOutline = Builder(name = "ClockTimeTwoOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                reflectiveCurveTo(16.42f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(4.0f, 7.58f, 4.0f, 12.0f)
                reflectiveCurveTo(7.58f, 20.0f, 12.0f, 20.0f)
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 22.0f, 12.0f, 22.0f)
                curveTo(6.47f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.5f, 13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(11.26f)
                lineTo(16.2f, 9.13f)
                lineTo(16.95f, 10.43f)
                lineTo(12.5f, 13.0f)
                close()
            }
        }
        .build()
        return _clockTimeTwoOutline!!
    }

private var _clockTimeTwoOutline: ImageVector? = null
