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

public val SolidGroup.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) {
            return _chevronUp!!
        }
        _chevronUp = Builder(name = "ChevronUp", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.971f, 130.524f)
                lineToRelative(194.343f, 194.343f)
                curveToRelative(9.373f, 9.373f, 9.373f, 24.569f, 0.0f, 33.941f)
                lineToRelative(-22.667f, 22.667f)
                curveToRelative(-9.357f, 9.357f, -24.522f, 9.375f, -33.901f, 0.04f)
                lineTo(224.0f, 227.495f)
                lineTo(69.255f, 381.516f)
                curveToRelative(-9.379f, 9.335f, -24.544f, 9.317f, -33.901f, -0.04f)
                lineToRelative(-22.667f, -22.667f)
                curveToRelative(-9.373f, -9.373f, -9.373f, -24.569f, 0.0f, -33.941f)
                lineTo(207.03f, 130.525f)
                curveToRelative(9.372f, -9.373f, 24.568f, -9.373f, 33.941f, -0.001f)
                close()
            }
        }
        .build()
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
