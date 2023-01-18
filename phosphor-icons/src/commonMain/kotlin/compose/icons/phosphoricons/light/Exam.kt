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

public val LightGroup.Exam: ImageVector
    get() {
        if (_exam != null) {
            return _exam!!
        }
        _exam = Builder(name = "Exam", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 216.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.8f, 5.1f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 5.9f, 0.3f)
                lineTo(64.0f, 206.7f)
                lineToRelative(29.3f, 14.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 5.4f, 0.0f)
                lineTo(128.0f, 206.7f)
                lineToRelative(29.3f, 14.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 5.4f, 0.0f)
                lineTo(192.0f, 206.7f)
                lineToRelative(29.3f, 14.7f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 2.7f, 0.6f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 3.2f, -0.9f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 230.0f, 216.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(218.0f, 206.3f)
                lineTo(194.7f, 194.6f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -5.4f, 0.0f)
                lineTo(160.0f, 209.3f)
                lineToRelative(-29.3f, -14.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -5.4f, 0.0f)
                lineTo(96.0f, 209.3f)
                lineTo(66.7f, 194.6f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -5.4f, 0.0f)
                lineTo(38.0f, 206.3f)
                lineTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(109.4f, 93.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -10.8f, 0.0f)
                lineToRelative(-32.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.8f, 5.4f)
                lineTo(83.7f, 150.0f)
                horizontalLineToRelative(40.6f)
                lineToRelative(6.3f, 12.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 136.0f, 166.0f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 2.7f, -0.6f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 2.7f, -8.1f)
                close()
                moveTo(89.7f, 138.0f)
                lineTo(104.0f, 109.4f)
                lineTo(118.3f, 138.0f)
                close()
                moveTo(198.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(178.0f, 134.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(166.0f, 134.0f)
                lineTo(152.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(14.0f)
                lineTo(166.0f, 108.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 128.0f)
                close()
            }
        }
        .build()
        return _exam!!
    }

private var _exam: ImageVector? = null
