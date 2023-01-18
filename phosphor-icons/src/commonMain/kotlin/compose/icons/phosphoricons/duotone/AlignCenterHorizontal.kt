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

public val DuotoneGroup.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) {
            return _alignCenterHorizontal!!
        }
        _alignCenterHorizontal = Builder(name = "AlignCenterHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(72.0f, 56.0f)
                lineTo(184.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 64.0f)
                lineTo(192.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 112.0f)
                lineTo(72.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 104.0f)
                lineTo(64.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 144.0f)
                lineTo(208.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 152.0f)
                lineTo(216.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 200.0f)
                lineTo(48.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 192.0f)
                lineTo(40.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 136.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 64.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(152.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 136.0f)
                close()
                moveTo(72.0f, 64.0f)
                horizontalLineTo(184.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(72.0f)
                close()
                moveTo(208.0f, 192.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(152.0f)
                horizontalLineTo(208.0f)
                verticalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
