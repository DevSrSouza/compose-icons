package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 76.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 44.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 128.0f, 76.0f)
                close()
                moveTo(128.0f, 20.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 128.0f, 20.0f)
                close()
                moveTo(208.8f, 142.1f)
                lineTo(169.3f, 91.4f)
                lineTo(169.0f, 91.0f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, false, -17.0f, -7.0f)
                lineTo(104.0f, 84.0f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, false, -17.0f, 7.0f)
                lineToRelative(-0.3f, 0.4f)
                lineTo(47.2f, 142.1f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -4.5f, 11.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 27.2f, 11.5f)
                lineToRelative(24.4f, -19.0f)
                lineTo(70.5f, 220.9f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -0.4f, 12.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.5f, 9.5f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 8.9f, -8.0f)
                lineTo(128.0f, 189.5f)
                lineToRelative(28.5f, 44.9f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 8.9f, 8.0f)
                arcToRelative(14.9f, 14.9f, 0.0f, false, false, 5.5f, 1.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 15.0f, -10.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -0.4f, -12.0f)
                lineToRelative(-23.8f, -75.1f)
                lineToRelative(24.4f, 19.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 22.7f, -22.7f)
                close()
                moveTo(202.9f, 158.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, 0.0f)
                lineToRelative(-0.4f, -0.3f)
                lineToRelative(-34.7f, -27.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.8f, -0.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -1.5f, 4.5f)
                lineToRelative(27.7f, 87.6f)
                curveToRelative(0.1f, 0.2f, 0.2f, 0.3f, 0.2f, 0.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.3f, 6.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.1f, 4.5f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -6.2f, 0.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.5f, -4.1f)
                curveToRelative(0.0f, -0.2f, -0.1f, -0.3f, -0.2f, -0.5f)
                lineToRelative(-32.0f, -50.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -6.8f, 0.0f)
                lineToRelative(-32.0f, 50.4f)
                curveToRelative(-0.1f, 0.2f, -0.2f, 0.3f, -0.2f, 0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.5f, 4.1f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -6.2f, -0.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.1f, -4.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.3f, -6.1f)
                curveToRelative(0.0f, -0.2f, 0.1f, -0.3f, 0.2f, -0.5f)
                lineToRelative(27.7f, -87.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -1.5f, -4.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.8f, 0.2f)
                lineToRelative(-34.7f, 27.0f)
                lineToRelative(-0.4f, 0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.3f, -11.3f)
                lineToRelative(0.3f, -0.4f)
                lineTo(92.9f, 96.5f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 104.0f, 92.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, 11.1f, 4.5f)
                lineToRelative(39.5f, 50.7f)
                lineToRelative(0.3f, 0.4f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.0f, 11.3f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
