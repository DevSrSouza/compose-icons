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

public val SolidGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.1f, 385.67f)
                lineToRelative(14.23f, 28.66f)
                curveToRelative(3.93f, 7.91f, 0.7f, 17.52f, -7.22f, 21.44f)
                lineToRelative(-65.46f, 32.89f)
                curveToRelative(-16.05f, 7.97f, -35.56f, 1.19f, -43.19f, -15.06f)
                lineTo(331.68f, 320.0f)
                horizontalLineTo(192.0f)
                curveToRelative(-15.93f, 0.0f, -29.43f, -11.71f, -31.68f, -27.48f)
                curveTo(126.43f, 55.31f, 128.38f, 70.04f, 128.0f, 64.0f)
                curveToRelative(0.0f, -36.36f, 30.32f, -65.64f, 67.05f, -63.93f)
                curveToRelative(33.27f, 1.54f, 60.05f, 28.91f, 60.92f, 62.2f)
                curveToRelative(0.87f, 32.93f, -23.15f, 60.42f, -54.61f, 65.04f)
                lineToRelative(4.67f, 32.69f)
                horizontalLineTo(336.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(215.18f)
                lineToRelative(4.57f, 32.0f)
                horizontalLineTo(352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 28.96f, 18.39f)
                lineTo(438.48f, 396.8f)
                lineToRelative(36.18f, -18.35f)
                curveToRelative(7.91f, -3.93f, 17.52f, -0.7f, 21.45f, 7.22f)
                close()
                moveTo(311.36f, 352.0f)
                horizontalLineToRelative(-24.51f)
                curveToRelative(-7.79f, 54.2f, -54.53f, 96.0f, -110.85f, 96.0f)
                curveToRelative(-61.76f, 0.0f, -112.0f, -50.24f, -112.0f, -112.0f)
                curveToRelative(0.0f, -41.51f, 22.69f, -77.81f, 56.32f, -97.16f)
                curveToRelative(-3.71f, -25.97f, -6.84f, -47.86f, -9.49f, -66.33f)
                curveTo(45.96f, 198.46f, 0.0f, 261.96f, 0.0f, 336.0f)
                curveToRelative(0.0f, 97.05f, 78.95f, 176.0f, 176.0f, 176.0f)
                curveToRelative(71.87f, 0.0f, 133.81f, -43.31f, 161.11f, -105.19f)
                lineTo(311.36f, 352.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
