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

public val DuotoneGroup.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) {
            return _stripeLogo!!
        }
        _stripeLogo = Builder(name = "StripeLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.1f, 152.0f)
                curveToRelative(0.0f, 17.9f, -19.4f, 32.0f, -44.1f, 32.0f)
                reflectiveCurveToRelative(-44.1f, -14.1f, -44.1f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                curveToRelative(0.0f, 7.6f, 11.6f, 16.0f, 28.1f, 16.0f)
                curveToRelative(13.3f, 0.0f, 28.1f, -6.6f, 28.1f, -16.0f)
                reflectiveCurveToRelative(-12.2f, -13.4f, -30.8f, -18.2f)
                curveToRelative(-8.7f, -2.2f, -17.7f, -4.5f, -24.8f, -8.2f)
                curveToRelative(-9.7f, -5.2f, -14.6f, -12.4f, -14.6f, -21.6f)
                curveToRelative(0.0f, -18.2f, 18.1f, -32.0f, 42.1f, -32.0f)
                curveToRelative(17.2f, 0.0f, 31.9f, 7.2f, 38.5f, 18.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.0f, 10.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -10.9f, -3.0f)
                curveTo(148.9f, 92.2f, 139.3f, 88.0f, 128.0f, 88.0f)
                curveToRelative(-14.6f, 0.0f, -26.1f, 7.0f, -26.1f, 16.0f)
                curveToRelative(0.0f, 6.8f, 10.8f, 10.1f, 27.3f, 14.3f)
                curveTo(148.3f, 123.2f, 172.1f, 129.3f, 172.1f, 152.0f)
                close()
                moveTo(224.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(208.0f, 208.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(208.0f)
                close()
            }
        }
        .build()
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
