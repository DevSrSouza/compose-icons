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

public val MaterialDesignIcons.DiceD6: ImageVector
    get() {
        if (_diceD6 != null) {
            return _diceD6!!
        }
        _diceD6 = Builder(name = "DiceD6", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.05f, 13.5f)
                curveTo(13.05f, 14.27f, 12.61f, 14.83f, 12.0f, 14.83f)
                reflectiveCurveTo(10.85f, 14.27f, 10.85f, 13.5f)
                lineTo(10.83f, 12.78f)
                curveTo(10.83f, 12.78f, 11.21f, 12.0f, 11.95f, 12.1f)
                curveTo(12.56f, 12.1f, 13.05f, 12.73f, 13.05f, 13.5f)
                moveTo(21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.11f, 20.11f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                moveTo(14.55f, 13.41f)
                curveTo(14.5f, 11.45f, 13.19f, 10.87f, 12.53f, 10.87f)
                curveTo(11.41f, 10.87f, 10.86f, 11.53f, 10.86f, 11.53f)
                reflectiveCurveTo(10.89f, 9.5f, 13.39f, 9.53f)
                verticalLineTo(8.33f)
                curveTo(13.39f, 8.33f, 9.33f, 7.94f, 9.3f, 12.66f)
                curveTo(9.27f, 16.86f, 12.77f, 16.0f, 12.77f, 16.0f)
                reflectiveCurveTo(14.61f, 15.47f, 14.55f, 13.41f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
