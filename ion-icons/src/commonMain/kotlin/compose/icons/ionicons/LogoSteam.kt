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

public val IonIcons.LogoSteam: ImageVector
    get() {
        if (_logoSteam != null) {
            return _logoSteam!!
        }
        _logoSteam = Builder(name = "LogoSteam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(478.8f, 208.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 478.8f, 208.2f)
                close()
                moveTo(442.6f, 139.0f)
                arcToRelative(69.42f, 69.42f, 0.0f, false, false, -69.4f, 68.7f)
                lineToRelative(-43.2f, 62.0f)
                arcToRelative(48.86f, 48.86f, 0.0f, false, false, -5.4f, -0.3f)
                arcToRelative(51.27f, 51.27f, 0.0f, false, false, -26.4f, 7.3f)
                lineTo(102.4f, 198.0f)
                arcToRelative(51.8f, 51.8f, 0.0f, true, false, -50.6f, 62.9f)
                arcToRelative(51.27f, 51.27f, 0.0f, false, false, 26.4f, -7.3f)
                lineTo(274.0f, 332.2f)
                arcToRelative(51.76f, 51.76f, 0.0f, false, false, 102.1f, -5.9f)
                lineToRelative(66.5f, -48.6f)
                arcToRelative(69.35f, 69.35f, 0.0f, true, false, 0.0f, -138.7f)
                close()
                moveTo(442.6f, 161.9f)
                arcToRelative(46.45f, 46.45f, 0.0f, true, true, -46.5f, 46.5f)
                arcTo(46.54f, 46.54f, 0.0f, false, true, 442.6f, 161.9f)
                close()
                moveTo(51.8f, 170.9f)
                arcToRelative(38.18f, 38.18f, 0.0f, false, true, 33.7f, 20.2f)
                lineToRelative(-18.9f, -7.6f)
                verticalLineToRelative(0.1f)
                arcToRelative(30.21f, 30.21f, 0.0f, false, false, -22.6f, 56.0f)
                verticalLineToRelative(0.1f)
                lineToRelative(16.1f, 6.4f)
                arcToRelative(36.8f, 36.8f, 0.0f, false, true, -8.2f, 0.9f)
                arcToRelative(38.05f, 38.05f, 0.0f, false, true, -0.1f, -76.1f)
                close()
                moveTo(324.6f, 283.1f)
                arcTo(38.1f, 38.1f, 0.0f, true, true, 290.9f, 339.0f)
                curveToRelative(6.3f, 2.5f, 12.5f, 5.0f, 18.8f, 7.6f)
                arcToRelative(30.27f, 30.27f, 0.0f, true, false, 22.5f, -56.2f)
                lineTo(316.3f, 284.0f)
                arcTo(46.83f, 46.83f, 0.0f, false, true, 324.6f, 283.1f)
                close()
            }
        }
        .build()
        return _logoSteam!!
    }

private var _logoSteam: ImageVector? = null
