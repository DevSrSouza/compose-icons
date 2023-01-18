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

public val RegularGroup.Braces: ImageVector
    get() {
        if (_braces != null) {
            return _braces!!
        }
        _braces = Builder(name = "Braces", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 5.75f)
                curveTo(4.5f, 4.2312f, 5.7312f, 3.0f, 7.25f, 3.0f)
                curveTo(7.6642f, 3.0f, 8.0f, 3.3358f, 8.0f, 3.75f)
                curveTo(8.0f, 4.1642f, 7.6642f, 4.5f, 7.25f, 4.5f)
                curveTo(6.5596f, 4.5f, 6.0f, 5.0596f, 6.0f, 5.75f)
                verticalLineTo(10.0585f)
                curveTo(6.0f, 10.8034f, 5.7f, 11.4958f, 5.1977f, 12.0f)
                curveTo(5.7f, 12.5042f, 6.0f, 13.1966f, 6.0f, 13.9415f)
                verticalLineTo(18.25f)
                curveTo(6.0f, 18.9404f, 6.5596f, 19.5f, 7.25f, 19.5f)
                curveTo(7.6642f, 19.5f, 8.0f, 19.8358f, 8.0f, 20.25f)
                curveTo(8.0f, 20.6642f, 7.6642f, 21.0f, 7.25f, 21.0f)
                curveTo(5.7312f, 21.0f, 4.5f, 19.7688f, 4.5f, 18.25f)
                verticalLineTo(13.9415f)
                curveTo(4.5f, 13.4035f, 4.1557f, 12.9258f, 3.6453f, 12.7557f)
                lineTo(3.5128f, 12.7115f)
                curveTo(3.2066f, 12.6094f, 3.0f, 12.3228f, 3.0f, 12.0f)
                curveTo(3.0f, 11.6772f, 3.2066f, 11.3906f, 3.5128f, 11.2885f)
                lineTo(3.6453f, 11.2443f)
                curveTo(4.1557f, 11.0742f, 4.5f, 10.5965f, 4.5f, 10.0585f)
                verticalLineTo(5.75f)
                close()
                moveTo(19.5f, 5.75f)
                curveTo(19.5f, 4.2312f, 18.2688f, 3.0f, 16.75f, 3.0f)
                curveTo(16.3358f, 3.0f, 16.0f, 3.3358f, 16.0f, 3.75f)
                curveTo(16.0f, 4.1642f, 16.3358f, 4.5f, 16.75f, 4.5f)
                curveTo(17.4404f, 4.5f, 18.0f, 5.0596f, 18.0f, 5.75f)
                verticalLineTo(10.0585f)
                curveTo(18.0f, 10.8034f, 18.3f, 11.4958f, 18.8023f, 12.0f)
                curveTo(18.3f, 12.5042f, 18.0f, 13.1966f, 18.0f, 13.9415f)
                verticalLineTo(18.25f)
                curveTo(18.0f, 18.9404f, 17.4404f, 19.5f, 16.75f, 19.5f)
                curveTo(16.3358f, 19.5f, 16.0f, 19.8358f, 16.0f, 20.25f)
                curveTo(16.0f, 20.6642f, 16.3358f, 21.0f, 16.75f, 21.0f)
                curveTo(18.2688f, 21.0f, 19.5f, 19.7688f, 19.5f, 18.25f)
                verticalLineTo(13.9415f)
                curveTo(19.5f, 13.4035f, 19.8443f, 12.9258f, 20.3547f, 12.7557f)
                lineTo(20.4872f, 12.7115f)
                curveTo(20.7934f, 12.6094f, 21.0f, 12.3228f, 21.0f, 12.0f)
                curveTo(21.0f, 11.6772f, 20.7934f, 11.3906f, 20.4872f, 11.2885f)
                lineTo(20.3547f, 11.2443f)
                curveTo(19.8443f, 11.0742f, 19.5f, 10.5965f, 19.5f, 10.0585f)
                verticalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _braces!!
    }

private var _braces: ImageVector? = null
