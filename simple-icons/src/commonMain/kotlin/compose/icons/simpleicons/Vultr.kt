package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Vultr: VectorAsset
    get() {
        if (_vultr != null) {
            return _vultr!!
        }
        _vultr = VectorAssetBuilder(name = "Vultr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.36f, 2.17f)
                arcToRelative(1.194f, 1.194f, 0.0f, false, false, -1.012f, -0.571f)
                lineTo(1.2f, 1.599f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -1.2f, 1.2f)
                arcToRelative(1.211f, 1.211f, 0.0f, false, false, 0.182f, 0.64f)
                lineToRelative(11.6f, 18.4f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, false, 2.035f, 0.0f)
                lineToRelative(3.075f, -4.874f)
                arcToRelative(1.229f, 1.229f, 0.0f, false, false, 0.182f, -0.64f)
                arcToRelative(1.211f, 1.211f, 0.0f, false, false, -0.182f, -0.642f)
                close()
                moveTo(18.709f, 10.85f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, false, 2.035f, 0.0f)
                lineTo(21.8f, 9.176f)
                lineToRelative(2.017f, -3.2f)
                arcToRelative(1.211f, 1.211f, 0.0f, false, false, 0.183f, -0.64f)
                arcToRelative(1.229f, 1.229f, 0.0f, false, false, -0.183f, -0.64f)
                lineToRelative(-1.6f, -2.526f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, false, -1.016f, -0.571f)
                horizontalLineToRelative(-6.148f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -1.201f, 1.2f)
                arcToRelative(1.143f, 1.143f, 0.0f, false, false, 0.188f, 0.64f)
                close()
            }
        }
        .build()
        return _vultr!!
    }

private var _vultr: VectorAsset? = null
