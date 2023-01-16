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

public val MaterialDesignIcons.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.83f, 7.5f)
                lineTo(17.56f, 5.23f)
                curveTo(17.63f, 4.81f, 17.74f, 4.42f, 17.88f, 4.08f)
                curveTo(17.96f, 3.9f, 18.0f, 3.71f, 18.0f, 3.5f)
                curveTo(18.0f, 2.67f, 17.33f, 2.0f, 16.5f, 2.0f)
                curveTo(14.86f, 2.0f, 13.41f, 2.79f, 12.5f, 4.0f)
                horizontalLineTo(7.5f)
                curveTo(4.46f, 4.0f, 2.0f, 6.46f, 2.0f, 9.5f)
                reflectiveCurveTo(4.5f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.5f)
                lineTo(19.18f, 15.41f)
                lineTo(22.0f, 14.47f)
                verticalLineTo(7.5f)
                horizontalLineTo(19.83f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(16.0f, 11.0f)
                curveTo(15.45f, 11.0f, 15.0f, 10.55f, 15.0f, 10.0f)
                reflectiveCurveTo(15.45f, 9.0f, 16.0f, 9.0f)
                curveTo(16.55f, 9.0f, 17.0f, 9.45f, 17.0f, 10.0f)
                reflectiveCurveTo(16.55f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
