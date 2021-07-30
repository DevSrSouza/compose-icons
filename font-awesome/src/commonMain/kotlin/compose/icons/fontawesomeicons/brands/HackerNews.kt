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

public val BrandsGroup.HackerNews: ImageVector
    get() {
        if (_hackerNews != null) {
            return _hackerNews!!
        }
        _hackerNews = Builder(name = "HackerNews", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                verticalLineToRelative(448.0f)
                horizontalLineToRelative(448.0f)
                lineTo(448.0f, 32.0f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(21.2f, 229.2f)
                lineTo(21.0f, 229.2f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.3f, 0.3f, -0.4f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.3f, -0.1f, 0.4f)
                close()
                moveTo(239.2f, 283.1f)
                lineTo(239.2f, 384.0f)
                horizontalLineToRelative(-31.4f)
                lineTo(207.8f, 281.3f)
                lineTo(128.0f, 128.0f)
                horizontalLineToRelative(37.3f)
                curveToRelative(52.5f, 98.3f, 49.2f, 101.2f, 59.3f, 125.6f)
                curveToRelative(12.3f, -27.0f, 5.8f, -24.4f, 60.6f, -125.6f)
                lineTo(320.0f, 128.0f)
                lineToRelative(-80.8f, 155.1f)
                close()
            }
        }
        .build()
        return _hackerNews!!
    }

private var _hackerNews: ImageVector? = null
