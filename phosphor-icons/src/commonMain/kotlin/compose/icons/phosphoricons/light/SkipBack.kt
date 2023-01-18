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

public val LightGroup.SkipBack: ImageVector
    get() {
        if (_skipBack != null) {
            return _skipBack!!
        }
        _skipBack = Builder(name = "SkipBack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.8f, 42.1f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, -14.1f, 0.2f)
                lineTo(64.0f, 116.1f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -2.0f, 1.5f)
                verticalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(138.4f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 2.0f, 1.5f)
                lineToRelative(120.7f, 73.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.3f, 2.1f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 6.8f, -1.9f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 7.2f, -12.2f)
                verticalLineTo(54.3f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 198.8f, 42.1f)
                close()
                moveTo(194.0f, 201.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.0f, 1.8f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -2.0f, -0.1f)
                lineTo(70.3f, 129.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, -3.4f)
                lineTo(191.0f, 52.6f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 1.0f, -0.3f)
                lineToRelative(1.0f, 0.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.0f, 1.8f)
                close()
            }
        }
        .build()
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
