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

public val BrandsGroup.Neos: ImageVector
    get() {
        if (_neos != null) {
            return _neos!!
        }
        _neos = Builder(name = "Neos", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(415.44f, 512.0f)
                horizontalLineToRelative(-95.11f)
                lineTo(212.12f, 357.46f)
                verticalLineToRelative(91.1f)
                lineTo(125.69f, 512.0f)
                lineTo(28.0f, 512.0f)
                lineTo(28.0f, 29.82f)
                lineTo(68.47f, 0.0f)
                horizontalLineToRelative(108.05f)
                lineToRelative(123.74f, 176.13f)
                lineTo(300.26f, 63.45f)
                lineTo(386.69f, 0.0f)
                horizontalLineToRelative(97.69f)
                verticalLineToRelative(461.5f)
                close()
                moveTo(38.77f, 35.27f)
                lineTo(38.77f, 496.0f)
                lineToRelative(72.0f, -52.88f)
                lineTo(110.77f, 194.0f)
                lineToRelative(215.5f, 307.64f)
                horizontalLineToRelative(84.79f)
                lineToRelative(52.35f, -38.17f)
                horizontalLineToRelative(-78.27f)
                lineTo(69.0f, 13.0f)
                close()
                moveTo(121.31f, 501.88f)
                lineToRelative(80.0f, -58.78f)
                verticalLineToRelative(-101.0f)
                lineToRelative(-79.76f, -114.4f)
                verticalLineToRelative(220.94f)
                lineTo(49.0f, 501.89f)
                horizontalLineToRelative(72.34f)
                close()
                moveTo(80.63f, 10.77f)
                lineToRelative(310.6f, 442.57f)
                horizontalLineToRelative(82.37f)
                lineTo(473.6f, 10.77f)
                horizontalLineToRelative(-79.75f)
                verticalLineToRelative(317.56f)
                lineTo(170.91f, 10.77f)
                close()
                moveTo(311.0f, 191.65f)
                lineToRelative(72.0f, 102.81f)
                lineTo(383.0f, 15.93f)
                lineToRelative(-72.0f, 53.0f)
                verticalLineToRelative(122.72f)
                close()
            }
        }
        .build()
        return _neos!!
    }

private var _neos: ImageVector? = null
