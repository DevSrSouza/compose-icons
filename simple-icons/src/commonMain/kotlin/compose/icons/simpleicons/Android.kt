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

public val SimpleIcons.Android: VectorAsset
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = VectorAssetBuilder(name = "Android", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.005f)
                lineTo(0.0f, 19.005f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, true, 2.21f, -6.07f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, true, 3.66f, -3.53f)
                lineToRelative(0.41f, -0.23f)
                lineToRelative(-2.02f, -3.41f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.17f, -0.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.69f, 0.18f)
                lineToRelative(2.08f, 3.5f)
                arcToRelative(12.62f, 12.62f, 0.0f, false, true, 4.84f, -0.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 4.75f, 0.9f)
                lineToRelative(2.07f, -3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, -0.17f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.16f, 0.7f)
                lineToRelative(-2.02f, 3.42f)
                lineToRelative(0.5f, 0.28f)
                arcToRelative(11.38f, 11.38f, 0.0f, false, true, 3.63f, 3.62f)
                arcToRelative(14.48f, 14.48f, 0.0f, false, true, 2.17f, 5.91f)
                close()
                moveTo(16.5f, 14.525f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(5.5f, 14.525f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: VectorAsset? = null
