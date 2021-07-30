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

public val SolidGroup.Burn: ImageVector
    get() {
        if (_burn != null) {
            return _burn!!
        }
        _burn = Builder(name = "Burn", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 0.0f)
                curveTo(79.7f, 101.3f, 0.0f, 220.9f, 0.0f, 300.5f)
                curveTo(0.0f, 425.0f, 79.0f, 512.0f, 192.0f, 512.0f)
                reflectiveCurveToRelative(192.0f, -87.0f, 192.0f, -211.5f)
                curveToRelative(0.0f, -79.9f, -80.2f, -199.6f, -192.0f, -300.5f)
                close()
                moveTo(192.0f, 448.0f)
                curveToRelative(-56.5f, 0.0f, -96.0f, -39.0f, -96.0f, -94.8f)
                curveToRelative(0.0f, -13.5f, 4.6f, -61.5f, 96.0f, -161.2f)
                curveToRelative(91.4f, 99.7f, 96.0f, 147.7f, 96.0f, 161.2f)
                curveToRelative(0.0f, 55.8f, -39.5f, 94.8f, -96.0f, 94.8f)
                close()
            }
        }
        .build()
        return _burn!!
    }

private var _burn: ImageVector? = null
