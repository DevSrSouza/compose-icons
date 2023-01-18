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

public val IonIcons.MicOffCircleSharp: ImageVector
    get() {
        if (_micOffCircleSharp != null) {
            return _micOffCircleSharp!!
        }
        _micOffCircleSharp = Builder(name = "MicOffCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(320.0f, 248.22f)
                lineTo(320.0f, 208.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(40.22f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, true, -13.37f, 43.11f)
                lineTo(316.0f, 266.4f)
                arcTo(44.11f, 44.11f, 0.0f, false, false, 320.0f, 248.22f)
                close()
                moveTo(256.0f, 128.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, true, 48.0f, 48.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(48.07f, 48.07f, 0.0f, false, true, -1.44f, 11.64f)
                lineToRelative(-89.0f, -97.92f)
                arcTo(48.13f, 48.13f, 0.0f, false, true, 256.0f, 128.0f)
                close()
                moveTo(304.0f, 384.0f)
                lineTo(208.0f, 384.0f)
                lineTo(208.0f, 352.0f)
                horizontalLineToRelative(32.0f)
                lineTo(240.0f, 334.26f)
                arcToRelative(103.71f, 103.71f, 0.0f, false, true, -49.21f, -23.38f)
                curveTo(170.94f, 293.83f, 160.0f, 271.58f, 160.0f, 248.22f)
                lineTo(160.0f, 208.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(40.22f)
                curveToRelative(0.0f, 25.66f, 28.0f, 55.48f, 64.0f, 55.48f)
                arcToRelative(56.91f, 56.91f, 0.0f, false, false, 7.0f, -0.45f)
                lineToRelative(24.52f, 27.0f)
                arcToRelative(99.57f, 99.57f, 0.0f, false, true, -15.5f, 4.0f)
                lineTo(272.02f, 352.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(208.09f, 242.87f)
                lineToRelative(40.5f, 44.55f)
                arcTo(48.2f, 48.2f, 0.0f, false, true, 208.09f, 242.87f)
                close()
                moveTo(344.16f, 367.76f)
                lineToRelative(-200.5f, -218.5f)
                lineToRelative(23.68f, -21.52f)
                lineToRelative(200.5f, 218.5f)
                close()
            }
        }
        .build()
        return _micOffCircleSharp!!
    }

private var _micOffCircleSharp: ImageVector? = null
