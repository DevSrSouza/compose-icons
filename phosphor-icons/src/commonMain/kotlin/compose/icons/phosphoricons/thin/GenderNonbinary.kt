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

public val ThinGroup.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) {
            return _genderNonbinary!!
        }
        _genderNonbinary = Builder(name = "GenderNonbinary", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 92.1f)
                verticalLineTo(51.5f)
                lineToRelative(29.5f, 19.8f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.2f, 0.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.3f, -1.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -1.1f, -5.5f)
                lineTo(135.2f, 44.0f)
                lineToRelative(30.7f, -20.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 1.1f, -5.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -5.5f, -1.1f)
                lineTo(128.0f, 39.2f)
                lineTo(94.5f, 16.7f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 89.0f, 17.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 1.1f, 5.5f)
                lineTo(120.8f, 44.0f)
                lineTo(90.1f, 64.7f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 89.0f, 70.2f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 92.3f, 72.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.2f, -0.7f)
                lineTo(124.0f, 51.5f)
                verticalLineTo(92.1f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, -64.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 128.0f, 228.0f)
                close()
            }
        }
        .build()
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
