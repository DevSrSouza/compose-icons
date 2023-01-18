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

public val DuotoneGroup.EnvelopeSimpleOpen: ImageVector
    get() {
        if (_envelopeSimpleOpen != null) {
            return _envelopeSimpleOpen!!
        }
        _envelopeSimpleOpen = Builder(name = "EnvelopeSimpleOpen", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                lineToRelative(-78.5f, 56.0f)
                horizontalLineToRelative(-35.0f)
                lineTo(32.0f, 96.0f)
                lineToRelative(96.0f, -64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.4f, 89.3f)
                lineToRelative(-96.0f, -64.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -8.8f, 0.0f)
                lineToRelative(-96.0f, 64.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 24.0f, 96.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(96.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 228.4f, 89.3f)
                close()
                moveTo(128.0f, 41.6f)
                lineToRelative(81.9f, 54.6f)
                lineToRelative(-67.0f, 47.8f)
                horizontalLineTo(113.1f)
                lineToRelative(-67.0f, -47.8f)
                close()
                moveTo(40.0f, 200.0f)
                verticalLineTo(111.5f)
                lineToRelative(65.9f, 47.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.6f, 1.5f)
                horizontalLineToRelative(35.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.6f, -1.5f)
                lineToRelative(65.9f, -47.0f)
                verticalLineTo(200.0f)
                close()
            }
        }
        .build()
        return _envelopeSimpleOpen!!
    }

private var _envelopeSimpleOpen: ImageVector? = null
