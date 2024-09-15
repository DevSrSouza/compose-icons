package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(505.12f, 19.09f)
                curveToRelative(-1.19f, -5.53f, -6.66f, -11.0f, -12.21f, -12.19f)
                curveTo(460.72f, 0.0f, 435.51f, 0.0f, 410.41f, 0.0f)
                curveTo(307.18f, 0.0f, 245.27f, 55.2f, 199.05f, 128.0f)
                horizontalLineTo(94.84f)
                curveToRelative(-16.35f, 0.02f, -35.56f, 11.88f, -42.89f, 26.48f)
                lineTo(2.52f, 253.3f)
                arcTo(28.4f, 28.4f, 0.0f, false, false, 0.0f, 264.0f)
                arcToRelative(24.01f, 24.01f, 0.0f, false, false, 24.01f, 24.0f)
                horizontalLineTo(127.82f)
                lineToRelative(-22.47f, 22.47f)
                curveToRelative(-11.37f, 11.36f, -13.0f, 32.26f, 0.0f, 45.25f)
                lineTo(156.25f, 406.63f)
                curveToRelative(11.16f, 11.19f, 32.16f, 13.16f, 45.28f, 0.0f)
                lineToRelative(22.47f, -22.47f)
                verticalLineTo(488.0f)
                arcToRelative(24.01f, 24.01f, 0.0f, false, false, 24.01f, 24.0f)
                arcToRelative(28.56f, 28.56f, 0.0f, false, false, 10.71f, -2.52f)
                lineToRelative(98.73f, -49.39f)
                curveToRelative(14.63f, -7.3f, 26.51f, -26.5f, 26.51f, -42.86f)
                verticalLineTo(312.8f)
                curveToRelative(72.6f, -46.31f, 128.03f, -108.41f, 128.03f, -211.09f)
                curveTo(512.08f, 76.5f, 512.08f, 51.3f, 505.12f, 19.09f)
                close()
                moveTo(384.04f, 168.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 424.05f, 128.0f)
                arcTo(40.02f, 40.02f, 0.0f, false, true, 384.04f, 168.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
