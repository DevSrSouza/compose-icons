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

public val SolidGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.2f, 189.9f)
                lineTo(243.2f, 258.0f)
                curveToRelative(26.1f, 5.9f, 49.3f, 15.6f, 73.6f, 22.3f)
                verticalLineToRelative(-68.2f)
                curveToRelative(-26.0f, -5.8f, -49.4f, -15.5f, -73.6f, -22.2f)
                close()
                moveTo(466.5f, 66.9f)
                curveToRelative(-34.3f, 15.9f, -76.5f, 31.9f, -117.0f, 31.9f)
                curveTo(296.0f, 98.8f, 251.7f, 64.0f, 184.3f, 64.0f)
                curveToRelative(-25.0f, 0.0f, -47.3f, 4.4f, -68.0f, 12.0f)
                curveToRelative(2.8f, -7.3f, 4.1f, -15.2f, 3.6f, -23.6f)
                curveTo(118.1f, 24.0f, 94.8f, 1.2f, 66.3f, 0.0f)
                curveTo(34.3f, -1.3f, 8.0f, 24.3f, 8.0f, 56.0f)
                curveToRelative(0.0f, 19.0f, 9.5f, 35.8f, 24.0f, 45.9f)
                lineTo(32.0f, 488.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineToRelative(-94.4f)
                curveToRelative(28.3f, -12.1f, 63.6f, -22.1f, 114.4f, -22.1f)
                curveToRelative(53.6f, 0.0f, 97.8f, 34.8f, 165.2f, 34.8f)
                curveToRelative(48.2f, 0.0f, 86.7f, -16.3f, 122.5f, -40.9f)
                curveToRelative(8.7f, -6.0f, 13.8f, -15.8f, 13.8f, -26.4f)
                lineTo(511.9f, 95.9f)
                curveToRelative(0.1f, -23.3f, -24.2f, -38.8f, -45.4f, -29.0f)
                close()
                moveTo(169.6f, 325.5f)
                curveToRelative(-25.8f, 2.7f, -50.0f, 8.2f, -73.6f, 16.6f)
                verticalLineToRelative(-70.5f)
                curveToRelative(26.2f, -9.3f, 47.5f, -15.0f, 73.6f, -17.4f)
                close()
                moveTo(464.0f, 191.0f)
                curveToRelative(-23.6f, 9.8f, -46.3f, 19.5f, -73.6f, 23.9f)
                lineTo(390.4f, 286.0f)
                curveToRelative(24.8f, -3.4f, 51.4f, -11.8f, 73.6f, -26.0f)
                verticalLineToRelative(70.5f)
                curveToRelative(-25.1f, 16.1f, -48.5f, 24.7f, -73.6f, 27.1f)
                lineTo(390.4f, 286.0f)
                curveToRelative(-27.0f, 3.7f, -47.9f, 1.5f, -73.6f, -5.6f)
                verticalLineToRelative(67.4f)
                curveToRelative(-23.9f, -7.4f, -47.3f, -16.7f, -73.6f, -21.3f)
                lineTo(243.2f, 258.0f)
                curveToRelative(-19.7f, -4.4f, -40.8f, -6.8f, -73.6f, -3.8f)
                verticalLineToRelative(-70.0f)
                curveToRelative(-22.4f, 3.1f, -44.6f, 10.2f, -73.6f, 20.9f)
                verticalLineToRelative(-70.5f)
                curveToRelative(33.2f, -12.2f, 50.1f, -19.8f, 73.6f, -22.0f)
                verticalLineToRelative(71.6f)
                curveToRelative(27.0f, -3.7f, 48.4f, -1.3f, 73.6f, 5.7f)
                verticalLineToRelative(-67.4f)
                curveToRelative(23.7f, 7.4f, 47.2f, 16.7f, 73.6f, 21.3f)
                verticalLineToRelative(68.4f)
                curveToRelative(23.7f, 5.3f, 47.6f, 6.9f, 73.6f, 2.7f)
                lineTo(390.4f, 143.0f)
                curveToRelative(27.0f, -4.8f, 52.3f, -13.6f, 73.6f, -22.5f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
