package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.TrendingDown: ImageVector
    get() {
        if (_trendingDown != null) {
            return _trendingDown!!
        }
        _trendingDown = Builder(name = "TrendingDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                lineToRelative(0.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(2.3f)
                lineToRelative(-4.24f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.27f, -0.21f)
                lineTo(9.22f, 11.7f)
                lineTo(4.77f, 6.36f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 3.23f, 7.64f)
                lineToRelative(5.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.28f, 0.22f)
                lineToRelative(4.28f, -2.57f)
                lineToRelative(4.0f, 4.71f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.36f, -0.07f)
                lineToRelative(0.14f, -0.08f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, false, 0.15f, -0.09f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.14f, -0.17f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.09f, -0.14f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 0.05f, -0.17f)
                arcTo(0.78f, 0.78f, 0.0f, false, false, 21.0f, 17.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _trendingDown!!
    }

private var _trendingDown: ImageVector? = null
