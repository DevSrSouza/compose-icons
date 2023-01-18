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

public val IonIcons.AirplaneSharp: ImageVector
    get() {
        if (_airplaneSharp != null) {
            return _airplaneSharp!!
        }
        _airplaneSharp = Builder(name = "AirplaneSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.72f, 208.0f)
                curveToRelative(-2.72f, 0.0f, -14.44f, 0.08f, -18.67f, 0.31f)
                lineToRelative(-57.77f, 1.52f)
                lineTo(198.06f, 48.0f)
                lineTo(135.25f, 48.0f)
                lineToRelative(74.59f, 164.61f)
                lineToRelative(-97.31f, 1.44f)
                lineTo(68.25f, 160.0f)
                lineTo(16.14f, 160.0f)
                lineToRelative(20.61f, 94.18f)
                curveToRelative(0.15f, 0.54f, 0.33f, 1.07f, 0.53f, 1.59f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, true, 0.0f, 0.15f)
                arcToRelative(15.42f, 15.42f, 0.0f, false, false, -0.53f, 1.58f)
                lineTo(15.86f, 352.0f)
                lineTo(67.64f, 352.0f)
                lineToRelative(45.45f, -55.0f)
                lineToRelative(96.77f, 2.17f)
                lineTo(135.24f, 464.0f)
                horizontalLineToRelative(63.0f)
                lineToRelative(133.0f, -161.75f)
                lineToRelative(57.77f, 1.54f)
                curveToRelative(4.29f, 0.23f, 16.0f, 0.31f, 18.66f, 0.31f)
                curveToRelative(24.35f, 0.0f, 44.27f, -3.34f, 59.21f, -9.94f)
                curveTo(492.22f, 283.0f, 496.0f, 265.46f, 496.0f, 256.0f)
                curveTo(496.0f, 225.94f, 463.0f, 208.0f, 407.72f, 208.0f)
                close()
                moveTo(336.43f, 295.9f)
                verticalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _airplaneSharp!!
    }

private var _airplaneSharp: ImageVector? = null
