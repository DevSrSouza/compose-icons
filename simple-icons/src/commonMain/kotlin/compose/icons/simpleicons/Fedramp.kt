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

public val SimpleIcons.Fedramp: VectorAsset
    get() {
        if (_fedramp != null) {
            return _fedramp!!
        }
        _fedramp = VectorAssetBuilder(name = "Fedramp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.886f, 3.412f)
                arcTo(1.85f, 1.85f, 0.0f, false, false, 0.0f, 5.27f)
                verticalLineToRelative(15.319f)
                horizontalLineToRelative(3.922f)
                verticalLineToRelative(-6.094f)
                horizontalLineToRelative(4.934f)
                verticalLineTo(10.66f)
                horizontalLineTo(3.922f)
                verticalLineTo(7.336f)
                horizontalLineToRelative(14.595f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, 0.0f, 3.324f)
                horizontalLineToRelative(-6.844f)
                arcToRelative(1.431f, 1.431f, 0.0f, false, false, -1.298f, 1.325f)
                verticalLineToRelative(8.601f)
                horizontalLineToRelative(3.919f)
                verticalLineTo(14.54f)
                horizontalLineToRelative(2.168f)
                lineToRelative(3.138f, 6.047f)
                horizontalLineToRelative(4.378f)
                lineToRelative(-3.46f, -6.657f)
                arcToRelative(5.442f, 5.442f, 0.0f, false, false, -2.001f, -10.517f)
                close()
            }
        }
        .build()
        return _fedramp!!
    }

private var _fedramp: VectorAsset? = null
