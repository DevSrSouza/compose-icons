package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 136.0f)
                lineTo(320.0f, 136.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 376.0f, 192.0f)
                lineTo(376.0f, 320.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 320.0f, 376.0f)
                lineTo(192.0f, 376.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 136.0f, 320.0f)
                lineTo(136.0f, 192.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 192.0f, 136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 96.0f)
                lineTo(336.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(192.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(176.0f, 96.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, -80.0f, 80.0f)
                lineTo(96.0f, 336.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, 80.0f, 80.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(320.0f, 496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(336.0f, 416.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, 80.0f, -80.0f)
                lineTo(416.0f, 176.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, false, 336.0f, 96.0f)
                close()
                moveTo(392.0f, 320.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, 72.0f)
                lineTo(192.0f, 392.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f)
                lineTo(120.0f, 192.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, -72.0f)
                lineTo(320.0f, 120.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, 72.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
