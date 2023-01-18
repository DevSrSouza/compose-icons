package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AnalyticsSharp: ImageVector
    get() {
        if (_analyticsSharp != null) {
            return _analyticsSharp!!
        }
        _analyticsSharp = Builder(name = "AnalyticsSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(450.0f, 128.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -44.11f, 59.0f)
                lineToRelative(-71.37f, 71.36f)
                arcToRelative(45.88f, 45.88f, 0.0f, false, false, -29.0f, 0.0f)
                lineToRelative(-52.91f, -52.91f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, -89.12f, 0.0f)
                lineTo(75.0f, 293.88f)
                arcTo(46.08f, 46.08f, 0.0f, true, false, 106.11f, 325.0f)
                lineToRelative(87.37f, -87.36f)
                arcToRelative(45.85f, 45.85f, 0.0f, false, false, 29.0f, 0.0f)
                lineToRelative(52.92f, 52.92f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 89.12f, 0.0f)
                lineTo(437.0f, 218.12f)
                arcTo(46.0f, 46.0f, 0.0f, true, false, 450.0f, 128.0f)
                close()
            }
        }
        .build()
        return _analyticsSharp!!
    }

private var _analyticsSharp: ImageVector? = null
