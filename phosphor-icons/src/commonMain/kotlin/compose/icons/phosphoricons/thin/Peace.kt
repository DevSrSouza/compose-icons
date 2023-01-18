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

public val ThinGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.1f, 185.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 28.0f, 128.0f)
                arcToRelative(99.2f, 99.2f, 0.0f, false, false, 17.9f, 57.0f)
                lineToRelative(0.2f, 0.4f)
                lineToRelative(0.2f, 0.2f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, 163.4f, 0.0f)
                lineToRelative(0.2f, -0.2f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(91.6f, 91.6f, 0.0f, false, true, -14.4f, 49.4f)
                lineTo(132.0f, 125.9f)
                lineTo(132.0f, 36.1f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(124.0f, 36.1f)
                verticalLineToRelative(89.8f)
                lineTo(50.4f, 177.4f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 124.0f, 36.1f)
                close()
                moveTo(55.0f, 184.0f)
                lineToRelative(69.0f, -48.3f)
                verticalLineToRelative(84.2f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 55.0f, 184.0f)
                close()
                moveTo(132.0f, 219.9f)
                lineTo(132.0f, 135.7f)
                lineTo(201.0f, 184.0f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 132.0f, 219.9f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
