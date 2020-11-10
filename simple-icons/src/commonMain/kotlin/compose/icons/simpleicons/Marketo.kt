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

public val SimpleIcons.Marketo: VectorAsset
    get() {
        if (_marketo != null) {
            return _marketo!!
        }
        _marketo = VectorAssetBuilder(name = "Marketo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.146f, 0.0f)
                verticalLineToRelative(24.0f)
                lineToRelative(6.134f, -4.886f)
                verticalLineTo(3.334f)
                close()
                moveTo(13.293f, 18.758f)
                lineToRelative(-4.939f, 2.157f)
                verticalLineTo(2.086f)
                lineToRelative(4.939f, 1.462f)
                close()
                moveTo(1.721f, 18.205f)
                lineToRelative(3.78f, -0.999f)
                verticalLineTo(5.188f)
                lineToRelative(-3.762f, -0.606f)
                close()
            }
        }
        .build()
        return _marketo!!
    }

private var _marketo: VectorAsset? = null
