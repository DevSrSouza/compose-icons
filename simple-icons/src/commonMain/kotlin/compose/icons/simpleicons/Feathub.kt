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

public val SimpleIcons.Feathub: VectorAsset
    get() {
        if (_feathub != null) {
            return _feathub!!
        }
        _feathub = VectorAssetBuilder(name = "Feathub", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.73f, 0.01f)
                horizontalLineToRelative(6.54f)
                verticalLineToRelative(6.867f)
                lineTo(8.73f, 6.877f)
                lineTo(8.73f, 0.01f)
                close()
                moveTo(8.73f, 17.123f)
                horizontalLineToRelative(6.54f)
                verticalLineToRelative(6.867f)
                lineTo(8.73f, 23.99f)
                verticalLineToRelative(-6.867f)
                close()
                moveTo(0.01f, 8.73f)
                horizontalLineToRelative(23.98f)
                verticalLineToRelative(6.54f)
                lineTo(0.01f, 15.27f)
                lineTo(0.01f, 8.73f)
                close()
            }
        }
        .build()
        return _feathub!!
    }

private var _feathub: VectorAsset? = null
