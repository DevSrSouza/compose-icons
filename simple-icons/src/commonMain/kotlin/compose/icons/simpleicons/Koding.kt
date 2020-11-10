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

public val SimpleIcons.Koding: VectorAsset
    get() {
        if (_koding != null) {
            return _koding!!
        }
        _koding = VectorAssetBuilder(name = "Koding", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.8f, 0.0f)
                lineTo(23.0f, 0.0f)
                verticalLineToRelative(6.0f)
                lineTo(1.0f, 6.0f)
                lineTo(1.0f, 0.0f)
                close()
                moveTo(0.8f, 9.0f)
                lineTo(18.0f, 9.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.7f, 15.0f)
                lineTo(0.7f, 9.0f)
                close()
                moveTo(0.8f, 18.0f)
                lineTo(23.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(1.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _koding!!
    }

private var _koding: VectorAsset? = null
