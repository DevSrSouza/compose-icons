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

public val SolidGroup.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) {
            return _chevronRight!!
        }
        _chevronRight = Builder(name = "ChevronRight", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(285.476f, 272.971f)
                lineTo(91.132f, 467.314f)
                curveToRelative(-9.373f, 9.373f, -24.569f, 9.373f, -33.941f, 0.0f)
                lineToRelative(-22.667f, -22.667f)
                curveToRelative(-9.357f, -9.357f, -9.375f, -24.522f, -0.04f, -33.901f)
                lineTo(188.505f, 256.0f)
                lineTo(34.484f, 101.255f)
                curveToRelative(-9.335f, -9.379f, -9.317f, -24.544f, 0.04f, -33.901f)
                lineToRelative(22.667f, -22.667f)
                curveToRelative(9.373f, -9.373f, 24.569f, -9.373f, 33.941f, 0.0f)
                lineTo(285.475f, 239.03f)
                curveToRelative(9.373f, 9.372f, 9.373f, 24.568f, 0.001f, 33.941f)
                close()
            }
        }
        .build()
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
