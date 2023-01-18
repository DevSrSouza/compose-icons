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

public val LightGroup.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) {
            return _penNibStraight!!
        }
        _penNibStraight = Builder(name = "PenNibStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.8f, 124.8f)
                lineTo(190.0f, 70.6f)
                lineTo(190.0f, 32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(80.0f, 18.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 66.0f, 32.0f)
                lineTo(66.0f, 70.6f)
                lineTo(39.2f, 124.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 1.3f, 14.5f)
                lineToRelative(82.7f, 112.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 0.0f)
                lineToRelative(82.7f, -112.3f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 216.8f, 124.8f)
                close()
                moveTo(80.0f, 30.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(178.0f, 66.0f)
                lineTo(78.0f, 66.0f)
                lineTo(78.0f, 32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 80.0f, 30.0f)
                close()
                moveTo(128.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 128.0f, 146.0f)
                close()
                moveTo(205.8f, 132.2f)
                lineTo(134.0f, 229.7f)
                lineTo(134.0f, 157.3f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(72.4f)
                lineTo(50.2f, 132.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.2f, -2.1f)
                lineTo(75.7f, 78.0f)
                lineTo(180.3f, 78.0f)
                lineTo(206.0f, 130.1f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 205.8f, 132.2f)
                close()
            }
        }
        .build()
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
