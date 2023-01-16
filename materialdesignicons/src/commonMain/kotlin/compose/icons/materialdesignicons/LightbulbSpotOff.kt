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

public val MaterialDesignIcons.LightbulbSpotOff: ImageVector
    get() {
        if (_lightbulbSpotOff != null) {
            return _lightbulbSpotOff!!
        }
        _lightbulbSpotOff = Builder(name = "LightbulbSpotOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(15.11f, 17.0f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 14.0f)
                curveTo(6.5f, 12.57f, 4.0f, 11.0f, 4.0f, 6.0f)
                verticalLineTo(5.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(22.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.2f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(22.0f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(9.2f)
                lineTo(16.37f, 13.17f)
                curveTo(18.33f, 11.87f, 20.0f, 10.07f, 20.0f, 6.0f)
                moveTo(13.0f, 22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                moveTo(9.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 22.0f)
                close()
            }
        }
        .build()
        return _lightbulbSpotOff!!
    }

private var _lightbulbSpotOff: ImageVector? = null
