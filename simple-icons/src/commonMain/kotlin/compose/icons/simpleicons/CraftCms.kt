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

public val SimpleIcons.CraftCms: VectorAsset
    get() {
        if (_craftCms != null) {
            return _craftCms!!
        }
        _craftCms = VectorAssetBuilder(name = "CraftCms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 0.0f)
                horizontalLineToRelative(-19.0f)
                curveTo(1.1f, 0.0f, 0.0f, 1.1f, 0.0f, 2.5f)
                verticalLineToRelative(18.9f)
                curveTo(0.0f, 22.9f, 1.1f, 24.0f, 2.5f, 24.0f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.4f, 0.0f, 2.5f, -1.1f, 2.5f, -2.5f)
                verticalLineToRelative(-19.0f)
                curveTo(24.0f, 1.1f, 22.9f, 0.0f, 21.5f, 0.0f)
                close()
                moveTo(12.0f, 14.6f)
                curveToRelative(0.8f, 0.0f, 1.6f, -0.3f, 2.4f, -1.0f)
                lineToRelative(1.1f, 1.3f)
                curveToRelative(-1.2f, 1.0f, -2.5f, 1.5f, -3.9f, 1.5f)
                curveToRelative(-2.7f, 0.0f, -4.3f, -1.8f, -4.0f, -4.3f)
                curveToRelative(0.4f, -2.5f, 2.7f, -4.3f, 5.4f, -4.3f)
                curveToRelative(1.3f, 0.0f, 2.5f, 0.5f, 3.3f, 1.4f)
                lineToRelative(-1.6f, 1.3f)
                curveToRelative(-0.5f, -0.6f, -1.2f, -1.0f, -2.0f, -1.0f)
                curveToRelative(-1.6f, 0.0f, -2.8f, 1.0f, -3.1f, 2.5f)
                curveToRelative(-0.2f, 1.6f, 0.7f, 2.6f, 2.4f, 2.6f)
                close()
            }
        }
        .build()
        return _craftCms!!
    }

private var _craftCms: VectorAsset? = null
