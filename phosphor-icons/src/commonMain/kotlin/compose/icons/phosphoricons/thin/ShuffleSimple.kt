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

public val ThinGroup.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) {
            return _shuffleSimple!!
        }
        _shuffleSimple = Builder(name = "ShuffleSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 168.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.1f, 0.8f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, 0.3f)
                curveToRelative(0.0f, 0.2f, -0.1f, 0.3f, -0.1f, 0.4f)
                reflectiveCurveToRelative(-0.1f, 0.3f, -0.2f, 0.4f)
                lineToRelative(-0.2f, 0.3f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -1.1f, 1.1f)
                lineToRelative(-0.3f, 0.2f)
                lineToRelative(-0.4f, 0.2f)
                lineTo(168.0f, 211.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(30.3f)
                lineTo(45.2f, 50.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(204.0f, 198.3f)
                lineTo(204.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(211.9f, 47.2f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, -0.3f)
                curveToRelative(0.0f, -0.2f, -0.1f, -0.3f, -0.1f, -0.4f)
                lineToRelative(-0.2f, -0.4f)
                lineToRelative(-0.2f, -0.3f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -1.1f, -1.1f)
                lineToRelative(-0.3f, -0.2f)
                lineToRelative(-0.4f, -0.2f)
                lineTo(168.0f, 44.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(30.3f)
                lineToRelative(-50.5f, 50.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.7f, 5.7f)
                lineTo(204.0f, 57.7f)
                lineTo(204.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(212.0f, 48.0f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 211.9f, 47.2f)
                close()
                moveTo(102.5f, 147.8f)
                lineTo(45.2f, 205.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(57.4f, -57.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.7f, -5.7f)
                close()
            }
        }
        .build()
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
