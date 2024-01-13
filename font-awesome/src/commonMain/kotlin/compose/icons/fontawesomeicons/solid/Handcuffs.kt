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

public val SolidGroup.Handcuffs: ImageVector
    get() {
        if (_handcuffs != null) {
            return _handcuffs!!
        }
        _handcuffs = Builder(name = "Handcuffs", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(192.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(160.0f, 128.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.7f, -0.2f, 3.4f, -0.5f, 5.1f)
                curveTo(280.3f, 229.6f, 320.0f, 286.2f, 320.0f, 352.0f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                reflectiveCurveTo(0.0f, 440.4f, 0.0f, 352.0f)
                curveToRelative(0.0f, -65.8f, 39.7f, -122.4f, 96.5f, -146.9f)
                curveToRelative(-0.4f, -1.6f, -0.5f, -3.3f, -0.5f, -5.1f)
                lineTo(96.0f, 184.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(160.0f, 448.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, -192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, 192.0f)
                close()
                moveTo(352.0f, 352.0f)
                curveToRelative(0.0f, -25.9f, -5.1f, -50.5f, -14.4f, -73.1f)
                curveToRelative(16.9f, -32.9f, 44.8f, -59.1f, 78.9f, -73.9f)
                curveToRelative(-0.4f, -1.6f, -0.5f, -3.3f, -0.5f, -5.1f)
                lineTo(416.0f, 184.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.7f, -0.2f, 3.4f, -0.5f, 5.1f)
                curveTo(600.3f, 229.6f, 640.0f, 286.2f, 640.0f, 352.0f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                curveToRelative(-62.0f, 0.0f, -115.8f, -35.3f, -142.4f, -86.9f)
                curveToRelative(9.3f, -22.5f, 14.4f, -47.2f, 14.4f, -73.1f)
                close()
                moveTo(576.0f, 352.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 192.0f, 0.0f)
                close()
                moveTo(368.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(448.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _handcuffs!!
    }

private var _handcuffs: ImageVector? = null
