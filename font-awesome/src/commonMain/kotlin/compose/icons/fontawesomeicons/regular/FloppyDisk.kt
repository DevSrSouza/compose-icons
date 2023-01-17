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
                moveTo(224.0f, 256.0f)
                curveToRelative(-35.2f, 0.0f, -64.0f, 28.8f, -64.0f, 64.0f)
                curveToRelative(0.0f, 35.2f, 28.8f, 64.0f, 64.0f, 64.0f)
                curveToRelative(35.2f, 0.0f, 64.0f, -28.8f, 64.0f, -64.0f)
                curveTo(288.0f, 284.8f, 259.2f, 256.0f, 224.0f, 256.0f)
                close()
                moveTo(433.1f, 129.1f)
                lineToRelative(-83.9f, -83.9f)
                curveTo(341.1f, 37.06f, 328.8f, 32.0f, 316.1f, 32.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 32.0f, 0.0f, 60.65f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineTo(163.9f)
                curveTo(448.0f, 151.2f, 442.9f, 138.9f, 433.1f, 129.1f)
                close()
                moveTo(128.0f, 80.0f)
                horizontalLineToRelative(144.0f)
                verticalLineTo(160.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(80.0f)
                close()
                moveTo(400.0f, 416.0f)
                curveToRelative(0.0f, 8.836f, -7.164f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.836f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -8.838f, 7.164f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(192.0f)
                curveTo(309.3f, 208.0f, 320.0f, 197.3f, 320.0f, 184.0f)
                verticalLineTo(83.88f)
                lineToRelative(78.25f, 78.25f)
                curveTo(399.4f, 163.2f, 400.0f, 164.8f, 400.0f, 166.3f)
                verticalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
