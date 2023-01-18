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

public val RegularGroup.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.4533f, 1.9228f)
                curveTo(22.7462f, 2.2157f, 22.7462f, 2.6906f, 22.4533f, 2.9834f)
                lineTo(15.5248f, 9.912f)
                curveTo(17.2598f, 12.1668f, 17.0945f, 15.4134f, 15.0287f, 17.4791f)
                lineTo(14.1973f, 18.3106f)
                lineTo(11.4101f, 22.4913f)
                curveTo(11.2855f, 22.6783f, 11.0836f, 22.7995f, 10.86f, 22.8217f)
                curveTo(10.6364f, 22.8438f, 10.4146f, 22.7645f, 10.2557f, 22.6056f)
                lineTo(1.7705f, 14.1204f)
                curveTo(1.6116f, 13.9615f, 1.5323f, 13.7397f, 1.5544f, 13.5161f)
                curveTo(1.5766f, 13.2925f, 1.6978f, 13.0906f, 1.8848f, 12.966f)
                lineTo(6.0657f, 10.1787f)
                lineTo(6.897f, 9.3474f)
                curveTo(8.9628f, 7.2817f, 12.2093f, 7.1163f, 14.4641f, 8.8514f)
                lineTo(21.3927f, 1.9228f)
                curveTo(21.6856f, 1.6299f, 22.1604f, 1.6299f, 22.4533f, 1.9228f)
                close()
                moveTo(7.6041f, 10.7616f)
                lineTo(13.6145f, 16.772f)
                lineTo(13.9681f, 16.4185f)
                curveTo(15.6278f, 14.7588f, 15.6278f, 12.0678f, 13.9681f, 10.4081f)
                curveTo(12.3083f, 8.7484f, 9.6174f, 8.7484f, 7.9577f, 10.4081f)
                lineTo(7.6041f, 10.7616f)
                close()
                moveTo(6.4479f, 11.7267f)
                lineTo(3.478f, 13.7066f)
                lineTo(10.6695f, 20.8981f)
                lineTo(12.6494f, 17.9282f)
                lineTo(6.4479f, 11.7267f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
