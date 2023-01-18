package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(64.0f)
                lineTo(36.0f, 136.0f)
                lineTo(36.0f, 72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 56.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 28.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                lineTo(108.0f, 144.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                lineTo(228.0f, 72.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(36.0f, 164.0f)
                lineTo(36.0f, 144.0f)
                lineTo(46.3f, 144.0f)
                lineToRelative(43.5f, 43.4f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 36.0f, 164.0f)
                close()
                moveTo(100.0f, 164.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, -5.1f, 17.3f)
                lineTo(57.7f, 144.0f)
                lineTo(100.0f, 144.0f)
                close()
                moveTo(156.0f, 164.0f)
                lineTo(156.0f, 144.0f)
                horizontalLineToRelative(10.3f)
                lineToRelative(43.5f, 43.4f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 156.0f, 164.0f)
                close()
                moveTo(214.9f, 181.3f)
                lineTo(177.7f, 144.0f)
                lineTo(220.0f, 144.0f)
                verticalLineToRelative(20.0f)
                arcTo(31.9f, 31.9f, 0.0f, false, true, 214.9f, 181.3f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
