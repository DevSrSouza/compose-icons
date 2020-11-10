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

public val SimpleIcons.Dynamics365: VectorAsset
    get() {
        if (_dynamics365 != null) {
            return _dynamics365!!
        }
        _dynamics365 = VectorAssetBuilder(name = "Dynamics365", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.59f, 7.41f)
                lineToRelative(4.94f, 3.54f)
                lineTo(4.59f, 24.0f)
                close()
                moveTo(4.59f, 0.0f)
                verticalLineToRelative(6.36f)
                lineToRelative(9.53f, 5.29f)
                lineToRelative(4.59f, -3.52f)
                close()
                moveTo(4.59f, 24.0f)
                lineToRelative(14.82f, -8.47f)
                verticalLineToRelative(-6.7f)
                close()
            }
        }
        .build()
        return _dynamics365!!
    }

private var _dynamics365: VectorAsset? = null
