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

public val FilledGroup.PersonBoard: ImageVector
    get() {
        if (_personBoard != null) {
            return _personBoard!!
        }
        _personBoard = Builder(name = "PersonBoard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(3.0f, 16.5449f, 4.4551f, 18.0f, 6.25f, 18.0f)
                horizontalLineTo(14.75f)
                curveTo(16.5449f, 18.0f, 18.0f, 16.5449f, 18.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(18.0f, 4.4551f, 16.5449f, 3.0f, 14.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(12.75f, 7.5f)
                curveTo(12.75f, 8.7426f, 11.7426f, 9.75f, 10.5f, 9.75f)
                curveTo(9.2574f, 9.75f, 8.25f, 8.7426f, 8.25f, 7.5f)
                curveTo(8.25f, 6.2574f, 9.2574f, 5.25f, 10.5f, 5.25f)
                curveTo(11.7426f, 5.25f, 12.75f, 6.2574f, 12.75f, 7.5f)
                close()
                moveTo(13.5f, 10.75f)
                curveTo(14.3284f, 10.75f, 15.0f, 11.4216f, 15.0f, 12.25f)
                verticalLineTo(12.75f)
                curveTo(15.0f, 13.2457f, 14.9136f, 13.61f, 14.7461f, 13.9106f)
                curveTo(14.5779f, 14.2127f, 14.3158f, 14.4724f, 13.9277f, 14.7393f)
                curveTo(13.1952f, 15.2429f, 12.0702f, 15.5f, 10.5f, 15.5f)
                curveTo(9.1797f, 15.5f, 8.0548f, 15.2429f, 7.2598f, 14.7393f)
                curveTo(6.8415f, 14.4743f, 6.5304f, 14.2158f, 6.3219f, 13.9097f)
                curveTo(6.1172f, 13.6092f, 6.0f, 13.2459f, 6.0f, 12.75f)
                verticalLineTo(12.25f)
                curveTo(6.0f, 11.4216f, 6.6716f, 10.75f, 7.5f, 10.75f)
                horizontalLineTo(13.5f)
                close()
                moveTo(6.0109f, 19.0f)
                curveTo(6.5884f, 19.902f, 7.5994f, 20.5f, 8.75f, 20.5f)
                horizontalLineTo(15.25f)
                curveTo(18.1495f, 20.5f, 20.5f, 18.1494f, 20.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(20.5f, 7.5993f, 19.9021f, 6.5884f, 19.0f, 6.0109f)
                verticalLineTo(15.25f)
                curveTo(19.0f, 17.321f, 17.3211f, 19.0f, 15.25f, 19.0f)
                horizontalLineTo(6.0109f)
                close()
            }
        }
        .build()
        return _personBoard!!
    }

private var _personBoard: ImageVector? = null
