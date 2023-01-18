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

public val IonIcons.SettingsSharp: ImageVector
    get() {
        if (_settingsSharp != null) {
            return _settingsSharp!!
        }
        _settingsSharp = Builder(name = "SettingsSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 176.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 80.0f, 80.0f)
                arcTo(80.24f, 80.24f, 0.0f, false, false, 256.0f, 176.0f)
                close()
                moveTo(428.72f, 256.0f)
                arcToRelative(165.53f, 165.53f, 0.0f, false, true, -1.64f, 22.34f)
                lineToRelative(48.69f, 38.12f)
                arcToRelative(11.59f, 11.59f, 0.0f, false, true, 2.63f, 14.78f)
                lineToRelative(-46.06f, 79.52f)
                arcToRelative(11.64f, 11.64f, 0.0f, false, true, -14.14f, 4.93f)
                lineToRelative(-57.25f, -23.0f)
                arcToRelative(176.56f, 176.56f, 0.0f, false, true, -38.82f, 22.67f)
                lineToRelative(-8.56f, 60.78f)
                arcTo(11.93f, 11.93f, 0.0f, false, true, 302.06f, 486.0f)
                lineTo(209.94f, 486.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.51f, -9.53f)
                lineToRelative(-8.56f, -60.78f)
                arcTo(169.3f, 169.3f, 0.0f, false, true, 151.05f, 393.0f)
                lineTo(93.8f, 416.0f)
                arcToRelative(11.64f, 11.64f, 0.0f, false, true, -14.14f, -4.92f)
                lineTo(33.6f, 331.57f)
                arcToRelative(11.59f, 11.59f, 0.0f, false, true, 2.63f, -14.78f)
                lineToRelative(48.69f, -38.12f)
                arcTo(174.58f, 174.58f, 0.0f, false, true, 83.28f, 256.0f)
                arcToRelative(165.53f, 165.53f, 0.0f, false, true, 1.64f, -22.34f)
                lineTo(36.23f, 195.54f)
                arcToRelative(11.59f, 11.59f, 0.0f, false, true, -2.63f, -14.78f)
                lineToRelative(46.06f, -79.52f)
                arcTo(11.64f, 11.64f, 0.0f, false, true, 93.8f, 96.31f)
                lineToRelative(57.25f, 23.0f)
                arcToRelative(176.56f, 176.56f, 0.0f, false, true, 38.82f, -22.67f)
                lineToRelative(8.56f, -60.78f)
                arcTo(11.93f, 11.93f, 0.0f, false, true, 209.94f, 26.0f)
                horizontalLineToRelative(92.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.51f, 9.53f)
                lineToRelative(8.56f, 60.78f)
                arcTo(169.3f, 169.3f, 0.0f, false, true, 361.0f, 119.0f)
                lineTo(418.2f, 96.0f)
                arcToRelative(11.64f, 11.64f, 0.0f, false, true, 14.14f, 4.92f)
                lineToRelative(46.06f, 79.52f)
                arcToRelative(11.59f, 11.59f, 0.0f, false, true, -2.63f, 14.78f)
                lineToRelative(-48.69f, 38.12f)
                arcTo(174.58f, 174.58f, 0.0f, false, true, 428.72f, 256.0f)
                close()
            }
        }
        .build()
        return _settingsSharp!!
    }

private var _settingsSharp: ImageVector? = null
