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

public val SolidGroup.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) {
            return _paintRoller!!
        }
        _paintRoller = Builder(name = "PaintRoller", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 128.0f)
                lineTo(416.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 0.0f)
                curveTo(14.33f, 0.0f, 0.0f, 14.33f, 0.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                close()
                moveTo(448.0f, 64.0f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 17.67f, -14.33f, 32.0f, -32.0f, 32.0f)
                lineTo(256.0f, 224.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(288.0f, 352.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(160.0f)
                curveToRelative(53.02f, 0.0f, 96.0f, -42.98f, 96.0f, -96.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -35.35f, -28.65f, -64.0f, -64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
