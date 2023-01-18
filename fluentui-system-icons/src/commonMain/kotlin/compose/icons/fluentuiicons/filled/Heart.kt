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

public val FilledGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8197f, 5.5796f)
                lineTo(11.999f, 6.4021f)
                lineTo(11.1757f, 5.5788f)
                curveTo(9.0766f, 3.4798f, 5.6734f, 3.4798f, 3.5743f, 5.5788f)
                curveTo(1.4752f, 7.6779f, 1.4752f, 11.0812f, 3.5743f, 13.1802f)
                lineTo(11.4697f, 21.0756f)
                curveTo(11.7626f, 21.3685f, 12.2374f, 21.3685f, 12.5303f, 21.0756f)
                lineTo(20.4318f, 13.1788f)
                curveTo(22.5262f, 11.0727f, 22.5298f, 7.679f, 20.4303f, 5.5796f)
                curveTo(18.3274f, 3.4767f, 14.9226f, 3.4767f, 12.8197f, 5.5796f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
