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

public val BrandsGroup.Deezer: ImageVector
    get() {
        if (_deezer != null) {
            return _deezer!!
        }
        _deezer = Builder(name = "Deezer", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(451.46f, 244.71f)
                lineTo(576.0f, 244.71f)
                lineTo(576.0f, 172.0f)
                lineTo(451.46f, 172.0f)
                close()
                moveTo(451.46f, 70.82f)
                verticalLineToRelative(72.67f)
                lineTo(576.0f, 143.49f)
                lineTo(576.0f, 70.82f)
                close()
                moveTo(451.46f, 345.88f)
                lineTo(576.0f, 345.88f)
                lineTo(576.0f, 273.2f)
                lineTo(451.46f, 273.2f)
                close()
                moveTo(0.0f, 447.09f)
                lineTo(124.54f, 447.09f)
                lineTo(124.54f, 374.42f)
                lineTo(0.0f, 374.42f)
                close()
                moveTo(150.47f, 447.09f)
                lineTo(275.0f, 447.09f)
                lineTo(275.0f, 374.42f)
                lineTo(150.47f, 374.42f)
                close()
                moveTo(300.99f, 447.09f)
                lineTo(425.53f, 447.09f)
                lineTo(425.53f, 374.42f)
                lineTo(301.0f, 374.42f)
                close()
                moveTo(451.46f, 447.09f)
                lineTo(576.0f, 447.09f)
                lineTo(576.0f, 374.42f)
                lineTo(451.46f, 374.42f)
                close()
                moveTo(301.0f, 345.88f)
                lineTo(425.53f, 345.88f)
                lineTo(425.53f, 273.2f)
                lineTo(301.0f, 273.2f)
                close()
                moveTo(150.48f, 345.88f)
                lineTo(275.0f, 345.88f)
                lineTo(275.0f, 273.2f)
                lineTo(150.47f, 273.2f)
                close()
                moveTo(150.48f, 244.71f)
                lineTo(275.0f, 244.71f)
                lineTo(275.0f, 172.0f)
                lineTo(150.47f, 172.0f)
                close()
            }
        }
        .build()
        return _deezer!!
    }

private var _deezer: ImageVector? = null
