package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Ipfs: ImageVector
    get() {
        if (_ipfs != null) {
            return _ipfs!!
        }
        _ipfs = Builder(name = "Ipfs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(1.608f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.392f, -6.0f)
                lineTo(22.392f, 6.0f)
                close()
                moveTo(10.927f, 1.445f)
                horizontalLineToRelative(0.001f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 2.138f, 0.0f)
                lineToRelative(7.534f, 4.35f)
                arcToRelative(1.794f, 1.794f, 0.0f, false, false, 0.0f, 0.403f)
                lineToRelative(-7.535f, 4.35f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -2.137f, 0.0f)
                lineToRelative(-7.536f, -4.35f)
                arcToRelative(1.795f, 1.795f, 0.0f, false, false, 0.0f, -0.402f)
                close()
                moveTo(21.324f, 7.4f)
                curveToRelative(0.109f, 0.08f, 0.226f, 0.147f, 0.349f, 0.201f)
                verticalLineToRelative(8.7f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.069f, 1.852f)
                lineToRelative(-7.535f, 4.35f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.349f, -0.2f)
                lineToRelative(-0.009f, -8.653f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.07f, -1.851f)
                close()
                moveTo(2.676f, 7.448f)
                lineToRelative(7.535f, 4.35f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.069f, 1.852f)
                verticalLineToRelative(8.7f)
                curveToRelative(-0.124f, 0.054f, -0.24f, 0.122f, -0.349f, 0.202f)
                lineToRelative(-7.535f, -4.35f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.069f, -1.852f)
                verticalLineToRelative(-8.7f)
                curveToRelative(0.124f, -0.054f, 0.24f, -0.122f, 0.35f, -0.202f)
                close()
            }
        }
        .build()
        return _ipfs!!
    }

private var _ipfs: ImageVector? = null
