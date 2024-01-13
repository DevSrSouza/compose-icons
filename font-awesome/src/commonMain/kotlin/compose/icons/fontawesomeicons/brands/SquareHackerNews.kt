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

public val BrandsGroup.SquareHackerNews: ImageVector
    get() {
        if (_squareHackerNews != null) {
            return _squareHackerNews!!
        }
        _squareHackerNews = Builder(name = "SquareHackerNews", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(384.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(21.0f, 229.2f)
                curveToRelative(0.0f, 0.0f, 0.1f, -0.1f, 0.1f, -0.2f)
                reflectiveCurveToRelative(0.1f, -0.2f, 0.2f, -0.2f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.3f, -0.1f, 0.4f)
                horizontalLineTo(21.0f)
                close()
                moveTo(239.2f, 384.0f)
                horizontalLineTo(207.8f)
                verticalLineTo(281.3f)
                lineTo(128.0f, 128.0f)
                horizontalLineToRelative(37.3f)
                curveToRelative(41.5f, 77.7f, 48.1f, 95.8f, 54.1f, 112.0f)
                curveToRelative(1.6f, 4.3f, 3.1f, 8.5f, 5.2f, 13.6f)
                curveToRelative(3.2f, -7.0f, 5.1f, -11.9f, 7.1f, -17.3f)
                curveToRelative(5.9f, -15.3f, 12.8f, -33.2f, 53.5f, -108.3f)
                horizontalLineTo(320.0f)
                lineTo(239.2f, 283.1f)
                verticalLineTo(384.0f)
                close()
            }
        }
        .build()
        return _squareHackerNews!!
    }

private var _squareHackerNews: ImageVector? = null
