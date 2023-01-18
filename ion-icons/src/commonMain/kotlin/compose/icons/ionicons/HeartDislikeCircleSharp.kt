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

public val IonIcons.HeartDislikeCircleSharp: ImageVector
    get() {
        if (_heartDislikeCircleSharp != null) {
            return _heartDislikeCircleSharp!!
        }
        _heartDislikeCircleSharp = Builder(name = "HeartDislikeCircleSharp", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(319.73f, 358.36f)
                lineTo(136.59f, 176.06f)
                lineToRelative(22.74f, -22.51f)
                lineTo(342.52f, 335.91f)
                close()
                moveTo(256.22f, 363.22f)
                curveToRelative(-35.36f, -25.0f, -66.31f, -51.92f, -74.91f, -62.4f)
                curveToRelative(-20.0f, -24.37f, -29.58f, -49.4f, -29.3f, -76.5f)
                arcToRelative(58.27f, 58.27f, 0.0f, false, true, 0.85f, -9.31f)
                lineToRelative(130.21f, 129.4f)
                curveTo(279.64f, 347.0f, 266.86f, 355.86f, 256.22f, 363.22f)
                close()
                moveTo(330.69f, 300.82f)
                lineTo(330.38f, 301.2f)
                lineTo(197.33f, 169.0f)
                arcToRelative(53.8f, 53.8f, 0.0f, false, true, 10.21f, -1.0f)
                arcToRelative(59.34f, 59.34f, 0.0f, false, true, 44.1f, 19.41f)
                lineTo(256.0f, 192.0f)
                lineToRelative(4.36f, -4.6f)
                arcTo(59.34f, 59.34f, 0.0f, false, true, 304.46f, 168.0f)
                curveToRelative(30.31f, 0.0f, 55.22f, 25.27f, 55.53f, 56.33f)
                curveTo(360.27f, 251.42f, 350.68f, 276.45f, 330.69f, 300.82f)
                close()
            }
        }
        .build()
        return _heartDislikeCircleSharp!!
    }

private var _heartDislikeCircleSharp: ImageVector? = null
