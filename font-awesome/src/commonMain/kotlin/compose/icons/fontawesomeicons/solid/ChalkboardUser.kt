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

public val SolidGroup.ChalkboardUser: ImageVector
    get() {
        if (_chalkboardUser != null) {
            return _chalkboardUser!!
        }
        _chalkboardUser = Builder(name = "ChalkboardUser", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 64.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineTo(576.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(640.0f, 352.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(336.8f, 416.0f)
                curveToRelative(-11.8f, -25.5f, -29.9f, -47.5f, -52.4f, -64.0f)
                lineTo(384.0f, 352.0f)
                lineTo(384.0f, 320.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(64.0f)
                lineTo(576.0f, 64.0f)
                lineTo(224.0f, 64.0f)
                verticalLineToRelative(49.1f)
                curveTo(205.2f, 102.2f, 183.3f, 96.0f, 160.0f, 96.0f)
                lineTo(160.0f, 64.0f)
                close()
                moveTo(160.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, 192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, -192.0f)
                close()
                moveTo(133.3f, 352.0f)
                horizontalLineToRelative(53.3f)
                curveTo(260.3f, 352.0f, 320.0f, 411.7f, 320.0f, 485.3f)
                curveToRelative(0.0f, 14.7f, -11.9f, 26.7f, -26.7f, 26.7f)
                lineTo(26.7f, 512.0f)
                curveTo(11.9f, 512.0f, 0.0f, 500.1f, 0.0f, 485.3f)
                curveTo(0.0f, 411.7f, 59.7f, 352.0f, 133.3f, 352.0f)
                close()
            }
        }
        .build()
        return _chalkboardUser!!
    }

private var _chalkboardUser: ImageVector? = null
