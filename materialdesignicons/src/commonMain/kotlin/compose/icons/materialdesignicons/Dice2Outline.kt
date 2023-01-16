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

public val MaterialDesignIcons.Dice2Outline: ImageVector
    get() {
        if (_dice2Outline != null) {
            return _dice2Outline!!
        }
        _dice2Outline = Builder(name = "Dice2Outline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                moveTo(7.5f, 6.0f)
                curveTo(6.67f, 6.0f, 6.0f, 6.67f, 6.0f, 7.5f)
                reflectiveCurveTo(6.67f, 9.0f, 7.5f, 9.0f)
                reflectiveCurveTo(9.0f, 8.33f, 9.0f, 7.5f)
                reflectiveCurveTo(8.33f, 6.0f, 7.5f, 6.0f)
                moveTo(16.5f, 15.0f)
                curveTo(15.67f, 15.0f, 15.0f, 15.67f, 15.0f, 16.5f)
                curveTo(15.0f, 17.33f, 15.67f, 18.0f, 16.5f, 18.0f)
                curveTo(17.33f, 18.0f, 18.0f, 17.33f, 18.0f, 16.5f)
                curveTo(18.0f, 15.67f, 17.33f, 15.0f, 16.5f, 15.0f)
                close()
            }
        }
        .build()
        return _dice2Outline!!
    }

private var _dice2Outline: ImageVector? = null
