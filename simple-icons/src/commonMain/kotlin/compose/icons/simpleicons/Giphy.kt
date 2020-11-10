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

public val SimpleIcons.Giphy: VectorAsset
    get() {
        if (_giphy != null) {
            return _giphy!!
        }
        _giphy = VectorAssetBuilder(name = "Giphy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.666f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(18.666f)
                lineTo(21.332f, 8.668f)
                lineToRelative(-2.666f, 2.664f)
                verticalLineToRelative(10.0f)
                lineTo(5.332f, 21.332f)
                lineTo(5.332f, 2.668f)
                lineTo(10.0f, 2.668f)
                lineTo(12.666f, 0.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(13.332f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(21.332f, 5.332f)
                horizontalLineToRelative(-2.666f)
                lineTo(18.666f, 2.668f)
                lineTo(16.0f, 2.668f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(-2.668f)
                close()
            }
        }
        .build()
        return _giphy!!
    }

private var _giphy: VectorAsset? = null
