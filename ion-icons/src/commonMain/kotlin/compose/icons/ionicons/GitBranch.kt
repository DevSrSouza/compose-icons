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

public val IonIcons.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) {
            return _gitBranch!!
        }
        _gitBranch = Builder(name = "GitBranch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 160.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -96.27f, 55.24f)
                curveToRelative(-2.29f, 29.08f, -20.08f, 37.0f, -75.0f, 48.42f)
                curveToRelative(-17.76f, 3.68f, -35.93f, 7.45f, -52.71f, 13.93f)
                lineTo(192.02f, 151.39f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -64.0f, 0.0f)
                lineTo(128.02f, 360.61f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.42f, 0.24f)
                curveToRelative(2.39f, -18.0f, 16.0f, -24.33f, 65.26f, -34.52f)
                curveToRelative(27.43f, -5.67f, 55.78f, -11.54f, 79.78f, -26.95f)
                curveToRelative(29.0f, -18.58f, 44.53f, -46.78f, 46.36f, -83.89f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 416.0f, 160.0f)
                close()
                moveTo(160.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 64.0f)
                close()
                moveTo(160.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 448.0f)
                close()
                moveTo(352.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 352.0f, 192.0f)
                close()
            }
        }
        .build()
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
