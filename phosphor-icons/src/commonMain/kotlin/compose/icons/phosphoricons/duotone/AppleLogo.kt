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

public val DuotoneGroup.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) {
            return _appleLogo!!
        }
        _appleLogo = Builder(name = "AppleLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(218.5f, 162.9f)
                curveTo(205.9f, 193.7f, 183.1f, 216.0f, 164.0f, 216.0f)
                horizontalLineTo(92.0f)
                curveToRelative(-28.0f, 0.0f, -64.0f, -48.0f, -64.0f, -100.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 128.0f, 71.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 87.2f, 7.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 3.3f, 84.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.7f, 29.6f)
                arcTo(40.2f, 40.2f, 0.0f, false, true, 168.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -22.4f, 15.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.5f, 5.1f)
                arcToRelative(9.2f, 9.2f, 0.0f, false, true, -2.8f, -0.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 130.7f, 29.6f)
                close()
                moveTo(225.9f, 166.0f)
                curveToRelative(-14.0f, 34.1f, -39.4f, 58.0f, -61.9f, 58.0f)
                lineTo(92.0f, 224.0f)
                curveToRelative(-16.4f, 0.0f, -34.7f, -12.7f, -49.1f, -34.0f)
                arcTo(135.0f, 135.0f, 0.0f, false, true, 20.0f, 116.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 128.0f, 61.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 93.5f, 13.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -2.2f, 11.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 2.7f, 70.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 225.9f, 166.0f)
                close()
                moveTo(208.3f, 166.2f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, true, -5.1f, -88.5f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -69.7f, -0.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -10.7f, 0.3f)
                verticalLineToRelative(-0.2f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 36.0f, 116.0f)
                curveToRelative(0.0f, 49.9f, 34.4f, 92.0f, 56.0f, 92.0f)
                horizontalLineToRelative(72.0f)
                curveTo(178.4f, 208.0f, 196.7f, 190.4f, 208.3f, 166.2f)
                close()
            }
        }
        .build()
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
