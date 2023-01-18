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

public val FilledGroup.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.25f, 11.0f)
                curveTo(20.7125f, 11.0f, 21.9084f, 12.1417f, 21.995f, 13.5825f)
                lineTo(22.0f, 13.75f)
                verticalLineTo(20.25f)
                curveTo(22.0f, 20.6642f, 21.6642f, 21.0f, 21.25f, 21.0f)
                curveTo(20.8703f, 21.0f, 20.5565f, 20.7178f, 20.5068f, 20.3518f)
                lineTo(20.5f, 20.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(20.25f)
                curveTo(3.5f, 20.6297f, 3.2178f, 20.9435f, 2.8518f, 20.9932f)
                lineTo(2.75f, 21.0f)
                curveTo(2.3703f, 21.0f, 2.0565f, 20.7178f, 2.0069f, 20.3518f)
                lineTo(2.0f, 20.25f)
                verticalLineTo(13.75f)
                curveTo(2.0f, 12.2875f, 3.1417f, 11.0916f, 4.5825f, 11.005f)
                lineTo(4.75f, 11.0f)
                horizontalLineTo(19.25f)
                close()
                moveTo(6.75f, 4.0f)
                horizontalLineTo(17.25f)
                curveTo(18.7125f, 4.0f, 19.9084f, 5.1417f, 19.995f, 6.5825f)
                lineTo(20.0f, 6.75f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                lineTo(16.9933f, 9.8834f)
                curveTo(16.94f, 9.4243f, 16.5757f, 9.0601f, 16.1166f, 9.0067f)
                lineTo(16.0f, 9.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4872f, 9.0f, 13.0645f, 9.386f, 13.0067f, 9.8834f)
                lineTo(13.0f, 10.0f)
                horizontalLineTo(11.0f)
                lineTo(10.9933f, 9.8834f)
                curveTo(10.94f, 9.4243f, 10.5757f, 9.0601f, 10.1166f, 9.0067f)
                lineTo(10.0f, 9.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4872f, 9.0f, 7.0645f, 9.386f, 7.0067f, 9.8834f)
                lineTo(7.0f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.75f)
                curveTo(4.0f, 5.2875f, 5.1417f, 4.0916f, 6.5825f, 4.005f)
                lineTo(6.75f, 4.0f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
