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

public val SimpleIcons.Terraform: VectorAsset
    get() {
        if (_terraform != null) {
            return _terraform!!
        }
        _terraform = VectorAssetBuilder(name = "Terraform", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.283f, 4.265f)
                lineToRelative(7.433f, 3.776f)
                verticalLineToRelative(7.551f)
                lineToRelative(-7.433f, -3.776f)
                lineTo(8.283f, 4.265f)
                close()
                moveTo(16.531f, 8.041f)
                verticalLineToRelative(7.551f)
                lineToRelative(7.436f, -3.776f)
                lineTo(23.967f, 4.265f)
                lineToRelative(-7.436f, 3.776f)
                close()
                moveTo(0.035f, 0.051f)
                verticalLineToRelative(7.551f)
                lineToRelative(7.433f, 3.776f)
                lineTo(7.468f, 3.827f)
                lineTo(0.035f, 0.051f)
                close()
                moveTo(8.283f, 20.192f)
                lineToRelative(7.433f, 3.776f)
                lineTo(15.716f, 16.42f)
                lineToRelative(-7.433f, -3.776f)
                verticalLineToRelative(7.548f)
                close()
            }
        }
        .build()
        return _terraform!!
    }

private var _terraform: VectorAsset? = null
