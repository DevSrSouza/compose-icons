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

public val SimpleIcons.Hulu: VectorAsset
    get() {
        if (_hulu != null) {
            return _hulu!!
        }
        _hulu = VectorAssetBuilder(name = "Hulu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4f, 7.355f)
                horizontalLineToRelative(-3.607f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, -2.063f, 0.405f)
                verticalLineTo(-0.03f)
                horizontalLineTo(2.94f)
                verticalLineToRelative(24.06f)
                horizontalLineToRelative(5.8f)
                verticalLineToRelative(-9.51f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, true, 1.56f, -1.7f)
                horizontalLineToRelative(3.39f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, 1.59f, 1.56f)
                verticalLineToRelative(9.59f)
                horizontalLineToRelative(5.78f)
                verticalLineTo(13.54f)
                curveToRelative(0.0f, -4.41f, -2.25f, -6.162f, -5.9f, -6.162f)
            }
        }
        .build()
        return _hulu!!
    }

private var _hulu: VectorAsset? = null
