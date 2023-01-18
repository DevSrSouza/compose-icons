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

public val DuotoneGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 208.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(208.0f)
                lineToRelative(-32.0f, -16.0f)
                lineToRelative(-32.0f, 16.0f)
                lineToRelative(-32.0f, -16.0f)
                lineTo(96.0f, 208.0f)
                lineTo(64.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 112.0f)
                horizontalLineTo(180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 144.0f)
                horizontalLineTo(180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 208.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.8f, 6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.8f, 0.4f)
                lineTo(64.0f, 200.9f)
                lineToRelative(28.4f, 14.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 7.2f, 0.0f)
                lineTo(128.0f, 200.9f)
                lineToRelative(28.4f, 14.3f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 7.2f, 0.0f)
                lineTo(192.0f, 200.9f)
                lineToRelative(28.4f, 14.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.8f, -0.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 232.0f, 208.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(216.0f, 195.1f)
                lineTo(195.6f, 184.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -7.2f, 0.0f)
                lineTo(160.0f, 199.1f)
                lineToRelative(-28.4f, -14.3f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -7.2f, 0.0f)
                lineTo(96.0f, 199.1f)
                lineTo(67.6f, 184.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -7.2f, 0.0f)
                lineTo(40.0f, 195.1f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
