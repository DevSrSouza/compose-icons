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

public val RegularGroup.Heart: ImageVector
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
                moveTo(19.3682f, 12.121f)
                lineTo(12.0f, 19.4846f)
                lineTo(4.635f, 12.1196f)
                curveTo(3.1217f, 10.6063f, 3.1217f, 8.1528f, 4.635f, 6.6395f)
                curveTo(6.1482f, 5.1262f, 8.6018f, 5.1262f, 10.115f, 6.6395f)
                lineTo(11.4725f, 7.9969f)
                curveTo(11.7703f, 8.2948f, 12.255f, 8.289f, 12.5457f, 7.9841f)
                lineTo(13.8803f, 6.6402f)
                curveTo(15.3974f, 5.1231f, 17.8526f, 5.1231f, 19.3697f, 6.6402f)
                curveTo(20.8833f, 8.1539f, 20.8807f, 10.6001f, 19.3682f, 12.121f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
