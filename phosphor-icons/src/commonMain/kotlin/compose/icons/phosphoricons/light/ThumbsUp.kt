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

public val LightGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.4f, 81.4f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 213.9f, 74.0f)
                horizontalLineTo(158.0f)
                verticalLineTo(56.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, -38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.4f, 3.3f)
                lineTo(76.3f, 98.0f)
                horizontalLineTo(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(201.9f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 21.8f, -19.3f)
                lineToRelative(12.0f, -96.0f)
                arcTo(22.4f, 22.4f, 0.0f, false, false, 230.4f, 81.4f)
                close()
                moveTo(30.0f, 200.0f)
                verticalLineTo(112.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(74.0f)
                verticalLineToRelative(92.0f)
                horizontalLineTo(32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 200.0f)
                close()
                moveTo(223.8f, 97.2f)
                lineToRelative(-12.0f, 96.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -9.9f, 8.8f)
                horizontalLineTo(86.0f)
                verticalLineTo(105.4f)
                lineToRelative(37.6f, -75.2f)
                arcTo(26.2f, 26.2f, 0.0f, false, true, 146.0f, 56.0f)
                verticalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(61.9f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 7.5f, 3.4f)
                arcTo(9.8f, 9.8f, 0.0f, false, true, 223.8f, 97.2f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
