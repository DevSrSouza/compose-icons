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

public val SimpleIcons.Hexo: VectorAsset
    get() {
        if (_hexo != null) {
            return _hexo!!
        }
        _hexo = VectorAssetBuilder(name = "Hexo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.007f)
                lineTo(1.57f, 6.056f)
                lineTo(1.57f, 18.05f)
                lineTo(12.0f, 23.995f)
                lineToRelative(10.43f, -6.049f)
                lineTo(22.43f, 5.952f)
                lineTo(12.0f, 0.007f)
                close()
                moveTo(16.798f, 17.112f)
                lineToRelative(-0.939f, 0.521f)
                lineToRelative(-0.939f, -0.521f)
                lineTo(14.92f, 12.94f)
                lineTo(9.08f, 12.94f)
                verticalLineToRelative(4.172f)
                lineToRelative(-0.94f, 0.521f)
                lineToRelative(-0.938f, -0.521f)
                lineTo(7.202f, 6.89f)
                lineToRelative(0.939f, -0.521f)
                lineToRelative(0.939f, 0.521f)
                verticalLineToRelative(4.172f)
                horizontalLineToRelative(5.84f)
                lineTo(14.92f, 6.89f)
                lineToRelative(0.94f, -0.521f)
                lineToRelative(0.938f, 0.521f)
                verticalLineToRelative(10.222f)
                close()
            }
        }
        .build()
        return _hexo!!
    }

private var _hexo: VectorAsset? = null
