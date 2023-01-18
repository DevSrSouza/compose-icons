package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ExtensionPuzzleOutline: ImageVector
    get() {
        if (_extensionPuzzleOutline != null) {
            return _extensionPuzzleOutline!!
        }
        _extensionPuzzleOutline = Builder(name = "ExtensionPuzzleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(413.66f, 246.1f)
                horizontalLineTo(386.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(166.86f)
                arcTo(38.86f, 38.86f, 0.0f, false, false, 345.14f, 128.0f)
                horizontalLineTo(267.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(98.34f)
                curveToRelative(0.0f, -27.14f, -21.5f, -49.86f, -48.64f, -50.33f)
                arcToRelative(49.53f, 49.53f, 0.0f, false, false, -50.4f, 49.51f)
                verticalLineTo(126.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(87.62f)
                arcTo(39.74f, 39.74f, 0.0f, false, false, 48.0f, 167.62f)
                verticalLineTo(238.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(76.91f)
                curveToRelative(29.37f, 0.0f, 53.68f, 25.48f, 54.09f, 54.85f)
                curveToRelative(0.42f, 29.87f, -23.51f, 57.15f, -53.29f, 57.15f)
                horizontalLineTo(50.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(70.38f)
                arcTo(39.74f, 39.74f, 0.0f, false, false, 87.62f, 464.0f)
                horizontalLineTo(158.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(441.07f)
                curveToRelative(0.0f, -30.28f, 24.75f, -56.35f, 55.0f, -57.06f)
                curveToRelative(30.1f, -0.7f, 57.0f, 20.31f, 57.0f, 50.28f)
                verticalLineTo(462.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(71.14f)
                arcTo(38.86f, 38.86f, 0.0f, false, false, 384.0f, 425.14f)
                verticalLineToRelative(-78.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(28.48f)
                curveToRelative(27.63f, 0.0f, 49.52f, -22.67f, 49.52f, -50.4f)
                reflectiveCurveTo(440.8f, 246.1f, 413.66f, 246.1f)
                close()
            }
        }
        .build()
        return _extensionPuzzleOutline!!
    }

private var _extensionPuzzleOutline: ImageVector? = null
