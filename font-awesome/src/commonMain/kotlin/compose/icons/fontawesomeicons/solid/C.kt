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

public val SolidGroup.C: ImageVector
    get() {
        if (_c != null) {
            return _c!!
        }
        _c = Builder(name = "C", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(329.1f, 142.9f)
                curveToRelative(-62.5f, -62.5f, -155.8f, -62.5f, -218.3f, 0.0f)
                reflectiveCurveToRelative(-62.5f, 163.8f, 0.0f, 226.3f)
                reflectiveCurveToRelative(155.8f, 62.5f, 218.3f, 0.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                curveToRelative(-87.5f, 87.5f, -221.3f, 87.5f, -308.8f, 0.0f)
                reflectiveCurveToRelative(-87.5f, -229.3f, 0.0f, -316.8f)
                reflectiveCurveToRelative(221.3f, -87.5f, 308.8f, 0.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                close()
            }
        }
        .build()
        return _c!!
    }

private var _c: ImageVector? = null
