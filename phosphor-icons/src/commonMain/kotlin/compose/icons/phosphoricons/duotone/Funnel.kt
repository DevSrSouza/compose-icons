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

public val DuotoneGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(42.1f, 48.0f)
                horizontalLineTo(213.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.9f, 13.4f)
                lineToRelative(-65.7f, 72.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.1f, 5.4f)
                verticalLineToRelative(56.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.6f, 6.7f)
                lineToRelative(-32.0f, 21.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.4f, -6.6f)
                verticalLineToRelative(-78.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.1f, -5.4f)
                lineTo(36.2f, 61.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 42.1f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 233.1f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, -7.5f, -1.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 96.0f, 217.1f)
                verticalLineToRelative(-78.0f)
                lineTo(30.2f, 66.8f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 42.1f, 40.0f)
                horizontalLineTo(213.9f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 11.9f, 26.8f)
                lineTo(160.0f, 139.1f)
                verticalLineToRelative(56.6f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -7.1f, 13.3f)
                lineToRelative(-32.0f, 21.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 233.1f)
                close()
                moveTo(42.1f, 56.0f)
                lineToRelative(65.7f, 72.3f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 4.2f, 10.8f)
                verticalLineToRelative(78.0f)
                lineToRelative(32.0f, -21.4f)
                verticalLineTo(139.1f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 4.2f, -10.8f)
                lineTo(213.9f, 56.0f)
                close()
                moveTo(214.0f, 56.0f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
