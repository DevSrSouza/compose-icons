package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) {
            return _floppyDisk!!
        }
        _floppyDisk = Builder(name = "FloppyDisk", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 96.0f)
                lineTo(48.0f, 416.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(384.0f, 432.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(400.0f, 170.5f)
                curveToRelative(0.0f, -4.2f, -1.7f, -8.3f, -4.7f, -11.3f)
                lineToRelative(33.9f, -33.9f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(447.9f, 416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineTo(309.5f, 32.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineToRelative(74.5f, 74.5f)
                lineToRelative(-33.9f, 33.9f)
                lineTo(320.8f, 84.7f)
                curveToRelative(-0.3f, -0.3f, -0.5f, -0.5f, -0.8f, -0.8f)
                lineTo(320.0f, 184.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(104.0f, 208.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(80.0f, 80.0f)
                lineTo(64.0f, 80.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                close()
                moveTo(128.0f, 80.0f)
                verticalLineToRelative(80.0f)
                lineTo(272.0f, 160.0f)
                lineTo(272.0f, 80.0f)
                lineTo(128.0f, 80.0f)
                close()
                moveTo(160.0f, 320.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
                close()
            }
        }
        .build()
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
