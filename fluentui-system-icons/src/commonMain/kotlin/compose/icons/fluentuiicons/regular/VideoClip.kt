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

public val RegularGroup.VideoClip: ImageVector
    get() {
        if (_videoClip != null) {
            return _videoClip!!
        }
        _videoClip = Builder(name = "VideoClip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 9.3846f)
                verticalLineTo(14.6162f)
                curveTo(9.5f, 15.1858f, 10.1099f, 15.5475f, 10.6097f, 15.2743f)
                lineTo(15.3959f, 12.6582f)
                curveTo(15.9163f, 12.3737f, 15.9162f, 11.6263f, 15.3958f, 11.3419f)
                lineTo(10.6097f, 8.7264f)
                curveTo(10.1099f, 8.4533f, 9.5f, 8.815f, 9.5f, 9.3846f)
                close()
                moveTo(5.25f, 3.0f)
                curveTo(3.4551f, 3.0f, 2.0f, 4.4551f, 2.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(2.0f, 19.5449f, 3.4551f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 21.0f, 22.0f, 19.5449f, 22.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 4.4551f, 20.5449f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 6.25f)
                curveTo(3.5f, 5.2835f, 4.2835f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 4.5f, 20.5f, 5.2835f, 20.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(20.5f, 18.7165f, 19.7165f, 19.5f, 18.75f, 19.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 19.5f, 3.5f, 18.7165f, 3.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _videoClip!!
    }

private var _videoClip: ImageVector? = null
