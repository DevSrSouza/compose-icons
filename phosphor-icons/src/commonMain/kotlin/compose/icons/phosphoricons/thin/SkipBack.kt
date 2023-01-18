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

public val ThinGroup.SkipBack: ImageVector
    get() {
        if (_skipBack != null) {
            return _skipBack!!
        }
        _skipBack = Builder(name = "SkipBack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.9f, 43.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -12.2f, 0.2f)
                lineTo(65.1f, 117.8f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -5.1f, 6.3f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(131.9f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 5.1f, 6.3f)
                lineTo(185.7f, 212.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.3f, 1.8f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, false, 5.9f, -1.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.1f, -10.5f)
                verticalLineTo(54.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 197.9f, 43.8f)
                close()
                moveTo(196.0f, 201.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.1f, 3.4f)
                lineTo(69.3f, 131.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -6.8f)
                lineTo(189.9f, 50.9f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 2.1f, -0.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 2.0f, 0.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.0f, 3.5f)
                close()
            }
        }
        .build()
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
