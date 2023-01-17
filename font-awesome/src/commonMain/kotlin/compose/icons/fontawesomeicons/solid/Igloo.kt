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

public val SolidGroup.Igloo: ImageVector
    get() {
        if (_igloo != null) {
            return _igloo!!
        }
        _igloo = Builder(name = "Igloo", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 33.8f)
                lineTo(320.0f, 160.0f)
                lineTo(48.5f, 160.0f)
                curveTo(100.2f, 82.8f, 188.1f, 32.0f, 288.0f, 32.0f)
                curveToRelative(10.8f, 0.0f, 21.5f, 0.6f, 32.0f, 1.8f)
                close()
                moveTo(352.0f, 160.0f)
                lineTo(352.0f, 39.1f)
                curveTo(424.9f, 55.7f, 487.2f, 99.8f, 527.5f, 160.0f)
                lineTo(352.0f, 160.0f)
                close()
                moveTo(29.9f, 192.0f)
                lineTo(96.0f, 192.0f)
                lineTo(96.0f, 320.0f)
                lineTo(0.0f, 320.0f)
                curveToRelative(0.0f, -46.0f, 10.8f, -89.4f, 29.9f, -128.0f)
                close()
                moveTo(192.0f, 320.0f)
                lineTo(128.0f, 320.0f)
                lineTo(128.0f, 192.0f)
                lineTo(448.0f, 192.0f)
                lineTo(448.0f, 320.0f)
                lineTo(384.0f, 320.0f)
                verticalLineToRelative(32.0f)
                lineTo(576.0f, 352.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(352.0f, 480.0f)
                lineTo(352.0f, 352.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                lineTo(224.0f, 480.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 352.0f)
                lineTo(192.0f, 352.0f)
                lineTo(192.0f, 320.0f)
                close()
                moveTo(480.0f, 320.0f)
                lineTo(480.0f, 192.0f)
                horizontalLineToRelative(66.1f)
                curveToRelative(19.2f, 38.6f, 29.9f, 82.0f, 29.9f, 128.0f)
                lineTo(480.0f, 320.0f)
                close()
            }
        }
        .build()
        return _igloo!!
    }

private var _igloo: ImageVector? = null
