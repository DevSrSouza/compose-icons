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

public val IonIcons.FootballSharp: ImageVector
    get() {
        if (_footballSharp != null) {
            return _footballSharp!!
        }
        _footballSharp = Builder(name = "FootballSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(396.64f, 344.08f)
                lineTo(349.87f, 344.08f)
                lineToRelative(-16.89f, -29.0f)
                lineToRelative(15.0f, -60.44f)
                lineTo(377.79f, 242.0f)
                lineToRelative(42.65f, 36.71f)
                arcTo(164.87f, 164.87f, 0.0f, false, true, 396.64f, 344.08f)
                close()
                moveTo(134.21f, 242.0f)
                lineTo(164.0f, 254.67f)
                lineToRelative(15.0f, 60.44f)
                lineToRelative(-16.89f, 29.0f)
                lineTo(115.36f, 344.11f)
                arcToRelative(164.87f, 164.87f, 0.0f, false, true, -23.8f, -65.34f)
                close()
                moveTo(383.28f, 149.53f)
                lineTo(364.87f, 201.86f)
                lineTo(333.75f, 215.04f)
                lineTo(277.0f, 167.46f)
                verticalLineToRelative(-35.0f)
                lineToRelative(43.86f, -29.22f)
                arcTo(166.87f, 166.87f, 0.0f, false, true, 383.28f, 149.56f)
                close()
                moveTo(191.14f, 103.2f)
                lineTo(235.0f, 132.42f)
                verticalLineToRelative(35.0f)
                lineToRelative(-56.75f, 47.61f)
                lineToRelative(-31.12f, -13.18f)
                lineToRelative(-18.41f, -52.33f)
                arcTo(166.87f, 166.87f, 0.0f, false, true, 191.14f, 103.2f)
                close()
                moveTo(217.58f, 417.5f)
                lineTo(197.48f, 366.84f)
                lineTo(213.48f, 339.33f)
                horizontalLineToRelative(85.0f)
                lineToRelative(16.06f, 27.53f)
                lineToRelative(-20.0f, 50.6f)
                arcToRelative(166.23f, 166.23f, 0.0f, false, true, -77.0f, 0.0f)
                close()
            }
        }
        .build()
        return _footballSharp!!
    }

private var _footballSharp: ImageVector? = null
