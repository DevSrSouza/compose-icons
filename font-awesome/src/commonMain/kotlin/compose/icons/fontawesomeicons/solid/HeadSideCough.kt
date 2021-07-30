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

public val SolidGroup.HeadSideCough: ImageVector
    get() {
        if (_headSideCough != null) {
            return _headSideCough!!
        }
        _headSideCough = Builder(name = "HeadSideCough", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(616.0f, 304.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 616.0f, 304.0f)
                close()
                moveTo(552.0f, 416.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 552.0f, 416.0f)
                close()
                moveTo(488.0f, 360.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 488.0f, 360.0f)
                close()
                moveTo(616.0f, 464.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 616.0f, 464.0f)
                close()
                moveTo(616.0f, 360.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 616.0f, 360.0f)
                close()
                moveTo(552.0f, 320.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 552.0f, 320.0f)
                close()
                moveTo(477.22f, 275.0f)
                curveToRelative(-21.0f, -47.12f, -48.5f, -151.75f, -73.12f, -186.75f)
                arcTo(208.13f, 208.13f, 0.0f, false, false, 234.1f, 0.0f)
                lineTo(192.0f, 0.0f)
                curveTo(86.0f, 0.0f, 0.0f, 86.0f, 0.0f, 192.0f)
                curveToRelative(0.0f, 56.75f, 24.75f, 107.62f, 64.0f, 142.88f)
                lineTo(64.0f, 512.0f)
                lineTo(288.0f, 512.0f)
                lineTo(288.0f, 480.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(320.0f, 416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(96.0f)
                lineTo(416.0f, 320.0f)
                horizontalLineToRelative(32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 477.22f, 275.0f)
                close()
                moveTo(288.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.07f, 32.07f, 0.0f, false, true, 288.0f, 224.0f)
                close()
            }
        }
        .build()
        return _headSideCough!!
    }

private var _headSideCough: ImageVector? = null
