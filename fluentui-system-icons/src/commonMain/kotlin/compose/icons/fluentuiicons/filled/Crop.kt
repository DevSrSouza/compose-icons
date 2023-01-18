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

public val FilledGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 15.5f)
                curveTo(7.0f, 16.2797f, 7.5949f, 16.9204f, 8.3555f, 16.9931f)
                lineTo(8.5f, 17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 17.0f, 22.0f, 17.4477f, 22.0f, 18.0f)
                curveTo(22.0f, 18.5128f, 21.614f, 18.9355f, 21.1166f, 18.9933f)
                lineTo(21.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.5523f, 18.5523f, 22.0f, 18.0f, 22.0f)
                curveTo(17.4872f, 22.0f, 17.0645f, 21.614f, 17.0067f, 21.1166f)
                lineTo(17.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.5f)
                curveTo(6.6314f, 19.0f, 5.1049f, 17.5357f, 5.0052f, 15.692f)
                lineTo(5.0f, 15.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 7.0f, 2.0f, 6.5523f, 2.0f, 6.0f)
                curveTo(2.0f, 5.4872f, 2.386f, 5.0645f, 2.8834f, 5.0067f)
                lineTo(3.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.4477f, 5.4477f, 2.0f, 6.0f, 2.0f)
                curveTo(6.5128f, 2.0f, 6.9355f, 2.386f, 6.9933f, 2.8834f)
                lineTo(7.0f, 3.0f)
                verticalLineTo(15.5f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineTo(15.5f)
                curveTo(17.3686f, 5.0f, 18.8951f, 6.4643f, 18.9948f, 8.308f)
                lineTo(19.0f, 8.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.5f)
                curveTo(17.0f, 7.7203f, 16.4051f, 7.0795f, 15.6445f, 7.0069f)
                lineTo(15.5f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
