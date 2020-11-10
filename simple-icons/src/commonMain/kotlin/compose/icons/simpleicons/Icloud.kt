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

public val SimpleIcons.Icloud: VectorAsset
    get() {
        if (_icloud != null) {
            return _icloud!!
        }
        _icloud = VectorAssetBuilder(name = "Icloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.013f, 10.726f)
                lineToRelative(0.001f, -0.028f)
                arcTo(6.346f, 6.346f, 0.0f, false, false, 8.09f, 7.67f)
                arcToRelative(3.414f, 3.414f, 0.0f, false, false, -4.989f, 2.829f)
                arcTo(4.72f, 4.72f, 0.0f, false, false, 0.0f, 14.929f)
                arcToRelative(4.72f, 4.72f, 0.0f, false, false, 4.719f, 4.719f)
                horizontalLineToRelative(14.807f)
                arcToRelative(4.475f, 4.475f, 0.0f, false, false, 0.487f, -8.922f)
                close()
            }
        }
        .build()
        return _icloud!!
    }

private var _icloud: VectorAsset? = null
