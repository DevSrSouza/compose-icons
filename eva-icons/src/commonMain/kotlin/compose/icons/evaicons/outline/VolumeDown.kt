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

public val OutlineGroup.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.78f, 8.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.56f, 1.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 4.74f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -0.37f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 20.78f, 8.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.47f, 3.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(9.0f, 7.57f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(9.0f)
                lineToRelative(6.41f, 4.4f)
                arcTo(1.06f, 1.06f, 0.0f, false, false, 16.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.47f, 3.12f)
                close()
                moveTo(15.0f, 18.1f)
                lineTo(9.9f, 14.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.57f, -0.17f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.57f)
                horizontalLineTo(9.33f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.9f, 9.4f)
                lineTo(15.0f, 5.9f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
