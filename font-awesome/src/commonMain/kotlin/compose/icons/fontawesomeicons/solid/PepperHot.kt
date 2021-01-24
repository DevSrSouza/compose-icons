package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PepperHot: ImageVector
    get() {
        if (_pepperHot != null) {
            return _pepperHot!!
        }
        _pepperHot = Builder(name = "PepperHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(330.67f, 263.12f)
                lineTo(330.67f, 173.4f)
                lineToRelative(-52.75f, -24.22f)
                curveTo(219.44f, 218.76f, 197.58f, 400.0f, 56.0f, 400.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, 112.0f)
                curveToRelative(212.64f, 0.0f, 370.65f, -122.87f, 419.18f, -210.34f)
                lineToRelative(-37.05f, -38.54f)
                close()
                moveTo(461.76f, 134.75f)
                curveTo(493.92f, 74.91f, 477.18f, 26.48f, 458.62f, 3.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.93f, -0.59f)
                lineToRelative(-22.9f, 23.0f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, false, -0.89f, 10.23f)
                curveToRelative(6.86f, 10.36f, 17.05f, 35.1f, -1.4f, 72.32f)
                arcTo(142.85f, 142.85f, 0.0f, false, false, 364.34f, 96.0f)
                curveToRelative(-28.0f, 0.0f, -54.0f, 8.54f, -76.34f, 22.59f)
                lineToRelative(74.67f, 34.29f)
                verticalLineToRelative(78.24f)
                horizontalLineToRelative(89.09f)
                lineTo(506.44f, 288.0f)
                curveToRelative(3.26f, -12.62f, 5.56f, -25.63f, 5.56f, -39.31f)
                arcToRelative(154.0f, 154.0f, 0.0f, false, false, -50.24f, -113.94f)
                close()
            }
        }
        .build()
        return _pepperHot!!
    }

private var _pepperHot: ImageVector? = null
