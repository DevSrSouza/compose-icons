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

public val FilledGroup.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.608f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.483f, 20.6435f, 19.8992f, 18.9344f, 19.9949f)
                lineTo(18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(8.608f)
                lineTo(11.652f, 13.6644f)
                curveTo(11.87f, 13.7785f, 12.13f, 13.7785f, 12.348f, 13.6644f)
                lineTo(22.0f, 8.608f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineTo(18.75f)
                curveTo(20.4347f, 4.0f, 21.8201f, 5.2819f, 21.9838f, 6.9236f)
                lineTo(12.0f, 12.1533f)
                lineTo(2.0162f, 6.9236f)
                curveTo(2.1739f, 5.3427f, 3.4643f, 4.0954f, 5.0641f, 4.0052f)
                lineTo(5.25f, 4.0f)
                horizontalLineTo(18.75f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _mail!!
    }

private var _mail: ImageVector? = null
