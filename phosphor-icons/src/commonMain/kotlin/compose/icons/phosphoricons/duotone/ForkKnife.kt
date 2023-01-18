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

public val DuotoneGroup.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(204.0f, 160.0f)
                horizontalLineTo(148.0f)
                reflectiveCurveTo(160.0f, 48.0f, 204.0f, 32.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 84.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.9f, 30.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.8f, 2.6f)
                lineTo(112.0f, 80.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                lineToRelative(7.9f, -47.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.8f, -2.6f)
                lineToRelative(-8.0f, 48.0f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 40.0f, 80.0f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, 36.0f, 43.3f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(123.3f)
                arcTo(44.1f, 44.1f, 0.0f, false, false, 128.0f, 80.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -0.1f, -1.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.6f, 25.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -7.3f, -0.9f)
                curveToRelative(-20.8f, 7.5f, -37.5f, 32.9f, -49.5f, 75.3f)
                arcTo(412.8f, 412.8f, 0.0f, false, false, 140.0f, 159.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.0f, 6.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 6.0f, 2.7f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(32.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 208.6f, 25.4f)
                close()
                moveTo(196.0f, 152.0f)
                horizontalLineTo(157.1f)
                arcToRelative(402.3f, 402.3f, 0.0f, false, true, 10.1f, -47.8f)
                curveToRelative(7.9f, -28.0f, 17.7f, -47.6f, 28.8f, -57.8f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
