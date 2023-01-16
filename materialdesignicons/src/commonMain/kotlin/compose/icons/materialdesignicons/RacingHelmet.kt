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

public val MaterialDesignIcons.RacingHelmet: ImageVector
    get() {
        if (_racingHelmet != null) {
            return _racingHelmet!!
        }
        _racingHelmet = Builder(name = "RacingHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2f, 11.2f)
                curveTo(2.0f, 13.6f, 2.7f, 15.6f, 4.2f, 17.4f)
                curveTo(5.7f, 19.2f, 7.7f, 20.0f, 10.1f, 20.0f)
                horizontalLineTo(20.1f)
                curveTo(20.6f, 20.0f, 21.1f, 19.8f, 21.5f, 19.4f)
                curveTo(21.9f, 19.0f, 22.1f, 18.5f, 22.1f, 18.0f)
                verticalLineTo(17.2f)
                curveTo(22.1f, 16.6f, 22.0f, 15.9f, 21.9f, 15.0f)
                horizontalLineTo(13.7f)
                curveTo(12.7f, 15.0f, 11.9f, 14.6f, 11.2f, 13.9f)
                curveTo(10.5f, 13.2f, 10.1f, 12.3f, 10.1f, 11.4f)
                curveTo(10.1f, 9.8f, 10.8f, 8.7f, 12.3f, 8.1f)
                lineTo(17.1f, 6.0f)
                curveTo(15.4f, 4.8f, 13.4f, 4.1f, 11.1f, 4.0f)
                curveTo(8.9f, 3.8f, 6.9f, 4.5f, 5.1f, 5.9f)
                curveTo(3.3f, 7.3f, 2.4f, 9.0f, 2.2f, 11.2f)
                moveTo(12.1f, 11.4f)
                curveTo(12.1f, 11.8f, 12.3f, 12.2f, 12.6f, 12.5f)
                curveTo(12.9f, 12.8f, 13.3f, 13.0f, 13.7f, 13.0f)
                horizontalLineTo(21.5f)
                curveTo(20.9f, 10.8f, 20.0f, 9.0f, 18.7f, 7.6f)
                lineTo(13.1f, 9.9f)
                curveTo(12.4f, 10.1f, 12.1f, 10.6f, 12.1f, 11.4f)
                close()
            }
        }
        .build()
        return _racingHelmet!!
    }

private var _racingHelmet: ImageVector? = null
