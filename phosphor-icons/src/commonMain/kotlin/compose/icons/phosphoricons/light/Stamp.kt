package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 218.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 224.0f)
                close()
                moveTo(222.0f, 144.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(48.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(34.0f, 144.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f)
                horizontalLineToRelative(56.6f)
                lineTo(88.4f, 54.3f)
                arcToRelative(29.4f, 29.4f, 0.0f, false, true, 6.0f, -25.2f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 117.7f, 18.0f)
                horizontalLineToRelative(20.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 23.3f, 11.1f)
                arcToRelative(29.4f, 29.4f, 0.0f, false, true, 6.0f, 25.2f)
                lineTo(151.4f, 130.0f)
                lineTo(208.0f, 130.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 144.0f)
                close()
                moveTo(116.9f, 130.0f)
                horizontalLineToRelative(22.2f)
                lineToRelative(16.8f, -78.2f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 138.3f, 30.0f)
                lineTo(117.7f, 30.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -17.6f, 21.8f)
                close()
                moveTo(210.0f, 144.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(48.0f, 142.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(208.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
