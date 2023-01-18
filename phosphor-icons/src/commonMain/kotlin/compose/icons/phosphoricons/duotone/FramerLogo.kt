package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(56.0f, 100.0f)
                lineToRelative(0.0f, 68.0f)
                lineToRelative(72.0f, 68.0f)
                lineToRelative(0.0f, -68.0f)
                lineToRelative(72.0f, 0.0f)
                lineToRelative(-144.0f, -136.0f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(0.0f, 68.0f)
                lineToRelative(-144.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 244.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.5f, -2.2f)
                lineToRelative(-72.0f, -68.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 48.0f, 168.0f)
                verticalLineTo(100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(51.9f)
                lineTo(50.5f, 37.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(148.1f)
                lineToRelative(57.4f, 54.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 176.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.8f, 7.3f)
                arcTo(7.4f, 7.4f, 0.0f, false, true, 128.0f, 244.0f)
                close()
                moveTo(64.0f, 164.6f)
                lineToRelative(56.0f, 52.8f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(51.9f)
                lineToRelative(-55.1f, -52.0f)
                horizontalLineTo(64.0f)
                close()
                moveTo(131.2f, 92.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(76.1f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
