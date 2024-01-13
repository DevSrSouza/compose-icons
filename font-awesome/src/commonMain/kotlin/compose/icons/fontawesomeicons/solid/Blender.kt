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

public val SolidGroup.Blender: ImageVector
    get() {
        if (_blender != null) {
            return _blender!!
        }
        _blender = Builder(name = "Blender", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                horizontalLineToRelative(64.0f)
                horizontalLineToRelative(32.0f)
                lineTo(470.1f, 0.0f)
                curveToRelative(21.1f, 0.0f, 36.4f, 20.1f, 30.9f, 40.4f)
                lineTo(494.5f, 64.0f)
                lineTo(336.0f, 64.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(485.8f, 96.0f)
                lineToRelative(-17.5f, 64.0f)
                lineTo(336.0f, 160.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(459.6f, 192.0f)
                lineToRelative(-17.5f, 64.0f)
                lineTo(336.0f, 256.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(97.5f)
                lineTo(416.0f, 352.0f)
                lineTo(160.0f, 352.0f)
                lineToRelative(-8.7f, -96.0f)
                lineTo(64.0f, 256.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(145.5f, 192.0f)
                lineTo(133.8f, 64.0f)
                lineTo(64.0f, 64.0f)
                lineTo(64.0f, 192.0f)
                horizontalLineToRelative(81.5f)
                close()
                moveTo(144.0f, 384.0f)
                lineTo(432.0f, 384.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(144.0f, 512.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(96.0f, 432.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                close()
                moveTo(288.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _blender!!
    }

private var _blender: ImageVector? = null
