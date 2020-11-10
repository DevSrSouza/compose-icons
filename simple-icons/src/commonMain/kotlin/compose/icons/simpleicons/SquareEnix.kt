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

public val SimpleIcons.SquareEnix: VectorAsset
    get() {
        if (_squareEnix != null) {
            return _squareEnix!!
        }
        _squareEnix = VectorAssetBuilder(name = "SquareEnix", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.723f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(20.554f)
                verticalLineToRelative(-4.496f)
                lineTo(7.037f, 19.504f)
                lineTo(7.037f, 4.088f)
                horizontalLineToRelative(15.006f)
                lineTo(22.043f, 0.0f)
                close()
                moveTo(11.474f, 9.46f)
                verticalLineToRelative(4.497f)
                horizontalLineToRelative(8.584f)
                lineTo(20.058f, 9.459f)
                close()
            }
        }
        .build()
        return _squareEnix!!
    }

private var _squareEnix: VectorAsset? = null
