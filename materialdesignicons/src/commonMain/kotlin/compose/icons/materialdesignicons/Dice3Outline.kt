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

public val MaterialDesignIcons.Dice3Outline: ImageVector
    get() {
        if (_dice3Outline != null) {
            return _dice3Outline!!
        }
        _dice3Outline = Builder(name = "Dice3Outline", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(12.0f, 10.5f)
                curveTo(11.2f, 10.5f, 10.5f, 11.2f, 10.5f, 12.0f)
                reflectiveCurveTo(11.2f, 13.5f, 12.0f, 13.5f)
                reflectiveCurveTo(13.5f, 12.8f, 13.5f, 12.0f)
                reflectiveCurveTo(12.8f, 10.5f, 12.0f, 10.5f)
                moveTo(7.5f, 6.0f)
                curveTo(6.7f, 6.0f, 6.0f, 6.7f, 6.0f, 7.5f)
                reflectiveCurveTo(6.7f, 9.0f, 7.5f, 9.0f)
                reflectiveCurveTo(9.0f, 8.3f, 9.0f, 7.5f)
                reflectiveCurveTo(8.3f, 6.0f, 7.5f, 6.0f)
                moveTo(16.5f, 15.0f)
                curveTo(15.7f, 15.0f, 15.0f, 15.7f, 15.0f, 16.5f)
                curveTo(15.0f, 17.3f, 15.7f, 18.0f, 16.5f, 18.0f)
                curveTo(17.3f, 18.0f, 18.0f, 17.3f, 18.0f, 16.5f)
                curveTo(18.0f, 15.7f, 17.3f, 15.0f, 16.5f, 15.0f)
                close()
            }
        }
        .build()
        return _dice3Outline!!
    }

private var _dice3Outline: ImageVector? = null
