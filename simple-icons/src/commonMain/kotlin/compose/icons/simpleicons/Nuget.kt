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

public val SimpleIcons.Nuget: VectorAsset
    get() {
        if (_nuget != null) {
            return _nuget!!
        }
        _nuget = VectorAssetBuilder(name = "Nuget", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.67f, 21.633f)
                arcToRelative(3.995f, 3.995f, 0.0f, true, true, 0.0f, -7.99f)
                arcToRelative(3.995f, 3.995f, 0.0f, false, true, 0.0f, 7.99f)
                moveToRelative(-7.969f, -9.157f)
                arcToRelative(2.497f, 2.497f, 0.0f, true, true, 0.0f, -4.994f)
                arcToRelative(2.497f, 2.497f, 0.0f, false, true, 0.0f, 4.994f)
                moveToRelative(8.145f, -7.795f)
                horizontalLineToRelative(-6.667f)
                arcToRelative(6.156f, 6.156f, 0.0f, false, false, -6.154f, 6.155f)
                verticalLineToRelative(6.667f)
                arcToRelative(6.154f, 6.154f, 0.0f, false, false, 6.154f, 6.154f)
                horizontalLineToRelative(6.667f)
                arcTo(6.154f, 6.154f, 0.0f, false, false, 24.0f, 17.503f)
                verticalLineToRelative(-6.667f)
                arcToRelative(6.155f, 6.155f, 0.0f, false, false, -6.154f, -6.155f)
                moveTo(3.995f, 2.339f)
                arcToRelative(1.998f, 1.998f, 0.0f, true, true, -3.996f, 0.0f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, true, 3.996f, 0.0f)
            }
        }
        .build()
        return _nuget!!
    }

private var _nuget: VectorAsset? = null
