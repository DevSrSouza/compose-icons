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

public val SimpleIcons.Haskell: VectorAsset
    get() {
        if (_haskell != null) {
            return _haskell!!
        }
        _haskell = VectorAssetBuilder(name = "Haskell", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.006f, 20.47f)
                lineTo(5.649f, 12.0f)
                lineTo(0.006f, 3.531f)
                horizontalLineToRelative(4.235f)
                lineToRelative(5.674f, 8.47f)
                lineToRelative(-5.674f, 8.468f)
                close()
                moveTo(5.649f, 20.47f)
                lineTo(11.29f, 12.0f)
                lineTo(5.65f, 3.531f)
                horizontalLineToRelative(4.266f)
                lineToRelative(11.253f, 16.938f)
                horizontalLineToRelative(-4.224f)
                lineToRelative(-3.535f, -5.34f)
                lineToRelative(-3.495f, 5.34f)
                close()
                moveTo(19.3f, 15.525f)
                lineToRelative(-1.877f, -2.827f)
                horizontalLineToRelative(6.571f)
                verticalLineToRelative(2.826f)
                close()
                moveTo(16.474f, 11.29f)
                lineToRelative(-1.877f, -2.827f)
                horizontalLineToRelative(9.387f)
                verticalLineToRelative(2.827f)
                close()
            }
        }
        .build()
        return _haskell!!
    }

private var _haskell: VectorAsset? = null
