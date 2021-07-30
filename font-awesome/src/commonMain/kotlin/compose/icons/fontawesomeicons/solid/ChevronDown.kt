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
                moveTo(207.029f, 381.476f)
                lineTo(12.686f, 187.132f)
                curveToRelative(-9.373f, -9.373f, -9.373f, -24.569f, 0.0f, -33.941f)
                lineToRelative(22.667f, -22.667f)
                curveToRelative(9.357f, -9.357f, 24.522f, -9.375f, 33.901f, -0.04f)
                lineTo(224.0f, 284.505f)
                lineToRelative(154.745f, -154.021f)
                curveToRelative(9.379f, -9.335f, 24.544f, -9.317f, 33.901f, 0.04f)
                lineToRelative(22.667f, 22.667f)
                curveToRelative(9.373f, 9.373f, 9.373f, 24.569f, 0.0f, 33.941f)
                lineTo(240.971f, 381.476f)
                curveToRelative(-9.373f, 9.372f, -24.569f, 9.372f, -33.942f, 0.0f)
                close()
            }
        }
        .build()
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
