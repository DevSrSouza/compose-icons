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

public val SimpleIcons.Mcafee: VectorAsset
    get() {
        if (_mcafee != null) {
            return _mcafee!!
        }
        _mcafee = VectorAssetBuilder(name = "Mcafee", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.843f)
                lineTo(1.608f, 0.033f)
                verticalLineToRelative(19.124f)
                lineTo(12.0f, 23.967f)
                lineToRelative(10.392f, -4.81f)
                lineTo(22.392f, 0.033f)
                close()
                moveTo(18.155f, 16.437f)
                lineToRelative(-6.126f, 2.835f)
                lineToRelative(-6.127f, -2.835f)
                lineTo(5.902f, 6.704f)
                lineToRelative(6.127f, 2.834f)
                lineToRelative(6.126f, -2.834f)
                close()
            }
        }
        .build()
        return _mcafee!!
    }

private var _mcafee: VectorAsset? = null
