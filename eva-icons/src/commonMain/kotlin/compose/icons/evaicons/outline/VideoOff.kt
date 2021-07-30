package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.VideoOff: ImageVector
    get() {
        if (_videoOff != null) {
            return _videoOff!!
        }
        _videoOff = Builder(name = "VideoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.59f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(8.41f, 7.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.71f, 3.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.29f, 4.71f)
                lineToRelative(0.54f, 0.53f)
                lineTo(5.59f, 7.0f)
                lineToRelative(9.34f, 9.34f)
                lineToRelative(1.46f, 1.46f)
                lineToRelative(2.9f, 2.91f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.4f, -0.78f)
                lineTo(3.0f, 5.8f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.94f, 2.94f, 0.0f, false, false, 1.66f, -0.51f)
                lineTo(14.14f, 17.0f)
                arcTo(0.7f, 0.7f, 0.0f, false, true, 14.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.15f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -1.85f, 0.3f)
                lineTo(17.0f, 9.45f)
                verticalLineTo(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(7.83f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.17f)
                lineToRelative(4.72f, 4.72f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, 0.6f, 0.11f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, 0.69f, -0.15f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 1.0f, -1.48f)
                verticalLineTo(8.63f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 21.0f, 7.15f)
                close()
                moveTo(20.0f, 14.6f)
                lineTo(17.19f, 12.0f)
                lineTo(20.0f, 9.4f)
                close()
            }
        }
        .build()
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
