package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) {
            return _penNibStraight!!
        }
        _penNibStraight = Builder(name = "PenNibStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(217.1f, 140.5f)
                lineTo(143.2f, 240.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.2f, -2.4f)
                lineTo(136.0f, 163.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -16.0f, 0.0f)
                verticalLineToRelative(75.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.2f, 2.4f)
                lineTo(38.9f, 140.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -1.5f, -16.6f)
                lineTo(64.0f, 70.1f)
                lineTo(64.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(192.0f, 70.1f)
                lineToRelative(26.6f, 53.8f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 217.1f, 140.5f)
                close()
                moveTo(176.0f, 32.0f)
                lineTo(80.0f, 32.0f)
                lineTo(80.0f, 64.0f)
                horizontalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
