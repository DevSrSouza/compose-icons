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

public val SolidGroup.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = Builder(name = "ChevronDown", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.03f, 381.48f)
                lineTo(12.69f, 187.13f)
                curveToRelative(-9.37f, -9.37f, -9.37f, -24.57f, 0.0f, -33.94f)
                lineToRelative(22.67f, -22.67f)
                curveToRelative(9.36f, -9.36f, 24.52f, -9.38f, 33.9f, -0.04f)
                lineTo(224.0f, 284.51f)
                lineToRelative(154.74f, -154.02f)
                curveToRelative(9.38f, -9.34f, 24.54f, -9.32f, 33.9f, 0.04f)
                lineToRelative(22.67f, 22.67f)
                curveToRelative(9.37f, 9.37f, 9.37f, 24.57f, 0.0f, 33.94f)
                lineTo(240.97f, 381.48f)
                curveToRelative(-9.37f, 9.37f, -24.57f, 9.37f, -33.94f, 0.0f)
                close()
            }
        }
        .build()
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
