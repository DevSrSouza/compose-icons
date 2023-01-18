package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Walk: ImageVector
    get() {
        if (_walk != null) {
            return _walk!!
        }
        _walk = Builder(name = "Walk", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(312.55f, 479.9f)
                lineToRelative(-56.42f, -114.0f)
                lineToRelative(-44.62f, -57.0f)
                arcTo(72.37f, 72.37f, 0.0f, false, true, 201.45f, 272.0f)
                verticalLineTo(143.64f)
                horizontalLineTo(217.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                verticalLineTo(365.85f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(127.38f, 291.78f)
                verticalLineTo(217.71f)
                reflectiveCurveToRelative(37.0f, -74.07f, 74.07f, -74.07f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.09f, 291.78f)
                arcToRelative(18.49f, 18.49f, 0.0f, false, true, -10.26f, -3.11f)
                lineTo(297.7f, 250.0f)
                arcTo(21.18f, 21.18f, 0.0f, false, true, 288.0f, 232.21f)
                verticalLineToRelative(-23.7f)
                arcToRelative(5.65f, 5.65f, 0.0f, false, true, 8.69f, -4.77f)
                lineToRelative(81.65f, 54.11f)
                arcToRelative(18.52f, 18.52f, 0.0f, false, true, -10.29f, 33.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.91f, 493.47f)
                arcToRelative(18.5f, 18.5f, 0.0f, false, true, -14.83f, -7.41f)
                curveToRelative(-6.14f, -8.18f, -4.0f, -17.18f, 3.7f, -25.92f)
                lineToRelative(59.95f, -74.66f)
                arcToRelative(7.41f, 7.41f, 0.0f, false, true, 10.76f, 2.06f)
                curveToRelative(1.56f, 2.54f, 3.38f, 5.65f, 5.19f, 9.09f)
                curveToRelative(5.24f, 9.95f, 6.0f, 16.11f, -1.68f, 25.7f)
                curveToRelative(-8.0f, 10.0f, -52.0f, 67.44f, -52.0f, 67.44f)
                curveTo(180.38f, 492.75f, 175.77f, 493.47f, 171.91f, 493.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 16.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(257.0f, 69.56f)
                moveToRelative(-37.04f, 0.0f)
                arcToRelative(37.04f, 37.04f, 0.0f, true, true, 74.08f, 0.0f)
                arcToRelative(37.04f, 37.04f, 0.0f, true, true, -74.08f, 0.0f)
            }
        }
        .build()
        return _walk!!
    }

private var _walk: ImageVector? = null
