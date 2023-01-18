package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.BarChartSharp: ImageVector
    get() {
        if (_barChartSharp != null) {
            return _barChartSharp!!
        }
        _barChartSharp = Builder(name = "BarChartSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 496.0f)
                lineToRelative(-480.0f, 0.0f)
                lineToRelative(0.0f, -480.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 448.0f)
                lineToRelative(448.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 432.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 432.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(160.0f)
                horizontalLineTo(336.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.64f, 432.0f)
                horizontalLineToRelative(-112.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(112.0f)
                close()
            }
        }
        .build()
        return _barChartSharp!!
    }

private var _barChartSharp: ImageVector? = null
