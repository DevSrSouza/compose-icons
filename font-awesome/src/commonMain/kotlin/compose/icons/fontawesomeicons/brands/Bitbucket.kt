package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Bitbucket: ImageVector
    get() {
        if (_bitbucket != null) {
            return _bitbucket!!
        }
        _bitbucket = Builder(name = "Bitbucket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.2f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.0f, 47.8f)
                arcToRelative(26.35f, 26.35f, 0.0f, false, false, 0.2f, 2.8f)
                lineToRelative(67.9f, 412.1f)
                arcToRelative(21.77f, 21.77f, 0.0f, false, false, 21.3f, 18.2f)
                horizontalLineToRelative(325.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -13.4f)
                lineTo(505.0f, 50.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.2f, -18.3f)
                arcToRelative(24.58f, 24.58f, 0.0f, false, false, -2.8f, -0.2f)
                lineTo(22.2f, 32.0f)
                close()
                moveTo(308.1f, 329.8f)
                horizontalLineToRelative(-104.0f)
                lineToRelative(-28.1f, -147.0f)
                horizontalLineToRelative(157.3f)
                lineToRelative(-25.2f, 147.0f)
                close()
            }
        }
        .build()
        return _bitbucket!!
    }

private var _bitbucket: ImageVector? = null
