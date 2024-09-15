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
                moveTo(240.97f, 130.52f)
                lineToRelative(194.34f, 194.34f)
                curveToRelative(9.37f, 9.37f, 9.37f, 24.57f, 0.0f, 33.94f)
                lineToRelative(-22.67f, 22.67f)
                curveToRelative(-9.36f, 9.36f, -24.52f, 9.38f, -33.9f, 0.04f)
                lineTo(224.0f, 227.49f)
                lineTo(69.25f, 381.52f)
                curveToRelative(-9.38f, 9.34f, -24.54f, 9.32f, -33.9f, -0.04f)
                lineToRelative(-22.67f, -22.67f)
                curveToRelative(-9.37f, -9.37f, -9.37f, -24.57f, 0.0f, -33.94f)
                lineTo(207.03f, 130.52f)
                curveToRelative(9.37f, -9.37f, 24.57f, -9.37f, 33.94f, -0.0f)
                close()
            }
        }
        .build()
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
