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

public val FillGroup.TrendingUp: ImageVector
    get() {
        if (_trendingUp != null) {
            return _trendingUp!!
        }
        _trendingUp = Builder(name = "TrendingUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(21.0f, 7.0f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, false, 0.0f, -0.21f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.05f, -0.17f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.09f, -0.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.14f, -0.17f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-0.12f, -0.07f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.19f, -0.1f)
                lineToRelative(-0.2f, 0.0f)
                arcTo(0.7f, 0.7f, 0.0f, false, false, 20.0f, 6.0f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.83f)
                lineToRelative(-4.0f, 4.71f)
                lineTo(9.51f, 10.14f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.28f, 0.22f)
                lineToRelative(-5.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.13f, 1.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.77f, -0.36f)
                lineTo(9.22f, 12.3f)
                lineToRelative(4.27f, 2.56f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.27f, -0.21f)
                lineTo(19.0f, 9.7f)
                verticalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(7.0f)
                reflectiveCurveTo(21.0f, 7.0f, 21.0f, 7.0f)
                close()
            }
        }
        .build()
        return _trendingUp!!
    }

private var _trendingUp: ImageVector? = null
