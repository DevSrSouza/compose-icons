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

public val FilledGroup.Broom: ImageVector
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
                lineTo(16.1403f, 9.2965f)
                curveTo(15.9937f, 9.1159f, 15.8363f, 8.9412f, 15.6682f, 8.7731f)
                curveTo(15.4778f, 8.5826f, 15.2788f, 8.4059f, 15.0724f, 8.243f)
                lineTo(21.3927f, 1.9228f)
                curveTo(21.6856f, 1.6299f, 22.1604f, 1.6299f, 22.4533f, 1.9228f)
                close()
                moveTo(15.0287f, 9.3474f)
                curveTo(12.7832f, 7.1019f, 9.1425f, 7.1019f, 6.897f, 9.3474f)
                lineTo(6.6529f, 9.5914f)
                lineTo(14.7847f, 17.7232f)
                lineTo(15.0287f, 17.4791f)
                curveTo(17.2742f, 15.2336f, 17.2742f, 11.5929f, 15.0287f, 9.3474f)
                close()
                moveTo(1.8848f, 12.966f)
                lineTo(5.4976f, 10.5574f)
                lineTo(13.8187f, 18.8785f)
                lineTo(11.4101f, 22.4913f)
                curveTo(11.2855f, 22.6783f, 11.0836f, 22.7995f, 10.86f, 22.8216f)
                curveTo(10.6364f, 22.8438f, 10.4146f, 22.7645f, 10.2557f, 22.6056f)
                lineTo(1.7705f, 14.1203f)
                curveTo(1.6116f, 13.9615f, 1.5323f, 13.7397f, 1.5544f, 13.5161f)
                curveTo(1.5766f, 13.2925f, 1.6978f, 13.0906f, 1.8848f, 12.966f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
