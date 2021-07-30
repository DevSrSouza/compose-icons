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

public val BrandsGroup.Atlassian: ImageVector
    get() {
        if (_atlassian != null) {
            return _atlassian!!
        }
        _atlassian = Builder(name = "Atlassian", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.2f, 236.4f)
                curveToRelative(-7.7f, -8.2f, -19.7f, -7.7f, -24.8f, 2.8f)
                lineTo(1.6f, 490.2f)
                curveToRelative(-5.0f, 10.0f, 2.4f, 21.7f, 13.4f, 21.7f)
                horizontalLineToRelative(175.0f)
                curveToRelative(5.8f, 0.1f, 11.0f, -3.2f, 13.4f, -8.4f)
                curveToRelative(37.9f, -77.8f, 15.1f, -196.3f, -51.2f, -267.1f)
                close()
                moveTo(244.4f, 8.1f)
                curveToRelative(-122.3f, 193.4f, -8.5f, 348.6f, 65.0f, 495.5f)
                curveToRelative(2.5f, 5.1f, 7.7f, 8.4f, 13.4f, 8.4f)
                horizontalLineTo(497.0f)
                curveToRelative(11.2f, 0.0f, 18.4f, -11.8f, 13.4f, -21.7f)
                curveToRelative(0.0f, 0.0f, -234.5f, -470.6f, -240.4f, -482.3f)
                curveToRelative(-5.3f, -10.6f, -18.8f, -10.8f, -25.6f, 0.1f)
                close()
            }
        }
        .build()
        return _atlassian!!
    }

private var _atlassian: ImageVector? = null
