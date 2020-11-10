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

public val SimpleIcons.Angularjs: VectorAsset
    get() {
        if (_angularjs != null) {
            return _angularjs!!
        }
        _angularjs = VectorAssetBuilder(name = "Angularjs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.964f, 0.0f)
                lineTo(0.672f, 3.974f)
                lineToRelative(1.784f, 14.794f)
                lineTo(11.976f, 24.0f)
                lineToRelative(9.568f, -5.303f)
                lineToRelative(1.784f, -14.794f)
                close()
                moveTo(11.937f, 1.258f)
                lineToRelative(10.265f, 3.5f)
                lineToRelative(-1.663f, 13.232f)
                lineToRelative(-8.602f, 4.76f)
                lineToRelative(-8.469f, -4.697f)
                lineTo(1.939f, 4.822f)
                close()
                moveTo(11.937f, 2.038f)
                lineTo(4.957f, 17.57f)
                lineToRelative(2.604f, -0.048f)
                lineToRelative(1.4f, -3.501f)
                horizontalLineToRelative(6.257f)
                lineToRelative(1.532f, 3.55f)
                lineToRelative(2.492f, 0.046f)
                close()
                moveTo(11.957f, 7.018f)
                lineToRelative(2.355f, 4.93f)
                lineTo(9.878f, 11.948f)
                close()
            }
        }
        .build()
        return _angularjs!!
    }

private var _angularjs: VectorAsset? = null
