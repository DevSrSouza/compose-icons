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

public val SimpleIcons.Faceit: VectorAsset
    get() {
        if (_faceit != null) {
            return _faceit!!
        }
        _faceit = VectorAssetBuilder(name = "Faceit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.7f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.2f)
                curveToRelative(-0.1f, 0.0f, -0.1f, 0.0f, -0.2f, 0.1f)
                curveToRelative(-2.0f, 3.1f, -4.1f, 6.2f, -6.1f, 9.4f)
                horizontalLineTo(0.2f)
                curveToRelative(-0.2f, 0.0f, -0.3f, 0.3f, -0.1f, 0.4f)
                curveToRelative(7.2f, 2.7f, 17.7f, 6.8f, 23.5f, 9.1f)
                curveToRelative(0.2f, 0.1f, 0.4f, -0.1f, 0.4f, -0.2f)
                verticalLineTo(2.7f)
                close()
            }
        }
        .build()
        return _faceit!!
    }

private var _faceit: VectorAsset? = null
