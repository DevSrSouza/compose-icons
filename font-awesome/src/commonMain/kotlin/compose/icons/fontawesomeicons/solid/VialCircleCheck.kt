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

public val SolidGroup.VialCircleCheck: ImageVector
    get() {
        if (_vialCircleCheck != null) {
            return _vialCircleCheck!!
        }
        _vialCircleCheck = Builder(name = "VialCircleCheck", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(96.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(224.0f, 266.8f)
                curveToRelative(-20.2f, 28.6f, -32.0f, 63.5f, -32.0f, 101.2f)
                curveToRelative(0.0f, 25.2f, 5.3f, 49.1f, 14.8f, 70.8f)
                curveTo(189.5f, 463.7f, 160.6f, 480.0f, 128.0f, 480.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                close()
                moveTo(96.0f, 96.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(64.0f)
                lineTo(160.0f, 96.0f)
                lineTo(96.0f, 96.0f)
                close()
                moveTo(224.0f, 368.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, -288.0f, 0.0f)
                close()
                moveTo(435.3f, 324.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                lineTo(352.0f, 385.4f)
                lineToRelative(-28.7f, -28.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(40.0f, 40.0f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                lineToRelative(72.0f, -72.0f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                close()
            }
        }
        .build()
        return _vialCircleCheck!!
    }

private var _vialCircleCheck: ImageVector? = null
