package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-48.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(470.39f, 300.0f)
                lineToRelative(-0.47f, -0.38f)
                lineToRelative(-31.56f, -24.75f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, true, -6.1f, -13.33f)
                lineToRelative(0.0f, -11.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 6.11f, -13.22f)
                lineTo(469.92f, 212.0f)
                lineToRelative(0.47f, -0.38f)
                arcToRelative(26.68f, 26.68f, 0.0f, false, false, 5.9f, -34.06f)
                lineToRelative(-42.71f, -73.9f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, -0.13f, -0.22f)
                arcTo(26.86f, 26.86f, 0.0f, false, false, 401.0f, 92.14f)
                lineToRelative(-0.35f, 0.13f)
                lineTo(363.55f, 107.2f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, -14.47f, -1.29f)
                quadToRelative(-4.92f, -3.1f, -10.0f, -5.86f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, -8.19f, -11.82f)
                lineTo(325.3f, 48.64f)
                lineToRelative(-0.12f, -0.72f)
                arcTo(27.22f, 27.22f, 0.0f, false, false, 298.76f, 26.0f)
                horizontalLineTo(213.24f)
                arcToRelative(26.92f, 26.92f, 0.0f, false, false, -26.45f, 22.39f)
                lineToRelative(-0.09f, 0.56f)
                lineToRelative(-5.57f, 39.67f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 173.0f, 100.44f)
                curveToRelative(-3.42f, 1.84f, -6.76f, 3.79f, -10.0f, 5.82f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, -14.43f, 1.27f)
                lineToRelative(-37.13f, -15.0f)
                lineToRelative(-0.35f, -0.14f)
                arcToRelative(26.87f, 26.87f, 0.0f, false, false, -32.48f, 11.34f)
                lineToRelative(-0.13f, 0.22f)
                lineTo(35.71f, 177.9f)
                arcTo(26.71f, 26.71f, 0.0f, false, false, 41.61f, 212.0f)
                lineToRelative(0.47f, 0.38f)
                lineToRelative(31.56f, 24.75f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, true, 6.1f, 13.33f)
                lineToRelative(0.0f, 11.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -6.11f, 13.22f)
                lineTo(42.08f, 300.0f)
                lineToRelative(-0.47f, 0.38f)
                arcToRelative(26.68f, 26.68f, 0.0f, false, false, -5.9f, 34.06f)
                lineToRelative(42.71f, 73.9f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, 0.13f, 0.22f)
                arcTo(26.86f, 26.86f, 0.0f, false, false, 111.0f, 419.86f)
                lineToRelative(0.35f, -0.13f)
                lineToRelative(37.07f, -14.93f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, 14.47f, 1.29f)
                quadToRelative(4.92f, 3.11f, 10.0f, 5.86f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, 8.19f, 11.82f)
                lineToRelative(5.56f, 39.59f)
                lineToRelative(0.12f, 0.72f)
                arcTo(27.22f, 27.22f, 0.0f, false, false, 213.24f, 486.0f)
                horizontalLineToRelative(85.52f)
                arcToRelative(26.92f, 26.92f, 0.0f, false, false, 26.45f, -22.39f)
                lineToRelative(0.09f, -0.56f)
                lineToRelative(5.57f, -39.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 8.18f, -11.82f)
                curveToRelative(3.42f, -1.84f, 6.76f, -3.79f, 10.0f, -5.82f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, 14.43f, -1.27f)
                lineToRelative(37.13f, 14.95f)
                lineToRelative(0.35f, 0.14f)
                arcToRelative(26.85f, 26.85f, 0.0f, false, false, 32.48f, -11.34f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, true, 0.13f, -0.22f)
                lineToRelative(42.71f, -73.89f)
                arcTo(26.7f, 26.7f, 0.0f, false, false, 470.39f, 300.0f)
                close()
                moveTo(335.91f, 259.76f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -83.66f, -83.67f)
                arcTo(80.21f, 80.21f, 0.0f, false, true, 335.91f, 259.76f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
