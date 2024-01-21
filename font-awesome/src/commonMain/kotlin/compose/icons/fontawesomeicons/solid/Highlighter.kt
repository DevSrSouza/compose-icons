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

public val SolidGroup.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(315.0f, 315.0f)
                lineToRelative(158.4f, -215.0f)
                lineTo(444.1f, 70.6f)
                lineTo(229.0f, 229.0f)
                lineTo(315.0f, 315.0f)
                close()
                moveTo(128.0f, 320.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(128.0f, 248.3f)
                curveToRelative(0.0f, -15.3f, 7.2f, -29.6f, 19.5f, -38.6f)
                lineTo(420.6f, 8.4f)
                curveTo(428.0f, 2.9f, 437.0f, 0.0f, 446.2f, 0.0f)
                curveToRelative(11.4f, 0.0f, 22.4f, 4.5f, 30.5f, 12.6f)
                lineToRelative(54.8f, 54.8f)
                curveToRelative(8.1f, 8.1f, 12.6f, 19.0f, 12.6f, 30.5f)
                curveToRelative(0.0f, 9.2f, -2.9f, 18.2f, -8.4f, 25.6f)
                lineTo(334.4f, 396.5f)
                curveToRelative(-9.0f, 12.3f, -23.4f, 19.5f, -38.6f, 19.5f)
                lineTo(224.0f, 416.0f)
                lineToRelative(-25.4f, 25.4f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-50.7f, -50.7f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(128.0f, 320.0f)
                close()
                moveTo(7.0f, 466.3f)
                lineToRelative(63.0f, -63.0f)
                lineToRelative(70.6f, 70.6f)
                lineToRelative(-31.0f, 31.0f)
                curveToRelative(-4.5f, 4.5f, -10.6f, 7.0f, -17.0f, 7.0f)
                lineTo(24.0f, 511.9f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineToRelative(-4.7f)
                curveToRelative(0.0f, -6.4f, 2.5f, -12.5f, 7.0f, -17.0f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
