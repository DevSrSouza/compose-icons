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

public val SimpleIcons.Stitcher: VectorAsset
    get() {
        if (_stitcher != null) {
            return _stitcher!!
        }
        _stitcher = VectorAssetBuilder(name = "Stitcher", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.98f, 6.938f)
                horizontalLineToRelative(-0.359f)
                verticalLineToRelative(10.125f)
                horizontalLineToRelative(0.359f)
                lineTo(17.98f, 6.938f)
                close()
                moveTo(17.235f, 8.063f)
                horizontalLineToRelative(-0.36f)
                verticalLineToRelative(7.875f)
                horizontalLineToRelative(0.36f)
                lineTo(17.235f, 8.063f)
                close()
                moveTo(16.119f, 8.063f)
                lineTo(0.0f, 8.063f)
                verticalLineToRelative(7.875f)
                horizontalLineToRelative(16.119f)
                lineTo(16.119f, 8.063f)
                close()
                moveTo(24.0f, 8.063f)
                horizontalLineToRelative(-4.508f)
                verticalLineToRelative(7.875f)
                lineTo(24.0f, 15.938f)
                lineTo(24.0f, 8.063f)
                close()
                moveTo(18.744f, 8.063f)
                horizontalLineToRelative(-0.36f)
                verticalLineToRelative(7.875f)
                horizontalLineToRelative(0.36f)
                lineTo(18.744f, 8.063f)
                close()
            }
        }
        .build()
        return _stitcher!!
    }

private var _stitcher: VectorAsset? = null
