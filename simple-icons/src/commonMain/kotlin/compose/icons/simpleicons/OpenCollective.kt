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

public val SimpleIcons.OpenCollective: VectorAsset
    get() {
        if (_openCollective != null) {
            return _openCollective!!
        }
        _openCollective = VectorAssetBuilder(name = "OpenCollective", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.86f, 5.17f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, 0.0f, 13.66f)
                lineToRelative(-3.1f, -3.1f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, false, 0.0f, -7.46f)
                lineToRelative(3.1f, -3.1f)
                close()
                moveTo(18.83f, 2.14f)
                lineToRelative(-3.1f, 3.1f)
                arcToRelative(7.71f, 7.71f, 0.0f, true, false, 0.0f, 13.51f)
                lineToRelative(3.1f, 3.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -19.73f)
                moveTo(21.86f, 5.17f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, 0.0f, 13.66f)
                lineToRelative(-3.1f, -3.1f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, false, 0.0f, -7.46f)
                lineToRelative(3.1f, -3.1f)
                close()
            }
        }
        .build()
        return _openCollective!!
    }

private var _openCollective: VectorAsset? = null
