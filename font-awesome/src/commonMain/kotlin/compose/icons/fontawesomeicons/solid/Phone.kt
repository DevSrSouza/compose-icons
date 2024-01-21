package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.9f, 24.6f)
                curveToRelative(-7.7f, -18.6f, -28.0f, -28.5f, -47.4f, -23.2f)
                lineToRelative(-88.0f, 24.0f)
                curveTo(12.1f, 30.2f, 0.0f, 46.0f, 0.0f, 64.0f)
                curveTo(0.0f, 311.4f, 200.6f, 512.0f, 448.0f, 512.0f)
                curveToRelative(18.0f, 0.0f, 33.8f, -12.1f, 38.6f, -29.5f)
                lineToRelative(24.0f, -88.0f)
                curveToRelative(5.3f, -19.4f, -4.6f, -39.7f, -23.2f, -47.4f)
                lineToRelative(-96.0f, -40.0f)
                curveToRelative(-16.3f, -6.8f, -35.2f, -2.1f, -46.3f, 11.6f)
                lineTo(304.7f, 368.0f)
                curveTo(234.3f, 334.7f, 177.3f, 277.7f, 144.0f, 207.3f)
                lineTo(193.3f, 167.0f)
                curveToRelative(13.7f, -11.2f, 18.4f, -30.0f, 11.6f, -46.3f)
                lineToRelative(-40.0f, -96.0f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
