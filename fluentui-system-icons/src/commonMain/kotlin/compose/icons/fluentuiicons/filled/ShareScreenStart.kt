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

public val FilledGroup.ShareScreenStart: ImageVector
    get() {
        if (_shareScreenStart != null) {
            return _shareScreenStart!!
        }
        _shareScreenStart = Builder(name = "ShareScreenStart", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 4.0f)
                curveTo(3.0074f, 4.0f, 2.0f, 5.0074f, 2.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(2.0f, 18.9926f, 3.0074f, 20.0f, 4.25f, 20.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 20.0f, 22.0f, 18.9926f, 22.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 5.0074f, 20.9926f, 4.0f, 19.75f, 4.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(12.5303f, 7.4651f)
                lineTo(15.7848f, 10.7197f)
                curveTo(16.0777f, 11.0126f, 16.0777f, 11.4874f, 15.7848f, 11.7803f)
                curveTo(15.4919f, 12.0732f, 15.0171f, 12.0732f, 14.7242f, 11.7803f)
                lineTo(12.75f, 9.8061f)
                verticalLineTo(16.2528f)
                curveTo(12.75f, 16.6671f, 12.4142f, 17.0028f, 12.0f, 17.0028f)
                curveTo(11.5858f, 17.0028f, 11.25f, 16.6671f, 11.25f, 16.2528f)
                verticalLineTo(9.8079f)
                lineTo(9.2807f, 11.78f)
                curveTo(8.988f, 12.0731f, 8.5131f, 12.0734f, 8.22f, 11.7807f)
                curveTo(7.9269f, 11.488f, 7.9266f, 11.0131f, 8.2193f, 10.72f)
                lineTo(11.4693f, 7.4655f)
                curveTo(11.6099f, 7.3247f, 11.8007f, 7.2456f, 11.9997f, 7.2455f)
                curveTo(12.1987f, 7.2454f, 12.3896f, 7.3244f, 12.5303f, 7.4651f)
                close()
            }
        }
        .build()
        return _shareScreenStart!!
    }

private var _shareScreenStart: ImageVector? = null
