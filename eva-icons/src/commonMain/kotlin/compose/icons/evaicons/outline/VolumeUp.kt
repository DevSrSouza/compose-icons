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

public val OutlineGroup.VolumeUp: ImageVector
    get() {
        if (_volumeUp != null) {
            return _volumeUp!!
        }
        _volumeUp = Builder(name = "VolumeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(18.28f, 8.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.56f, 1.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 4.74f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.5f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -0.37f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.28f, 8.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.64f, 5.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.28f, 1.54f)
                arcTo(6.8f, 6.8f, 0.0f, false, true, 21.0f, 12.0f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, true, -2.64f, 5.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.13f, 1.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.64f, -0.23f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 23.0f, 12.0f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 19.64f, 5.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(7.52f, 7.57f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(6.41f, 4.4f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, 0.57f, 0.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(15.5f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 3.12f)
                close()
                moveTo(13.53f, 18.12f)
                lineTo(8.4f, 14.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.57f, -0.17f)
                lineTo(3.5f, 14.43f)
                lineTo(3.5f, 9.57f)
                lineTo(7.83f, 9.57f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.4f, 9.4f)
                lineToRelative(5.1f, -3.5f)
                close()
            }
        }
        .build()
        return _volumeUp!!
    }

private var _volumeUp: ImageVector? = null
