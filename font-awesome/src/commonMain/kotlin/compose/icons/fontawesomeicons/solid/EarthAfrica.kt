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

public val SolidGroup.EarthAfrica: ImageVector
    get() {
        if (_earthAfrica != null) {
            return _earthAfrica!!
        }
        _earthAfrica = Builder(name = "EarthAfrica", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(177.8f, 63.2f)
                lineToRelative(10.0f, 17.4f)
                curveToRelative(2.8f, 4.8f, 4.2f, 10.3f, 4.2f, 15.9f)
                verticalLineToRelative(41.4f)
                curveToRelative(0.0f, 3.9f, 1.6f, 7.7f, 4.3f, 10.4f)
                curveToRelative(6.2f, 6.2f, 16.5f, 5.7f, 22.0f, -1.2f)
                lineToRelative(13.6f, -17.0f)
                curveToRelative(4.7f, -5.9f, 12.9f, -7.7f, 19.6f, -4.3f)
                lineToRelative(15.2f, 7.6f)
                curveToRelative(3.4f, 1.7f, 7.2f, 2.6f, 11.0f, 2.6f)
                curveToRelative(6.5f, 0.0f, 12.8f, -2.6f, 17.4f, -7.2f)
                lineToRelative(3.9f, -3.9f)
                curveToRelative(2.9f, -2.9f, 7.3f, -3.6f, 11.0f, -1.8f)
                lineToRelative(29.2f, 14.6f)
                curveToRelative(7.8f, 3.9f, 12.6f, 11.8f, 12.6f, 20.5f)
                curveToRelative(0.0f, 10.5f, -7.1f, 19.6f, -17.3f, 22.2f)
                lineToRelative(-35.4f, 8.8f)
                curveToRelative(-7.4f, 1.8f, -15.1f, 1.5f, -22.4f, -0.9f)
                lineToRelative(-32.0f, -10.7f)
                curveToRelative(-3.3f, -1.1f, -6.7f, -1.7f, -10.2f, -1.7f)
                curveToRelative(-7.0f, 0.0f, -13.8f, 2.3f, -19.4f, 6.5f)
                lineTo(176.0f, 212.0f)
                curveToRelative(-10.1f, 7.6f, -16.0f, 19.4f, -16.0f, 32.0f)
                verticalLineToRelative(28.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                curveToRelative(10.1f, 0.0f, 19.6f, -4.7f, 25.6f, -12.8f)
                lineToRelative(25.6f, -34.1f)
                curveToRelative(8.3f, -11.1f, 12.8f, -24.6f, 12.8f, -38.4f)
                verticalLineTo(318.6f)
                curveToRelative(0.0f, -3.9f, 2.6f, -7.3f, 6.4f, -8.2f)
                lineToRelative(5.3f, -1.3f)
                curveToRelative(11.9f, -3.0f, 20.3f, -13.7f, 20.3f, -26.0f)
                curveToRelative(0.0f, -7.1f, -2.8f, -13.9f, -7.8f, -18.9f)
                lineToRelative(-33.5f, -33.5f)
                curveToRelative(-3.7f, -3.7f, -3.7f, -9.7f, 0.0f, -13.4f)
                curveToRelative(5.7f, -5.7f, 14.1f, -7.7f, 21.8f, -5.1f)
                lineToRelative(14.1f, 4.7f)
                curveToRelative(12.3f, 4.1f, 25.7f, -1.5f, 31.5f, -13.0f)
                curveToRelative(3.5f, -7.0f, 11.2f, -10.8f, 18.9f, -9.2f)
                lineToRelative(27.4f, 5.5f)
                curveTo(432.0f, 112.4f, 351.5f, 48.0f, 256.0f, 48.0f)
                curveToRelative(-27.7f, 0.0f, -54.0f, 5.4f, -78.2f, 15.2f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
            }
        }
        .build()
        return _earthAfrica!!
    }

private var _earthAfrica: ImageVector? = null
