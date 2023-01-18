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

public val IonIcons.MicCircleSharp: ImageVector
    get() {
        if (_micCircleSharp != null) {
            return _micCircleSharp!!
        }
        _micCircleSharp = Builder(name = "MicCircleSharp", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(208.0f, 176.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, true, 48.0f, -48.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, true, 48.0f, 48.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, true, -48.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, true, -48.0f, -48.0f)
                close()
                moveTo(352.0f, 248.22f)
                curveToRelative(0.0f, 23.36f, -10.94f, 45.61f, -30.79f, 62.66f)
                arcTo(103.71f, 103.71f, 0.0f, false, true, 272.0f, 334.26f)
                lineTo(272.0f, 352.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                lineTo(208.0f, 384.0f)
                lineTo(208.0f, 352.0f)
                horizontalLineToRelative(32.0f)
                lineTo(240.0f, 334.26f)
                arcToRelative(103.71f, 103.71f, 0.0f, false, true, -49.21f, -23.38f)
                curveTo(170.94f, 293.83f, 160.0f, 271.58f, 160.0f, 248.22f)
                lineTo(160.0f, 208.3f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(39.92f)
                curveToRelative(0.0f, 25.66f, 28.0f, 55.48f, 64.0f, 55.48f)
                curveToRelative(29.6f, 0.0f, 64.0f, -24.23f, 64.0f, -55.48f)
                lineTo(320.0f, 208.3f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _micCircleSharp!!
    }

private var _micCircleSharp: ImageVector? = null
