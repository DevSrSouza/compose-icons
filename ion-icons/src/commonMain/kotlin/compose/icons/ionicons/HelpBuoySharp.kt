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

public val IonIcons.HelpBuoySharp: ImageVector
    get() {
        if (_helpBuoySharp != null) {
            return _helpBuoySharp!!
        }
        _helpBuoySharp = Builder(name = "HelpBuoySharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(132.29f, 32.0f, 32.0f, 132.29f, 32.0f, 256.0f)
                reflectiveCurveTo(132.29f, 480.0f, 256.0f, 480.0f)
                reflectiveCurveTo(480.0f, 379.71f, 480.0f, 256.0f)
                reflectiveCurveTo(379.71f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(192.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 192.0f, 256.0f)
                close()
                moveTo(429.24f, 193.71f)
                lineTo(342.91f, 199.0f)
                arcToRelative(104.86f, 104.86f, 0.0f, false, false, -29.86f, -29.86f)
                lineToRelative(5.24f, -86.33f)
                arcToRelative(185.0f, 185.0f, 0.0f, false, true, 111.0f, 111.0f)
                close()
                moveTo(125.89f, 125.89f)
                arcToRelative(183.44f, 183.44f, 0.0f, false, true, 67.82f, -43.13f)
                lineTo(199.0f, 169.09f)
                arcTo(104.86f, 104.86f, 0.0f, false, false, 169.09f, 199.0f)
                lineToRelative(-86.33f, -5.24f)
                arcTo(183.44f, 183.44f, 0.0f, false, true, 125.89f, 125.89f)
                close()
                moveTo(82.76f, 318.29f)
                lineToRelative(86.33f, -5.24f)
                arcTo(104.86f, 104.86f, 0.0f, false, false, 199.0f, 342.91f)
                lineToRelative(-5.24f, 86.33f)
                arcTo(185.0f, 185.0f, 0.0f, false, true, 82.76f, 318.29f)
                close()
                moveTo(386.11f, 386.11f)
                arcToRelative(183.44f, 183.44f, 0.0f, false, true, -67.82f, 43.13f)
                lineToRelative(-5.24f, -86.33f)
                arcToRelative(104.86f, 104.86f, 0.0f, false, false, 29.86f, -29.86f)
                lineToRelative(86.33f, 5.24f)
                arcTo(183.44f, 183.44f, 0.0f, false, true, 386.11f, 386.11f)
                close()
            }
        }
        .build()
        return _helpBuoySharp!!
    }

private var _helpBuoySharp: ImageVector? = null
