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

public val SolidGroup.UsersRectangle: ImageVector
    get() {
        if (_usersRectangle != null) {
            return _usersRectangle!!
        }
        _usersRectangle = Builder(name = "UsersRectangle", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveTo(43.0f, 0.0f, 0.0f, 43.0f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineTo(544.0f, 512.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                lineTo(640.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                lineTo(96.0f, 0.0f)
                close()
                moveTo(64.0f, 96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(544.0f, 64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(576.0f, 416.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(96.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(64.0f, 96.0f)
                close()
                moveTo(223.8f, 176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(96.0f, 309.3f)
                curveToRelative(0.0f, 14.7f, 11.9f, 26.7f, 26.7f, 26.7f)
                horizontalLineToRelative(56.1f)
                curveToRelative(8.0f, -34.1f, 32.8f, -61.7f, 65.2f, -73.6f)
                curveToRelative(-7.5f, -4.1f, -16.2f, -6.4f, -25.3f, -6.4f)
                lineTo(149.3f, 256.0f)
                curveTo(119.9f, 256.0f, 96.0f, 279.9f, 96.0f, 309.3f)
                close()
                moveTo(461.2f, 336.0f)
                horizontalLineToRelative(56.1f)
                curveToRelative(14.7f, 0.0f, 26.7f, -11.9f, 26.7f, -26.7f)
                curveToRelative(0.0f, -29.5f, -23.9f, -53.3f, -53.3f, -53.3f)
                lineTo(421.3f, 256.0f)
                curveToRelative(-9.2f, 0.0f, -17.8f, 2.3f, -25.3f, 6.4f)
                curveToRelative(32.4f, 11.9f, 57.2f, 39.5f, 65.2f, 73.6f)
                close()
                moveTo(372.0f, 289.0f)
                curveToRelative(-3.9f, -0.7f, -7.9f, -1.0f, -12.0f, -1.0f)
                lineTo(280.0f, 288.0f)
                curveToRelative(-4.1f, 0.0f, -8.1f, 0.3f, -12.0f, 1.0f)
                curveToRelative(-26.0f, 4.4f, -47.3f, 22.7f, -55.9f, 47.0f)
                curveToRelative(-2.7f, 7.5f, -4.1f, 15.6f, -4.1f, 24.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(408.0f, 384.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -8.4f, -1.4f, -16.5f, -4.1f, -24.0f)
                curveToRelative(-8.6f, -24.3f, -29.9f, -42.6f, -55.9f, -47.0f)
                close()
                moveTo(512.0f, 176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(320.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, -128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, 128.0f)
                close()
            }
        }
        .build()
        return _usersRectangle!!
    }

private var _usersRectangle: ImageVector? = null
