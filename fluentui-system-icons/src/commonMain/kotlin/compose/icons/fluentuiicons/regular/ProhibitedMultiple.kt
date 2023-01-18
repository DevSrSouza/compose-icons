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

public val RegularGroup.ProhibitedMultiple: ImageVector
    get() {
        if (_prohibitedMultiple != null) {
            return _prohibitedMultiple!!
        }
        _prohibitedMultiple = Builder(name = "ProhibitedMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 10.75f)
                curveTo(2.0f, 5.9175f, 5.9175f, 2.0f, 10.75f, 2.0f)
                curveTo(15.5825f, 2.0f, 19.5f, 5.9175f, 19.5f, 10.75f)
                curveTo(19.5f, 15.5825f, 15.5825f, 19.5f, 10.75f, 19.5f)
                curveTo(5.9175f, 19.5f, 2.0f, 15.5825f, 2.0f, 10.75f)
                close()
                moveTo(10.75f, 3.5f)
                curveTo(6.7459f, 3.5f, 3.5f, 6.7459f, 3.5f, 10.75f)
                curveTo(3.5f, 12.4819f, 4.1073f, 14.0719f, 5.1205f, 15.3188f)
                lineTo(15.3188f, 5.1205f)
                curveTo(14.0719f, 4.1073f, 12.4819f, 3.5f, 10.75f, 3.5f)
                close()
                moveTo(10.75f, 18.0f)
                curveTo(14.7541f, 18.0f, 18.0f, 14.7541f, 18.0f, 10.75f)
                curveTo(18.0f, 9.0181f, 17.3927f, 7.428f, 16.3795f, 6.1811f)
                lineTo(6.1811f, 16.3795f)
                curveTo(7.428f, 17.3927f, 9.0181f, 18.0f, 10.75f, 18.0f)
                close()
                moveTo(13.2501f, 22.0f)
                curveTo(11.1418f, 22.0f, 9.2077f, 21.2544f, 7.697f, 20.0125f)
                curveTo(8.6574f, 20.3288f, 9.6837f, 20.5f, 10.7501f, 20.5f)
                curveTo(11.2058f, 20.5f, 11.6542f, 20.4687f, 12.0933f, 20.4082f)
                curveTo(12.47f, 20.4686f, 12.8564f, 20.5f, 13.2501f, 20.5f)
                curveTo(17.2541f, 20.5f, 20.5001f, 17.2541f, 20.5001f, 13.25f)
                curveTo(20.5001f, 12.8563f, 20.4687f, 12.4699f, 20.4083f, 12.0933f)
                curveTo(20.4688f, 11.6542f, 20.5001f, 11.2057f, 20.5001f, 10.75f)
                curveTo(20.5001f, 9.6837f, 20.3289f, 8.6573f, 20.0125f, 7.697f)
                curveTo(21.2544f, 9.2076f, 22.0001f, 11.1417f, 22.0001f, 13.25f)
                curveTo(22.0001f, 18.0825f, 18.0826f, 22.0f, 13.2501f, 22.0f)
                close()
            }
        }
        .build()
        return _prohibitedMultiple!!
    }

private var _prohibitedMultiple: ImageVector? = null
