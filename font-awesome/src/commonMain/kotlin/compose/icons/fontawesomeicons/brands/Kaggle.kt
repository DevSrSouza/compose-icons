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

public val BrandsGroup.Kaggle: ImageVector
    get() {
        if (_kaggle != null) {
            return _kaggle!!
        }
        _kaggle = Builder(name = "Kaggle", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.2f, 501.5f)
                lineTo(158.4f, 320.3f)
                lineTo(298.2f, 185.0f)
                curveToRelative(2.6f, -2.7f, 1.7f, -10.5f, -5.3f, -10.5f)
                horizontalLineToRelative(-69.2f)
                curveToRelative(-3.5f, 0.0f, -7.0f, 1.8f, -10.5f, 5.3f)
                lineTo(80.9f, 313.5f)
                verticalLineTo(7.5f)
                quadToRelative(0.0f, -7.5f, -7.5f, -7.5f)
                horizontalLineTo(21.5f)
                quadTo(14.0f, 0.0f, 14.0f, 7.5f)
                verticalLineToRelative(497.0f)
                quadToRelative(0.0f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(51.9f)
                quadToRelative(7.5f, 0.0f, 7.5f, -7.5f)
                verticalLineToRelative(-109.0f)
                lineToRelative(30.8f, -29.3f)
                lineToRelative(110.5f, 140.6f)
                curveToRelative(3.0f, 3.5f, 6.5f, 5.3f, 10.5f, 5.3f)
                horizontalLineToRelative(66.9f)
                quadToRelative(5.25f, 0.0f, 6.0f, -3.0f)
                close()
            }
        }
        .build()
        return _kaggle!!
    }

private var _kaggle: ImageVector? = null
