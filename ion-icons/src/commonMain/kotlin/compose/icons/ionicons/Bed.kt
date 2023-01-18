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

public val IonIcons.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 230.7f)
                arcToRelative(79.44f, 79.44f, 0.0f, false, false, -32.0f, -6.7f)
                horizontalLineTo(112.0f)
                arcToRelative(79.51f, 79.51f, 0.0f, false, false, -32.0f, 6.69f)
                horizontalLineToRelative(0.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, false, 32.0f, 304.0f)
                verticalLineTo(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(440.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineTo(304.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, false, 432.0f, 230.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(376.0f, 80.0f)
                horizontalLineTo(136.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.11f, 3.84f)
                arcTo(95.5f, 95.5f, 0.0f, false, true, 112.0f, 208.0f)
                horizontalLineToRelative(4.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -3.55f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 152.0f, 176.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 31.8f, 28.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 3.55f)
                horizontalLineToRelative(24.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -3.55f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 304.0f, 176.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 31.8f, 28.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 3.55f)
                horizontalLineTo(400.0f)
                arcToRelative(95.51f, 95.51f, 0.0f, false, true, 26.89f, 3.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 432.0f, 208.0f)
                verticalLineTo(136.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 376.0f, 80.0f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
