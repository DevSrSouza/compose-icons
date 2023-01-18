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

public val IonIcons.CloudSharp: ImageVector
    get() {
        if (_cloudSharp != null) {
            return _cloudSharp!!
        }
        _cloudSharp = Builder(name = "CloudSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(396.0f, 432.0f)
                horizontalLineTo(136.0f)
                curveToRelative(-36.44f, 0.0f, -70.36f, -12.57f, -95.51f, -35.41f)
                curveTo(14.38f, 372.88f, 0.0f, 340.0f, 0.0f, 304.0f)
                curveToRelative(0.0f, -36.58f, 13.39f, -68.12f, 38.72f, -91.22f)
                curveToRelative(19.93f, -18.19f, 47.12f, -30.56f, 77.38f, -35.37f)
                arcToRelative(156.42f, 156.42f, 0.0f, false, true, 45.22f, -63.61f)
                curveTo(187.76f, 91.69f, 220.5f, 80.0f, 256.0f, 80.0f)
                arcToRelative(153.57f, 153.57f, 0.0f, false, true, 107.14f, 42.9f)
                curveToRelative(27.06f, 26.06f, 44.59f, 61.28f, 51.11f, 102.46f)
                curveTo(463.56f, 232.66f, 512.0f, 266.15f, 512.0f, 328.0f)
                curveToRelative(0.0f, 33.39f, -12.24f, 60.78f, -35.41f, 79.23f)
                curveTo(456.23f, 423.43f, 428.37f, 432.0f, 396.0f, 432.0f)
                close()
            }
        }
        .build()
        return _cloudSharp!!
    }

private var _cloudSharp: ImageVector? = null
