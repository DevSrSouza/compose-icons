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

public val SolidGroup.K: ImageVector
    get() {
        if (_k != null) {
            return _k!!
        }
        _k = Builder(name = "K", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(311.0f, 86.3f)
                curveToRelative(12.3f, -12.7f, 12.0f, -32.9f, -0.7f, -45.2f)
                reflectiveCurveToRelative(-32.9f, -12.0f, -45.2f, 0.7f)
                lineToRelative(-155.2f, 160.0f)
                lineTo(64.0f, 249.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(0.0f, 46.3f, 0.0f, 64.0f)
                verticalLineTo(328.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(341.0f)
                lineToRelative(64.7f, -66.7f)
                lineToRelative(133.0f, 192.0f)
                curveToRelative(10.1f, 14.5f, 30.0f, 18.1f, 44.5f, 8.1f)
                reflectiveCurveToRelative(18.1f, -30.0f, 8.1f, -44.5f)
                lineTo(174.1f, 227.4f)
                lineTo(311.0f, 86.3f)
                close()
            }
        }
        .build()
        return _k!!
    }

private var _k: ImageVector? = null
