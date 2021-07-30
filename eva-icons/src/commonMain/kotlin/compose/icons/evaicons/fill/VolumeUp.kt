package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.VolumeUp: ImageVector
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
                moveTo(14.47f, 3.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(7.0f, 7.57f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(7.0f)
                lineToRelative(6.41f, 4.4f)
                arcTo(1.06f, 1.06f, 0.0f, false, false, 14.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.47f, 3.12f)
                close()
            }
        }
        .build()
        return _volumeUp!!
    }

private var _volumeUp: ImageVector? = null
