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

public val SolidGroup.HatWizard: ImageVector
    get() {
        if (_hatWizard != null) {
            return _hatWizard!!
        }
        _hatWizard = Builder(name = "HatWizard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 448.0f)
                lineTo(16.0f, 448.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(192.0f, 384.0f)
                lineToRelative(-64.0f, -32.0f)
                lineToRelative(64.0f, -32.0f)
                lineToRelative(32.0f, -64.0f)
                lineToRelative(32.0f, 64.0f)
                lineToRelative(64.0f, 32.0f)
                lineToRelative(-64.0f, 32.0f)
                lineToRelative(-16.0f, 32.0f)
                horizontalLineToRelative(208.0f)
                lineToRelative(-86.41f, -201.63f)
                arcToRelative(63.955f, 63.955f, 0.0f, false, true, -1.89f, -45.45f)
                lineTo(416.0f, 0.0f)
                lineTo(228.42f, 107.19f)
                arcToRelative(127.989f, 127.989f, 0.0f, false, false, -53.46f, 59.15f)
                lineTo(64.0f, 416.0f)
                horizontalLineToRelative(144.0f)
                lineToRelative(-16.0f, -32.0f)
                close()
                moveTo(256.0f, 160.0f)
                lineToRelative(16.0f, -32.0f)
                lineToRelative(16.0f, 32.0f)
                lineToRelative(32.0f, 16.0f)
                lineToRelative(-32.0f, 16.0f)
                lineToRelative(-16.0f, 32.0f)
                lineToRelative(-16.0f, -32.0f)
                lineToRelative(-32.0f, -16.0f)
                lineToRelative(32.0f, -16.0f)
                close()
            }
        }
        .build()
        return _hatWizard!!
    }

private var _hatWizard: ImageVector? = null
