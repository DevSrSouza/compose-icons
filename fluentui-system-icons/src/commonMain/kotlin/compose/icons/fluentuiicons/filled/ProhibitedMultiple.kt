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

public val FilledGroup.ProhibitedMultiple: ImageVector
    get() {
        if (_prohibitedMultiple != null) {
            return _prohibitedMultiple!!
        }
        _prohibitedMultiple = Builder(name = "ProhibitedMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 19.5f)
                curveTo(15.5825f, 19.5f, 19.5f, 15.5825f, 19.5f, 10.75f)
                curveTo(19.5f, 5.9175f, 15.5825f, 2.0f, 10.75f, 2.0f)
                curveTo(5.9175f, 2.0f, 2.0f, 5.9175f, 2.0f, 10.75f)
                curveTo(2.0f, 15.5825f, 5.9175f, 19.5f, 10.75f, 19.5f)
                close()
                moveTo(10.75f, 17.5f)
                curveTo(9.2468f, 17.5f, 7.8583f, 17.0086f, 6.7365f, 16.1777f)
                lineTo(16.1777f, 6.7365f)
                curveTo(17.0086f, 7.8583f, 17.5f, 9.2468f, 17.5f, 10.75f)
                curveTo(17.5f, 14.4779f, 14.4779f, 17.5f, 10.75f, 17.5f)
                close()
                moveTo(14.7635f, 5.3222f)
                lineTo(5.3222f, 14.7635f)
                curveTo(4.4914f, 13.6416f, 4.0f, 12.2532f, 4.0f, 10.75f)
                curveTo(4.0f, 7.0221f, 7.0221f, 4.0f, 10.75f, 4.0f)
                curveTo(12.2532f, 4.0f, 13.6416f, 4.4914f, 14.7635f, 5.3222f)
                close()
                moveTo(20.5001f, 10.75f)
                curveTo(20.5001f, 16.1348f, 16.1348f, 20.5f, 10.7501f, 20.5f)
                curveTo(9.6837f, 20.5f, 8.6574f, 20.3288f, 7.697f, 20.0125f)
                curveTo(9.2077f, 21.2544f, 11.1418f, 22.0f, 13.2501f, 22.0f)
                curveTo(18.0825f, 22.0f, 22.0001f, 18.0825f, 22.0001f, 13.25f)
                curveTo(22.0001f, 11.1417f, 21.2544f, 9.2076f, 20.0125f, 7.697f)
                curveTo(20.3289f, 8.6573f, 20.5001f, 9.6837f, 20.5001f, 10.75f)
                close()
            }
        }
        .build()
        return _prohibitedMultiple!!
    }

private var _prohibitedMultiple: ImageVector? = null
