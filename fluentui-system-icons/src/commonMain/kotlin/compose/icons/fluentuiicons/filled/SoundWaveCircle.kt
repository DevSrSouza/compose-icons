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

public val FilledGroup.SoundWaveCircle: ImageVector
    get() {
        if (_soundWaveCircle != null) {
            return _soundWaveCircle!!
        }
        _soundWaveCircle = Builder(name = "SoundWaveCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.0f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(11.0f, 15.6642f, 10.6642f, 16.0f, 10.25f, 16.0f)
                curveTo(9.8358f, 16.0f, 9.5f, 15.6642f, 9.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(9.5f, 8.3358f, 9.8358f, 8.0f, 10.25f, 8.0f)
                curveTo(10.6642f, 8.0f, 11.0f, 8.3358f, 11.0f, 8.75f)
                close()
                moveTo(17.0f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(17.0f, 15.6642f, 16.6642f, 16.0f, 16.25f, 16.0f)
                curveTo(15.8358f, 16.0f, 15.5f, 15.6642f, 15.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(15.5f, 8.3358f, 15.8358f, 8.0f, 16.25f, 8.0f)
                curveTo(16.6642f, 8.0f, 17.0f, 8.3358f, 17.0f, 8.75f)
                close()
                moveTo(14.0f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(14.0f, 14.1642f, 13.6642f, 14.5f, 13.25f, 14.5f)
                curveTo(12.8358f, 14.5f, 12.5f, 14.1642f, 12.5f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(12.5f, 9.8358f, 12.8358f, 9.5f, 13.25f, 9.5f)
                curveTo(13.6642f, 9.5f, 14.0f, 9.8358f, 14.0f, 10.25f)
                close()
                moveTo(8.0f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(8.0f, 13.6642f, 7.6642f, 14.0f, 7.25f, 14.0f)
                curveTo(6.8358f, 14.0f, 6.5f, 13.6642f, 6.5f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(6.5f, 10.3358f, 6.8358f, 10.0f, 7.25f, 10.0f)
                curveTo(7.6642f, 10.0f, 8.0f, 10.3358f, 8.0f, 10.75f)
                close()
            }
        }
        .build()
        return _soundWaveCircle!!
    }

private var _soundWaveCircle: ImageVector? = null
