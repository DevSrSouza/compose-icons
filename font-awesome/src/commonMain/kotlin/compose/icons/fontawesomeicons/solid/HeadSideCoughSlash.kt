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

public val SolidGroup.HeadSideCoughSlash: ImageVector
    get() {
        if (_headSideCoughSlash != null) {
            return _headSideCoughSlash!!
        }
        _headSideCoughSlash = Builder(name = "HeadSideCoughSlash", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(454.11f, 319.21f)
                curveToRelative(19.56f, -3.81f, 31.62f, -25.0f, 23.11f, -44.21f)
                curveToRelative(-21.0f, -47.12f, -48.5f, -151.75f, -73.12f, -186.75f)
                arcTo(208.13f, 208.13f, 0.0f, false, false, 234.1f, 0.0f)
                lineTo(192.0f, 0.0f)
                arcTo(190.64f, 190.64f, 0.0f, false, false, 84.18f, 33.3f)
                lineTo(45.46f, 3.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 23.0f, 6.19f)
                lineTo(3.37f, 31.46f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.18f, 53.91f)
                lineTo(594.53f, 508.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 617.0f, 505.82f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.81f, -22.45f)
                close()
                moveTo(313.39f, 210.45f)
                lineTo(263.61f, 172.0f)
                curveToRelative(5.88f, -7.14f, 14.43f, -12.0f, 24.36f, -12.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, true, 32.0f, 32.0f)
                curveTo(320.0f, 199.0f, 317.24f, 205.17f, 313.39f, 210.45f)
                close()
                moveTo(616.0f, 304.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 616.0f, 304.0f)
                close()
                moveTo(552.0f, 368.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 552.0f, 368.0f)
                close()
                moveTo(288.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(19.54f)
                lineTo(20.73f, 105.59f)
                arcTo(190.86f, 190.86f, 0.0f, false, false, 0.0f, 192.0f)
                curveToRelative(0.0f, 56.75f, 24.75f, 107.62f, 64.0f, 142.88f)
                lineTo(64.0f, 512.0f)
                lineTo(288.0f, 512.0f)
                lineTo(288.0f, 480.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(320.0f, 416.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 288.0f, 384.0f)
                close()
                moveTo(616.0f, 360.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 616.0f, 360.0f)
                close()
            }
        }
        .build()
        return _headSideCoughSlash!!
    }

private var _headSideCoughSlash: ImageVector? = null
