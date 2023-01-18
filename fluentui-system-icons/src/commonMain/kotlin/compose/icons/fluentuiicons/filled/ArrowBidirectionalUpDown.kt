package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ArrowBidirectionalUpDown: ImageVector
    get() {
        if (_arrowBidirectionalUpDown != null) {
            return _arrowBidirectionalUpDown!!
        }
        _arrowBidirectionalUpDown = Builder(name = "ArrowBidirectionalUpDown", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.975f, 9.6888f)
                curveTo(7.5946f, 10.0892f, 6.9617f, 10.1054f, 6.5613f, 9.725f)
                curveTo(6.1609f, 9.3446f, 6.1446f, 8.7117f, 6.525f, 8.3112f)
                lineTo(11.275f, 3.3112f)
                curveTo(11.4638f, 3.1125f, 11.7259f, 3.0f, 12.0f, 3.0f)
                curveTo(12.2741f, 3.0f, 12.5362f, 3.1125f, 12.725f, 3.3112f)
                lineTo(17.475f, 8.3112f)
                curveTo(17.8554f, 8.7117f, 17.8392f, 9.3446f, 17.4388f, 9.725f)
                curveTo(17.0383f, 10.1054f, 16.4054f, 10.0892f, 16.025f, 9.6888f)
                lineTo(13.0f, 6.5045f)
                verticalLineTo(17.4955f)
                lineTo(16.025f, 14.3113f)
                curveTo(16.4054f, 13.9108f, 17.0383f, 13.8946f, 17.4388f, 14.275f)
                curveTo(17.8392f, 14.6554f, 17.8554f, 15.2883f, 17.475f, 15.6887f)
                lineTo(12.725f, 20.6887f)
                curveTo(12.5362f, 20.8875f, 12.2741f, 21.0f, 12.0f, 21.0f)
                curveTo(11.7259f, 21.0f, 11.4638f, 20.8875f, 11.275f, 20.6887f)
                lineTo(6.525f, 15.6887f)
                curveTo(6.1446f, 15.2883f, 6.1609f, 14.6554f, 6.5613f, 14.275f)
                curveTo(6.9617f, 13.8946f, 7.5946f, 13.9108f, 7.975f, 14.3113f)
                lineTo(11.0f, 17.4955f)
                verticalLineTo(6.5045f)
                lineTo(7.975f, 9.6888f)
                close()
            }
        }
        .build()
        return _arrowBidirectionalUpDown!!
    }

private var _arrowBidirectionalUpDown: ImageVector? = null
