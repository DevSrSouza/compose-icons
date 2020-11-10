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

public val SimpleIcons.Angular: VectorAsset
    get() {
        if (_angular != null) {
            return _angular!!
        }
        _angular = VectorAssetBuilder(name = "Angular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.93f, 12.645f)
                horizontalLineToRelative(4.134f)
                lineTo(11.996f, 7.74f)
                moveTo(11.996f, 0.009f)
                lineTo(0.686f, 3.988f)
                lineToRelative(1.725f, 14.76f)
                lineToRelative(9.585f, 5.243f)
                lineToRelative(9.588f, -5.238f)
                lineTo(23.308f, 3.99f)
                lineTo(11.996f, 0.01f)
                close()
                moveTo(19.054f, 18.306f)
                horizontalLineToRelative(-2.636f)
                lineToRelative(-1.42f, -3.501f)
                lineTo(8.995f, 14.805f)
                lineToRelative(-1.42f, 3.501f)
                lineTo(4.937f, 18.306f)
                lineToRelative(7.06f, -15.648f)
                lineToRelative(7.057f, 15.648f)
                close()
            }
        }
        .build()
        return _angular!!
    }

private var _angular: VectorAsset? = null
