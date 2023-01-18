package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.SportAmericanFootball: ImageVector
    get() {
        if (_sportAmericanFootball != null) {
            return _sportAmericanFootball!!
        }
        _sportAmericanFootball = Builder(name = "SportAmericanFootball", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7197f, 9.2197f)
                curveTo(14.0126f, 8.9268f, 14.4874f, 8.9268f, 14.7803f, 9.2197f)
                curveTo(15.0732f, 9.5126f, 15.0732f, 9.9874f, 14.7803f, 10.2803f)
                lineTo(10.2803f, 14.7803f)
                curveTo(9.9874f, 15.0732f, 9.5126f, 15.0732f, 9.2197f, 14.7803f)
                curveTo(8.9268f, 14.4874f, 8.9268f, 14.0126f, 9.2197f, 13.7197f)
                lineTo(13.7197f, 9.2197f)
                close()
                moveTo(17.75f, 2.0f)
                curveTo(20.0972f, 2.0f, 22.0f, 3.9028f, 22.0f, 6.25f)
                verticalLineTo(7.25f)
                curveTo(22.0f, 15.3962f, 15.3962f, 22.0f, 7.25f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(3.9028f, 22.0f, 2.0f, 20.0972f, 2.0f, 17.75f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 8.6038f, 8.6038f, 2.0f, 16.75f, 2.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(20.5f, 6.25f)
                curveTo(20.5f, 4.7312f, 19.2688f, 3.5f, 17.75f, 3.5f)
                horizontalLineTo(16.75f)
                curveTo(16.3467f, 3.5f, 15.9477f, 3.518f, 15.5536f, 3.5533f)
                lineTo(20.4467f, 8.4463f)
                curveTo(20.482f, 8.0522f, 20.5f, 7.6532f, 20.5f, 7.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(20.1533f, 10.2742f)
                lineTo(13.7257f, 3.8467f)
                curveTo(8.8039f, 4.9958f, 4.9366f, 8.8883f, 3.8241f, 13.8241f)
                lineTo(10.176f, 20.1758f)
                curveTo(15.1118f, 19.0633f, 19.0043f, 15.1961f, 20.1533f, 10.2742f)
                close()
                moveTo(3.5438f, 15.665f)
                curveTo(3.5148f, 16.0229f, 3.5f, 16.3847f, 3.5f, 16.75f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 19.2688f, 4.7312f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(7.6153f, 20.5f, 7.9772f, 20.4852f, 8.335f, 20.4562f)
                lineTo(3.5438f, 15.665f)
                close()
            }
        }
        .build()
        return _sportAmericanFootball!!
    }

private var _sportAmericanFootball: ImageVector? = null
