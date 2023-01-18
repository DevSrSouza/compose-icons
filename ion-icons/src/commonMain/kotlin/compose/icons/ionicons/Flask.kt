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

public val IonIcons.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(452.32f, 365.0f)
                lineTo(327.4f, 167.12f)
                arcTo(48.07f, 48.07f, 0.0f, false, true, 320.0f, 141.48f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(15.56f)
                curveToRelative(8.61f, 0.0f, 16.0f, -6.62f, 16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 336.0f, 32.0f)
                horizontalLineTo(176.45f)
                curveToRelative(-8.61f, 0.0f, -16.0f, 6.62f, -16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(77.48f)
                arcToRelative(47.92f, 47.92f, 0.0f, false, true, -7.41f, 25.63f)
                lineTo(59.68f, 365.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -2.5f, 75.84f)
                curveTo(70.44f, 465.19f, 96.36f, 480.0f, 124.13f, 480.0f)
                horizontalLineTo(387.87f)
                curveToRelative(27.77f, 0.0f, 53.69f, -14.81f, 66.95f, -39.21f)
                arcTo(74.0f, 74.0f, 0.0f, false, false, 452.32f, 365.0f)
                close()
                moveTo(211.66f, 184.2f)
                arcTo(79.94f, 79.94f, 0.0f, false, false, 224.0f, 141.48f)
                verticalLineTo(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(73.48f)
                arcToRelative(79.94f, 79.94f, 0.0f, false, false, 12.35f, 42.72f)
                lineToRelative(57.8f, 91.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 351.37f, 288.0f)
                horizontalLineTo(160.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.77f, -12.27f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
