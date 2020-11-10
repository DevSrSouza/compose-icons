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

public val SimpleIcons.Netapp: VectorAsset
    get() {
        if (_netapp != null) {
            return _netapp!!
        }
        _netapp = VectorAssetBuilder(name = "Netapp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(9.33f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(5.34f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _netapp!!
    }

private var _netapp: VectorAsset? = null
