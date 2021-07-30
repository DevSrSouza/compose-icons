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

public val OutlineGroup.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) {
            return _volumeOff!!
        }
        _volumeOff = Builder(name = "VolumeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(4.71f, 3.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.29f, 4.71f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.91f, 14.08f)
                lineToRelative(1.44f, 1.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.07f, -7.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.56f, 1.26f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.91f, 14.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, true, -1.78f, 4.39f)
                lineToRelative(1.42f, 1.42f)
                arcTo(8.53f, 8.53f, 0.0f, false, false, 23.0f, 12.0f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -3.36f, -6.77f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.28f, 1.54f)
                arcTo(6.8f, 6.8f, 0.0f, false, true, 21.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 18.1f)
                lineTo(8.4f, 14.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.57f, -0.17f)
                horizontalLineTo(3.5f)
                verticalLineTo(9.57f)
                horizontalLineTo(6.74f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(6.41f, 4.4f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, 0.57f, 0.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(18.33f)
                lineToRelative(-2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 5.9f)
                verticalLineToRelative(4.77f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.57f, -0.83f)
                lineTo(9.23f, 6.4f)
                lineToRelative(1.44f, 1.44f)
                close()
            }
        }
        .build()
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
