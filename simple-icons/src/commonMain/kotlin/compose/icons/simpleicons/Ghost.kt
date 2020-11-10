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

public val SimpleIcons.Ghost: VectorAsset
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = VectorAssetBuilder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.604f, 19.199f)
                lineTo(0.008f, 19.199f)
                lineTo(0.008f, 24.0f)
                horizontalLineToRelative(9.597f)
                verticalLineToRelative(-4.801f)
                close()
                moveTo(23.994f, 19.199f)
                horizontalLineToRelative(-9.591f)
                lineTo(14.403f, 24.0f)
                horizontalLineToRelative(9.591f)
                verticalLineToRelative(-4.801f)
                close()
                moveTo(23.997f, 9.6f)
                lineTo(0.0f, 9.6f)
                verticalLineToRelative(4.8f)
                horizontalLineToRelative(23.997f)
                lineTo(23.997f, 9.6f)
                close()
                moveTo(24.0f, 0.0f)
                horizontalLineToRelative(-4.801f)
                verticalLineToRelative(4.801f)
                lineTo(24.0f, 4.801f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(14.404f, 0.0f)
                lineTo(0.008f, 0.0f)
                verticalLineToRelative(4.801f)
                horizontalLineToRelative(14.396f)
                lineTo(14.404f, 0.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: VectorAsset? = null
